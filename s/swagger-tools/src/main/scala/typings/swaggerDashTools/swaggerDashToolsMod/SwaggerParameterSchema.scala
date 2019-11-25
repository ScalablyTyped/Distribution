package typings.swaggerDashTools.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerParameterSchema extends js.Object {
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var in: js.UndefOr[String] = js.undefined
  var maximum: js.UndefOr[String] = js.undefined
  var minimum: js.UndefOr[String] = js.undefined
  var name: String
  var paramType: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var `type`: String
}

object SwaggerParameterSchema {
  @scala.inline
  def apply(
    name: String,
    `type`: String,
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    format: String = null,
    in: String = null,
    maximum: String = null,
    minimum: String = null,
    paramType: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): SwaggerParameterSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerParameterSchema]
  }
}

