package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InBodyParameterObject extends ParameterObject {
  var schema: SchemaObject
}

object InBodyParameterObject {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    schema: SchemaObject,
    description: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): InBodyParameterObject = {
    val __obj = js.Dynamic.literal(in = in, name = name, schema = schema)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[InBodyParameterObject]
  }
}

