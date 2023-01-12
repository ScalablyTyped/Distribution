package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactInstanceData extends StObject {
  
  var accountName: String
  
  var authenticationToken: String
  
  var tfsUrl: String
  
  var version: String
}
object ArtifactInstanceData {
  
  inline def apply(accountName: String, authenticationToken: String, tfsUrl: String, version: String): ArtifactInstanceData = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], authenticationToken = authenticationToken.asInstanceOf[js.Any], tfsUrl = tfsUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactInstanceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactInstanceData] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationToken(value: String): Self = StObject.set(x, "authenticationToken", value.asInstanceOf[js.Any])
    
    inline def setTfsUrl(value: String): Self = StObject.set(x, "tfsUrl", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
