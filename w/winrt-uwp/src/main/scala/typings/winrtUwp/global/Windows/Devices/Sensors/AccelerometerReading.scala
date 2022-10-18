package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an accelerometer reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.AccelerometerReading")
@js.native
open class AccelerometerReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.AccelerometerReading {
  
  /** Gets the g-force acceleration along the x-axis. */
  /* CompleteClass */
  var accelerationX: Double = js.native
  
  /** Gets the g-force acceleration along the y-axis. */
  /* CompleteClass */
  var accelerationY: Double = js.native
  
  /** Gets the g-force acceleration along the z-axis. */
  /* CompleteClass */
  var accelerationZ: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
