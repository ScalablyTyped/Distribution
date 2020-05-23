package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of slip station of a point-of-service printer. */
trait SlipPrinterCapabilities extends js.Object {
  /** Gets information about the sensors that the slip printer station has available to report the status of the printer station. */
  var cartridgeSensors: PosPrinterCartridgeSensors
  /** Gets the color cartridges that the slip printer station can use to print in color. */
  var colorCartridgeCapabilities: PosPrinterColorCapabilities
  /** Gets whether the slip printer station can print in a rotated upside-down mode. */
  var is180RotationSupported: Boolean
  /** Gets whether the slip printer station can print barcodes. */
  var isBarcodeSupported: Boolean
  /** Gets whether the slip printer station can print bitmaps. */
  var isBitmapSupported: Boolean
  /** Gets whether the slip printer station can print bold characters. */
  var isBoldSupported: Boolean
  /** Gets whether the slip printer station supports printing on both sides of the document. */
  var isBothSidesPrintingSupported: Boolean
  /** Gets whether the slip printer station can print characters that are both double-high and double-wide. */
  var isDoubleHighDoubleWidePrintSupported: Boolean
  /** Gets whether the slip printer station can print double-high characters. */
  var isDoubleHighPrintSupported: Boolean
  /** Gets whether the slip printer station can print double-wide characters. */
  var isDoubleWidePrintSupported: Boolean
  /** Gets whether the slip printer station can print a dark color plus an alternate color. */
  var isDualColorSupported: Boolean
  /** Gets whether the slip printer station can print full-length forms. */
  var isFullLengthSupported: Boolean
  /** Gets whether the slip printer station can print italic characters. */
  var isItalicSupported: Boolean
  /** Gets whether the slip printer station can print information rotated 90 degrees to the left. */
  var isLeft90RotationSupported: Boolean
  /** Gets whether the slip printer station has an out-of-paper sensor. */
  var isPaperEmptySensorSupported: Boolean
  /** Gets whether the slip printer station has a low-paper sensor. */
  var isPaperNearEndSensorSupported: Boolean
  /** Gets whether the slip printer station supports setting a custom size for the area of the page on which the printer station should print. */
  var isPrintAreaSupported: Boolean
  /** Gets whether a point-of-service printer with a station that prints forms such as checks or credit card slips is present. */
  var isPrinterPresent: Boolean
  /** Gets whether the slip printer station can print information rotated 90 degrees to the right. */
  var isRight90RotationSupported: Boolean
  /** Gets whether the slip printer station can underline characters. */
  var isUnderlineSupported: Boolean
  /** Gets information about the capabilities of the slip printer station to draw ruled lines. */
  var ruledLineCapabilities: PosPrinterRuledLineCapabilities
  /** Gets a list of the directions in which the slip printer station can rotate a barcode when printing. */
  var supportedBarcodeRotations: IVectorView[PosPrinterRotation]
  /** Gets a list of the directions in which the slip printer station can rotate a bitmap when printing. */
  var supportedBitmapRotations: IVectorView[PosPrinterRotation]
  /** Gets a collection of the line widths in characters per line that the slip printer station supports. */
  var supportedCharactersPerLine: IVectorView[Double]
}

object SlipPrinterCapabilities {
  @scala.inline
  def apply(
    cartridgeSensors: PosPrinterCartridgeSensors,
    colorCartridgeCapabilities: PosPrinterColorCapabilities,
    is180RotationSupported: Boolean,
    isBarcodeSupported: Boolean,
    isBitmapSupported: Boolean,
    isBoldSupported: Boolean,
    isBothSidesPrintingSupported: Boolean,
    isDoubleHighDoubleWidePrintSupported: Boolean,
    isDoubleHighPrintSupported: Boolean,
    isDoubleWidePrintSupported: Boolean,
    isDualColorSupported: Boolean,
    isFullLengthSupported: Boolean,
    isItalicSupported: Boolean,
    isLeft90RotationSupported: Boolean,
    isPaperEmptySensorSupported: Boolean,
    isPaperNearEndSensorSupported: Boolean,
    isPrintAreaSupported: Boolean,
    isPrinterPresent: Boolean,
    isRight90RotationSupported: Boolean,
    isUnderlineSupported: Boolean,
    ruledLineCapabilities: PosPrinterRuledLineCapabilities,
    supportedBarcodeRotations: IVectorView[PosPrinterRotation],
    supportedBitmapRotations: IVectorView[PosPrinterRotation],
    supportedCharactersPerLine: IVectorView[Double]
  ): SlipPrinterCapabilities = {
    val __obj = js.Dynamic.literal(cartridgeSensors = cartridgeSensors.asInstanceOf[js.Any], colorCartridgeCapabilities = colorCartridgeCapabilities.asInstanceOf[js.Any], is180RotationSupported = is180RotationSupported.asInstanceOf[js.Any], isBarcodeSupported = isBarcodeSupported.asInstanceOf[js.Any], isBitmapSupported = isBitmapSupported.asInstanceOf[js.Any], isBoldSupported = isBoldSupported.asInstanceOf[js.Any], isBothSidesPrintingSupported = isBothSidesPrintingSupported.asInstanceOf[js.Any], isDoubleHighDoubleWidePrintSupported = isDoubleHighDoubleWidePrintSupported.asInstanceOf[js.Any], isDoubleHighPrintSupported = isDoubleHighPrintSupported.asInstanceOf[js.Any], isDoubleWidePrintSupported = isDoubleWidePrintSupported.asInstanceOf[js.Any], isDualColorSupported = isDualColorSupported.asInstanceOf[js.Any], isFullLengthSupported = isFullLengthSupported.asInstanceOf[js.Any], isItalicSupported = isItalicSupported.asInstanceOf[js.Any], isLeft90RotationSupported = isLeft90RotationSupported.asInstanceOf[js.Any], isPaperEmptySensorSupported = isPaperEmptySensorSupported.asInstanceOf[js.Any], isPaperNearEndSensorSupported = isPaperNearEndSensorSupported.asInstanceOf[js.Any], isPrintAreaSupported = isPrintAreaSupported.asInstanceOf[js.Any], isPrinterPresent = isPrinterPresent.asInstanceOf[js.Any], isRight90RotationSupported = isRight90RotationSupported.asInstanceOf[js.Any], isUnderlineSupported = isUnderlineSupported.asInstanceOf[js.Any], ruledLineCapabilities = ruledLineCapabilities.asInstanceOf[js.Any], supportedBarcodeRotations = supportedBarcodeRotations.asInstanceOf[js.Any], supportedBitmapRotations = supportedBitmapRotations.asInstanceOf[js.Any], supportedCharactersPerLine = supportedCharactersPerLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlipPrinterCapabilities]
  }
}

