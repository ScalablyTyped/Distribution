package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaCaptureFailedEventArgs extends IMediaCaptureFailedEventArgs

object MediaCaptureFailedEventArgs {
  @scala.inline
  def apply(code: Double, message: String): MediaCaptureFailedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureFailedEventArgs]
  }
}

