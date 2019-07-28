package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedError extends Error {
  @JSName("name")
  var name_UnsupportedError: typings.atVimeoPlayer.atVimeoPlayerStrings.UnsupportedError
}

object UnsupportedError {
  @scala.inline
  def apply(message: String, method: String, name: typings.atVimeoPlayer.atVimeoPlayerStrings.UnsupportedError): UnsupportedError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[UnsupportedError]
  }
}

