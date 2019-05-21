package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2AccessCodeSecurity
  extends BaseOAuthSecuirty
     with Security {
  var authorizationUrl: java.lang.String
  @JSName("flow")
  var flow_OAuth2AccessCodeSecurity: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.accessCode
  var scopes: js.UndefOr[js.Array[OAuthScope]] = js.undefined
  var tokenUrl: java.lang.String
}

object OAuth2AccessCodeSecurity {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String,
    flow: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.accessCode,
    tokenUrl: java.lang.String,
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.oauth2,
    description: java.lang.String = null,
    scopes: js.Array[OAuthScope] = null
  ): OAuth2AccessCodeSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, flow = flow, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OAuth2AccessCodeSecurity]
  }
}

