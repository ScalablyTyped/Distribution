package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpMessagingGrantPayload
  extends StObject
     with GrantPayload {
  
  var deployment_role_sid: String
  
  var endpoint_id: String
  
  var push_credential_sid: String
  
  var service_sid: String
}
object IpMessagingGrantPayload {
  
  inline def apply(deployment_role_sid: String, endpoint_id: String, push_credential_sid: String, service_sid: String): IpMessagingGrantPayload = {
    val __obj = js.Dynamic.literal(deployment_role_sid = deployment_role_sid.asInstanceOf[js.Any], endpoint_id = endpoint_id.asInstanceOf[js.Any], push_credential_sid = push_credential_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpMessagingGrantPayload]
  }
  
  extension [Self <: IpMessagingGrantPayload](x: Self) {
    
    inline def setDeployment_role_sid(value: String): Self = StObject.set(x, "deployment_role_sid", value.asInstanceOf[js.Any])
    
    inline def setEndpoint_id(value: String): Self = StObject.set(x, "endpoint_id", value.asInstanceOf[js.Any])
    
    inline def setPush_credential_sid(value: String): Self = StObject.set(x, "push_credential_sid", value.asInstanceOf[js.Any])
    
    inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
  }
}
