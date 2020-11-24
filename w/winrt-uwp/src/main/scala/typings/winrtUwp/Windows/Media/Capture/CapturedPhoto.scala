package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a photo taken from a capture device such as a webcam attached. */
@js.native
trait CapturedPhoto extends js.Object {
  
  /** Gets the photo data, represented as CapturedFrame object, associated with the CapturedPhoto object. */
  var frame: CapturedFrame = js.native
  
  /** Represents a thumbnail image of the capture photo. */
  var thumbnail: CapturedFrame = js.native
}
object CapturedPhoto {
  
  @scala.inline
  def apply(frame: CapturedFrame, thumbnail: CapturedFrame): CapturedPhoto = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturedPhoto]
  }
  
  @scala.inline
  implicit class CapturedPhotoOps[Self <: CapturedPhoto] (val x: Self) extends AnyVal {
    
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
    def setFrame(value: CapturedFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: CapturedFrame): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
}
