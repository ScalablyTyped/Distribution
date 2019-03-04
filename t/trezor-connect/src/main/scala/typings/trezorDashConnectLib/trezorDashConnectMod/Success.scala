package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success[T] extends ResponseMessage[T] {
  var id: scala.Double
  var payload: T
  var success: trezorDashConnectLib.trezorDashConnectLibNumbers.`true`
}

object Success {
  @scala.inline
  def apply[T](id: scala.Double, payload: T, success: trezorDashConnectLib.trezorDashConnectLibNumbers.`true`): Success[T] = {
    val __obj = js.Dynamic.literal(id = id, payload = payload.asInstanceOf[js.Any], success = success)
  
    __obj.asInstanceOf[Success[T]]
  }
}

