package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleAnimation extends js.Object {
  def scale(sx: scala.Double): Animation
  def scale3d(): Animation
  def scaleX(sx: scala.Double): Animation
  def scaleY(sy: scala.Double): Animation
  def scaleZ(sz: scala.Double): Animation
}

object ScaleAnimation {
  @scala.inline
  def apply(
    scale: js.Function1[scala.Double, Animation],
    scale3d: js.Function0[Animation],
    scaleX: js.Function1[scala.Double, Animation],
    scaleY: js.Function1[scala.Double, Animation],
    scaleZ: js.Function1[scala.Double, Animation]
  ): ScaleAnimation = {
    val __obj = js.Dynamic.literal(scale = scale, scale3d = scale3d, scaleX = scaleX, scaleY = scaleY, scaleZ = scaleZ)
  
    __obj.asInstanceOf[ScaleAnimation]
  }
}

