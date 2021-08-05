package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with ResponseMessage[js.Any] {
  
  var payload: typings.trezorConnect.anon.Error
  
  var success: `false`
}
object Error {
  
  inline def apply(payload: typings.trezorConnect.anon.Error): Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = false)
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setPayload(value: typings.trezorConnect.anon.Error): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
