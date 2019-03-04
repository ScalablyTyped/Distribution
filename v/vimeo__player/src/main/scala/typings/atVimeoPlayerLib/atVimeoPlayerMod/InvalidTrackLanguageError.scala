package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTrackLanguageError extends Error {
  @JSName("name")
  var name_InvalidTrackLanguageError: atVimeoPlayerLib.atVimeoPlayerLibStrings.InvalidTrackLanguageError
}

object InvalidTrackLanguageError {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: atVimeoPlayerLib.atVimeoPlayerLibStrings.InvalidTrackLanguageError
  ): InvalidTrackLanguageError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[InvalidTrackLanguageError]
  }
}

