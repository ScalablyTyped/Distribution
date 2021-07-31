package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WalletBarcodeSymbology extends StObject
/** Represents the barcode symbology types that are supported for a WalletItem . */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletBarcodeSymbology")
@js.native
object WalletBarcodeSymbology extends StObject {
  
  /** Uses the Aztec barcode symbology. */
  @js.native
  sealed trait aztec
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses the Code 128 barcode symbology. */
  @js.native
  sealed trait code128
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses the Code 39 barcode symbology. */
  @js.native
  sealed trait code39
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses a custom bar code symbology. */
  @js.native
  sealed trait custom
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses the EAN-13 barcode symbology. */
  @js.native
  sealed trait ean13
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses the EAN-8 barcode symbology. */
  @js.native
  sealed trait ean8
    extends StObject
       with WalletBarcodeSymbology
  
  /** Invalid barcode type. */
  @js.native
  sealed trait invalid
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses the ITF barcode symbology. */
  @js.native
  sealed trait itf
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses the PDF417 barcode symbology. */
  @js.native
  sealed trait pdf417
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses the QR Code barcode symbology. */
  @js.native
  sealed trait qr
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses the UPC-A barcode symbology. */
  @js.native
  sealed trait upca
    extends StObject
       with WalletBarcodeSymbology
  
  /** Uses the UPC-E barcode symbology. */
  @js.native
  sealed trait upce
    extends StObject
       with WalletBarcodeSymbology
}
