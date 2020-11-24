package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceEndpointAuthenticationScheme extends js.Object {
  
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
  implicit class ServiceEndpointAuthenticationSchemeOps[Self <: ServiceEndpointAuthenticationScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizationHeadersVarargs(value: AuthorizationHeader*): Self = this.set("authorizationHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizationHeaders(value: js.Array[AuthorizationHeader]): Self = this.set("authorizationHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptorsVarargs(value: InputDescriptor*): Self = this.set("inputDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setInputDescriptors(value: js.Array[InputDescriptor]): Self = this.set("inputDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
  }
}
