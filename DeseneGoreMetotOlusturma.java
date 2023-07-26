import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    static void minus1(int number, int temp) {
        if (number > 0) {
            System.out.print(number + " ");
            minus1(number - 5, temp);
        } else if (number <= 0) {
            minus2(number, temp);
        }
    }
    static void minus2(int number, int temp) {
        if (temp >= number) {
            System.out.print(number + " ");
            minus2(number + 5, temp);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : " );
        int number = input.nextInt();
        int temp = number;
        minus1(number, temp);
    }
}