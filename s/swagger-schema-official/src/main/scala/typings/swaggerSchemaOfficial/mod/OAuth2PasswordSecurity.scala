package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2PasswordSecurity
  extends BaseOAuthSecurity
     with Security {
  
  @JSName("flow")
  var flow_OAuth2PasswordSecurity: password = js.native
  
  var tokenUrl: String = js.native
}
object OAuth2PasswordSecurity {
  
  @scala.inline
  def apply(flow: password, tokenUrl: String, `type`: oauth2): OAuth2PasswordSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2PasswordSecurity]
  }
  
  @scala.inline
  implicit class OAuth2PasswordSecurityMutableBuilder[Self <: OAuth2PasswordSecurity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: password): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
