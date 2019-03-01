package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeySecurity
  extends BaseSecurity
     with _Security {
  var in: java.lang.String
  var name: java.lang.String
}

object ApiKeySecurity {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String,
    description: java.lang.String = null
  ): ApiKeySecurity = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ApiKeySecurity]
  }
}

