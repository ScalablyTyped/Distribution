package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateAnimation extends js.Object {
  def rotate(deg: scala.Double): Animation
  def rotate3d(): Animation
  def rotateX(deg: scala.Double): Animation
  def rotateY(deg: scala.Double): Animation
  def rotateZ(deg: scala.Double): Animation
}

object RotateAnimation {
  @scala.inline
  def apply(
    rotate: js.Function1[scala.Double, Animation],
    rotate3d: js.Function0[Animation],
    rotateX: js.Function1[scala.Double, Animation],
    rotateY: js.Function1[scala.Double, Animation],
    rotateZ: js.Function1[scala.Double, Animation]
  ): RotateAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rotate")(rotate)
    __obj.updateDynamic("rotate3d")(rotate3d)
    __obj.updateDynamic("rotateX")(rotateX)
    __obj.updateDynamic("rotateY")(rotateY)
    __obj.updateDynamic("rotateZ")(rotateZ)
    __obj.asInstanceOf[RotateAnimation]
  }
}

