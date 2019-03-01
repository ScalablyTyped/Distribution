package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerParameterSchema extends js.Object {
  var allowMultiple: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var in: js.UndefOr[java.lang.String] = js.undefined
  var maximum: js.UndefOr[java.lang.String] = js.undefined
  var minimum: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var paramType: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
}

object SwaggerParameterSchema {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: java.lang.String,
    allowMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    format: java.lang.String = null,
    in: java.lang.String = null,
    maximum: java.lang.String = null,
    minimum: java.lang.String = null,
    paramType: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): SwaggerParameterSchema = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
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

