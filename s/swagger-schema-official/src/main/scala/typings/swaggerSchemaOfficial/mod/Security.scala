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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity
  - typings.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity
  - typings.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity
  - typings.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity
  - typings.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity
  - typings.swaggerSchemaOfficial.mod.ApiKeySecurity
*/
trait Security extends js.Object

object Security {
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
  def ApiKeySecurity(in: query | header, name: String, `type`: apiKey, description: String = null): Security = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
  @scala.inline
  def BasicAuthenticationSecurity(`type`: basic, description: String = null): Security = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
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
}

