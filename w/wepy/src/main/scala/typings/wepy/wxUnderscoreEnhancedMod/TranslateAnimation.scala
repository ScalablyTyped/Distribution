package typings.wepy.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateAnimation extends js.Object {
  def translate(tx: Double): Animation
  def translate3d(): Animation
  def translateX(tx: Double): Animation
  def translateY(ty: Double): Animation
  def translateZ(tz: Double): Animation
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
}

