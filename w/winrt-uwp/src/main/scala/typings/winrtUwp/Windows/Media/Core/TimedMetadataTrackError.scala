package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an error that occurred with a timed metadata track. */
trait TimedMetadataTrackError extends js.Object {
  /** Gets the error code associated with the timed metadata track error. */
  var errorCode: TimedMetadataTrackErrorCode
  /** Gets the extended error code for the TimedMetadataTrackError . */
  var extendedError: WinRTError
}

object TimedMetadataTrackError {
  @scala.inline
  def apply(errorCode: TimedMetadataTrackErrorCode, extendedError: WinRTError): TimedMetadataTrackError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataTrackError]
  }
}

