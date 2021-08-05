package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2ImplicitSecurity
  extends StObject
     with BaseOAuthSecurity
     with Security {
  
  var authorizationUrl: String
  
  @JSName("flow")
  var flow_OAuth2ImplicitSecurity: `implicit`
}
object OAuth2ImplicitSecurity {
  
  inline def apply(authorizationUrl: String): OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "implicit")
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[OAuth2ImplicitSecurity]
  }
  
  extension [Self <: OAuth2ImplicitSecurity](x: Self) {
    
    inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: `implicit`): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
  }
}
