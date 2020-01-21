package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AdvancedPhotoCapture::OptionalReferencePhotoCaptured event. */
@JSGlobal("Windows.Media.Capture.OptionalReferencePhotoCapturedEventArgs")
@js.native
abstract class OptionalReferencePhotoCapturedEventArgs () extends js.Object {
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  var context: js.Any = js.native
  /** Gets the captured frame containing the reference photo from the advanced photo capture. */
  var frame: CapturedFrame = js.native
}

