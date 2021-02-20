package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PhotoConfirmationCaptured event. */
@js.native
trait PhotoConfirmationCapturedEventArgs extends StObject {
  
  /** Gets the time offset from when capture began to the capture of the frame associated with the event. */
  var captureTimeOffset: Double = js.native
  
  /** Gets the captured frame. */
  var frame: CapturedFrame = js.native
}
object PhotoConfirmationCapturedEventArgs {
  
  @scala.inline
  def apply(captureTimeOffset: Double, frame: CapturedFrame): PhotoConfirmationCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoConfirmationCapturedEventArgs]
  }
  
  @scala.inline
  implicit class PhotoConfirmationCapturedEventArgsMutableBuilder[Self <: PhotoConfirmationCapturedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureTimeOffset(value: Double): Self = StObject.set(x, "captureTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: CapturedFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
