package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivacyError extends Error {
  @JSName("name")
  var name_PrivacyError: atVimeoPlayerLib.atVimeoPlayerLibStrings.PrivacyError
}

object PrivacyError {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: atVimeoPlayerLib.atVimeoPlayerLibStrings.PrivacyError
  ): PrivacyError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[PrivacyError]
  }
}

