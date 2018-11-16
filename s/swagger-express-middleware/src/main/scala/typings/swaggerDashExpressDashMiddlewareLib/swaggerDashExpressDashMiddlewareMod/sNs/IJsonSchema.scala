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
  var definitions: js.UndefOr[ScalablyTyped.runtime.StringDictionary[IJsonSchema]] = js.undefined
  var dependencies: js.UndefOr[ScalablyTyped.runtime.StringDictionary[IJsonSchema | js.Array[java.lang.String]]] = js.undefined
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
  var patternProperties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[IJsonSchema]] = js.undefined
  var properties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[IJsonSchema]] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

