package typings.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation
  extends RotateAnimation
     with ScaleAnimation
     with SkewAnimation
     with TranslateAnimation {
  def backgroundColor(x: String): Animation = js.native
  def bottom(x: Double): Animation = js.native
  def height(x: Double): Animation = js.native
  def left(x: Double): Animation = js.native
  def opacity(x: Double): Animation = js.native
  def right(x: Double): Animation = js.native
  def top(x: Double): Animation = js.native
  def width(x: Double): Animation = js.native
}

object Animation {
  @scala.inline
  def apply(
    backgroundColor: String => Animation,
    bottom: Double => Animation,
    height: Double => Animation,
    left: Double => Animation,
    opacity: Double => Animation,
    right: Double => Animation,
    rotate: Double => Animation,
    rotate3d: () => Animation,
    rotateX: Double => Animation,
    rotateY: Double => Animation,
    rotateZ: Double => Animation,
    scale: Double => Animation,
    scale3d: () => Animation,
    scaleX: Double => Animation,
    scaleY: Double => Animation,
    scaleZ: Double => Animation,
    skew: Double => Animation,
    skewX: Double => Animation,
    skewY: Double => Animation,
    top: Double => Animation,
    translate: Double => Animation,
    translate3d: () => Animation,
    translateX: Double => Animation,
    translateY: Double => Animation,
    translateZ: Double => Animation,
    width: Double => Animation
  ): Animation = {
    val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction1(backgroundColor), bottom = js.Any.fromFunction1(bottom), height = js.Any.fromFunction1(height), left = js.Any.fromFunction1(left), opacity = js.Any.fromFunction1(opacity), right = js.Any.fromFunction1(right), rotate = js.Any.fromFunction1(rotate), rotate3d = js.Any.fromFunction0(rotate3d), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ), scale = js.Any.fromFunction1(scale), scale3d = js.Any.fromFunction0(scale3d), scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ), skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY), top = js.Any.fromFunction1(top), translate = js.Any.fromFunction1(translate), translate3d = js.Any.fromFunction0(translate3d), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ), width = js.Any.fromFunction1(width))
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: String => Animation): Self = this.set("backgroundColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBottom(value: Double => Animation): Self = this.set("bottom", js.Any.fromFunction1(value))
    @scala.inline
    def setHeight(value: Double => Animation): Self = this.set("height", js.Any.fromFunction1(value))
    @scala.inline
    def setLeft(value: Double => Animation): Self = this.set("left", js.Any.fromFunction1(value))
    @scala.inline
    def setOpacity(value: Double => Animation): Self = this.set("opacity", js.Any.fromFunction1(value))
    @scala.inline
    def setRight(value: Double => Animation): Self = this.set("right", js.Any.fromFunction1(value))
    @scala.inline
    def setTop(value: Double => Animation): Self = this.set("top", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: Double => Animation): Self = this.set("width", js.Any.fromFunction1(value))
  }
  
}

