package typings.wreck.mod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestResponse extends js.Object {
  var payload: js.Any = js.native
  var res: IncomingMessage = js.native
}

object RequestResponse {
  @scala.inline
  def apply(payload: js.Any, res: IncomingMessage): RequestResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponse]
  }
  @scala.inline
  implicit class RequestResponseOps[Self <: RequestResponse] (val x: Self) extends AnyVal {
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
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: IncomingMessage): Self = this.set("res", value.asInstanceOf[js.Any])
  }
  
}

