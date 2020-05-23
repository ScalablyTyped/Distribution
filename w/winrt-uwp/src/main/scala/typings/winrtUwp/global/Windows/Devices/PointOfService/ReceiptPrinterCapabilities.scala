package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of receipt station of a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.ReceiptPrinterCapabilities")
@js.native
abstract class ReceiptPrinterCapabilities ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.ReceiptPrinterCapabilities {
  /** Gets whether the receipt printer station can perform paper cuts. */
  /* CompleteClass */
  override var canCutPaper: Boolean = js.native
  /** Gets information about the sensors that the receipt printer station has available to report the status of the printer station. */
  /* CompleteClass */
  override var cartridgeSensors: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterCartridgeSensors = js.native
  /** Gets the color cartridges that the receipt printer station can use to print in color. */
  /* CompleteClass */
  override var colorCartridgeCapabilities: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities = js.native
  /** Gets whether the receipt printer station can print in a rotated upside-down mode. */
  /* CompleteClass */
  override var is180RotationSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print barcodes. */
  /* CompleteClass */
  override var isBarcodeSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print bitmaps. */
  /* CompleteClass */
  override var isBitmapSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print bold characters. */
  /* CompleteClass */
  override var isBoldSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print characters that are both double-high and double-wide. */
  /* CompleteClass */
  override var isDoubleHighDoubleWidePrintSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print double-high characters. */
  /* CompleteClass */
  override var isDoubleHighPrintSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print double-wide characters. */
  /* CompleteClass */
  override var isDoubleWidePrintSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print a dark color plus an alternate color. */
  /* CompleteClass */
  override var isDualColorSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print italic characters. */
  /* CompleteClass */
  override var isItalicSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the left. */
  /* CompleteClass */
  override var isLeft90RotationSupported: Boolean = js.native
  /** Gets whether the receipt printer station has an out-of-paper sensor. */
  /* CompleteClass */
  override var isPaperEmptySensorSupported: Boolean = js.native
  /** Gets whether the receipt printer station has a low-paper sensor. */
  /* CompleteClass */
  override var isPaperNearEndSensorSupported: Boolean = js.native
  /** Gets whether the receipt printer station supports setting a custom size for the area of the page on which the printer should print. */
  /* CompleteClass */
  override var isPrintAreaSupported: Boolean = js.native
  /** Gets whether a point-of-service printer with a station that prints receipts is present. */
  /* CompleteClass */
  override var isPrinterPresent: Boolean = js.native
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the right. */
  /* CompleteClass */
  override var isRight90RotationSupported: Boolean = js.native
  /** Gets whether the receipt printer station has a stamp capability. */
  /* CompleteClass */
  override var isStampSupported: Boolean = js.native
  /** Gets whether the receipt printer station can underline characters. */
  /* CompleteClass */
  override var isUnderlineSupported: Boolean = js.native
  /** Gets the type of mark-sensed paper handling that is available for the receipt printer station. */
  /* CompleteClass */
  override var markFeedCapabilities: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities = js.native
  /** Gets information about the capabilities of the receipt printer station to draw ruled lines. */
  /* CompleteClass */
  override var ruledLineCapabilities: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterRuledLineCapabilities = js.native
  /** Gets a list of the directions in which the receipt printer station can rotate a barcode when printing. */
  /* CompleteClass */
  override var supportedBarcodeRotations: IVectorView[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterRotation] = js.native
  /** Gets a list of the directions in which the receipt printer station can rotate a bitmap when printing. */
  /* CompleteClass */
  override var supportedBitmapRotations: IVectorView[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterRotation] = js.native
  /** Gets a collection of the line widths in characters per line that the receipt printer station supports. */
  /* CompleteClass */
  override var supportedCharactersPerLine: IVectorView[Double] = js.native
}

