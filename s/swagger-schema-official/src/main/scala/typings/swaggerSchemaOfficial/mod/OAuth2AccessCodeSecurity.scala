package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.accessCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2AccessCodeSecurity
  extends StObject
     with BaseOAuthSecurity
     with Security {
  
  var authorizationUrl: String
  
  @JSName("flow")
  var flow_OAuth2AccessCodeSecurity: accessCode
  
  var tokenUrl: String
}
object OAuth2AccessCodeSecurity {
  
  inline def apply(authorizationUrl: String, tokenUrl: String): OAuth2AccessCodeSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "accessCode", tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[OAuth2AccessCodeSecurity]
  }
  
  extension [Self <: OAuth2AccessCodeSecurity](x: Self) {
    
    inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: accessCode): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
