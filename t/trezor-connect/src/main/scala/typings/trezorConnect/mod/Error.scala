package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error
  extends ResponseMessage[js.Any] {
  var payload: typings.trezorConnect.anon.Error = js.native
  var success: `false` = js.native
}

object Error {
  @scala.inline
  def apply(payload: typings.trezorConnect.anon.Error, success: `false`): Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setPayload(value: typings.trezorConnect.anon.Error): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: `false`): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

