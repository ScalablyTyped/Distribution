package typings.trezorConnect.mod

import typings.trezorConnect.AnonError
import typings.trezorConnect.trezorConnectBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error
  extends ResponseMessage[js.Any] {
  var payload: AnonError
  var success: `false`
}

object Error {
  @scala.inline
  def apply(payload: AnonError, success: `false`): Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

