package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaObject
  extends IJsonSchema
     with /* index */ StringDictionary[js.Any] {
  var discriminator: js.UndefOr[String] = js.undefined
  var example: js.UndefOr[js.Any] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var xml: js.UndefOr[XMLObject] = js.undefined
}

object SchemaObject {
  @scala.inline
  def apply(
    $ref: String = null,
    $schema: String = null,
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    additionalItems: Boolean | IJsonSchema = null,
    additionalProperties: Boolean | IJsonSchema = null,
    allOf: js.Array[IJsonSchema] = null,
    anyOf: js.Array[IJsonSchema] = null,
    definitions: StringDictionary[IJsonSchema] = null,
    dependencies: StringDictionary[IJsonSchema | js.Array[String]] = null,
    description: String = null,
    discriminator: String = null,
    enum: js.Array[_] = null,
    example: js.Any = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    externalDocs: ExternalDocumentationObject = null,
    format: String = null,
    id: String = null,
    items: IJsonSchema | js.Array[IJsonSchema] = null,
    maxItems: Int | Double = null,
    maxLength: Int | Double = null,
    maxProperties: Int | Double = null,
    maximum: Int | Double = null,
    minItems: Int | Double = null,
    minLength: Int | Double = null,
    minProperties: Int | Double = null,
    minimum: Int | Double = null,
    multipleOf: Int | Double = null,
    not: IJsonSchema = null,
    oneOf: js.Array[IJsonSchema] = null,
    pattern: String = null,
    patternProperties: StringDictionary[IJsonSchema] = null,
    properties: StringDictionary[IJsonSchema] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.Array[String] = null,
    title: String = null,
    `type`: String | js.Array[String] = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined,
    xml: XMLObject = null
  ): SchemaObject = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if ($schema != null) __obj.updateDynamic("$schema")($schema)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (discriminator != null) __obj.updateDynamic("discriminator")(discriminator)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (example != null) __obj.updateDynamic("example")(example)
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum)
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
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
    if (not != null) __obj.updateDynamic("not")(not)
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (required != null) __obj.updateDynamic("required")(required)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    if (xml != null) __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[SchemaObject]
  }
}

