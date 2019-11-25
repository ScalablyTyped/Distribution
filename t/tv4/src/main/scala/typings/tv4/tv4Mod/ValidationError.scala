package typings.tv4.tv4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var code: Double
  var dataPath: js.UndefOr[String] = js.undefined
  var message: js.Any
  var schemaPath: js.UndefOr[String] = js.undefined
  var subErrors: js.UndefOr[js.Array[ValidationError]] = js.undefined
}

object ValidationError {
  @scala.inline
  def apply(
    code: Double,
    message: js.Any,
    dataPath: String = null,
    schemaPath: String = null,
    subErrors: js.Array[ValidationError] = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (dataPath != null) __obj.updateDynamic("dataPath")(dataPath.asInstanceOf[js.Any])
    if (schemaPath != null) __obj.updateDynamic("schemaPath")(schemaPath.asInstanceOf[js.Any])
    if (subErrors != null) __obj.updateDynamic("subErrors")(subErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

