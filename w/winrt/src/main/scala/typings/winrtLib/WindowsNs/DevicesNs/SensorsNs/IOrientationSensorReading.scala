package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrientationSensorReading extends js.Object {
  var quaternion: SensorQuaternion
  var rotationMatrix: SensorRotationMatrix
  var timestamp: stdLib.Date
}

object IOrientationSensorReading {
  @scala.inline
  def apply(quaternion: SensorQuaternion, rotationMatrix: SensorRotationMatrix, timestamp: stdLib.Date): IOrientationSensorReading = {
    val __obj = js.Dynamic.literal(quaternion = quaternion, rotationMatrix = rotationMatrix, timestamp = timestamp)
  
    __obj.asInstanceOf[IOrientationSensorReading]
  }
}

