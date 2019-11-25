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
    dataPath: String = null,
    schemaPath: String = null,
    subErrors: js.Array[ValidationError] = null
  ): ErrorVar = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    if (dataPath != null) __obj.updateDynamic("dataPath")(dataPath.asInstanceOf[js.Any])
    if (schemaPath != null) __obj.updateDynamic("schemaPath")(schemaPath.asInstanceOf[js.Any])
    if (subErrors != null) __obj.updateDynamic("subErrors")(subErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorVar]
  }
}

