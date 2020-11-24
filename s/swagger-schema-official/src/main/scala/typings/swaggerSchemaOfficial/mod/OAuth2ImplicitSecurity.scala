package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2ImplicitSecurity
  extends BaseOAuthSecurity
     with Security {
  
  var authorizationUrl: String = js.native
  
  @JSName("flow")
  var flow_OAuth2ImplicitSecurity: `implicit` = js.native
}
object OAuth2ImplicitSecurity {
  
  @scala.inline
  def apply(authorizationUrl: String, flow: `implicit`, `type`: oauth2): OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2ImplicitSecurity]
  }
  
  @scala.inline
  implicit class OAuth2ImplicitSecurityOps[Self <: OAuth2ImplicitSecurity] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationUrl(value: String): Self = this.set("authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: `implicit`): Self = this.set("flow", value.asInstanceOf[js.Any])
  }
}
