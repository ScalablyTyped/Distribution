package typings.tv4.tv4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorVar extends ValidationError {
  var params: js.Any
  var stack: String
}

object ErrorVar {
  @scala.inline
  def apply(
    code: Double,
    message: js.Any,
    params: js.Any,
    stack: String,
    subErrors: js.Any,
    dataPath: String = null,
    schemaPath: String = null
  ): ErrorVar = {
    val __obj = js.Dynamic.literal(code = code, message = message, params = params, stack = stack, subErrors = subErrors)
    if (dataPath != null) __obj.updateDynamic("dataPath")(dataPath)
    if (schemaPath != null) __obj.updateDynamic("schemaPath")(schemaPath)
    __obj.asInstanceOf[ErrorVar]
  }
}

