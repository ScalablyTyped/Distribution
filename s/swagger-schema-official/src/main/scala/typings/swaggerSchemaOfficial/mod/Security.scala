package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.accessCode
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.apiKey
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.basic
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.header
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def ApiKeySecurity(in: query | header, name: String, `type`: apiKey): typings.swaggerSchemaOfficial.mod.ApiKeySecurity = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.ApiKeySecurity]
  }
  
  @scala.inline
  def BasicAuthenticationSecurity(`type`: basic): typings.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity]
  }
  
  @scala.inline
  def OAuth2AccessCodeSecurity(authorizationUrl: String, flow: accessCode, tokenUrl: String, `type`: oauth2): typings.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity]
  }
  
  @scala.inline
  def OAuth2ApplicationSecurity(flow: application, tokenUrl: String, `type`: oauth2): typings.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity]
  }
  
  @scala.inline
  def OAuth2ImplicitSecurity(authorizationUrl: String, flow: `implicit`, `type`: oauth2): typings.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity]
  }
  
  @scala.inline
  def OAuth2PasswordSecurity(flow: password, tokenUrl: String, `type`: oauth2): typings.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity]
  }
}
