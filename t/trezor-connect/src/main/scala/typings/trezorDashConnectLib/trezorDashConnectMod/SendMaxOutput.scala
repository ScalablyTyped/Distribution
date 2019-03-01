package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMaxOutput extends Output {
  var address: java.lang.String
  var `type`: trezorDashConnectLib.trezorDashConnectLibStrings.`send-max`
}

object SendMaxOutput {
  @scala.inline
  def apply(address: java.lang.String, `type`: trezorDashConnectLib.trezorDashConnectLibStrings.`send-max`): SendMaxOutput = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("address")(address)
    __obj.asInstanceOf[SendMaxOutput]
  }
}

