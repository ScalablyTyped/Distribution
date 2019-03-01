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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("rotate")(rotate)
    __obj.updateDynamic("rotate3d")(rotate3d)
    __obj.updateDynamic("rotateX")(rotateX)
    __obj.updateDynamic("rotateY")(rotateY)
    __obj.updateDynamic("rotateZ")(rotateZ)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("scale3d")(scale3d)
    __obj.updateDynamic("scaleX")(scaleX)
    __obj.updateDynamic("scaleY")(scaleY)
    __obj.updateDynamic("scaleZ")(scaleZ)
    __obj.updateDynamic("skew")(skew)
    __obj.updateDynamic("skewX")(skewX)
    __obj.updateDynamic("skewY")(skewY)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("translate")(translate)
    __obj.updateDynamic("translate3d")(translate3d)
    __obj.updateDynamic("translateX")(translateX)
    __obj.updateDynamic("translateY")(translateY)
    __obj.updateDynamic("translateZ")(translateZ)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Animation]
  }
}

