package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AadOauthTokenRequest extends StObject {
  
  var refresh: Boolean
  
  var resource: String
  
  var tenantId: String
  
  var token: String
}
object AadOauthTokenRequest {
  
  @scala.inline
  def apply(refresh: Boolean, resource: String, tenantId: String, token: String): AadOauthTokenRequest = {
    val __obj = js.Dynamic.literal(refresh = refresh.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AadOauthTokenRequest]
  }
  
  @scala.inline
  implicit class AadOauthTokenRequestMutableBuilder[Self <: AadOauthTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
