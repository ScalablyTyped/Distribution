package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.accessCode
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOAuthSecurity extends BaseSecurity {
  
  var flow: accessCode | application | `implicit` | password = js.native
  
  var scopes: js.UndefOr[OAuthScope] = js.native
  
  @JSName("type")
  var type_BaseOAuthSecurity: oauth2 = js.native
}
object BaseOAuthSecurity {
  
  @scala.inline
  def apply(flow: accessCode | application | `implicit` | password, `type`: oauth2): BaseOAuthSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOAuthSecurity]
  }
  
  @scala.inline
  implicit class BaseOAuthSecurityOps[Self <: BaseOAuthSecurity] (val x: Self) extends AnyVal {
    
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
    def setFlow(value: accessCode | application | `implicit` | password): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: oauth2): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: OAuthScope): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
}
