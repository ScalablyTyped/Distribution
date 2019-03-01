package typings
package threeLib.threeDashVreffectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VREffectOffset extends js.Object {
  var offset: scala.Double
  var scale: scala.Double
}

object VREffectOffset {
  @scala.inline
  def apply(offset: scala.Double, scale: scala.Double): VREffectOffset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("scale")(scale)
    __obj.asInstanceOf[VREffectOffset]
  }
}

