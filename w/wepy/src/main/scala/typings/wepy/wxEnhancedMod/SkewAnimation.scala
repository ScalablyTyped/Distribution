package typings.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkewAnimation extends js.Object {
  def skew(ax: Double): Animation
  def skewX(ax: Double): Animation
  def skewY(ay: Double): Animation
}

object SkewAnimation {
  @scala.inline
  def apply(skew: Double => Animation, skewX: Double => Animation, skewY: Double => Animation): SkewAnimation = {
    val __obj = js.Dynamic.literal(skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY))
  
    __obj.asInstanceOf[SkewAnimation]
  }
}

