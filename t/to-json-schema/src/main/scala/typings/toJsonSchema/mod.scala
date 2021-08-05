package typings.toJsonSchema

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema4Type
import typings.jsonSchema.mod.JSONSchema4TypeName
import typings.jsonSchema.mod.JSONSchema4Version
import typings.toJsonSchema.anon.AdditionalProperties
import typings.toJsonSchema.anon.DetectFormat
import typings.toJsonSchema.anon.Mode
import typings.toJsonSchema.toJsonSchemaBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * `to-json-schema` exports function that converts most javascript values to
    * JSON schema. Such a schema can be used to further validation of similar
    * objects/values
    *
    * @param value Any javascript value
    * @param options optional options object
    */
  inline def apply(value: js.Any): JSONSchema3or4 = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[JSONSchema3or4]
  inline def apply(value: js.Any, options: Options): JSONSchema3or4 = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONSchema3or4]
  
  @JSImport("to-json-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JSONSchema3or4
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    var default: js.UndefOr[JSONSchema4Type] = js.undefined
    
    @JSName("$ref")
    var $ref: js.UndefOr[String] = js.undefined
    
    @JSName("$schema")
    var $schema: js.UndefOr[JSONSchema4Version] = js.undefined
    
    var additionalItems: js.UndefOr[Boolean | JSONSchema3or4] = js.undefined
    
    var additionalProperties: js.UndefOr[Boolean | JSONSchema3or4] = js.undefined
    
    var allOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
    
    var anyOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
    
    var definitions: js.UndefOr[StringDictionary[JSONSchema4]] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[JSONSchema3or4 | String | js.Array[String]]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    /** JSON Schema 3 only */
    var disallow: js.UndefOr[String | (js.Array[String | JSONSchema3or4])] = js.undefined
    
    /** JSON Schema 3 uses `divisibleBy` instead of `multipleOf`. */
    var divisibleBy: js.UndefOr[Double] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[JSONSchema4Type]] = js.undefined
    
    var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
    
    var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
    
    var `extends`: js.UndefOr[JSONSchema3or4 | js.Array[JSONSchema3or4]] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[JSONSchema3or4 | js.Array[JSONSchema3or4]] = js.undefined
    
    var maxItems: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maxProperties: js.UndefOr[Double] = js.undefined
    
    var maximum: js.UndefOr[Double] = js.undefined
    
    var minItems: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var minProperties: js.UndefOr[Double] = js.undefined
    
    var minimum: js.UndefOr[Double] = js.undefined
    
    var multipleOf: js.UndefOr[Double] = js.undefined
    
    var not: js.UndefOr[JSONSchema4] = js.undefined
    
    var oneOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var patternProperties: js.UndefOr[StringDictionary[JSONSchema3or4]] = js.undefined
    
    var properties: js.UndefOr[StringDictionary[JSONSchema3or4]] = js.undefined
    
    var required: js.UndefOr[Boolean | `false` | js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[JSONSchema4TypeName | js.Array[JSONSchema4TypeName]] = js.undefined
    
    var uniqueItems: js.UndefOr[Boolean] = js.undefined
  }
  object JSONSchema3or4 {
    
    inline def apply(): JSONSchema3or4 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema3or4]
    }
    
    extension [Self <: JSONSchema3or4](x: Self) {
      
      inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      inline def set$schema(value: JSONSchema4Version): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAdditionalItems(value: Boolean | JSONSchema3or4): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      inline def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      inline def setAdditionalProperties(value: Boolean | JSONSchema3or4): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      inline def setAllOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      inline def setAllOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      inline def setAnyOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      inline def setAnyOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      inline def setDefault(value: JSONSchema4Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefinitions(value: StringDictionary[JSONSchema4]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      inline def setDependencies(value: StringDictionary[JSONSchema3or4 | String | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisallow(value: String | (js.Array[String | JSONSchema3or4])): Self = StObject.set(x, "disallow", value.asInstanceOf[js.Any])
      
      inline def setDisallowUndefined: Self = StObject.set(x, "disallow", js.undefined)
      
      inline def setDisallowVarargs(value: (String | JSONSchema3or4)*): Self = StObject.set(x, "disallow", js.Array(value :_*))
      
      inline def setDivisibleBy(value: Double): Self = StObject.set(x, "divisibleBy", value.asInstanceOf[js.Any])
      
      inline def setDivisibleByUndefined: Self = StObject.set(x, "divisibleBy", js.undefined)
      
      inline def setEnum(value: js.Array[JSONSchema4Type]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: JSONSchema4Type*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      inline def setExclusiveMaximum(value: Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      inline def setExclusiveMinimum(value: Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      inline def setExtends(value: JSONSchema3or4 | js.Array[JSONSchema3or4]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: JSONSchema3or4*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItems(value: JSONSchema3or4 | js.Array[JSONSchema3or4]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: JSONSchema3or4*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
      
      inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
      
      inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
      
      inline def setNot(value: JSONSchema4): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setOneOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      inline def setOneOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternProperties(value: StringDictionary[JSONSchema3or4]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setProperties(value: StringDictionary[JSONSchema3or4]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRequired(value: Boolean | `false` | js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: JSONSchema4TypeName | js.Array[JSONSchema4TypeName]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: JSONSchema4TypeName*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var arrays: js.UndefOr[Mode] = js.undefined
    
    var objects: js.UndefOr[AdditionalProperties] = js.undefined
    
    /**
      * By providing `postProcessFnc`, you can modify or replace generated
      * schema. This function will be called recursively for all the properties
      * and sub-properties and array items from leaves to the root. If you want
      * to preserve default functionality, don't forget to call defaultFunc
      * which is currently responsible for setting `required` for the schema
      * items if there is common option `required` set to true.
      *
      * @param type JSON schema type of the `value`
      * @param schema Generated JSON schema
      * @param value - input value
      * @param defaultFunc standard function that is used to post-process
      *                    generated schema. Takes the `type`, `schema`,
      *                    `value` params.
      */
    var postProcessFnc: js.UndefOr[
        js.Function4[
          /* type */ JSONSchema4TypeName, 
          /* schema */ JSONSchema3or4, 
          /* value */ js.Any, 
          /* defaultFunc */ js.Function3[
            /* type */ JSONSchema4TypeName, 
            /* schema */ JSONSchema3or4, 
            /* value */ js.Any, 
            JSONSchema3or4
          ], 
          JSONSchema3or4
        ]
      ] = js.undefined
    
    /**
      * specify `true` to make all properties required.
      *
      * @default false
      * @example
      * const schema = toJsonSchema(33, {required: false});
      * // { type: "integer" }
      * const schema = toJsonSchema(33, {required: true});
      * // { type: "integer", "required": true }
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var strings: js.UndefOr[DetectFormat] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArrays(value: Mode): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      inline def setObjects(value: AdditionalProperties): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      inline def setPostProcessFnc(
        value: (/* type */ JSONSchema4TypeName, /* schema */ JSONSchema3or4, /* value */ js.Any, /* defaultFunc */ js.Function3[
              /* type */ JSONSchema4TypeName, 
              /* schema */ JSONSchema3or4, 
              /* value */ js.Any, 
              JSONSchema3or4
            ]) => JSONSchema3or4
      ): Self = StObject.set(x, "postProcessFnc", js.Any.fromFunction4(value))
      
      inline def setPostProcessFncUndefined: Self = StObject.set(x, "postProcessFnc", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStrings(value: DetectFormat): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    }
  }
}
