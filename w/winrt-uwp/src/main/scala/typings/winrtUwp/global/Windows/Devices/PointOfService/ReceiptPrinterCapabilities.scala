package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities of receipt station of a point-of-service printer. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.ReceiptPrinterCapabilities")
@js.native
open class ReceiptPrinterCapabilities ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.ReceiptPrinterCapabilities {
  
  /** Gets whether the receipt printer station can perform paper cuts. */
  /* CompleteClass */
  var canCutPaper: Boolean = js.native
  
  /** Gets information about the sensors that the receipt printer station has available to report the status of the printer station. */
  /* CompleteClass */
  var cartridgeSensors: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterCartridgeSensors = js.native
  
  /** Gets the color cartridges that the receipt printer station can use to print in color. */
  /* CompleteClass */
  var colorCartridgeCapabilities: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities = js.native
  
  /** Gets whether the receipt printer station can print in a rotated upside-down mode. */
  /* CompleteClass */
  var is180RotationSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can print barcodes. */
  /* CompleteClass */
  var isBarcodeSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can print bitmaps. */
  /* CompleteClass */
  var isBitmapSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can print bold characters. */
  /* CompleteClass */
  var isBoldSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can print characters that are both double-high and double-wide. */
  /* CompleteClass */
  var isDoubleHighDoubleWidePrintSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can print double-high characters. */
  /* CompleteClass */
  var isDoubleHighPrintSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can print double-wide characters. */
  /* CompleteClass */
  var isDoubleWidePrintSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can print a dark color plus an alternate color. */
  /* CompleteClass */
  var isDualColorSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can print italic characters. */
  /* CompleteClass */
  var isItalicSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the left. */
  /* CompleteClass */
  var isLeft90RotationSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station has an out-of-paper sensor. */
  /* CompleteClass */
  var isPaperEmptySensorSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station has a low-paper sensor. */
  /* CompleteClass */
  var isPaperNearEndSensorSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station supports setting a custom size for the area of the page on which the printer should print. */
  /* CompleteClass */
  var isPrintAreaSupported: Boolean = js.native
  
  /** Gets whether a point-of-service printer with a station that prints receipts is present. */
  /* CompleteClass */
  var isPrinterPresent: Boolean = js.native
  
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the right. */
  /* CompleteClass */
  var isRight90RotationSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station has a stamp capability. */
  /* CompleteClass */
  var isStampSupported: Boolean = js.native
  
  /** Gets whether the receipt printer station can underline characters. */
  /* CompleteClass */
  var isUnderlineSupported: Boolean = js.native
  
  /** Gets the type of mark-sensed paper handling that is available for the receipt printer station. */
  /* CompleteClass */
  var markFeedCapabilities: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities = js.native
  
  /** Gets information about the capabilities of the receipt printer station to draw ruled lines. */
  /* CompleteClass */
  var ruledLineCapabilities: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterRuledLineCapabilities = js.native
  
  /** Gets a list of the directions in which the receipt printer station can rotate a barcode when printing. */
  /* CompleteClass */
  var supportedBarcodeRotations: IVectorView[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterRotation] = js.native
  
  /** Gets a list of the directions in which the receipt printer station can rotate a bitmap when printing. */
  /* CompleteClass */
  var supportedBitmapRotations: IVectorView[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterRotation] = js.native
  
  /** Gets a collection of the line widths in characters per line that the receipt printer station supports. */
  /* CompleteClass */
  var supportedCharactersPerLine: IVectorView[Double] = js.native
}
