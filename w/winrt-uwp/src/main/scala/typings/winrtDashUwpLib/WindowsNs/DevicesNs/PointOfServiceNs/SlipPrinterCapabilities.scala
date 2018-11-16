package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of slip station of a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.SlipPrinterCapabilities")
@js.native
abstract class SlipPrinterCapabilities () extends js.Object {
  /** Gets information about the sensors that the slip printer station has available to report the status of the printer station. */
  var cartridgeSensors: PosPrinterCartridgeSensors = js.native
  /** Gets the color cartridges that the slip printer station can use to print in color. */
  var colorCartridgeCapabilities: PosPrinterColorCapabilities = js.native
  /** Gets whether the slip printer station can print in a rotated upside-down mode. */
  var is180RotationSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print barcodes. */
  var isBarcodeSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print bitmaps. */
  var isBitmapSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print bold characters. */
  var isBoldSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station supports printing on both sides of the document. */
  var isBothSidesPrintingSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print characters that are both double-high and double-wide. */
  var isDoubleHighDoubleWidePrintSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print double-high characters. */
  var isDoubleHighPrintSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print double-wide characters. */
  var isDoubleWidePrintSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print a dark color plus an alternate color. */
  var isDualColorSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print full-length forms. */
  var isFullLengthSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print italic characters. */
  var isItalicSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can print information rotated 90 degrees to the left. */
  var isLeft90RotationSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station has an out-of-paper sensor. */
  var isPaperEmptySensorSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station has a low-paper sensor. */
  var isPaperNearEndSensorSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station supports setting a custom size for the area of the page on which the printer station should print. */
  var isPrintAreaSupported: scala.Boolean = js.native
  /** Gets whether a point-of-service printer with a station that prints forms such as checks or credit card slips is present. */
  var isPrinterPresent: scala.Boolean = js.native
  /** Gets whether the slip printer station can print information rotated 90 degrees to the right. */
  var isRight90RotationSupported: scala.Boolean = js.native
  /** Gets whether the slip printer station can underline characters. */
  var isUnderlineSupported: scala.Boolean = js.native
  /** Gets information about the capabilities of the slip printer station to draw ruled lines. */
  var ruledLineCapabilities: PosPrinterRuledLineCapabilities = js.native
  /** Gets a list of the directions in which the slip printer station can rotate a barcode when printing. */
  var supportedBarcodeRotations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PosPrinterRotation] = js.native
  /** Gets a list of the directions in which the slip printer station can rotate a bitmap when printing. */
  var supportedBitmapRotations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PosPrinterRotation] = js.native
  /** Gets a collection of the line widths in characters per line that the slip printer station supports. */
  var supportedCharactersPerLine: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double] = js.native
}

