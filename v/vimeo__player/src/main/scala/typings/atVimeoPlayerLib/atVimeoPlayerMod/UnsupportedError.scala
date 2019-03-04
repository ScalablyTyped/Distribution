package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedError extends Error {
  @JSName("name")
  var name_UnsupportedError: atVimeoPlayerLib.atVimeoPlayerLibStrings.UnsupportedError
}

object UnsupportedError {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: atVimeoPlayerLib.atVimeoPlayerLibStrings.UnsupportedError
  ): UnsupportedError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[UnsupportedError]
  }
}

