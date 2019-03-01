package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends BaseSchema {
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  var additionalProperties: js.UndefOr[Schema] = js.undefined
  var allOf: js.UndefOr[js.Array[Schema]] = js.undefined
  var discriminator: js.UndefOr[java.lang.String] = js.undefined
  var example: js.UndefOr[js.Any] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Schema]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var xml: js.UndefOr[XML] = js.undefined
}

object Schema {
  @scala.inline
  def apply(
    $ref: java.lang.String = null,
    additionalProperties: Schema = null,
    allOf: js.Array[Schema] = null,
    default: java.lang.String | scala.Boolean | scala.Double | js.Object = null,
    description: java.lang.String = null,
    discriminator: java.lang.String = null,
    enum: js.Array[java.lang.String | scala.Boolean | scala.Double | js.Object] = null,
    example: js.Any = null,
    exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined,
    externalDocs: ExternalDocs = null,
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
    properties: org.scalablytyped.runtime.StringDictionary[Schema] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined,
    xml: XML = null
  ): Schema = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties)
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (discriminator != null) __obj.updateDynamic("discriminator")(discriminator)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (example != null) __obj.updateDynamic("example")(example)
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum)
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
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
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (required != null) __obj.updateDynamic("required")(required)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    if (xml != null) __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[Schema]
  }
}

