package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an orientation-sensor reading. */
trait OrientationSensorReading extends js.Object {
  /** Gets the Quaternion for the current orientation-sensor reading. */
  var quaternion: SensorQuaternion
  /** Gets the rotation matrix for the current orientation-sensor reading. */
  var rotationMatrix: SensorRotationMatrix
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
  /** Gets the orientation sensor's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy
}

object OrientationSensorReading {
  @scala.inline
  def apply(
    quaternion: SensorQuaternion,
    rotationMatrix: SensorRotationMatrix,
    timestamp: Date,
    yawAccuracy: MagnetometerAccuracy
  ): OrientationSensorReading = {
    val __obj = js.Dynamic.literal(quaternion = quaternion.asInstanceOf[js.Any], rotationMatrix = rotationMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawAccuracy = yawAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReading]
  }
}

