package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.apiKey
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.header
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeySecurity
  extends BaseSecurity
     with Security {
  var in: query | header
  var name: String
  @JSName("type")
  var type_ApiKeySecurity: apiKey
}

object ApiKeySecurity {
  @scala.inline
  def apply(in: query | header, name: String, `type`: apiKey, description: String = null): ApiKeySecurity = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ApiKeySecurity]
  }
}

