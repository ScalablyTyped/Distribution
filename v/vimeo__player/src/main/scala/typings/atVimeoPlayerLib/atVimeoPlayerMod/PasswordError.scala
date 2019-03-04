package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordError extends Error {
  @JSName("name")
  var name_PasswordError: atVimeoPlayerLib.atVimeoPlayerLibStrings.PasswordError
}

object PasswordError {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: atVimeoPlayerLib.atVimeoPlayerLibStrings.PasswordError
  ): PasswordError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[PasswordError]
  }
}

