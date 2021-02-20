package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2ApplicationSecurity
  extends BaseOAuthSecurity
     with Security {
  
  @JSName("flow")
  var flow_OAuth2ApplicationSecurity: application = js.native
  
  var tokenUrl: String = js.native
}
object OAuth2ApplicationSecurity {
  
  @scala.inline
  def apply(flow: application, tokenUrl: String, `type`: oauth2): OAuth2ApplicationSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2ApplicationSecurity]
  }
  
  @scala.inline
  implicit class OAuth2ApplicationSecurityMutableBuilder[Self <: OAuth2ApplicationSecurity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: application): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
