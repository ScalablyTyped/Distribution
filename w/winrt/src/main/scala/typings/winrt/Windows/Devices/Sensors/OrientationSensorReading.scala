package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.OrientationSensorReading")
@js.native
class OrientationSensorReading () extends IOrientationSensorReading {
  /* CompleteClass */
  override var quaternion: SensorQuaternion = js.native
  /* CompleteClass */
  override var rotationMatrix: SensorRotationMatrix = js.native
  /* CompleteClass */
  override var timestamp: Date = js.native
}

