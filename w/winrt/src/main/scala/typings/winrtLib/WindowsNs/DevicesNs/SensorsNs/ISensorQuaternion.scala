package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISensorQuaternion extends js.Object {
  var w: scala.Double
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object ISensorQuaternion {
  @scala.inline
  def apply(w: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): ISensorQuaternion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[ISensorQuaternion]
  }
}

