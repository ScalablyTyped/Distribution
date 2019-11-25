package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.apiKey
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.basic
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSecurity extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var `type`: basic | apiKey | oauth2
}

object BaseSecurity {
  @scala.inline
  def apply(`type`: basic | apiKey | oauth2, description: String = null): BaseSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSecurity]
  }
}

