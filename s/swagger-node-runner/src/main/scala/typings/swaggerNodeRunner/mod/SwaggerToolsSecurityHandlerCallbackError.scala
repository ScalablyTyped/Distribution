package typings.swaggerNodeRunner.mod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerToolsSecurityHandlerCallbackError extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object SwaggerToolsSecurityHandlerCallbackError {
  @scala.inline
  def apply(
    code: String = null,
    headers: OutgoingHttpHeaders = null,
    message: String = null,
    statusCode: Int | Double = null
  ): SwaggerToolsSecurityHandlerCallbackError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerToolsSecurityHandlerCallbackError]
  }
}

