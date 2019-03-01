package typings
package swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerToolsSecurityHandlerCallbackError extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object SwaggerToolsSecurityHandlerCallbackError {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    headers: nodeLib.httpMod.OutgoingHttpHeaders = null,
    message: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null
  ): SwaggerToolsSecurityHandlerCallbackError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (message != null) __obj.updateDynamic("message")(message)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerToolsSecurityHandlerCallbackError]
  }
}

