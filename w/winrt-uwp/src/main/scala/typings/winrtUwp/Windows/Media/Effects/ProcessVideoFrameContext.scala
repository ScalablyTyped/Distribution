package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides context for performing a custom video effect operation within the ProcessFrame method. */
@js.native
trait ProcessVideoFrameContext extends js.Object {
  
  /** Gets the input frame for a video effect operation. */
  var inputFrame: VideoFrame = js.native
  
  /** Gets the output frame for a video effect operation. */
  var outputFrame: VideoFrame = js.native
}
object ProcessVideoFrameContext {
  
  @scala.inline
  def apply(inputFrame: VideoFrame, outputFrame: VideoFrame): ProcessVideoFrameContext = {
    val __obj = js.Dynamic.literal(inputFrame = inputFrame.asInstanceOf[js.Any], outputFrame = outputFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessVideoFrameContext]
  }
  
  @scala.inline
  implicit class ProcessVideoFrameContextOps[Self <: ProcessVideoFrameContext] (val x: Self) extends AnyVal {
    
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
    def setInputFrame(value: VideoFrame): Self = this.set("inputFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFrame(value: VideoFrame): Self = this.set("outputFrame", value.asInstanceOf[js.Any])
  }
}
