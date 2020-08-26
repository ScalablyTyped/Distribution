package typings.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationKeyFrame extends js.Object {
  var easing: js.UndefOr[String | js.Array[String]] = js.native
  var offset: js.UndefOr[Double | (js.Array[Double | Null]) | Null] = js.native
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.native
  var transform: js.UndefOr[String | js.Array[String]] = js.native
}

object AnimationKeyFrame {
  @scala.inline
  def apply(): AnimationKeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationKeyFrame]
  }
  @scala.inline
  implicit class AnimationKeyFrameOps[Self <: AnimationKeyFrame] (val x: Self) extends AnyVal {
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
    def setEasingVarargs(value: String*): Self = this.set("easing", js.Array(value :_*))
    @scala.inline
    def setEasing(value: String | js.Array[String]): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setOffsetVarargs(value: (Double | Null)*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: Double | (js.Array[Double | Null])): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOffsetNull: Self = this.set("offset", null)
    @scala.inline
    def setOpacityVarargs(value: Double*): Self = this.set("opacity", js.Array(value :_*))
    @scala.inline
    def setOpacity(value: Double | js.Array[Double]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setTransformVarargs(value: String*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: String | js.Array[String]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

