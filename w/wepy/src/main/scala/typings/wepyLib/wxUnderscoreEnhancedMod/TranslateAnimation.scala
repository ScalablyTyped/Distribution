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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("translate")(translate)
    __obj.updateDynamic("translate3d")(translate3d)
    __obj.updateDynamic("translateX")(translateX)
    __obj.updateDynamic("translateY")(translateY)
    __obj.updateDynamic("translateZ")(translateZ)
    __obj.asInstanceOf[TranslateAnimation]
  }
}

