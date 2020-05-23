package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error that occurred with a MediaSource . */
trait MediaSourceError extends js.Object {
  /** Gets the extended error code for the MediaSourceError . */
  var extendedError: WinRTError
}

object MediaSourceError {
  @scala.inline
  def apply(extendedError: WinRTError): MediaSourceError = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceError]
  }
}

