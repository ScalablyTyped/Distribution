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

object JSONSchema3or4 {
  @scala.inline
  def apply(): JSONSchema3or4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchema3or4]
  }
  @scala.inline
  implicit class JSONSchema3or4Ops[Self <: JSONSchema3or4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    @scala.inline
    def set$schema(value: JSONSchema4Version): Self = this.set("$schema", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    @scala.inline
    def setAdditionalItems(value: Boolean | JSONSchema3or4): Self = this.set("additionalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalItems: Self = this.set("additionalItems", js.undefined)
    @scala.inline
    def setAdditionalProperties(value: Boolean | JSONSchema3or4): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setAllOfVarargs(value: JSONSchema4*): Self = this.set("allOf", js.Array(value :_*))
    @scala.inline
    def setAllOf(value: js.Array[JSONSchema4]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    @scala.inline
    def setAnyOfVarargs(value: JSONSchema4*): Self = this.set("anyOf", js.Array(value :_*))
    @scala.inline
    def setAnyOf(value: js.Array[JSONSchema4]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    @scala.inline
    def setDefault(value: JSONSchema4Type): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    @scala.inline
    def setDefinitions(value: StringDictionary[JSONSchema4]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    @scala.inline
    def setDependencies(value: StringDictionary[JSONSchema3or4 | String | js.Array[String]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisallowVarargs(value: (String | JSONSchema3or4)*): Self = this.set("disallow", js.Array(value :_*))
    @scala.inline
    def setDisallow(value: String | (js.Array[String | JSONSchema3or4])): Self = this.set("disallow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisallow: Self = this.set("disallow", js.undefined)
    @scala.inline
    def setDivisibleBy(value: Double): Self = this.set("divisibleBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivisibleBy: Self = this.set("divisibleBy", js.undefined)
    @scala.inline
    def setEnumVarargs(value: JSONSchema4Type*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: js.Array[JSONSchema4Type]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    @scala.inline
    def setExclusiveMaximum(value: Boolean): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    @scala.inline
    def setExclusiveMinimum(value: Boolean): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    @scala.inline
    def setExtendsVarargs(value: JSONSchema3or4*): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: JSONSchema3or4 | js.Array[JSONSchema3or4]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsVarargs(value: JSONSchema3or4*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: JSONSchema3or4 | js.Array[JSONSchema3or4]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxProperties(value: Double): Self = this.set("maxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxProperties: Self = this.set("maxProperties", js.undefined)
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMinProperties(value: Double): Self = this.set("minProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinProperties: Self = this.set("minProperties", js.undefined)
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setMultipleOf(value: Double): Self = this.set("multipleOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleOf: Self = this.set("multipleOf", js.undefined)
    @scala.inline
    def setNot(value: JSONSchema4): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setOneOfVarargs(value: JSONSchema4*): Self = this.set("oneOf", js.Array(value :_*))
    @scala.inline
    def setOneOf(value: js.Array[JSONSchema4]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPatternProperties(value: StringDictionary[JSONSchema3or4]): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternProperties: Self = this.set("patternProperties", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[JSONSchema3or4]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: Boolean | `false` | js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTypeVarargs(value: JSONSchema4TypeName*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: JSONSchema4TypeName | js.Array[JSONSchema4TypeName]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
  }
  
}

