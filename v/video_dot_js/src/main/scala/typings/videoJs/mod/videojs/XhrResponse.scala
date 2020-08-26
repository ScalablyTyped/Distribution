package typings.videoJs.mod.videojs

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XhrResponse extends js.Object {
  var body: js.Any = js.native
  var headers: js.Any = js.native
  var method: String = js.native
  var rawRequest: XMLHttpRequest = js.native
  var statusCode: Double = js.native
  var url: String = js.native
}

object XhrResponse {
  @scala.inline
  def apply(
    body: js.Any,
    headers: js.Any,
    method: String,
    rawRequest: XMLHttpRequest,
    statusCode: Double,
    url: String
  ): XhrResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], rawRequest = rawRequest.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[XhrResponse]
  }
  @scala.inline
  implicit class XhrResponseOps[Self <: XhrResponse] (val x: Self) extends AnyVal {
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawRequest(value: XMLHttpRequest): Self = this.set("rawRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

