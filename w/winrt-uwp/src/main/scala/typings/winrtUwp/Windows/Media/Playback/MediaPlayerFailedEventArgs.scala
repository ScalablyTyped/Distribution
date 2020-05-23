package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for MediaFailed events. */
trait MediaPlayerFailedEventArgs extends js.Object {
  /** Gets the MediaPlayerError value for the error that triggered the event. */
  var error: MediaPlayerError
  /** Gets a string describing the error that occurred. */
  var errorMessage: String
  /** Gets an HResult that indicates any extra data about the error that occurred. */
  var extendedErrorCode: WinRTError
}

object MediaPlayerFailedEventArgs {
  @scala.inline
  def apply(error: MediaPlayerError, errorMessage: String, extendedErrorCode: WinRTError): MediaPlayerFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerFailedEventArgs]
  }
}

