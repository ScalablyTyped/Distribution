package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  var isBoldSupported: scala.Boolean = js.native
  /** Gets whether the journal printer station can print characters that are both double-high and double-wide. */
  var isDoubleHighDoubleWidePrintSupported: scala.Boolean = js.native
  /** Gets whether the journal printer station can print double-high characters. */
  var isDoubleHighPrintSupported: scala.Boolean = js.native
  /** Gets whether the journal printer station can print double-wide characters. */
  var isDoubleWidePrintSupported: scala.Boolean = js.native
  /** Gets whether the journal printer station can print a dark color plus an alternate color. */
  var isDualColorSupported: scala.Boolean = js.native
  /** Gets whether the journal printer station can print italic characters. */
  var isItalicSupported: scala.Boolean = js.native
  /** Gets whether the journal printer station has an out-of-paper sensor. */
  var isPaperEmptySensorSupported: scala.Boolean = js.native
  /** Gets whether the journal printer station has a low-paper sensor. */
  var isPaperNearEndSensorSupported: scala.Boolean = js.native
  /** Gets whether a point-of-service printer with a station that functions as a journal printer station is present. */
  var isPrinterPresent: scala.Boolean = js.native
  /** Gets whether the journal printer station can underline characters. */
  var isUnderlineSupported: scala.Boolean = js.native
  /** Gets a collection of the line widths in characters per line that the journal printer station supports. */
  var supportedCharactersPerLine: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[scala.Double] = js.native
}

