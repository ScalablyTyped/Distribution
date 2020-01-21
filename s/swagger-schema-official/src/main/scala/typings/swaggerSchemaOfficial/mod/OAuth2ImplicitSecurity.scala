package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2ImplicitSecurity
  extends BaseOAuthSecurity
     with Security {
  var authorizationUrl: String
  @JSName("flow")
  var flow_OAuth2ImplicitSecurity: `implicit`
}

object OAuth2ImplicitSecurity {
  @scala.inline
  def apply(
    authorizationUrl: String,
    flow: `implicit`,
    `type`: oauth2,
    description: String = null,
    scopes: OAuthScope = null
  ): OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2ImplicitSecurity]
  }
}

