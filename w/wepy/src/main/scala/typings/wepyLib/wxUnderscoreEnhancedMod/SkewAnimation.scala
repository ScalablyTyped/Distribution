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
    skew: scala.Double => Animation,
    skewX: scala.Double => Animation,
    skewY: scala.Double => Animation
  ): SkewAnimation = {
    val __obj = js.Dynamic.literal(skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY))
  
    __obj.asInstanceOf[SkewAnimation]
  }
}

