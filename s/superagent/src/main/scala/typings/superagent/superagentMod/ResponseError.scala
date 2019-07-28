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
    val __obj = js.Dynamic.literal(message = message, method = method, name = name, path = path, status = status, text = text)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ResponseError]
  }
}

