package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.application
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2ApplicationSecurity
  extends BaseOAuthSecurity
     with Security {
  @JSName("flow")
  var flow_OAuth2ApplicationSecurity: application
  var tokenUrl: String
}

object OAuth2ApplicationSecurity {
  @scala.inline
  def apply(
    flow: application,
    tokenUrl: String,
    `type`: oauth2,
    description: String = null,
    scopes: OAuthScope = null
  ): OAuth2ApplicationSecurity = {
    val __obj = js.Dynamic.literal(flow = flow, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OAuth2ApplicationSecurity]
  }
}

