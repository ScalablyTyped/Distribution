package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Media.AudioFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides context for performing a custom audio effect operation within the ProcessFrame method. */
@js.native
trait ProcessAudioFrameContext extends js.Object {
  
  /** Gets the input frame for an audio effect operation. */
  var inputFrame: AudioFrame = js.native
  
  /** Gets the output frame for an audio effect operation. */
  var outputFrame: AudioFrame = js.native
}
object ProcessAudioFrameContext {
  
  @scala.inline
  def apply(inputFrame: AudioFrame, outputFrame: AudioFrame): ProcessAudioFrameContext = {
    val __obj = js.Dynamic.literal(inputFrame = inputFrame.asInstanceOf[js.Any], outputFrame = outputFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessAudioFrameContext]
  }
  
  @scala.inline
  implicit class ProcessAudioFrameContextOps[Self <: ProcessAudioFrameContext] (val x: Self) extends AnyVal {
    
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
    def setInputFrame(value: AudioFrame): Self = this.set("inputFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFrame(value: AudioFrame): Self = this.set("outputFrame", value.asInstanceOf[js.Any])
  }
}
