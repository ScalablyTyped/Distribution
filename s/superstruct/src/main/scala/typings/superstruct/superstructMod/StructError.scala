package typings.superstruct.superstructMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructError extends Error {
  var data: js.Any
  var errors: js.Array[StructError]
  var path: js.Array[String]
  var reason: js.Any
  var `type`: String
  var value: js.Any
}

object StructError {
  @scala.inline
  def apply(
    data: js.Any,
    errors: js.Array[StructError],
    message: String,
    name: String,
    path: js.Array[String],
    reason: js.Any,
    `type`: String,
    value: js.Any,
    stack: String = null
  ): StructError = {
    val __obj = js.Dynamic.literal(data = data, errors = errors, message = message, name = name, path = path, reason = reason, value = value)
    __obj.updateDynamic("type")(`type`)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StructError]
  }
}

