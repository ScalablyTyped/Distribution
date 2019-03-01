package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOAuthSecuirty extends BaseSecurity {
  var flow: java.lang.String
}

object BaseOAuthSecuirty {
  @scala.inline
  def apply(flow: java.lang.String, `type`: java.lang.String, description: java.lang.String = null): BaseOAuthSecuirty = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("flow")(flow)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[BaseOAuthSecuirty]
  }
}

