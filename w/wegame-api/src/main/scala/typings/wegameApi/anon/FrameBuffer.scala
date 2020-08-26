package typings.wegameApi.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameBuffer extends js.Object {
  var frameBuffer: ArrayBuffer = js.native
  var isLastFrame: Boolean = js.native
}

object FrameBuffer {
  @scala.inline
  def apply(frameBuffer: ArrayBuffer, isLastFrame: Boolean): FrameBuffer = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameBuffer]
  }
  @scala.inline
  implicit class FrameBufferOps[Self <: FrameBuffer] (val x: Self) extends AnyVal {
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
    def setFrameBuffer(value: ArrayBuffer): Self = this.set("frameBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLastFrame(value: Boolean): Self = this.set("isLastFrame", value.asInstanceOf[js.Any])
  }
  
}

