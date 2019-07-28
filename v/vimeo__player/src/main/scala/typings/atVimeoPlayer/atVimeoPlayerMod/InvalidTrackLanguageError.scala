package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTrackLanguageError extends Error {
  @JSName("name")
  var name_InvalidTrackLanguageError: typings.atVimeoPlayer.atVimeoPlayerStrings.InvalidTrackLanguageError
}

object InvalidTrackLanguageError {
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: typings.atVimeoPlayer.atVimeoPlayerStrings.InvalidTrackLanguageError
  ): InvalidTrackLanguageError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[InvalidTrackLanguageError]
  }
}

