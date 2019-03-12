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
    scale: scala.Double => Animation,
    scale3d: () => Animation,
    scaleX: scala.Double => Animation,
    scaleY: scala.Double => Animation,
    scaleZ: scala.Double => Animation
  ): ScaleAnimation = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale), scale3d = js.Any.fromFunction0(scale3d), scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ))
  
    __obj.asInstanceOf[ScaleAnimation]
  }
}

