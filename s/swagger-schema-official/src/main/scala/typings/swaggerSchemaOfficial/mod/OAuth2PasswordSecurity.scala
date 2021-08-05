package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2PasswordSecurity
  extends StObject
     with BaseOAuthSecurity
     with Security {
  
  @JSName("flow")
  var flow_OAuth2PasswordSecurity: password
  
  var tokenUrl: String
}
object OAuth2PasswordSecurity {
  
  inline def apply(tokenUrl: String): OAuth2PasswordSecurity = {
    val __obj = js.Dynamic.literal(flow = "password", tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[OAuth2PasswordSecurity]
  }
  
  extension [Self <: OAuth2PasswordSecurity](x: Self) {
    
    inline def setFlow(value: password): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
