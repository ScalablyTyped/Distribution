package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatGrantPayload extends StObject {
  
  var deployment_role_sid: js.UndefOr[String] = js.undefined
  
  var endpoint_id: js.UndefOr[String] = js.undefined
  
  var push_credential_sid: js.UndefOr[String] = js.undefined
  
  var service_sid: js.UndefOr[String] = js.undefined
}
object ChatGrantPayload {
  
  inline def apply(): ChatGrantPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatGrantPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatGrantPayload] (val x: Self) extends AnyVal {
    
    inline def setDeployment_role_sid(value: String): Self = StObject.set(x, "deployment_role_sid", value.asInstanceOf[js.Any])
    
    inline def setDeployment_role_sidUndefined: Self = StObject.set(x, "deployment_role_sid", js.undefined)
    
    inline def setEndpoint_id(value: String): Self = StObject.set(x, "endpoint_id", value.asInstanceOf[js.Any])
    
    inline def setEndpoint_idUndefined: Self = StObject.set(x, "endpoint_id", js.undefined)
    
    inline def setPush_credential_sid(value: String): Self = StObject.set(x, "push_credential_sid", value.asInstanceOf[js.Any])
    
    inline def setPush_credential_sidUndefined: Self = StObject.set(x, "push_credential_sid", js.undefined)
    
    inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
    
    inline def setService_sidUndefined: Self = StObject.set(x, "service_sid", js.undefined)
  }
}
