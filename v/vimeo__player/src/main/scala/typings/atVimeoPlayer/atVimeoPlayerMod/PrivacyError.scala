package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivacyError extends Error {
  @JSName("name")
  var name_PrivacyError: typings.atVimeoPlayer.atVimeoPlayerStrings.PrivacyError
}

object PrivacyError {
  @scala.inline
  def apply(message: String, method: String, name: typings.atVimeoPlayer.atVimeoPlayerStrings.PrivacyError): PrivacyError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[PrivacyError]
  }
}

