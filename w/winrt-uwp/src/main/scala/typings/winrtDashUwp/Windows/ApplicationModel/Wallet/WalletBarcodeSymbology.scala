package typings.winrtDashUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.aztec
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.code128
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.code39
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.custom
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.ean13
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.ean8
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.invalid
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.itf
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.pdf417
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.qr
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.upca
import typings.winrtDashUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.upce
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WalletBarcodeSymbology with Double] = js.native
  /* 10 */ @js.native
  object aztec extends TopLevel[aztec with Double]
  
  /* 7 */ @js.native
  object code128 extends TopLevel[code128 with Double]
  
  /* 6 */ @js.native
  object code39 extends TopLevel[code39 with Double]
  
  /* 11 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 3 */ @js.native
  object ean13 extends TopLevel[ean13 with Double]
  
  /* 4 */ @js.native
  object ean8 extends TopLevel[ean8 with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 5 */ @js.native
  object itf extends TopLevel[itf with Double]
  
  /* 9 */ @js.native
  object pdf417 extends TopLevel[pdf417 with Double]
  
  /* 8 */ @js.native
  object qr extends TopLevel[qr with Double]
  
  /* 1 */ @js.native
  object upca extends TopLevel[upca with Double]
  
  /* 2 */ @js.native
  object upce extends TopLevel[upce with Double]
  
}

