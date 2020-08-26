package typings.urllib.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpClientResponse[T] extends js.Object {
  var data: T = js.native
  var headers: OutgoingHttpHeaders = js.native
  var res: IncomingMessage = js.native
  var status: Double = js.native
}

object HttpClientResponse {
  @scala.inline
  def apply[T](data: T, headers: OutgoingHttpHeaders, res: IncomingMessage, status: Double): HttpClientResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpClientResponse[T]]
  }
  @scala.inline
  implicit class HttpClientResponseOps[Self <: HttpClientResponse[_], T] (val x: Self with HttpClientResponse[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: IncomingMessage): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

