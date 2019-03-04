package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkewAnimation extends js.Object {
  def skew(ax: scala.Double): Animation
  def skewX(ax: scala.Double): Animation
  def skewY(ay: scala.Double): Animation
}

object SkewAnimation {
  @scala.inline
  def apply(
    skew: js.Function1[scala.Double, Animation],
    skewX: js.Function1[scala.Double, Animation],
    skewY: js.Function1[scala.Double, Animation]
  ): SkewAnimation = {
    val __obj = js.Dynamic.literal(skew = skew, skewX = skewX, skewY = skewY)
  
    __obj.asInstanceOf[SkewAnimation]
  }
}

