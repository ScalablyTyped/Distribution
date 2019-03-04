package typings
package wepyLib.wxUnderscoreEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation
  extends RotateAnimation
     with ScaleAnimation
     with SkewAnimation
     with TranslateAnimation {
  def backgroundColor(x: java.lang.String): Animation
  def bottom(x: scala.Double): Animation
  def height(x: scala.Double): Animation
  def left(x: scala.Double): Animation
  def opacity(x: scala.Double): Animation
  def right(x: scala.Double): Animation
  def top(x: scala.Double): Animation
  def width(x: scala.Double): Animation
}

object Animation {
  @scala.inline
  def apply(
    backgroundColor: js.Function1[java.lang.String, Animation],
    bottom: js.Function1[scala.Double, Animation],
    height: js.Function1[scala.Double, Animation],
    left: js.Function1[scala.Double, Animation],
    opacity: js.Function1[scala.Double, Animation],
    right: js.Function1[scala.Double, Animation],
    rotate: js.Function1[scala.Double, Animation],
    rotate3d: js.Function0[Animation],
    rotateX: js.Function1[scala.Double, Animation],
    rotateY: js.Function1[scala.Double, Animation],
    rotateZ: js.Function1[scala.Double, Animation],
    scale: js.Function1[scala.Double, Animation],
    scale3d: js.Function0[Animation],
    scaleX: js.Function1[scala.Double, Animation],
    scaleY: js.Function1[scala.Double, Animation],
    scaleZ: js.Function1[scala.Double, Animation],
    skew: js.Function1[scala.Double, Animation],
    skewX: js.Function1[scala.Double, Animation],
    skewY: js.Function1[scala.Double, Animation],
    top: js.Function1[scala.Double, Animation],
    translate: js.Function1[scala.Double, Animation],
    translate3d: js.Function0[Animation],
    translateX: js.Function1[scala.Double, Animation],
    translateY: js.Function1[scala.Double, Animation],
    translateZ: js.Function1[scala.Double, Animation],
    width: js.Function1[scala.Double, Animation]
  ): Animation = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, bottom = bottom, height = height, left = left, opacity = opacity, right = right, rotate = rotate, rotate3d = rotate3d, rotateX = rotateX, rotateY = rotateY, rotateZ = rotateZ, scale = scale, scale3d = scale3d, scaleX = scaleX, scaleY = scaleY, scaleZ = scaleZ, skew = skew, skewX = skewX, skewY = skewY, top = top, translate = translate, translate3d = translate3d, translateX = translateX, translateY = translateY, translateZ = translateZ, width = width)
  
    __obj.asInstanceOf[Animation]
  }
}

