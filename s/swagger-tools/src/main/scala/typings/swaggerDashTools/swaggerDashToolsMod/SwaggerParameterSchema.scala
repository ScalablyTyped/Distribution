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
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple)
    if (description != null) __obj.updateDynamic("description")(description)
    if (format != null) __obj.updateDynamic("format")(format)
    if (in != null) __obj.updateDynamic("in")(in)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum)
    if (minimum != null) __obj.updateDynamic("minimum")(minimum)
    if (paramType != null) __obj.updateDynamic("paramType")(paramType)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[SwaggerParameterSchema]
  }
}

