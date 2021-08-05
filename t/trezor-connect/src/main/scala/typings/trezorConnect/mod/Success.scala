package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success[T]
  extends StObject
     with ResponseMessage[T] {
  
  var id: Double
  
  var payload: T
  
  var success: `true`
}
object Success {
  
  inline def apply[T](id: Double, payload: T): Success[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], success = true)
    __obj.asInstanceOf[Success[T]]
  }
  
  extension [Self <: Success[?], T](x: Self & Success[T]) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
