package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthenticationSecurity
  extends BaseSecurity
     with Security {
  @JSName("type")
  var type_BasicAuthenticationSecurity: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.basic
}

object BasicAuthenticationSecurity {
  @scala.inline
  def apply(
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.basic,
    description: java.lang.String = null
  ): BasicAuthenticationSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[BasicAuthenticationSecurity]
  }
}

