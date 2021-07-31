package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AdvancedPhotoCapture::OptionalReferencePhotoCaptured event. */
@JSGlobal("Windows.Media.Capture.OptionalReferencePhotoCapturedEventArgs")
@js.native
abstract class OptionalReferencePhotoCapturedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.OptionalReferencePhotoCapturedEventArgs {
  
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  /* CompleteClass */
  var context: js.Any = js.native
  
  /** Gets the captured frame containing the reference photo from the advanced photo capture. */
  /* CompleteClass */
  var frame: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
}
