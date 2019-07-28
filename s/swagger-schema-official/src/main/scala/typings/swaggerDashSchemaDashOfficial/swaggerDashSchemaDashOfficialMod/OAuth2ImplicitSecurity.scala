package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.`implicit`
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.oauth2
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
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, flow = flow)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OAuth2ImplicitSecurity]
  }
}

