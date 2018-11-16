package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WalletBarcodeSymbology extends js.Object

/** Represents the barcode symbology types that are supported for a WalletItem . */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletBarcodeSymbology")
@js.native
object WalletBarcodeSymbology extends js.Object {
  /** Uses the Aztec barcode symbology. */
  @js.native
  sealed trait aztec
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses the Code 128 barcode symbology. */
  @js.native
  sealed trait code128
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses the Code 39 barcode symbology. */
  @js.native
  sealed trait code39
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses a custom bar code symbology. */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses the EAN-13 barcode symbology. */
  @js.native
  sealed trait ean13
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses the EAN-8 barcode symbology. */
  @js.native
  sealed trait ean8
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Invalid barcode type. */
  @js.native
  sealed trait invalid
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses the ITF barcode symbology. */
  @js.native
  sealed trait itf
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses the PDF417 barcode symbology. */
  @js.native
  sealed trait pdf417
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses the QR Code barcode symbology. */
  @js.native
  sealed trait qr
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses the UPC-A barcode symbology. */
  @js.native
  sealed trait upca
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  /** Uses the UPC-E barcode symbology. */
  @js.native
  sealed trait upce
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology
  
  val aztec: aztec with java.lang.String = js.native
  val code128: code128 with java.lang.String = js.native
  val code39: code39 with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val ean13: ean13 with java.lang.String = js.native
  val ean8: ean8 with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val itf: itf with java.lang.String = js.native
  val pdf417: pdf417 with java.lang.String = js.native
  val qr: qr with java.lang.String = js.native
  val upca: upca with java.lang.String = js.native
  val upce: upce with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology with java.lang.String
  ] = js.native
}

