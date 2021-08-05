package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PhotoConfirmationCaptured event. */
trait PhotoConfirmationCapturedEventArgs extends StObject {
  
  /** Gets the time offset from when capture began to the capture of the frame associated with the event. */
  var captureTimeOffset: Double
  
  /** Gets the captured frame. */
  var frame: CapturedFrame
}
object PhotoConfirmationCapturedEventArgs {
  
  inline def apply(captureTimeOffset: Double, frame: CapturedFrame): PhotoConfirmationCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoConfirmationCapturedEventArgs]
  }
  
  extension [Self <: PhotoConfirmationCapturedEventArgs](x: Self) {
    
    inline def setCaptureTimeOffset(value: Double): Self = StObject.set(x, "captureTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: CapturedFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
