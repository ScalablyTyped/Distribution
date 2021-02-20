package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectBooleans.`false`
import typings.trezorConnect.trezorConnectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.mod.Error
  - typings.trezorConnect.mod.Success[T]
*/
trait ResponseMessage[T] extends StObject
object ResponseMessage {
  
  @scala.inline
  def Error(payload: typings.trezorConnect.anon.Error, success: `false`): typings.trezorConnect.mod.Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.mod.Error]
  }
  
  @scala.inline
  def Success[T](id: Double, payload: T, success: `true`): typings.trezorConnect.mod.Success[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.mod.Success[T]]
  }
}
