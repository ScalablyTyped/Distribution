package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTrackError extends Error {
  @JSName("name")
  var name_InvalidTrackError: typings.atVimeoPlayer.atVimeoPlayerStrings.InvalidTrackError
}

object InvalidTrackError {
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: typings.atVimeoPlayer.atVimeoPlayerStrings.InvalidTrackError
  ): InvalidTrackError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[InvalidTrackError]
  }
}

