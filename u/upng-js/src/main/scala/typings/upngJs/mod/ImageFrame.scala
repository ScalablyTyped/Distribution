package typings.upngJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageFrame extends js.Object {
  var blend: Double = js.native
  var delay: Double = js.native
  var dispose: Double = js.native
  var rect: ImageFrameRect = js.native
}

object ImageFrame {
  @scala.inline
  def apply(blend: Double, delay: Double, dispose: Double, rect: ImageFrameRect): ImageFrame = {
    val __obj = js.Dynamic.literal(blend = blend.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFrame]
  }
  @scala.inline
  implicit class ImageFrameOps[Self <: ImageFrame] (val x: Self) extends AnyVal {
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
    def setBlend(value: Double): Self = this.set("blend", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: Double): Self = this.set("dispose", value.asInstanceOf[js.Any])
    @scala.inline
    def setRect(value: ImageFrameRect): Self = this.set("rect", value.asInstanceOf[js.Any])
  }
  
}

