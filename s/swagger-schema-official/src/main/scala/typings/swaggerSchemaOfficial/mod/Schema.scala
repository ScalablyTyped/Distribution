package typings.swaggerSchemaOfficial.mod

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
    maxItems: js.UndefOr[Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxProperties: js.UndefOr[Double] = js.undefined,
    maximum: js.UndefOr[Double] = js.undefined,
    minItems: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    minProperties: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    multipleOf: js.UndefOr[Double] = js.undefined,
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
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (discriminator != null) __obj.updateDynamic("discriminator")(discriminator.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.get.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(maxItems)) __obj.updateDynamic("maxItems")(maxItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxProperties)) __obj.updateDynamic("maxProperties")(maxProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minItems)) __obj.updateDynamic("minItems")(minItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minProperties)) __obj.updateDynamic("minProperties")(minProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleOf)) __obj.updateDynamic("multipleOf")(multipleOf.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.get.asInstanceOf[js.Any])
    if (xml != null) __obj.updateDynamic("xml")(xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

