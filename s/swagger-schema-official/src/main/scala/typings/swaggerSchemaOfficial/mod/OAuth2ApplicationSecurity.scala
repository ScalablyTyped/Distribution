package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2ApplicationSecurity
  extends StObject
     with BaseOAuthSecurity
     with Security {
  
  @JSName("flow")
  var flow_OAuth2ApplicationSecurity: application
  
  var tokenUrl: String
}
object OAuth2ApplicationSecurity {
  
  inline def apply(tokenUrl: String): OAuth2ApplicationSecurity = {
    val __obj = js.Dynamic.literal(flow = "application", tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[OAuth2ApplicationSecurity]
  }
  
  extension [Self <: OAuth2ApplicationSecurity](x: Self) {
    
    inline def setFlow(value: application): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
