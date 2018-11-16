package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of receipt station of a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.ReceiptPrinterCapabilities")
@js.native
abstract class ReceiptPrinterCapabilities () extends js.Object {
  /** Gets whether the receipt printer station can perform paper cuts. */
  var canCutPaper: scala.Boolean = js.native
  /** Gets information about the sensors that the receipt printer station has available to report the status of the printer station. */
  var cartridgeSensors: PosPrinterCartridgeSensors = js.native
  /** Gets the color cartridges that the receipt printer station can use to print in color. */
  var colorCartridgeCapabilities: PosPrinterColorCapabilities = js.native
  /** Gets whether the receipt printer station can print in a rotated upside-down mode. */
  var is180RotationSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print barcodes. */
  var isBarcodeSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print bitmaps. */
  var isBitmapSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print bold characters. */
  var isBoldSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print characters that are both double-high and double-wide. */
  var isDoubleHighDoubleWidePrintSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print double-high characters. */
  var isDoubleHighPrintSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print double-wide characters. */
  var isDoubleWidePrintSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print a dark color plus an alternate color. */
  var isDualColorSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print italic characters. */
  var isItalicSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the left. */
  var isLeft90RotationSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station has an out-of-paper sensor. */
  var isPaperEmptySensorSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station has a low-paper sensor. */
  var isPaperNearEndSensorSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station supports setting a custom size for the area of the page on which the printer should print. */
  var isPrintAreaSupported: scala.Boolean = js.native
  /** Gets whether a point-of-service printer with a station that prints receipts is present. */
  var isPrinterPresent: scala.Boolean = js.native
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the right. */
  var isRight90RotationSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station has a stamp capability. */
  var isStampSupported: scala.Boolean = js.native
  /** Gets whether the receipt printer station can underline characters. */
  var isUnderlineSupported: scala.Boolean = js.native
  /** Gets the type of mark-sensed paper handling that is available for the receipt printer station. */
  var markFeedCapabilities: PosPrinterMarkFeedCapabilities = js.native
  /** Gets information about the capabilities of the receipt printer station to draw ruled lines. */
  var ruledLineCapabilities: PosPrinterRuledLineCapabilities = js.native
  /** Gets a list of the directions in which the receipt printer station can rotate a barcode when printing. */
  var supportedBarcodeRotations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PosPrinterRotation] = js.native
  /** Gets a list of the directions in which the receipt printer station can rotate a bitmap when printing. */
  var supportedBitmapRotations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PosPrinterRotation] = js.native
  /** Gets a collection of the line widths in characters per line that the receipt printer station supports. */
  var supportedCharactersPerLine: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double] = js.native
}

