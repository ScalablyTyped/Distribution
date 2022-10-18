package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities of journal station of a point-of-service printer. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.JournalPrinterCapabilities")
@js.native
open class JournalPrinterCapabilities ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.JournalPrinterCapabilities {
  
  /** Gets information about the sensors that the journal printer station has available to report the status of the printer cartridge. */
  /* CompleteClass */
  var cartridgeSensors: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterCartridgeSensors = js.native
  
  /** Gets the color cartridges that the journal printer station can use to print in color. */
  /* CompleteClass */
  var colorCartridgeCapabilities: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities = js.native
  
  /** Gets whether the journal printer station can print bold characters. */
  /* CompleteClass */
  var isBoldSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print characters that are both double-high and double-wide. */
  /* CompleteClass */
  var isDoubleHighDoubleWidePrintSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print double-high characters. */
  /* CompleteClass */
  var isDoubleHighPrintSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print double-wide characters. */
  /* CompleteClass */
  var isDoubleWidePrintSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print a dark color plus an alternate color. */
  /* CompleteClass */
  var isDualColorSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print italic characters. */
  /* CompleteClass */
  var isItalicSupported: Boolean = js.native
  
  /** Gets whether the journal printer station has an out-of-paper sensor. */
  /* CompleteClass */
  var isPaperEmptySensorSupported: Boolean = js.native
  
  /** Gets whether the journal printer station has a low-paper sensor. */
  /* CompleteClass */
  var isPaperNearEndSensorSupported: Boolean = js.native
  
  /** Gets whether a point-of-service printer with a station that functions as a journal printer station is present. */
  /* CompleteClass */
  var isPrinterPresent: Boolean = js.native
  
  /** Gets whether the journal printer station can underline characters. */
  /* CompleteClass */
  var isUnderlineSupported: Boolean = js.native
  
  /** Gets a collection of the line widths in characters per line that the journal printer station supports. */
  /* CompleteClass */
  var supportedCharactersPerLine: IVectorView[Double] = js.native
}
