package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a barometer reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.BarometerReading")
@js.native
open class BarometerReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.BarometerReading {
  
  /** Gets the barometric pressure determined by the barometer sensor. */
  /* CompleteClass */
  var stationPressureInHectopascals: Double = js.native
  
  /** Gets the time for the most recent barometer reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
