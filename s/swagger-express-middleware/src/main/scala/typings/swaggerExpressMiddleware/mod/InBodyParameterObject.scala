package typings.swaggerExpressMiddleware.mod

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
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[InBodyParameterObject]
  }
}

