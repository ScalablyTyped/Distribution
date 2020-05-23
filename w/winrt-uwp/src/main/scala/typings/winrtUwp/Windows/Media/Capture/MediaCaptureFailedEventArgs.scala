package typings.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaCapture.Failed event. */
trait MediaCaptureFailedEventArgs extends js.Object {
  /** The error code of the error that caused the event. */
  var code: Double
  /** A message string for the error. */
  var message: String
}

object MediaCaptureFailedEventArgs {
  @scala.inline
  def apply(code: Double, message: String): MediaCaptureFailedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureFailedEventArgs]
  }
}

