package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities of receipt station of a point-of-service printer. */
trait ReceiptPrinterCapabilities extends StObject {
  
  /** Gets whether the receipt printer station can perform paper cuts. */
  var canCutPaper: Boolean
  
  /** Gets information about the sensors that the receipt printer station has available to report the status of the printer station. */
  var cartridgeSensors: PosPrinterCartridgeSensors
  
  /** Gets the color cartridges that the receipt printer station can use to print in color. */
  var colorCartridgeCapabilities: PosPrinterColorCapabilities
  
  /** Gets whether the receipt printer station can print in a rotated upside-down mode. */
  var is180RotationSupported: Boolean
  
  /** Gets whether the receipt printer station can print barcodes. */
  var isBarcodeSupported: Boolean
  
  /** Gets whether the receipt printer station can print bitmaps. */
  var isBitmapSupported: Boolean
  
  /** Gets whether the receipt printer station can print bold characters. */
  var isBoldSupported: Boolean
  
  /** Gets whether the receipt printer station can print characters that are both double-high and double-wide. */
  var isDoubleHighDoubleWidePrintSupported: Boolean
  
  /** Gets whether the receipt printer station can print double-high characters. */
  var isDoubleHighPrintSupported: Boolean
  
  /** Gets whether the receipt printer station can print double-wide characters. */
  var isDoubleWidePrintSupported: Boolean
  
  /** Gets whether the receipt printer station can print a dark color plus an alternate color. */
  var isDualColorSupported: Boolean
  
  /** Gets whether the receipt printer station can print italic characters. */
  var isItalicSupported: Boolean
  
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the left. */
  var isLeft90RotationSupported: Boolean
  
  /** Gets whether the receipt printer station has an out-of-paper sensor. */
  var isPaperEmptySensorSupported: Boolean
  
  /** Gets whether the receipt printer station has a low-paper sensor. */
  var isPaperNearEndSensorSupported: Boolean
  
  /** Gets whether the receipt printer station supports setting a custom size for the area of the page on which the printer should print. */
  var isPrintAreaSupported: Boolean
  
  /** Gets whether a point-of-service printer with a station that prints receipts is present. */
  var isPrinterPresent: Boolean
  
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the right. */
  var isRight90RotationSupported: Boolean
  
  /** Gets whether the receipt printer station has a stamp capability. */
  var isStampSupported: Boolean
  
  /** Gets whether the receipt printer station can underline characters. */
  var isUnderlineSupported: Boolean
  
  /** Gets the type of mark-sensed paper handling that is available for the receipt printer station. */
  var markFeedCapabilities: PosPrinterMarkFeedCapabilities
  
  /** Gets information about the capabilities of the receipt printer station to draw ruled lines. */
  var ruledLineCapabilities: PosPrinterRuledLineCapabilities
  
  /** Gets a list of the directions in which the receipt printer station can rotate a barcode when printing. */
  var supportedBarcodeRotations: IVectorView[PosPrinterRotation]
  
  /** Gets a list of the directions in which the receipt printer station can rotate a bitmap when printing. */
  var supportedBitmapRotations: IVectorView[PosPrinterRotation]
  
  /** Gets a collection of the line widths in characters per line that the receipt printer station supports. */
  var supportedCharactersPerLine: IVectorView[Double]
}
object ReceiptPrinterCapabilities {
  
  @scala.inline
  def apply(
    canCutPaper: Boolean,
    cartridgeSensors: PosPrinterCartridgeSensors,
    colorCartridgeCapabilities: PosPrinterColorCapabilities,
    is180RotationSupported: Boolean,
    isBarcodeSupported: Boolean,
    isBitmapSupported: Boolean,
    isBoldSupported: Boolean,
    isDoubleHighDoubleWidePrintSupported: Boolean,
    isDoubleHighPrintSupported: Boolean,
    isDoubleWidePrintSupported: Boolean,
    isDualColorSupported: Boolean,
    isItalicSupported: Boolean,
    isLeft90RotationSupported: Boolean,
    isPaperEmptySensorSupported: Boolean,
    isPaperNearEndSensorSupported: Boolean,
    isPrintAreaSupported: Boolean,
    isPrinterPresent: Boolean,
    isRight90RotationSupported: Boolean,
    isStampSupported: Boolean,
    isUnderlineSupported: Boolean,
    markFeedCapabilities: PosPrinterMarkFeedCapabilities,
    ruledLineCapabilities: PosPrinterRuledLineCapabilities,
    supportedBarcodeRotations: IVectorView[PosPrinterRotation],
    supportedBitmapRotations: IVectorView[PosPrinterRotation],
    supportedCharactersPerLine: IVectorView[Double]
  ): ReceiptPrinterCapabilities = {
    val __obj = js.Dynamic.literal(canCutPaper = canCutPaper.asInstanceOf[js.Any], cartridgeSensors = cartridgeSensors.asInstanceOf[js.Any], colorCartridgeCapabilities = colorCartridgeCapabilities.asInstanceOf[js.Any], is180RotationSupported = is180RotationSupported.asInstanceOf[js.Any], isBarcodeSupported = isBarcodeSupported.asInstanceOf[js.Any], isBitmapSupported = isBitmapSupported.asInstanceOf[js.Any], isBoldSupported = isBoldSupported.asInstanceOf[js.Any], isDoubleHighDoubleWidePrintSupported = isDoubleHighDoubleWidePrintSupported.asInstanceOf[js.Any], isDoubleHighPrintSupported = isDoubleHighPrintSupported.asInstanceOf[js.Any], isDoubleWidePrintSupported = isDoubleWidePrintSupported.asInstanceOf[js.Any], isDualColorSupported = isDualColorSupported.asInstanceOf[js.Any], isItalicSupported = isItalicSupported.asInstanceOf[js.Any], isLeft90RotationSupported = isLeft90RotationSupported.asInstanceOf[js.Any], isPaperEmptySensorSupported = isPaperEmptySensorSupported.asInstanceOf[js.Any], isPaperNearEndSensorSupported = isPaperNearEndSensorSupported.asInstanceOf[js.Any], isPrintAreaSupported = isPrintAreaSupported.asInstanceOf[js.Any], isPrinterPresent = isPrinterPresent.asInstanceOf[js.Any], isRight90RotationSupported = isRight90RotationSupported.asInstanceOf[js.Any], isStampSupported = isStampSupported.asInstanceOf[js.Any], isUnderlineSupported = isUnderlineSupported.asInstanceOf[js.Any], markFeedCapabilities = markFeedCapabilities.asInstanceOf[js.Any], ruledLineCapabilities = ruledLineCapabilities.asInstanceOf[js.Any], supportedBarcodeRotations = supportedBarcodeRotations.asInstanceOf[js.Any], supportedBitmapRotations = supportedBitmapRotations.asInstanceOf[js.Any], supportedCharactersPerLine = supportedCharactersPerLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptPrinterCapabilities]
  }
  
  @scala.inline
  implicit class ReceiptPrinterCapabilitiesMutableBuilder[Self <: ReceiptPrinterCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanCutPaper(value: Boolean): Self = StObject.set(x, "canCutPaper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCartridgeSensors(value: PosPrinterCartridgeSensors): Self = StObject.set(x, "cartridgeSensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorCartridgeCapabilities(value: PosPrinterColorCapabilities): Self = StObject.set(x, "colorCartridgeCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs180RotationSupported(value: Boolean): Self = StObject.set(x, "is180RotationSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBarcodeSupported(value: Boolean): Self = StObject.set(x, "isBarcodeSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBitmapSupported(value: Boolean): Self = StObject.set(x, "isBitmapSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBoldSupported(value: Boolean): Self = StObject.set(x, "isBoldSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDoubleHighDoubleWidePrintSupported(value: Boolean): Self = StObject.set(x, "isDoubleHighDoubleWidePrintSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDoubleHighPrintSupported(value: Boolean): Self = StObject.set(x, "isDoubleHighPrintSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDoubleWidePrintSupported(value: Boolean): Self = StObject.set(x, "isDoubleWidePrintSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDualColorSupported(value: Boolean): Self = StObject.set(x, "isDualColorSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsItalicSupported(value: Boolean): Self = StObject.set(x, "isItalicSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeft90RotationSupported(value: Boolean): Self = StObject.set(x, "isLeft90RotationSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaperEmptySensorSupported(value: Boolean): Self = StObject.set(x, "isPaperEmptySensorSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaperNearEndSensorSupported(value: Boolean): Self = StObject.set(x, "isPaperNearEndSensorSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrintAreaSupported(value: Boolean): Self = StObject.set(x, "isPrintAreaSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrinterPresent(value: Boolean): Self = StObject.set(x, "isPrinterPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRight90RotationSupported(value: Boolean): Self = StObject.set(x, "isRight90RotationSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStampSupported(value: Boolean): Self = StObject.set(x, "isStampSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnderlineSupported(value: Boolean): Self = StObject.set(x, "isUnderlineSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkFeedCapabilities(value: PosPrinterMarkFeedCapabilities): Self = StObject.set(x, "markFeedCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuledLineCapabilities(value: PosPrinterRuledLineCapabilities): Self = StObject.set(x, "ruledLineCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedBarcodeRotations(value: IVectorView[PosPrinterRotation]): Self = StObject.set(x, "supportedBarcodeRotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedBitmapRotations(value: IVectorView[PosPrinterRotation]): Self = StObject.set(x, "supportedBitmapRotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCharactersPerLine(value: IVectorView[Double]): Self = StObject.set(x, "supportedCharactersPerLine", value.asInstanceOf[js.Any])
  }
}
