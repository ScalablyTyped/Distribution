package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorQuaternion extends ISensorQuaternion

object SensorQuaternion {
  @scala.inline
  def apply(w: Double, x: Double, y: Double, z: Double): SensorQuaternion = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorQuaternion]
  }
}

