package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an orientation-sensor reading. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensorReading")
@js.native
abstract class OrientationSensorReading ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.OrientationSensorReading {
  
  /** Gets the Quaternion for the current orientation-sensor reading. */
  /* CompleteClass */
  var quaternion: typings.winrtUwp.Windows.Devices.Sensors.SensorQuaternion = js.native
  
  /** Gets the rotation matrix for the current orientation-sensor reading. */
  /* CompleteClass */
  var rotationMatrix: typings.winrtUwp.Windows.Devices.Sensors.SensorRotationMatrix = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  var timestamp: Date = js.native
  
  /** Gets the orientation sensor's z-axis accuracy. */
  /* CompleteClass */
  var yawAccuracy: typings.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
}
