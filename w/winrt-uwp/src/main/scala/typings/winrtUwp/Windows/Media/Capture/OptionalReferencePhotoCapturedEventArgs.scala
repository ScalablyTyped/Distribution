package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AdvancedPhotoCapture::OptionalReferencePhotoCaptured event. */
@js.native
trait OptionalReferencePhotoCapturedEventArgs extends js.Object {
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  var context: js.Any = js.native
  /** Gets the captured frame containing the reference photo from the advanced photo capture. */
  var frame: CapturedFrame = js.native
}

object OptionalReferencePhotoCapturedEventArgs {
  @scala.inline
  def apply(context: js.Any, frame: CapturedFrame): OptionalReferencePhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalReferencePhotoCapturedEventArgs]
  }
  @scala.inline
  implicit class OptionalReferencePhotoCapturedEventArgsOps[Self <: OptionalReferencePhotoCapturedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: CapturedFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
  }
  
}

