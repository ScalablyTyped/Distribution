package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a photo taken from a capture device such as a webcam attached. */
trait CapturedPhoto extends StObject {
  
  /** Gets the photo data, represented as CapturedFrame object, associated with the CapturedPhoto object. */
  var frame: CapturedFrame
  
  /** Represents a thumbnail image of the capture photo. */
  var thumbnail: CapturedFrame
}
object CapturedPhoto {
  
  @scala.inline
  def apply(frame: CapturedFrame, thumbnail: CapturedFrame): CapturedPhoto = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturedPhoto]
  }
  
  @scala.inline
  implicit class CapturedPhotoMutableBuilder[Self <: CapturedPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrame(value: CapturedFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: CapturedFrame): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
