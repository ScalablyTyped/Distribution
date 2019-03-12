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
    backgroundColor: java.lang.String => Animation,
    bottom: scala.Double => Animation,
    height: scala.Double => Animation,
    left: scala.Double => Animation,
    opacity: scala.Double => Animation,
    right: scala.Double => Animation,
    rotate: scala.Double => Animation,
    rotate3d: () => Animation,
    rotateX: scala.Double => Animation,
    rotateY: scala.Double => Animation,
    rotateZ: scala.Double => Animation,
    scale: scala.Double => Animation,
    scale3d: () => Animation,
    scaleX: scala.Double => Animation,
    scaleY: scala.Double => Animation,
    scaleZ: scala.Double => Animation,
    skew: scala.Double => Animation,
    skewX: scala.Double => Animation,
    skewY: scala.Double => Animation,
    top: scala.Double => Animation,
    translate: scala.Double => Animation,
    translate3d: () => Animation,
    translateX: scala.Double => Animation,
    translateY: scala.Double => Animation,
    translateZ: scala.Double => Animation,
    width: scala.Double => Animation
  ): Animation = {
    val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction1(backgroundColor), bottom = js.Any.fromFunction1(bottom), height = js.Any.fromFunction1(height), left = js.Any.fromFunction1(left), opacity = js.Any.fromFunction1(opacity), right = js.Any.fromFunction1(right), rotate = js.Any.fromFunction1(rotate), rotate3d = js.Any.fromFunction0(rotate3d), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ), scale = js.Any.fromFunction1(scale), scale3d = js.Any.fromFunction0(scale3d), scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ), skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY), top = js.Any.fromFunction1(top), translate = js.Any.fromFunction1(translate), translate3d = js.Any.fromFunction0(translate3d), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ), width = js.Any.fromFunction1(width))
  
    __obj.asInstanceOf[Animation]
  }
}

