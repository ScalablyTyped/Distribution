package typings.tokenizr.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsingError extends Error

object ParsingError {
  @scala.inline
  def apply(message: String, name: String): ParsingError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingError]
  }
}

