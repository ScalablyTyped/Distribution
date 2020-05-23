package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the photo sequence PhotoCaptured event. */
trait PhotoCapturedEventArgs extends js.Object {
  /** Gets a value that indicates time offset in the photo sequence. */
  var captureTimeOffset: Double
  /** Gets the captured image associated with the event. */
  var frame: CapturedFrame
  /** Gets a thumbnail version of the captured image associated with the event. */
  var thumbnail: CapturedFrame
}

object PhotoCapturedEventArgs {
  @scala.inline
  def apply(captureTimeOffset: Double, frame: CapturedFrame, thumbnail: CapturedFrame): PhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoCapturedEventArgs]
  }
}

