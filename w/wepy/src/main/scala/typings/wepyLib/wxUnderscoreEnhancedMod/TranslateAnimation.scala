package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateAnimation extends js.Object {
  def translate(tx: scala.Double): Animation
  def translate3d(): Animation
  def translateX(tx: scala.Double): Animation
  def translateY(ty: scala.Double): Animation
  def translateZ(tz: scala.Double): Animation
}

object TranslateAnimation {
  @scala.inline
  def apply(
    translate: scala.Double => Animation,
    translate3d: () => Animation,
    translateX: scala.Double => Animation,
    translateY: scala.Double => Animation,
    translateZ: scala.Double => Animation
  ): TranslateAnimation = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction1(translate), translate3d = js.Any.fromFunction0(translate3d), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ))
  
    __obj.asInstanceOf[TranslateAnimation]
  }
}

