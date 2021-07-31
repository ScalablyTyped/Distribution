package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentAuthorizationInfo extends StObject {
  
  var authorizationHeaderFor: AuthorizationHeaderFor
  
  var resources: js.Array[String]
  
  var tenantId: String
  
  var vstsAccessTokenKey: String
}
object DeploymentAuthorizationInfo {
  
  @scala.inline
  def apply(
    authorizationHeaderFor: AuthorizationHeaderFor,
    resources: js.Array[String],
    tenantId: String,
    vstsAccessTokenKey: String
  ): DeploymentAuthorizationInfo = {
    val __obj = js.Dynamic.literal(authorizationHeaderFor = authorizationHeaderFor.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], vstsAccessTokenKey = vstsAccessTokenKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentAuthorizationInfo]
  }
  
  @scala.inline
  implicit class DeploymentAuthorizationInfoMutableBuilder[Self <: DeploymentAuthorizationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationHeaderFor(value: AuthorizationHeaderFor): Self = StObject.set(x, "authorizationHeaderFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVstsAccessTokenKey(value: String): Self = StObject.set(x, "vstsAccessTokenKey", value.asInstanceOf[js.Any])
  }
}
