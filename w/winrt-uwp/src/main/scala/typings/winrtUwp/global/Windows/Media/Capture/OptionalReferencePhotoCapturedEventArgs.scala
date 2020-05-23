package typings.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AdvancedPhotoCapture::OptionalReferencePhotoCaptured event. */
@JSGlobal("Windows.Media.Capture.OptionalReferencePhotoCapturedEventArgs")
@js.native
abstract class OptionalReferencePhotoCapturedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Capture.OptionalReferencePhotoCapturedEventArgs {
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  /* CompleteClass */
  override var context: js.Any = js.native
  /** Gets the captured frame containing the reference photo from the advanced photo capture. */
  /* CompleteClass */
  override var frame: typings.winrtUwp.Windows.Media.Capture.CapturedFrame = js.native
}

