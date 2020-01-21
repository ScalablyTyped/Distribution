package typings.vimeoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedError extends Error {
  @JSName("name")
  var name_UnsupportedError: typings.vimeoPlayer.vimeoPlayerStrings.UnsupportedError
}

object UnsupportedError {
  @scala.inline
  def apply(message: String, method: String, name: typings.vimeoPlayer.vimeoPlayerStrings.UnsupportedError): UnsupportedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnsupportedError]
  }
}

