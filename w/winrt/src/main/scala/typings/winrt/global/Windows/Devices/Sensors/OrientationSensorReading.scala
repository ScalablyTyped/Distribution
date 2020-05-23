package typings.winrt.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.OrientationSensorReading")
@js.native
class OrientationSensorReading ()
  extends typings.winrt.Windows.Devices.Sensors.OrientationSensorReading {
  /* CompleteClass */
  override var quaternion: typings.winrt.Windows.Devices.Sensors.SensorQuaternion = js.native
  /* CompleteClass */
  override var rotationMatrix: typings.winrt.Windows.Devices.Sensors.SensorRotationMatrix = js.native
  /* CompleteClass */
  override var timestamp: Date = js.native
}

