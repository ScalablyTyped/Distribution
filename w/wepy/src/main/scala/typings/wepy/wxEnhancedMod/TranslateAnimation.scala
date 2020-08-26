package typings.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateAnimation extends js.Object {
  def translate(tx: Double): Animation = js.native
  def translate3d(): Animation = js.native
  def translateX(tx: Double): Animation = js.native
  def translateY(ty: Double): Animation = js.native
  def translateZ(tz: Double): Animation = js.native
}

object TranslateAnimation {
  @scala.inline
  def apply(
    translate: Double => Animation,
    translate3d: () => Animation,
    translateX: Double => Animation,
    translateY: Double => Animation,
    translateZ: Double => Animation
  ): TranslateAnimation = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction1(translate), translate3d = js.Any.fromFunction0(translate3d), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ))
    __obj.asInstanceOf[TranslateAnimation]
  }
  @scala.inline
  implicit class TranslateAnimationOps[Self <: TranslateAnimation] (val x: Self) extends AnyVal {
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
    def setTranslate(value: Double => Animation): Self = this.set("translate", js.Any.fromFunction1(value))
    @scala.inline
    def setTranslate3d(value: () => Animation): Self = this.set("translate3d", js.Any.fromFunction0(value))
    @scala.inline
    def setTranslateX(value: Double => Animation): Self = this.set("translateX", js.Any.fromFunction1(value))
    @scala.inline
    def setTranslateY(value: Double => Animation): Self = this.set("translateY", js.Any.fromFunction1(value))
    @scala.inline
    def setTranslateZ(value: Double => Animation): Self = this.set("translateZ", js.Any.fromFunction1(value))
  }
  
}

