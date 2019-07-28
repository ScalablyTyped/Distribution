package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsObject extends js.Object {
  var collectionFormat: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  var exclusiveMaximum: Boolean
  var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[ItemsObject] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maximum: js.UndefOr[Double] = js.undefined
  var minItems: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
  var multipleOf: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var `type`: String
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}

object ItemsObject {
  @scala.inline
  def apply(
    exclusiveMaximum: Boolean,
    `type`: String,
    collectionFormat: String = null,
    default: js.Any = null,
    enum: js.Array[_] = null,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    items: ItemsObject = null,
    maxItems: Int | Double = null,
    maxLength: Int | Double = null,
    maximum: Int | Double = null,
    minItems: Int | Double = null,
    minLength: Int | Double = null,
    minimum: Int | Double = null,
    multipleOf: Int | Double = null,
    pattern: String = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined
  ): ItemsObject = {
    val __obj = js.Dynamic.literal(exclusiveMaximum = exclusiveMaximum)
    __obj.updateDynamic("type")(`type`)
    if (collectionFormat != null) __obj.updateDynamic("collectionFormat")(collectionFormat)
    if (default != null) __obj.updateDynamic("default")(default)
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
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[ItemsObject]
  }
}

