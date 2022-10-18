package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ambient light–sensor reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.LightSensorReading")
@js.native
open class LightSensorReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.LightSensorReading {
  
  /** Gets the illuminance level in lux. */
  /* CompleteClass */
  var illuminanceInLux: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
