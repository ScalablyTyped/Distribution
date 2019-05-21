package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSecurity extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.basic | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.apiKey | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.oauth2
}

object BaseSecurity {
  @scala.inline
  def apply(
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.basic | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.apiKey | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.oauth2,
    description: java.lang.String = null
  ): BaseSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[BaseSecurity]
  }
}

