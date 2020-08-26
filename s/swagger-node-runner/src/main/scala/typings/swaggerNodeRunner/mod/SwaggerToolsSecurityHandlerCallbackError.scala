package typings.swaggerNodeRunner.mod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerToolsSecurityHandlerCallbackError extends js.Object {
  var code: js.UndefOr[String] = js.native
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
  var message: js.UndefOr[String] = js.native
  var statusCode: js.UndefOr[Double] = js.native
}

object SwaggerToolsSecurityHandlerCallbackError {
  @scala.inline
  def apply(): SwaggerToolsSecurityHandlerCallbackError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerToolsSecurityHandlerCallbackError]
  }
  @scala.inline
  implicit class SwaggerToolsSecurityHandlerCallbackErrorOps[Self <: SwaggerToolsSecurityHandlerCallbackError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

