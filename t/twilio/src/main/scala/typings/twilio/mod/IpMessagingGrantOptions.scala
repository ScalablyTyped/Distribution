package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpMessagingGrantOptions extends StObject {
  
  var deploymentRoleSid: String
  
  var endpointId: String
  
  var pushCredentialSid: String
  
  var serviceSid: String
}
object IpMessagingGrantOptions {
  
  inline def apply(deploymentRoleSid: String, endpointId: String, pushCredentialSid: String, serviceSid: String): IpMessagingGrantOptions = {
    val __obj = js.Dynamic.literal(deploymentRoleSid = deploymentRoleSid.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], pushCredentialSid = pushCredentialSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpMessagingGrantOptions]
  }
  
  extension [Self <: IpMessagingGrantOptions](x: Self) {
    
    inline def setDeploymentRoleSid(value: String): Self = StObject.set(x, "deploymentRoleSid", value.asInstanceOf[js.Any])
    
    inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    
    inline def setPushCredentialSid(value: String): Self = StObject.set(x, "pushCredentialSid", value.asInstanceOf[js.Any])
    
    inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
  }
}
