package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PhotoConfirmationCaptured event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.PhotoConfirmationCapturedEventArgs")
@js.native
open class PhotoConfirmationCapturedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.PhotoConfirmationCapturedEventArgs {
  
  /** Gets the time offset from when capture began to the capture of the frame associated with the event. */
  /* CompleteClass */
  var captureTimeOffset: Double = js.native
  
  /** Gets the captured frame. */
  /* CompleteClass */
  var frame: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
}
