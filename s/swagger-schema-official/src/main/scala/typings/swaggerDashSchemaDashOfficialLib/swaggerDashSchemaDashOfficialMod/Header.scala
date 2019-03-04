package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends BaseSchema {
  @JSName("type")
  var type_Header: java.lang.String
}

object Header {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    default: java.lang.String | scala.Boolean | scala.Double | js.Object = null,
    description: java.lang.String = null,
    enum: js.Array[java.lang.String | scala.Boolean | scala.Double | js.Object] = null,
    exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    items: Schema | js.Array[Schema] = null,
    maxItems: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxProperties: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    minProperties: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    multipleOf: scala.Int | scala.Double = null,
    pattern: java.lang.String = null,
    title: java.lang.String = null,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
  ): Header = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum)
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
    if (format != null) __obj.updateDynamic("format")(format)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxProperties != null) __obj.updateDynamic("maxProperties")(maxProperties.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minProperties != null) __obj.updateDynamic("minProperties")(minProperties.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (multipleOf != null) __obj.updateDynamic("multipleOf")(multipleOf.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[Header]
  }
}

