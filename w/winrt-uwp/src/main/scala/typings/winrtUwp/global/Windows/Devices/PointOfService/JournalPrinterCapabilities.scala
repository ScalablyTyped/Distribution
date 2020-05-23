package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of journal station of a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.JournalPrinterCapabilities")
@js.native
abstract class JournalPrinterCapabilities ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.JournalPrinterCapabilities {
  /** Gets information about the sensors that the journal printer station has available to report the status of the printer cartridge. */
  /* CompleteClass */
  override var cartridgeSensors: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterCartridgeSensors = js.native
  /** Gets the color cartridges that the journal printer station can use to print in color. */
  /* CompleteClass */
  override var colorCartridgeCapabilities: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities = js.native
  /** Gets whether the journal printer station can print bold characters. */
  /* CompleteClass */
  override var isBoldSupported: Boolean = js.native
  /** Gets whether the journal printer station can print characters that are both double-high and double-wide. */
  /* CompleteClass */
  override var isDoubleHighDoubleWidePrintSupported: Boolean = js.native
  /** Gets whether the journal printer station can print double-high characters. */
  /* CompleteClass */
  override var isDoubleHighPrintSupported: Boolean = js.native
  /** Gets whether the journal printer station can print double-wide characters. */
  /* CompleteClass */
  override var isDoubleWidePrintSupported: Boolean = js.native
  /** Gets whether the journal printer station can print a dark color plus an alternate color. */
  /* CompleteClass */
  override var isDualColorSupported: Boolean = js.native
  /** Gets whether the journal printer station can print italic characters. */
  /* CompleteClass */
  override var isItalicSupported: Boolean = js.native
  /** Gets whether the journal printer station has an out-of-paper sensor. */
  /* CompleteClass */
  override var isPaperEmptySensorSupported: Boolean = js.native
  /** Gets whether the journal printer station has a low-paper sensor. */
  /* CompleteClass */
  override var isPaperNearEndSensorSupported: Boolean = js.native
  /** Gets whether a point-of-service printer with a station that functions as a journal printer station is present. */
  /* CompleteClass */
  override var isPrinterPresent: Boolean = js.native
  /** Gets whether the journal printer station can underline characters. */
  /* CompleteClass */
  override var isUnderlineSupported: Boolean = js.native
  /** Gets a collection of the line widths in characters per line that the journal printer station supports. */
  /* CompleteClass */
  override var supportedCharactersPerLine: IVectorView[Double] = js.native
}

