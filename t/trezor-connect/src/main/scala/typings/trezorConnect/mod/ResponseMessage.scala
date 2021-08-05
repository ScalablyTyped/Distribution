package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.mod.Error
  - typings.trezorConnect.mod.Success[T]
*/
trait ResponseMessage[T] extends StObject
object ResponseMessage {
  
  inline def Error(payload: typings.trezorConnect.anon.Error): typings.trezorConnect.mod.Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = false)
    __obj.asInstanceOf[typings.trezorConnect.mod.Error]
  }
  
  inline def Success[T](id: Double, payload: T): typings.trezorConnect.mod.Success[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], success = true)
    __obj.asInstanceOf[typings.trezorConnect.mod.Success[T]]
  }
}
