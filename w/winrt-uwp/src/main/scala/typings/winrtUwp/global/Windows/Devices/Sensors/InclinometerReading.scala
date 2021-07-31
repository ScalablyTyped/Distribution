package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer reading. */
@JSGlobal("Windows.Devices.Sensors.InclinometerReading")
@js.native
abstract class InclinometerReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.InclinometerReading {
  
  /** Gets the rotation in degrees around the x-axis. */
  /* CompleteClass */
  var pitchDegrees: Double = js.native
  
  /** Gets the rotation in degrees around the y-axis. */
  /* CompleteClass */
  var rollDegrees: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: Date = js.native
  
  /** Gets the inclinometer's z-axis accuracy. */
  /* CompleteClass */
  var yawAccuracy: typings.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
  
  /** Gets the rotation in degrees around the z-axis. */
  /* CompleteClass */
  var yawDegrees: Double = js.native
}
