package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Quaternion. */
trait SensorQuaternion extends js.Object {
  /** Gets the w-value of the Quaternion. */
  var w: Double
  /** Gets the x-value of the Quaternion. */
  var x: Double
  /** Gets the y-value of the Quaternion. */
  var y: Double
  /** Gets the z-value of the Quaternion. */
  var z: Double
}

object SensorQuaternion {
  @scala.inline
  def apply(w: Double, x: Double, y: Double, z: Double): SensorQuaternion = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorQuaternion]
  }
}

