package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Success[T] extends ResponseMessage[T] {
  
  var id: Double = js.native
  
  var payload: T = js.native
  
  var success: `true` = js.native
}
object Success {
  
  @scala.inline
  def apply[T](id: Double, payload: T, success: `true`): Success[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success[T]]
  }
  
  @scala.inline
  implicit class SuccessMutableBuilder[Self <: Success[_], T] (val x: Self with Success[T]) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
