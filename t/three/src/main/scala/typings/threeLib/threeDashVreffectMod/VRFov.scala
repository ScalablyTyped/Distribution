package typings
package threeLib.threeDashVreffectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRFov extends js.Object {
  var downTan: scala.Double
  var leftTan: scala.Double
  var rightTan: scala.Double
  var upTan: scala.Double
}

object VRFov {
  @scala.inline
  def apply(downTan: scala.Double, leftTan: scala.Double, rightTan: scala.Double, upTan: scala.Double): VRFov = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("downTan")(downTan)
    __obj.updateDynamic("leftTan")(leftTan)
    __obj.updateDynamic("rightTan")(rightTan)
    __obj.updateDynamic("upTan")(upTan)
    __obj.asInstanceOf[VRFov]
  }
}

