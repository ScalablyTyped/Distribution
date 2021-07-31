package typings.swaggerizeExpress.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonSchema extends StObject {
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
  var additionalItems: js.UndefOr[Boolean | IJsonSchema] = js.undefined
  
  var additionalProperties: js.UndefOr[Boolean | IJsonSchema] = js.undefined
  
  var allOf: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
  
  var anyOf: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
  
  var definitions: js.UndefOr[StringDictionary[IJsonSchema]] = js.undefined
  
  var dependencies: js.UndefOr[StringDictionary[IJsonSchema | js.Array[String]]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
  
  var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[IJsonSchema | js.Array[IJsonSchema]] = js.undefined
  
  var maxItems: js.UndefOr[Double] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var maxProperties: js.UndefOr[Double] = js.undefined
  
  var maximum: js.UndefOr[Double] = js.undefined
  
  var minItems: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var minProperties: js.UndefOr[Double] = js.undefined
  
  var minimum: js.UndefOr[Double] = js.undefined
  
  var multipleOf: js.UndefOr[Double] = js.undefined
  
  var not: js.UndefOr[IJsonSchema] = js.undefined
  
  var oneOf: js.UndefOr[js.Array[IJsonSchema]] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var patternProperties: js.UndefOr[StringDictionary[IJsonSchema]] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[IJsonSchema]] = js.undefined
  
  var required: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}
object IJsonSchema {
  
  @scala.inline
  def apply(): IJsonSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonSchema]
  }
  
  @scala.inline
  implicit class IJsonSchemaMutableBuilder[Self <: IJsonSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    @scala.inline
    def setAdditionalItems(value: Boolean | IJsonSchema): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
    
    @scala.inline
    def setAdditionalProperties(value: Boolean | IJsonSchema): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    @scala.inline
    def setAllOf(value: js.Array[IJsonSchema]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
    
    @scala.inline
    def setAllOfVarargs(value: IJsonSchema*): Self = StObject.set(x, "allOf", js.Array(value :_*))
    
    @scala.inline
    def setAnyOf(value: js.Array[IJsonSchema]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    @scala.inline
    def setAnyOfVarargs(value: IJsonSchema*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    @scala.inline
    def setDependencies(value: StringDictionary[IJsonSchema | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnum(value: js.Array[js.Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setExclusiveMaximum(value: Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
    
    @scala.inline
    def setExclusiveMinimum(value: Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItems(value: IJsonSchema | js.Array[IJsonSchema]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: IJsonSchema*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
    
    @scala.inline
    def setNot(value: IJsonSchema): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setOneOf(value: js.Array[IJsonSchema]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    @scala.inline
    def setOneOfVarargs(value: IJsonSchema*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternProperties(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
  }
}
