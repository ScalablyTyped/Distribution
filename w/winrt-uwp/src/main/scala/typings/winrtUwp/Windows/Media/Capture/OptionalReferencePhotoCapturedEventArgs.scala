package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AdvancedPhotoCapture::OptionalReferencePhotoCaptured event. */
trait OptionalReferencePhotoCapturedEventArgs extends js.Object {
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  var context: js.Any
  /** Gets the captured frame containing the reference photo from the advanced photo capture. */
  var frame: CapturedFrame
}

object OptionalReferencePhotoCapturedEventArgs {
  @scala.inline
  def apply(context: js.Any, frame: CapturedFrame): OptionalReferencePhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalReferencePhotoCapturedEventArgs]
  }
}

