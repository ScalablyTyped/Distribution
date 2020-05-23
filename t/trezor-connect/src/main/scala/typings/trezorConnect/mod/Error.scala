package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error
  extends ResponseMessage[js.Any] {
  var payload: typings.trezorConnect.anon.Error
  var success: `false`
}

object Error {
  @scala.inline
  def apply(payload: typings.trezorConnect.anon.Error, success: `false`): Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

