package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.`implicit`
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.accessCode
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.apiKey
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.application
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.basic
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.header
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.oauth2
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.password
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.BasicAuthenticationSecurity
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.OAuth2AccessCodeSecurity
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.OAuth2ApplicationSecurity
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.OAuth2ImplicitSecurity
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.OAuth2PasswordSecurity
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.ApiKeySecurity
*/
trait Security extends js.Object

object Security {
  @scala.inline
  def BasicAuthenticationSecurity(`type`: basic, description: String = null): Security = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
  @scala.inline
  def OAuth2AccessCodeSecurity(
    authorizationUrl: String,
    flow: accessCode,
    tokenUrl: String,
    `type`: oauth2,
    description: String = null,
    scopes: OAuthScope = null
  ): Security = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
  @scala.inline
  def OAuth2ApplicationSecurity(
    flow: application,
    tokenUrl: String,
    `type`: oauth2,
    description: String = null,
    scopes: OAuthScope = null
  ): Security = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
  @scala.inline
  def ApiKeySecurity(in: query | header, name: String, `type`: apiKey, description: String = null): Security = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
  @scala.inline
  def OAuth2PasswordSecurity(
    flow: password,
    tokenUrl: String,
    `type`: oauth2,
    description: String = null,
    scopes: OAuthScope = null
  ): Security = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
  @scala.inline
  def OAuth2ImplicitSecurity(
    authorizationUrl: String,
    flow: `implicit`,
    `type`: oauth2,
    description: String = null,
    scopes: OAuthScope = null
  ): Security = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
}

