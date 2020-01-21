package typings.swaggerizeExpress.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonSchema extends js.Object {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  var additionalItems: js.UndefOr[Boolean | IJsonSchema] = js.native
  var additionalProperties: js.UndefOr[Boolean | IJsonSchema] = js.native
  var allOf: js.UndefOr[js.Array[IJsonSchema]] = js.native
  var anyOf: js.UndefOr[js.Array[IJsonSchema]] = js.native
  var definitions: js.UndefOr[StringDictionary[IJsonSchema]] = js.native
  var dependencies: js.UndefOr[StringDictionary[IJsonSchema | js.Array[String]]] = js.native
  var description: js.UndefOr[String] = js.native
  var enum: js.UndefOr[js.Array[_]] = js.native
  var exclusiveMaximum: js.UndefOr[Boolean] = js.native
  var exclusiveMinimum: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[IJsonSchema | js.Array[IJsonSchema]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var maxProperties: js.UndefOr[Double] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minProperties: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  var multipleOf: js.UndefOr[Double] = js.native
  var not: js.UndefOr[IJsonSchema] = js.native
  var oneOf: js.UndefOr[js.Array[IJsonSchema]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var patternProperties: js.UndefOr[StringDictionary[IJsonSchema]] = js.native
  var properties: js.UndefOr[StringDictionary[IJsonSchema]] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

