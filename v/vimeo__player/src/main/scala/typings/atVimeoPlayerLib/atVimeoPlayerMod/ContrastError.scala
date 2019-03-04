package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContrastError extends Error {
  @JSName("name")
  var name_ContrastError: atVimeoPlayerLib.atVimeoPlayerLibStrings.ContrastError
}

object ContrastError {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: atVimeoPlayerLib.atVimeoPlayerLibStrings.ContrastError
  ): ContrastError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[ContrastError]
  }
}

