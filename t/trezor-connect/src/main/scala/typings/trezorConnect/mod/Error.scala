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
  
  @scala.inline
  def apply(payload: typings.trezorConnect.anon.Error): Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = false)
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: typings.trezorConnect.anon.Error): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
