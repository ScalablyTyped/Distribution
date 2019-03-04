package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralParameterObject
  extends ParameterObject
     with ItemsObject {
  var allowEmptyValue: js.UndefOr[scala.Boolean] = js.undefined
}

object GeneralParameterObject {
  @scala.inline
  def apply(
    exclusiveMaximum: scala.Boolean,
    in: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String,
    allowEmptyValue: js.UndefOr[scala.Boolean] = js.undefined,
    collectionFormat: java.lang.String = null,
    default: js.Any = null,
    description: java.lang.String = null,
    enum: js.Array[_] = null,
    exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    items: ItemsObject = null,
    maxItems: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    multipleOf: scala.Int | scala.Double = null,
    pattern: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
  ): GeneralParameterObject = {
    val __obj = js.Dynamic.literal(exclusiveMaximum = exclusiveMaximum, in = in, name = name)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue)
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat)
    if (default != null) __obj.updateDynamic("default")(default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
    if (format != null) __obj.updateDynamic("format")(format)
    if (items != null) __obj.updateDynamic("items")(items)
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (multipleOf != null) __obj.updateDynamic("multipleOf")(multipleOf.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[GeneralParameterObject]
  }
}

