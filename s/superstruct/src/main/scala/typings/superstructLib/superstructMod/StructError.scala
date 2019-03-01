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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("value")(value)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StructError]
  }
}

