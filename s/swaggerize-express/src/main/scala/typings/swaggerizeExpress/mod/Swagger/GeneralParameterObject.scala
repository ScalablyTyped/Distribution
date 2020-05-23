package typings.swaggerizeExpress.mod.Swagger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralParameterObject
  extends ParameterObject
     with ItemsObject {
  var allowEmptyValue: js.UndefOr[Boolean] = js.undefined
}

object GeneralParameterObject {
  @scala.inline
  def apply(
    exclusiveMaximum: Boolean,
    in: String,
    name: String,
    `type`: String,
    allowEmptyValue: js.UndefOr[Boolean] = js.undefined,
    collectionFormat: String = null,
    default: js.Any = null,
    description: String = null,
    enum: js.Array[_] = null,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    items: ItemsObject = null,
    maxItems: js.UndefOr[Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    maximum: js.UndefOr[Double] = js.undefined,
    minItems: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    multipleOf: js.UndefOr[Double] = js.undefined,
    pattern: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    uniqueItems: js.UndefOr[Boolean] = js.undefined
  ): GeneralParameterObject = {
    val __obj = js.Dynamic.literal(exclusiveMaximum = exclusiveMaximum.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmptyValue)) __obj.updateDynamic("allowEmptyValue")(allowEmptyValue.get.asInstanceOf[js.Any])
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(maxItems)) __obj.updateDynamic("maxItems")(maxItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minItems)) __obj.updateDynamic("minItems")(minItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleOf)) __obj.updateDynamic("multipleOf")(multipleOf.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralParameterObject]
  }
}

