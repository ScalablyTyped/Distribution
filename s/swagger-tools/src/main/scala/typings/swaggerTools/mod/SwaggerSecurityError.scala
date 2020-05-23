package typings.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerSecurityError extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object SwaggerSecurityError {
  @scala.inline
  def apply(
    code: String = null,
    message: String = null,
    state: String = null,
    statusCode: js.UndefOr[Double] = js.undefined
  ): SwaggerSecurityError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerSecurityError]
  }
}

