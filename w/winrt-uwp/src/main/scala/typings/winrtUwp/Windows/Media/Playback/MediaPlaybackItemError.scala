package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error that occurred trying to resolve a MediaPlaybackItem . */
trait MediaPlaybackItemError extends js.Object {
  /** Gets the error code associated with the playback item error. */
  var errorCode: MediaPlaybackItemErrorCode
  /** Gets the extended error code for the MediaPlaybackItem error. */
  var extendedError: WinRTError
}

object MediaPlaybackItemError {
  @scala.inline
  def apply(errorCode: MediaPlaybackItemErrorCode, extendedError: WinRTError): MediaPlaybackItemError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemError]
  }
}

