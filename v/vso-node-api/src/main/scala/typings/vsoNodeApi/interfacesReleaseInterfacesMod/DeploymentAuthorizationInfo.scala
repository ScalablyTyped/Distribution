package typings.vsoNodeApi.interfacesReleaseInterfacesMod

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
  
  inline def apply(
    authorizationHeaderFor: AuthorizationHeaderFor,
    resources: js.Array[String],
    tenantId: String,
    vstsAccessTokenKey: String
  ): DeploymentAuthorizationInfo = {
    val __obj = js.Dynamic.literal(authorizationHeaderFor = authorizationHeaderFor.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], vstsAccessTokenKey = vstsAccessTokenKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentAuthorizationInfo]
  }
  
  extension [Self <: DeploymentAuthorizationInfo](x: Self) {
    
    inline def setAuthorizationHeaderFor(value: AuthorizationHeaderFor): Self = StObject.set(x, "authorizationHeaderFor", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setVstsAccessTokenKey(value: String): Self = StObject.set(x, "vstsAccessTokenKey", value.asInstanceOf[js.Any])
  }
}
