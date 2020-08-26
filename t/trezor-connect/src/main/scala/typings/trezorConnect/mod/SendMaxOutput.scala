package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectStrings.`send-max`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMaxOutput extends Output {
  var address: String = js.native
  var `type`: `send-max` = js.native
}

object SendMaxOutput {
  @scala.inline
  def apply(address: String, `type`: `send-max`): SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMaxOutput]
  }
  @scala.inline
  implicit class SendMaxOutputOps[Self <: SendMaxOutput] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `send-max`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

