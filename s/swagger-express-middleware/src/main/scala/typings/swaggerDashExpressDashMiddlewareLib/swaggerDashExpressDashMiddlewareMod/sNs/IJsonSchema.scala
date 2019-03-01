package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonSchema extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$schema")
  var $schema: js.UndefOr[java.lang.String] = js.undefined
  var additionalItems: js.UndefOr[scala.Boolean | IJsonSchema] = js.undefined
  var additionalProperties: js.UndefOr[scala.Boolean | IJsonSchema] = js.undefined
  var allOf: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
  var anyOf: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
  var definitions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IJsonSchema]] = js.undefined
  var dependencies: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[IJsonSchema | js.Array[java.lang.String]]
  ] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  var exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[IJsonSchema | js.Array[IJsonSchema]] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxProperties: js.UndefOr[scala.Double] = js.undefined
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var minProperties: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  var not: js.UndefOr[IJsonSchema] = js.undefined
  var oneOf: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var patternProperties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IJsonSchema]] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IJsonSchema]] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

object IJsonSchema {
  @scala.inline
  def apply(
    $ref: java.lang.String = null,
    $schema: java.lang.String = null,
    additionalItems: scala.Boolean | IJsonSchema = null,
    additionalProperties: scala.Boolean | IJsonSchema = null,
    allOf: js.Array[IJsonSchema] = null,
    anyOf: js.Array[IJsonSchema] = null,
    definitions: org.scalablytyped.runtime.StringDictionary[IJsonSchema] = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[IJsonSchema | js.Array[java.lang.String]] = null,
    description: java.lang.String = null,
    enum: js.Array[_] = null,
    exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    id: java.lang.String = null,
    items: IJsonSchema | js.Array[IJsonSchema] = null,
    maxItems: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxProperties: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    minProperties: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    multipleOf: scala.Int | scala.Double = null,
    not: IJsonSchema = null,
    oneOf: js.Array[IJsonSchema] = null,
    pattern: java.lang.String = null,
    patternProperties: org.scalablytyped.runtime.StringDictionary[IJsonSchema] = null,
    properties: org.scalablytyped.runtime.StringDictionary[IJsonSchema] = null,
    required: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
  ): IJsonSchema = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if ($schema != null) __obj.updateDynamic("$schema")($schema)
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum)
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
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
    if (required != null) __obj.updateDynamic("required")(required)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[IJsonSchema]
  }
}

