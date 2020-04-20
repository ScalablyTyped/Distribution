package typings.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTrackError extends Error {
  @JSName("name")
  var name_InvalidTrackError: typings.vimeoPlayer.vimeoPlayerStrings.InvalidTrackError
}

object InvalidTrackError {
  @scala.inline
  def apply(message: String, method: String, name: typings.vimeoPlayer.vimeoPlayerStrings.InvalidTrackError): InvalidTrackError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTrackError]
  }
}

