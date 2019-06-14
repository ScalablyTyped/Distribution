package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseParameter extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var in: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.body | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.query | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.path | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.header | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.formData
  var name: java.lang.String
  var required: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseParameter {
  @scala.inline
  def apply(
    in: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.body | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.query | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.path | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.header | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.formData,
    name: java.lang.String,
    description: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseParameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[BaseParameter]
  }
}

