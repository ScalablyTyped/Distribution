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
    translate: js.Function1[scala.Double, Animation],
    translate3d: js.Function0[Animation],
    translateX: js.Function1[scala.Double, Animation],
    translateY: js.Function1[scala.Double, Animation],
    translateZ: js.Function1[scala.Double, Animation]
  ): TranslateAnimation = {
    val __obj = js.Dynamic.literal(translate = translate, translate3d = translate3d, translateX = translateX, translateY = translateY, translateZ = translateZ)
  
    __obj.asInstanceOf[TranslateAnimation]
  }
}

