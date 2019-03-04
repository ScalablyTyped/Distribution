package typings
package superstructLib.superstructMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructError
  extends stdLib.Error {
  var data: js.Any
  var errors: js.Array[StructError]
  var path: js.Array[java.lang.String]
  var reason: js.Any
  var `type`: java.lang.String
  var value: js.Any
}

object StructError {
  @scala.inline
  def apply(
    data: js.Any,
    errors: js.Array[StructError],
    message: java.lang.String,
    name: java.lang.String,
    path: js.Array[java.lang.String],
    reason: js.Any,
    `type`: java.lang.String,
    value: js.Any,
    stack: java.lang.String = null
  ): StructError = {
    val __obj = js.Dynamic.literal(data = data, errors = errors, message = message, name = name, path = path, reason = reason, value = value)
    __obj.updateDynamic("type")(`type`)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StructError]
  }
}

