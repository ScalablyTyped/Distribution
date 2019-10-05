package typings.winrtDashUwp.Windows.ApplicationModel.Wallet

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
  sealed trait aztec extends WalletBarcodeSymbology
  
  /** Uses the Code 128 barcode symbology. */
  @js.native
  sealed trait code128 extends WalletBarcodeSymbology
  
  /** Uses the Code 39 barcode symbology. */
  @js.native
  sealed trait code39 extends WalletBarcodeSymbology
  
  /** Uses a custom bar code symbology. */
  @js.native
  sealed trait custom extends WalletBarcodeSymbology
  
  /** Uses the EAN-13 barcode symbology. */
  @js.native
  sealed trait ean13 extends WalletBarcodeSymbology
  
  /** Uses the EAN-8 barcode symbology. */
  @js.native
  sealed trait ean8 extends WalletBarcodeSymbology
  
  /** Invalid barcode type. */
  @js.native
  sealed trait invalid extends WalletBarcodeSymbology
  
  /** Uses the ITF barcode symbology. */
  @js.native
  sealed trait itf extends WalletBarcodeSymbology
  
  /** Uses the PDF417 barcode symbology. */
  @js.native
  sealed trait pdf417 extends WalletBarcodeSymbology
  
  /** Uses the QR Code barcode symbology. */
  @js.native
  sealed trait qr extends WalletBarcodeSymbology
  
  /** Uses the UPC-A barcode symbology. */
  @js.native
  sealed trait upca extends WalletBarcodeSymbology
  
  /** Uses the UPC-E barcode symbology. */
  @js.native
  sealed trait upce extends WalletBarcodeSymbology
  
  /* 10 */ val aztec: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.aztec with Double = js.native
  /* 7 */ val code128: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.code128 with Double = js.native
  /* 6 */ val code39: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.code39 with Double = js.native
  /* 11 */ val custom: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.custom with Double = js.native
  /* 3 */ val ean13: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.ean13 with Double = js.native
  /* 4 */ val ean8: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.ean8 with Double = js.native
  /* 0 */ val invalid: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.invalid with Double = js.native
  /* 5 */ val itf: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.itf with Double = js.native
  /* 9 */ val pdf417: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.pdf417 with Double = js.native
  /* 8 */ val qr: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.qr with Double = js.native
  /* 1 */ val upca: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.upca with Double = js.native
  /* 2 */ val upce: typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.upce with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletBarcodeSymbology with Double] = js.native
}

