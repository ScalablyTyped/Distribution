package typings
package tv4Lib.tv4Mod.tv4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var code: scala.Double
  var dataPath: js.UndefOr[java.lang.String] = js.undefined
  var message: js.Any
  var schemaPath: js.UndefOr[java.lang.String] = js.undefined
  var subErrors: js.UndefOr[js.Array[ValidationError]] = js.undefined
}

object ValidationError {
  @scala.inline
  def apply(
    code: scala.Double,
    message: js.Any,
    dataPath: java.lang.String = null,
    schemaPath: java.lang.String = null,
    subErrors: js.Array[ValidationError] = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    if (dataPath != null) __obj.updateDynamic("dataPath")(dataPath)
    if (schemaPath != null) __obj.updateDynamic("schemaPath")(schemaPath)
    if (subErrors != null) __obj.updateDynamic("subErrors")(subErrors)
    __obj.asInstanceOf[ValidationError]
  }
}

