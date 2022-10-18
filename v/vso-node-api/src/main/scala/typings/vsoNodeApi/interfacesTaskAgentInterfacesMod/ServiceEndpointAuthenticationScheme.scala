package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEndpointAuthenticationScheme extends StObject {
  
  var authorizationHeaders: js.Array[AuthorizationHeader]
  
  var displayName: String
  
  var inputDescriptors: js.Array[InputDescriptor]
  
  var scheme: String
}
object ServiceEndpointAuthenticationScheme {
  
  inline def apply(
    authorizationHeaders: js.Array[AuthorizationHeader],
    displayName: String,
    inputDescriptors: js.Array[InputDescriptor],
    scheme: String
  ): ServiceEndpointAuthenticationScheme = {
    val __obj = js.Dynamic.literal(authorizationHeaders = authorizationHeaders.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointAuthenticationScheme]
  }
  
  extension [Self <: ServiceEndpointAuthenticationScheme](x: Self) {
    
    inline def setAuthorizationHeaders(value: js.Array[AuthorizationHeader]): Self = StObject.set(x, "authorizationHeaders", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationHeadersVarargs(value: AuthorizationHeader*): Self = StObject.set(x, "authorizationHeaders", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptors(value: js.Array[InputDescriptor]): Self = StObject.set(x, "inputDescriptors", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptorsVarargs(value: InputDescriptor*): Self = StObject.set(x, "inputDescriptors", js.Array(value*))
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
