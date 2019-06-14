package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOAuthSecurity extends BaseSecurity {
  var flow: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.accessCode | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.application | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.`implicit` | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.password
  var scopes: js.UndefOr[OAuthScope] = js.undefined
  @JSName("type")
  var type_BaseOAuthSecurity: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.oauth2
}

object BaseOAuthSecurity {
  @scala.inline
  def apply(
    flow: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.accessCode | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.application | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.`implicit` | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.password,
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.oauth2,
    description: java.lang.String = null,
    scopes: OAuthScope = null
  ): BaseOAuthSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[BaseOAuthSecurity]
  }
}

