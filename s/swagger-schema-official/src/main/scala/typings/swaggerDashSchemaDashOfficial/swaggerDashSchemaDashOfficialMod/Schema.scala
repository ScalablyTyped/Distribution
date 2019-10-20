package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends BaseSchema {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  var additionalProperties: js.UndefOr[Schema | Boolean] = js.undefined
  var allOf: js.UndefOr[js.Array[Schema]] = js.undefined
  var discriminator: js.UndefOr[String] = js.undefined
  var example: js.UndefOr[js.Any] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var properties: js.UndefOr[StringDictionary[Schema]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var xml: js.UndefOr[XML] = js.undefined
}

object Schema {
  @scala.inline
  def apply(
    $ref: String = null,
    additionalProperties: Schema | Boolean = null,
    allOf: js.Array[Schema] = null,
    default: js.Any = null,
    description: String = null,
    discriminator: String = null,
    enum: js.Array[_] = null,
    example: js.Any = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    externalDocs: ExternalDocs = null,
    format: String = null,
    items: Schema | js.Array[Schema] = null,
    maxItems: Int | Double = null,
    maxLength: Int | Double = null,
    maxProperties: Int | Double = null,
    maximum: Int | Double = null,
    minItems: Int | Double = null,
    minLength: Int | Double = null,
    minProperties: Int | Double = null,
    minimum: Int | Double = null,
    multipleOf: Int | Double = null,
    pattern: String = null,
    properties: StringDictionary[Schema] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.Array[String] = null,
    title: String = null,
    `type`: ParameterType = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined,
    xml: XML = null
  ): Schema = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (default != null) __obj.updateDynamic("default")(default)
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

