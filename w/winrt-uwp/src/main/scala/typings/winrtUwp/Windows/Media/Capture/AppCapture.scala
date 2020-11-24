package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppCapture extends js.Object {
  
   /* unmapped type */ var addEventListener: js.Any = js.native
  
   /* unmapped type */ var isCapturingAudio: js.Any = js.native
  
   /* unmapped type */ var isCapturingVideo: js.Any = js.native
  
   /* unmapped type */ var oncapturingchanged: js.Any = js.native
  
   /* unmapped type */ var removeEventListener: js.Any = js.native
}
object AppCapture {
  
  @scala.inline
  def apply(
    addEventListener: js.Any,
    isCapturingAudio: js.Any,
    isCapturingVideo: js.Any,
    oncapturingchanged: js.Any,
    removeEventListener: js.Any
  ): AppCapture = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], isCapturingAudio = isCapturingAudio.asInstanceOf[js.Any], isCapturingVideo = isCapturingVideo.asInstanceOf[js.Any], oncapturingchanged = oncapturingchanged.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCapture]
  }
  
  @scala.inline
  implicit class AppCaptureOps[Self <: AppCapture] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: js.Any): Self = this.set("addEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCapturingAudio(value: js.Any): Self = this.set("isCapturingAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCapturingVideo(value: js.Any): Self = this.set("isCapturingVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncapturingchanged(value: js.Any): Self = this.set("oncapturingchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: js.Any): Self = this.set("removeEventListener", value.asInstanceOf[js.Any])
  }
}
