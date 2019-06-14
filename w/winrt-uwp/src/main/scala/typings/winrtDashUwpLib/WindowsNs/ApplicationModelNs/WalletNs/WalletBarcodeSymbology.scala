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
  
  /* 10 */ val aztec: aztec with scala.Double = js.native
  /* 7 */ val code128: code128 with scala.Double = js.native
  /* 6 */ val code39: code39 with scala.Double = js.native
  /* 11 */ val custom: custom with scala.Double = js.native
  /* 3 */ val ean13: ean13 with scala.Double = js.native
  /* 4 */ val ean8: ean8 with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 5 */ val itf: itf with scala.Double = js.native
  /* 9 */ val pdf417: pdf417 with scala.Double = js.native
  /* 8 */ val qr: qr with scala.Double = js.native
  /* 1 */ val upca: upca with scala.Double = js.native
  /* 2 */ val upce: upce with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.WalletBarcodeSymbology with scala.Double
  ] = js.native
}

