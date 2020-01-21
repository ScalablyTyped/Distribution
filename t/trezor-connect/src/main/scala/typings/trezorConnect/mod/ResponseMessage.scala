package typings.trezorConnect.mod

import typings.trezorConnect.AnonError
import typings.trezorConnect.trezorConnectBooleans.`false`
import typings.trezorConnect.trezorConnectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.mod.Error
  - typings.trezorConnect.mod.Success[T]
*/
trait ResponseMessage[T] extends js.Object

object ResponseMessage {
  @scala.inline
  def Error[T](payload: AnonError, success: `false`): ResponseMessage[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseMessage[T]]
  }
  @scala.inline
  def Success[T](id: Double, payload: T, success: `true`): ResponseMessage[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseMessage[T]]
  }
}

