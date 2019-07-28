package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.trezorDashConnectNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success[T] extends ResponseMessage[T] {
  var id: Double
  var payload: T
  var success: `true`
}

object Success {
  @scala.inline
  def apply[T](id: Double, payload: T, success: `true`): Success[T] = {
    val __obj = js.Dynamic.literal(id = id, payload = payload.asInstanceOf[js.Any], success = success)
  
    __obj.asInstanceOf[Success[T]]
  }
}

