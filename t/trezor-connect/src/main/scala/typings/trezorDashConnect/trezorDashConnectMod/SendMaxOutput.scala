package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.trezorDashConnectStrings.`send-max`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMaxOutput extends Output {
  var address: String
  var `type`: `send-max`
}

object SendMaxOutput {
  @scala.inline
  def apply(address: String, `type`: `send-max`): SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SendMaxOutput]
  }
}

