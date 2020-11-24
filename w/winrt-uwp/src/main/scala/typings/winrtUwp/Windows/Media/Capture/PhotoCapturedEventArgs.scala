package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the photo sequence PhotoCaptured event. */
@js.native
trait PhotoCapturedEventArgs extends js.Object {
  
  /** Gets a value that indicates time offset in the photo sequence. */
  var captureTimeOffset: Double = js.native
  
  /** Gets the captured image associated with the event. */
  var frame: CapturedFrame = js.native
  
  /** Gets a thumbnail version of the captured image associated with the event. */
  var thumbnail: CapturedFrame = js.native
}
object PhotoCapturedEventArgs {
  
  @scala.inline
  def apply(captureTimeOffset: Double, frame: CapturedFrame, thumbnail: CapturedFrame): PhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoCapturedEventArgs]
  }
  
  @scala.inline
  implicit class PhotoCapturedEventArgsOps[Self <: PhotoCapturedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCaptureTimeOffset(value: Double): Self = this.set("captureTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: CapturedFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: CapturedFrame): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
}
