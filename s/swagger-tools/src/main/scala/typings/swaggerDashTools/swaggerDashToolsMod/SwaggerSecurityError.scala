package typings.swaggerDashTools.swaggerDashToolsMod

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
  def apply(code: String = null, message: String = null, state: String = null, statusCode: Int | Double = null): SwaggerSecurityError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    if (state != null) __obj.updateDynamic("state")(state)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerSecurityError]
  }
}

