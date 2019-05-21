package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2ApplicationSecurity
  extends BaseOAuthSecuirty
     with Security {
  @JSName("flow")
  var flow_OAuth2ApplicationSecurity: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.application
  var scopes: js.UndefOr[js.Array[OAuthScope]] = js.undefined
  var tokenUrl: java.lang.String
}

object OAuth2ApplicationSecurity {
  @scala.inline
  def apply(
    flow: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.application,
    tokenUrl: java.lang.String,
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.oauth2,
    description: java.lang.String = null,
    scopes: js.Array[OAuthScope] = null
  ): OAuth2ApplicationSecurity = {
    val __obj = js.Dynamic.literal(flow = flow, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OAuth2ApplicationSecurity]
  }
}

