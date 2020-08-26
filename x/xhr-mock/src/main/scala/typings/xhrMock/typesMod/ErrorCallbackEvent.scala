package typings.xhrMock.typesMod

import typings.std.Error
import typings.xhrMock.mockRequestMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorCallbackEvent extends js.Object {
  var err: Error = js.native
  var req: default = js.native
}

object ErrorCallbackEvent {
  @scala.inline
  def apply(err: Error, req: default): ErrorCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCallbackEvent]
  }
  @scala.inline
  implicit class ErrorCallbackEventOps[Self <: ErrorCallbackEvent] (val x: Self) extends AnyVal {
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
    def setErr(value: Error): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def setReq(value: default): Self = this.set("req", value.asInstanceOf[js.Any])
  }
  
}

