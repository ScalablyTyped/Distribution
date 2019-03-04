package typings
package tv4Lib.tv4Mod.tv4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorVar extends ValidationError {
  var params: js.Any
  var stack: java.lang.String
}

object ErrorVar {
  @scala.inline
  def apply(
    code: scala.Double,
    message: js.Any,
    params: js.Any,
    stack: java.lang.String,
    subErrors: js.Any,
    dataPath: java.lang.String = null,
    schemaPath: java.lang.String = null
  ): ErrorVar = {
    val __obj = js.Dynamic.literal(code = code, message = message, params = params, stack = stack, subErrors = subErrors)
    if (dataPath != null) __obj.updateDynamic("dataPath")(dataPath)
    if (schemaPath != null) __obj.updateDynamic("schemaPath")(schemaPath)
    __obj.asInstanceOf[ErrorVar]
  }
}

