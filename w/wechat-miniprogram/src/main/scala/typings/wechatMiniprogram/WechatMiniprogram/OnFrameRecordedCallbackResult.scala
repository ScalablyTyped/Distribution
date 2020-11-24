package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnFrameRecordedCallbackResult extends js.Object {
  
  /** 录音分片数据 */
  var frameBuffer: ArrayBuffer = js.native
  
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: Boolean = js.native
}
object OnFrameRecordedCallbackResult {
  
  @scala.inline
  def apply(frameBuffer: ArrayBuffer, isLastFrame: Boolean): OnFrameRecordedCallbackResult = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFrameRecordedCallbackResult]
  }
  
  @scala.inline
  implicit class OnFrameRecordedCallbackResultOps[Self <: OnFrameRecordedCallbackResult] (val x: Self) extends AnyVal {
    
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
