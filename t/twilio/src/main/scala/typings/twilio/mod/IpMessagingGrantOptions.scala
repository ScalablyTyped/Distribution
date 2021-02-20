package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpMessagingGrantOptions extends StObject {
  
  var deploymentRoleSid: String = js.native
  
  var endpointId: String = js.native
  
  var pushCredentialSid: String = js.native
  
  var serviceSid: String = js.native
}
object IpMessagingGrantOptions {
  
  @scala.inline
  def apply(deploymentRoleSid: String, endpointId: String, pushCredentialSid: String, serviceSid: String): IpMessagingGrantOptions = {
    val __obj = js.Dynamic.literal(deploymentRoleSid = deploymentRoleSid.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], pushCredentialSid = pushCredentialSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpMessagingGrantOptions]
  }
  
  @scala.inline
  implicit class IpMessagingGrantOptionsMutableBuilder[Self <: IpMessagingGrantOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentRoleSid(value: String): Self = StObject.set(x, "deploymentRoleSid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushCredentialSid(value: String): Self = StObject.set(x, "pushCredentialSid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
  }
}
