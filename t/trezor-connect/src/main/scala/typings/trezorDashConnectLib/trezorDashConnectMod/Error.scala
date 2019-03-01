package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error
  extends ResponseMessage[js.Any] {
  var payload: trezorDashConnectLib.Anon_Error
  var success: trezorDashConnectLib.trezorDashConnectLibNumbers.`false`
}

object Error {
  @scala.inline
  def apply(
    payload: trezorDashConnectLib.Anon_Error,
    success: trezorDashConnectLib.trezorDashConnectLibNumbers.`false`
  ): Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Error]
  }
}

