import java.util.Scanner;
public class Baitap {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int soThuNhat = scanner.nextInt();
        System.out.print("Nhap so thu 2: ");
        int soThuHai = scanner.nextInt();
        int tong = soThuNhat + soThuHai;
        int hieu = soThuNhat - soThuHai;
        int tich = soThuNhat * soThuHai;
        int thuong = soThuNhat / soThuHai; // Chia lấy phần nguyên
        int du = soThuNhat % soThuHai; // Chia lấy phần dư
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Tuong (phan nguyen): " + thuong);
        System.out.println("Du: " + du);
    }
}