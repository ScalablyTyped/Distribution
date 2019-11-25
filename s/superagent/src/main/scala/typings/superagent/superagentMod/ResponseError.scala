package typings.superagent.superagentMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseError extends Error {
  var method: String
  var path: String
  var status: Double
  var text: String
}

object ResponseError {
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: String,
    path: String,
    status: Double,
    text: String,
    stack: String = null
  ): ResponseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseError]
  }
}

