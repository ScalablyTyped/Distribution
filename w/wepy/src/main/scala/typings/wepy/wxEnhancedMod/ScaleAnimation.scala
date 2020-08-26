package typings.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleAnimation extends js.Object {
  def scale(sx: Double): Animation = js.native
  def scale3d(): Animation = js.native
  def scaleX(sx: Double): Animation = js.native
  def scaleY(sy: Double): Animation = js.native
  def scaleZ(sz: Double): Animation = js.native
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
  @scala.inline
  implicit class ScaleAnimationOps[Self <: ScaleAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScale(value: Double => Animation): Self = this.set("scale", js.Any.fromFunction1(value))
    @scala.inline
    def setScale3d(value: () => Animation): Self = this.set("scale3d", js.Any.fromFunction0(value))
    @scala.inline
    def setScaleX(value: Double => Animation): Self = this.set("scaleX", js.Any.fromFunction1(value))
    @scala.inline
    def setScaleY(value: Double => Animation): Self = this.set("scaleY", js.Any.fromFunction1(value))
    @scala.inline
    def setScaleZ(value: Double => Animation): Self = this.set("scaleZ", js.Any.fromFunction1(value))
  }
  
}

