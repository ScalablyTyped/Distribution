package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeError extends Error {
  @JSName("name")
  var name_RangeError: typings.atVimeoPlayer.atVimeoPlayerStrings.RangeError
}

object RangeError {
  @scala.inline
  def apply(message: String, method: String, name: typings.atVimeoPlayer.atVimeoPlayerStrings.RangeError): RangeError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name)
  
    __obj.asInstanceOf[RangeError]
  }
}

