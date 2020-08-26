package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoConfirmationCaptured event. */
@js.native
trait PhotoConfirmationCapturedEventArgs extends js.Object {
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
  implicit class PhotoConfirmationCapturedEventArgsOps[Self <: PhotoConfirmationCapturedEventArgs] (val x: Self) extends AnyVal {
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
    def setCaptureTimeOffset(value: Double): Self = this.set("captureTimeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: CapturedFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
  }
  
}

