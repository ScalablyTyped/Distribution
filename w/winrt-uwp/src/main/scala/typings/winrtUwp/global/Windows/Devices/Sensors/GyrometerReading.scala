package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a gyrometer reading. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.GyrometerReading")
@js.native
open class GyrometerReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.GyrometerReading {
  
  /** Gets the angular velocity, in degrees per second, about the x-axis. */
  /* CompleteClass */
  var angularVelocityX: Double = js.native
  
  /** Gets the angular velocity, in degrees per second, about the y-axis. */
  /* CompleteClass */
  var angularVelocityY: Double = js.native
  
  /** Gets the angular velocity, in degrees per second, about the z-axis. */
  /* CompleteClass */
  var angularVelocityZ: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: js.Date = js.native
}
