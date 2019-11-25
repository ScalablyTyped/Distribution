package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.body
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.formData
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.header
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.path
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseParameter extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var in: body | query | path | header | formData
  var name: String
  var required: js.UndefOr[Boolean] = js.undefined
}

object BaseParameter {
  @scala.inline
  def apply(
    in: body | query | path | header | formData,
    name: String,
    description: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): BaseParameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseParameter]
  }
}

