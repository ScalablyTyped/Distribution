package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a description of media that is supported by a video profile. */
@js.native
trait MediaCaptureVideoProfileMediaDescription extends StObject {
  
  /** Gets the frame rate of the media description. */
  var frameRate: Double = js.native
  
  /** Gets the height of the media description. */
  var height: Double = js.native
  
  /** Gets a value indicating if the media description includes HDR video support. */
  var isHdrVideoSupported: Boolean = js.native
  
  /** Gets a value indicating if the media description includes variable photo sequence support. */
  var isVariablePhotoSequenceSupported: Boolean = js.native
  
  /** Gets the height of the media description. */
  var width: Double = js.native
}
object MediaCaptureVideoProfileMediaDescription {
  
  @scala.inline
  def apply(
    frameRate: Double,
    height: Double,
    isHdrVideoSupported: Boolean,
    isVariablePhotoSequenceSupported: Boolean,
    width: Double
  ): MediaCaptureVideoProfileMediaDescription = {
    val __obj = js.Dynamic.literal(frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isHdrVideoSupported = isHdrVideoSupported.asInstanceOf[js.Any], isVariablePhotoSequenceSupported = isVariablePhotoSequenceSupported.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureVideoProfileMediaDescription]
  }
  
  @scala.inline
  implicit class MediaCaptureVideoProfileMediaDescriptionMutableBuilder[Self <: MediaCaptureVideoProfileMediaDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHdrVideoSupported(value: Boolean): Self = StObject.set(x, "isHdrVideoSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVariablePhotoSequenceSupported(value: Boolean): Self = StObject.set(x, "isVariablePhotoSequenceSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
