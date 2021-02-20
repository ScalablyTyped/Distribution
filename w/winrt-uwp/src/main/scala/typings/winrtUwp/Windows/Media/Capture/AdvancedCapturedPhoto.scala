package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a photo captured using system-provided computational photography techniques provided by the AdvancedPhotoCapture class. */
@js.native
trait AdvancedCapturedPhoto extends StObject {
  
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
  implicit class AdvancedCapturedPhotoMutableBuilder[Self <: AdvancedCapturedPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: CapturedFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: AdvancedPhotoMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
