package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaCapture.Failed event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.MediaCaptureFailedEventArgs")
@js.native
open class MediaCaptureFailedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.MediaCaptureFailedEventArgs {
  
  /** The error code of the error that caused the event. */
  /* CompleteClass */
  var code: Double = js.native
  
  /** A message string for the error. */
  /* CompleteClass */
  var message: String = js.native
}
