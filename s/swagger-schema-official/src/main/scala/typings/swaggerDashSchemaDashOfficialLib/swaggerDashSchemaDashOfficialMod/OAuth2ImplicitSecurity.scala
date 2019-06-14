package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2ImplicitSecurity
  extends BaseOAuthSecurity
     with Security {
  var authorizationUrl: java.lang.String
  @JSName("flow")
  var flow_OAuth2ImplicitSecurity: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.`implicit`
}

object OAuth2ImplicitSecurity {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String,
    flow: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.`implicit`,
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.oauth2,
    description: java.lang.String = null,
    scopes: OAuthScope = null
  ): OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, flow = flow)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OAuth2ImplicitSecurity]
  }
}

