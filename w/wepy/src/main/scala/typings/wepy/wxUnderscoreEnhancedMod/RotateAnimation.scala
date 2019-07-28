package typings.wepy.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateAnimation extends js.Object {
  def rotate(deg: Double): Animation
  def rotate3d(): Animation
  def rotateX(deg: Double): Animation
  def rotateY(deg: Double): Animation
  def rotateZ(deg: Double): Animation
}

object RotateAnimation {
  @scala.inline
  def apply(
    rotate: Double => Animation,
    rotate3d: () => Animation,
    rotateX: Double => Animation,
    rotateY: Double => Animation,
    rotateZ: Double => Animation
  ): RotateAnimation = {
    val __obj = js.Dynamic.literal(rotate = js.Any.fromFunction1(rotate), rotate3d = js.Any.fromFunction0(rotate3d), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ))
  
    __obj.asInstanceOf[RotateAnimation]
  }
}

