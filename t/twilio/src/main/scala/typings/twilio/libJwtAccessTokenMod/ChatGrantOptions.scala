package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatGrantOptions extends StObject {
  
  var deploymentRoleSid: js.UndefOr[String] = js.undefined
  
  var endpointId: js.UndefOr[String] = js.undefined
  
  var pushCredentialSid: js.UndefOr[String] = js.undefined
  
  var serviceSid: js.UndefOr[String] = js.undefined
}
object ChatGrantOptions {
  
  inline def apply(): ChatGrantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatGrantOptions]
  }
  
  extension [Self <: ChatGrantOptions](x: Self) {
    
    inline def setDeploymentRoleSid(value: String): Self = StObject.set(x, "deploymentRoleSid", value.asInstanceOf[js.Any])
    
    inline def setDeploymentRoleSidUndefined: Self = StObject.set(x, "deploymentRoleSid", js.undefined)
    
    inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "endpointId", js.undefined)
    
    inline def setPushCredentialSid(value: String): Self = StObject.set(x, "pushCredentialSid", value.asInstanceOf[js.Any])
    
    inline def setPushCredentialSidUndefined: Self = StObject.set(x, "pushCredentialSid", js.undefined)
    
    inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    
    inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
  }
}
