package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyParameter
  extends BaseParameter
     with Parameter {
  @JSName("in")
  var in_BodyParameter: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.body
  var schema: js.UndefOr[Schema] = js.undefined
}

object BodyParameter {
  @scala.inline
  def apply(
    in: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.body,
    name: java.lang.String,
    description: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    schema: Schema = null
  ): BodyParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[BodyParameter]
  }
}

