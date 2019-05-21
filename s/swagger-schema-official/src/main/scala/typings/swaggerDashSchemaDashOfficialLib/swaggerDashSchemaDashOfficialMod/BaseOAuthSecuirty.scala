package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOAuthSecuirty extends BaseSecurity {
  var flow: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.accessCode | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.application | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.`implicit` | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.password
  @JSName("type")
  var type_BaseOAuthSecuirty: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.oauth2
}

object BaseOAuthSecuirty {
  @scala.inline
  def apply(
    flow: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.accessCode | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.application | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.`implicit` | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.password,
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.oauth2,
    description: java.lang.String = null
  ): BaseOAuthSecuirty = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[BaseOAuthSecuirty]
  }
}

