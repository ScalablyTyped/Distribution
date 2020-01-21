package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an orientation-sensor reading. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensorReading")
@js.native
abstract class OrientationSensorReading () extends js.Object {
  /** Gets the Quaternion for the current orientation-sensor reading. */
  var quaternion: SensorQuaternion = js.native
  /** Gets the rotation matrix for the current orientation-sensor reading. */
  var rotationMatrix: SensorRotationMatrix = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
  /** Gets the orientation sensor's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy = js.native
}

