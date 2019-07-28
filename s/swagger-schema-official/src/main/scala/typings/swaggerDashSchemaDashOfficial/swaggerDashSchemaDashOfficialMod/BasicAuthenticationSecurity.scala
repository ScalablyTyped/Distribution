package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.basic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthenticationSecurity
  extends BaseSecurity
     with Security {
  @JSName("type")
  var type_BasicAuthenticationSecurity: basic
}

object BasicAuthenticationSecurity {
  @scala.inline
  def apply(`type`: basic, description: String = null): BasicAuthenticationSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[BasicAuthenticationSecurity]
  }
}

