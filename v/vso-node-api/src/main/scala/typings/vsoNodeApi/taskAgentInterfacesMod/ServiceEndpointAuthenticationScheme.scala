package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceEndpointAuthenticationScheme extends StObject {
  
  var authorizationHeaders: js.Array[AuthorizationHeader] = js.native
  
  var displayName: String = js.native
  
  var inputDescriptors: js.Array[InputDescriptor] = js.native
  
  var scheme: String = js.native
}
object ServiceEndpointAuthenticationScheme {
  
  @scala.inline
  def apply(
    authorizationHeaders: js.Array[AuthorizationHeader],
    displayName: String,
    inputDescriptors: js.Array[InputDescriptor],
    scheme: String
  ): ServiceEndpointAuthenticationScheme = {
    val __obj = js.Dynamic.literal(authorizationHeaders = authorizationHeaders.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointAuthenticationScheme]
  }
  
  @scala.inline
  implicit class ServiceEndpointAuthenticationSchemeMutableBuilder[Self <: ServiceEndpointAuthenticationScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationHeaders(value: js.Array[AuthorizationHeader]): Self = StObject.set(x, "authorizationHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationHeadersVarargs(value: AuthorizationHeader*): Self = StObject.set(x, "authorizationHeaders", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptors(value: js.Array[InputDescriptor]): Self = StObject.set(x, "inputDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptorsVarargs(value: InputDescriptor*): Self = StObject.set(x, "inputDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
