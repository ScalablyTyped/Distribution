package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.oauth2
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2PasswordSecurity
  extends BaseOAuthSecurity
     with Security {
  @JSName("flow")
  var flow_OAuth2PasswordSecurity: password
  var tokenUrl: String
}

object OAuth2PasswordSecurity {
  @scala.inline
  def apply(
    flow: password,
    tokenUrl: String,
    `type`: oauth2,
    description: String = null,
    scopes: OAuthScope = null
  ): OAuth2PasswordSecurity = {
    val __obj = js.Dynamic.literal(flow = flow, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OAuth2PasswordSecurity]
  }
}

