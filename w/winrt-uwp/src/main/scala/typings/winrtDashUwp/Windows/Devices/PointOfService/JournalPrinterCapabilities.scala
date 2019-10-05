package typings.winrtDashUwp.Windows.Devices.PointOfService

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of journal station of a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.JournalPrinterCapabilities")
@js.native
abstract class JournalPrinterCapabilities () extends js.Object {
  /** Gets information about the sensors that the journal printer station has available to report the status of the printer cartridge. */
  var cartridgeSensors: PosPrinterCartridgeSensors = js.native
  /** Gets the color cartridges that the journal printer station can use to print in color. */
  var colorCartridgeCapabilities: PosPrinterColorCapabilities = js.native
  /** Gets whether the journal printer station can print bold characters. */
  var isBoldSupported: Boolean = js.native
  /** Gets whether the journal printer station can print characters that are both double-high and double-wide. */
  var isDoubleHighDoubleWidePrintSupported: Boolean = js.native
  /** Gets whether the journal printer station can print double-high characters. */
  var isDoubleHighPrintSupported: Boolean = js.native
  /** Gets whether the journal printer station can print double-wide characters. */
  var isDoubleWidePrintSupported: Boolean = js.native
  /** Gets whether the journal printer station can print a dark color plus an alternate color. */
  var isDualColorSupported: Boolean = js.native
  /** Gets whether the journal printer station can print italic characters. */
  var isItalicSupported: Boolean = js.native
  /** Gets whether the journal printer station has an out-of-paper sensor. */
  var isPaperEmptySensorSupported: Boolean = js.native
  /** Gets whether the journal printer station has a low-paper sensor. */
  var isPaperNearEndSensorSupported: Boolean = js.native
  /** Gets whether a point-of-service printer with a station that functions as a journal printer station is present. */
  var isPrinterPresent: Boolean = js.native
  /** Gets whether the journal printer station can underline characters. */
  var isUnderlineSupported: Boolean = js.native
  /** Gets a collection of the line widths in characters per line that the journal printer station supports. */
  var supportedCharactersPerLine: IVectorView[Double] = js.native
}

