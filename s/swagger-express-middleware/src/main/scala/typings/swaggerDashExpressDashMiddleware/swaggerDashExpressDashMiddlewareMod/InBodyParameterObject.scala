package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InBodyParameterObject extends ParameterObject {
  var schema: SchemaObject
}

object InBodyParameterObject {
  @scala.inline
  def apply(
    in: String,
    name: String,
    schema: SchemaObject,
    description: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): InBodyParameterObject = {
    val __obj = js.Dynamic.literal(in = in, name = name, schema = schema)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[InBodyParameterObject]
  }
}

