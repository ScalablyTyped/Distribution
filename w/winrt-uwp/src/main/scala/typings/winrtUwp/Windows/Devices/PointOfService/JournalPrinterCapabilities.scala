package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of journal station of a point-of-service printer. */
trait JournalPrinterCapabilities extends js.Object {
  /** Gets information about the sensors that the journal printer station has available to report the status of the printer cartridge. */
  var cartridgeSensors: PosPrinterCartridgeSensors
  /** Gets the color cartridges that the journal printer station can use to print in color. */
  var colorCartridgeCapabilities: PosPrinterColorCapabilities
  /** Gets whether the journal printer station can print bold characters. */
  var isBoldSupported: Boolean
  /** Gets whether the journal printer station can print characters that are both double-high and double-wide. */
  var isDoubleHighDoubleWidePrintSupported: Boolean
  /** Gets whether the journal printer station can print double-high characters. */
  var isDoubleHighPrintSupported: Boolean
  /** Gets whether the journal printer station can print double-wide characters. */
  var isDoubleWidePrintSupported: Boolean
  /** Gets whether the journal printer station can print a dark color plus an alternate color. */
  var isDualColorSupported: Boolean
  /** Gets whether the journal printer station can print italic characters. */
  var isItalicSupported: Boolean
  /** Gets whether the journal printer station has an out-of-paper sensor. */
  var isPaperEmptySensorSupported: Boolean
  /** Gets whether the journal printer station has a low-paper sensor. */
  var isPaperNearEndSensorSupported: Boolean
  /** Gets whether a point-of-service printer with a station that functions as a journal printer station is present. */
  var isPrinterPresent: Boolean
  /** Gets whether the journal printer station can underline characters. */
  var isUnderlineSupported: Boolean
  /** Gets a collection of the line widths in characters per line that the journal printer station supports. */
  var supportedCharactersPerLine: IVectorView[Double]
}

object JournalPrinterCapabilities {
  @scala.inline
  def apply(
    cartridgeSensors: PosPrinterCartridgeSensors,
    colorCartridgeCapabilities: PosPrinterColorCapabilities,
    isBoldSupported: Boolean,
    isDoubleHighDoubleWidePrintSupported: Boolean,
    isDoubleHighPrintSupported: Boolean,
    isDoubleWidePrintSupported: Boolean,
    isDualColorSupported: Boolean,
    isItalicSupported: Boolean,
    isPaperEmptySensorSupported: Boolean,
    isPaperNearEndSensorSupported: Boolean,
    isPrinterPresent: Boolean,
    isUnderlineSupported: Boolean,
    supportedCharactersPerLine: IVectorView[Double]
  ): JournalPrinterCapabilities = {
    val __obj = js.Dynamic.literal(cartridgeSensors = cartridgeSensors.asInstanceOf[js.Any], colorCartridgeCapabilities = colorCartridgeCapabilities.asInstanceOf[js.Any], isBoldSupported = isBoldSupported.asInstanceOf[js.Any], isDoubleHighDoubleWidePrintSupported = isDoubleHighDoubleWidePrintSupported.asInstanceOf[js.Any], isDoubleHighPrintSupported = isDoubleHighPrintSupported.asInstanceOf[js.Any], isDoubleWidePrintSupported = isDoubleWidePrintSupported.asInstanceOf[js.Any], isDualColorSupported = isDualColorSupported.asInstanceOf[js.Any], isItalicSupported = isItalicSupported.asInstanceOf[js.Any], isPaperEmptySensorSupported = isPaperEmptySensorSupported.asInstanceOf[js.Any], isPaperNearEndSensorSupported = isPaperNearEndSensorSupported.asInstanceOf[js.Any], isPrinterPresent = isPrinterPresent.asInstanceOf[js.Any], isUnderlineSupported = isUnderlineSupported.asInstanceOf[js.Any], supportedCharactersPerLine = supportedCharactersPerLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[JournalPrinterCapabilities]
  }
}

