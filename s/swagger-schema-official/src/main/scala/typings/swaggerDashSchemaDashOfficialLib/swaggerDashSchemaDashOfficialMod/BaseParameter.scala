package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseParameter extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var in: java.lang.String
  var name: java.lang.String
  var required: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseParameter {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    description: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[BaseParameter]
  }
}

