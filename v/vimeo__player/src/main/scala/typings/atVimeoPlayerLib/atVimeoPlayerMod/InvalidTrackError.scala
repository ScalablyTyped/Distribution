package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTrackError extends Error {
  @JSName("name")
  var name_InvalidTrackError: atVimeoPlayerLib.atVimeoPlayerLibStrings.InvalidTrackError
}

object InvalidTrackError {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: atVimeoPlayerLib.atVimeoPlayerLibStrings.InvalidTrackError
  ): InvalidTrackError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[InvalidTrackError]
  }
}

