package typings.wepy.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleAnimation extends js.Object {
  def scale(sx: Double): Animation
  def scale3d(): Animation
  def scaleX(sx: Double): Animation
  def scaleY(sy: Double): Animation
  def scaleZ(sz: Double): Animation
}

object ScaleAnimation {
  @scala.inline
  def apply(
    scale: Double => Animation,
    scale3d: () => Animation,
    scaleX: Double => Animation,
    scaleY: Double => Animation,
    scaleZ: Double => Animation
  ): ScaleAnimation = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale), scale3d = js.Any.fromFunction0(scale3d), scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ))
  
    __obj.asInstanceOf[ScaleAnimation]
  }
}

