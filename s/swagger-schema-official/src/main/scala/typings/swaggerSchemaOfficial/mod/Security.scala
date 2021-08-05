package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.header
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity
  - typings.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity
  - typings.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity
  - typings.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity
  - typings.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity
  - typings.swaggerSchemaOfficial.mod.ApiKeySecurity
*/
trait Security extends StObject
object Security {
  
  inline def ApiKeySecurity(in: query | header, name: String): typings.swaggerSchemaOfficial.mod.ApiKeySecurity = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("apiKey")
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.ApiKeySecurity]
  }
  
  inline def BasicAuthenticationSecurity(): typings.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("basic")
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity]
  }
  
  inline def OAuth2AccessCodeSecurity(authorizationUrl: String, tokenUrl: String): typings.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "accessCode", tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity]
  }
  
  inline def OAuth2ApplicationSecurity(tokenUrl: String): typings.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity = {
    val __obj = js.Dynamic.literal(flow = "application", tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity]
  }
  
  inline def OAuth2ImplicitSecurity(authorizationUrl: String): typings.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = "implicit")
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity]
  }
  
  inline def OAuth2PasswordSecurity(tokenUrl: String): typings.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity = {
    val __obj = js.Dynamic.literal(flow = "password", tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("oauth2")
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity]
  }
}
