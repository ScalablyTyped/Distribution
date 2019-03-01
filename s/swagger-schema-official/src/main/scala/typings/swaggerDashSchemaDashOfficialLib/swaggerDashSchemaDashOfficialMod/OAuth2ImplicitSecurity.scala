package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2ImplicitSecurity
  extends BaseOAuthSecuirty
     with _Security {
  var authorizationUrl: java.lang.String
}

object OAuth2ImplicitSecurity {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String,
    flow: java.lang.String,
    `type`: java.lang.String,
    description: java.lang.String = null
  ): OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("authorizationUrl")(authorizationUrl)
    __obj.updateDynamic("flow")(flow)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[OAuth2ImplicitSecurity]
  }
}

