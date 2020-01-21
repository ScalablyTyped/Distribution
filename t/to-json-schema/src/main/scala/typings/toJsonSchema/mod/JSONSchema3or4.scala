package typings.toJsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema4Type
import typings.jsonSchema.mod.JSONSchema4TypeName
import typings.jsonSchema.mod.JSONSchema4Version
import typings.toJsonSchema.toJsonSchemaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema3or4
  extends /* k */ StringDictionary[js.Any] {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchema4Version] = js.native
  var additionalItems: js.UndefOr[Boolean | JSONSchema3or4] = js.native
  var additionalProperties: js.UndefOr[Boolean | JSONSchema3or4] = js.native
  var allOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
  var anyOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
  var default: js.UndefOr[JSONSchema4Type] = js.native
  var definitions: js.UndefOr[StringDictionary[JSONSchema4]] = js.native
  var dependencies: js.UndefOr[StringDictionary[JSONSchema3or4 | String | js.Array[String]]] = js.native
  var description: js.UndefOr[String] = js.native
  /** JSON Schema 3 only */
  var disallow: js.UndefOr[String | (js.Array[String | JSONSchema3or4])] = js.native
  /** JSON Schema 3 uses `divisibleBy` instead of `multipleOf`. */
  var divisibleBy: js.UndefOr[Double] = js.native
  var enum: js.UndefOr[js.Array[JSONSchema4Type]] = js.native
  var exclusiveMaximum: js.UndefOr[Boolean] = js.native
  var exclusiveMinimum: js.UndefOr[Boolean] = js.native
  var `extends`: js.UndefOr[JSONSchema3or4 | js.Array[JSONSchema3or4]] = js.native
  var format: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[JSONSchema3or4 | js.Array[JSONSchema3or4]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var maxProperties: js.UndefOr[Double] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minProperties: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  var multipleOf: js.UndefOr[Double] = js.native
  var not: js.UndefOr[JSONSchema4] = js.native
  var oneOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema3or4]] = js.native
  var properties: js.UndefOr[StringDictionary[JSONSchema3or4]] = js.native
  var required: js.UndefOr[Boolean | `false` | js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[JSONSchema4TypeName | js.Array[JSONSchema4TypeName]] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

