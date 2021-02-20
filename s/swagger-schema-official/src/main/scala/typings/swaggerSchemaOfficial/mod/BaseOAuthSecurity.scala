package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.accessCode
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import org.scalablytyped.runtime.StObject
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
  implicit class BaseOAuthSecurityMutableBuilder[Self <: BaseOAuthSecurity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: accessCode | application | `implicit` | password): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: OAuthScope): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setType(value: oauth2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
