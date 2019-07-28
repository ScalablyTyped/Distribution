package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContrastError extends Error {
  @JSName("name")
  var name_ContrastError: typings.atVimeoPlayer.atVimeoPlayerStrings.ContrastError
}

object ContrastError {
  @scala.inline
  def apply(message: String, method: String, name: typings.atVimeoPlayer.atVimeoPlayerStrings.ContrastError): ContrastError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[ContrastError]
  }
}

