package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.Anon_Error
import typings.trezorDashConnect.trezorDashConnectNumbers.`false`
import typings.trezorDashConnect.trezorDashConnectNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorDashConnect.trezorDashConnectMod.Error
  - typings.trezorDashConnect.trezorDashConnectMod.Success[T]
*/
trait ResponseMessage[T] extends js.Object

object ResponseMessage {
  @scala.inline
  def Error[T](payload: Anon_Error, success: `false`): ResponseMessage[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseMessage[T]]
  }
  @scala.inline
  def Success[T](id: Double, payload: T, success: `true`): ResponseMessage[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseMessage[T]]
  }
}

