package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2PasswordSecurity
  extends BaseOAuthSecuirty
     with _Security {
  var scopes: js.UndefOr[js.Array[OAuthScope]] = js.undefined
  var tokenUrl: java.lang.String
}

object OAuth2PasswordSecurity {
  @scala.inline
  def apply(
    flow: java.lang.String,
    tokenUrl: java.lang.String,
    `type`: java.lang.String,
    description: java.lang.String = null,
    scopes: js.Array[OAuthScope] = null
  ): OAuth2PasswordSecurity = {
    val __obj = js.Dynamic.literal(flow = flow, tokenUrl = tokenUrl)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OAuth2PasswordSecurity]
  }
}

