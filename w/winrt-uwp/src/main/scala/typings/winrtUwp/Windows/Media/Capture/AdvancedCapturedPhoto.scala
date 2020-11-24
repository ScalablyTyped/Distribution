package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a photo captured using system-provided computational photography techniques provided by the AdvancedPhotoCapture class. */
@js.native
trait AdvancedCapturedPhoto extends js.Object {
  
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  var context: js.Any = js.native
  
  /** Gets the captured frame containing the result of the advanced photo capture. */
  var frame: CapturedFrame = js.native
  
  /** Gets a value indicating the advanced capture mode with which the photo was captured. */
  var mode: AdvancedPhotoMode = js.native
}
object AdvancedCapturedPhoto {
  
  @scala.inline
  def apply(context: js.Any, frame: CapturedFrame, mode: AdvancedPhotoMode): AdvancedCapturedPhoto = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedCapturedPhoto]
  }
  
  @scala.inline
  implicit class AdvancedCapturedPhotoOps[Self <: AdvancedCapturedPhoto] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: CapturedFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: AdvancedPhotoMode): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
