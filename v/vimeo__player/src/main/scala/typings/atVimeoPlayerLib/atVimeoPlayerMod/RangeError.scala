package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeError extends Error {
  @JSName("name")
  var name_RangeError: atVimeoPlayerLib.atVimeoPlayerLibStrings.RangeError
}

object RangeError {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: atVimeoPlayerLib.atVimeoPlayerLibStrings.RangeError
  ): RangeError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[RangeError]
  }
}

