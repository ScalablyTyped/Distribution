package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PhotoConfirmationCaptured event. */
trait PhotoConfirmationCapturedEventArgs extends js.Object {
  /** Gets the time offset from when capture began to the capture of the frame associated with the event. */
  var captureTimeOffset: Double
  /** Gets the captured frame. */
  var frame: CapturedFrame
}

object PhotoConfirmationCapturedEventArgs {
  @scala.inline
  def apply(captureTimeOffset: Double, frame: CapturedFrame): PhotoConfirmationCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoConfirmationCapturedEventArgs]
  }
}

