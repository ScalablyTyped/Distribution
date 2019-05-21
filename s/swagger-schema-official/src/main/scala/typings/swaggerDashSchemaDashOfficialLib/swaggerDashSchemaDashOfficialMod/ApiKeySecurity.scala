package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeySecurity
  extends BaseSecurity
     with Security {
  var in: java.lang.String
  var name: java.lang.String
  @JSName("type")
  var type_ApiKeySecurity: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.apiKey
}

object ApiKeySecurity {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.apiKey,
    description: java.lang.String = null
  ): ApiKeySecurity = {
    val __obj = js.Dynamic.literal(in = in, name = name)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ApiKeySecurity]
  }
}

