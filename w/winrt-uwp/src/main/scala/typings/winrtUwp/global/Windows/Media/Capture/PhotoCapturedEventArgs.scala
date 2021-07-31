package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the photo sequence PhotoCaptured event. */
@JSGlobal("Windows.Media.Capture.PhotoCapturedEventArgs")
@js.native
abstract class PhotoCapturedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.PhotoCapturedEventArgs {
  
  /** Gets a value that indicates time offset in the photo sequence. */
  /* CompleteClass */
  var captureTimeOffset: Double = js.native
  
  /** Gets the captured image associated with the event. */
  /* CompleteClass */
  var frame: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
  
  /** Gets a thumbnail version of the captured image associated with the event. */
  /* CompleteClass */
  var thumbnail: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
}
