package typings.webPush.mod

import typings.node.Buffer
import typings.webPush.webPushStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDetails extends js.Object {
  var body: Buffer | Null = js.native
  var endpoint: String = js.native
  var headers: Headers = js.native
  var method: POST = js.native
  var proxy: js.UndefOr[String] = js.native
}

object RequestDetails {
  @scala.inline
  def apply(endpoint: String, headers: Headers, method: POST): RequestDetails = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetails]
  }
  @scala.inline
  implicit class RequestDetailsOps[Self <: RequestDetails] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: POST): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
  
}

