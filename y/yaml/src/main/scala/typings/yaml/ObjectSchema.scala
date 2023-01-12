package typings.yaml

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSchema
  extends StObject
     with CommonSchema
     with _JsonSchema {
  
  var additionalProperties: js.UndefOr[JsonSchema] = js.undefined
  
  var dependentRequired: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  
  var dependentSchemas: js.UndefOr[Record[String, JsonSchema]] = js.undefined
  
  var maxProperties: js.UndefOr[Double] = js.undefined
  
  var minProperties: js.UndefOr[Double] = js.undefined
  
  var patternProperties: js.UndefOr[Record[String, JsonSchema]] = js.undefined
  
  var properties: js.UndefOr[Record[String, JsonSchema]] = js.undefined
  
  var propertyNames: js.UndefOr[JsonSchema] = js.undefined
  
  var required: js.UndefOr[js.Array[String]] = js.undefined
  
  var unevaluatedProperties: js.UndefOr[JsonSchema] = js.undefined
}
object ObjectSchema {
  
  inline def apply(): ObjectSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectSchema] (val x: Self) extends AnyVal {
    
    inline def setAdditionalProperties(value: JsonSchema): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setDependentRequired(value: Record[String, js.Array[String]]): Self = StObject.set(x, "dependentRequired", value.asInstanceOf[js.Any])
    
    inline def setDependentRequiredUndefined: Self = StObject.set(x, "dependentRequired", js.undefined)
    
    inline def setDependentSchemas(value: Record[String, JsonSchema]): Self = StObject.set(x, "dependentSchemas", value.asInstanceOf[js.Any])
    
    inline def setDependentSchemasUndefined: Self = StObject.set(x, "dependentSchemas", js.undefined)
    
    inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    inline def setPatternProperties(value: Record[String, JsonSchema]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
    
    inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
    
    inline def setProperties(value: Record[String, JsonSchema]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertyNames(value: JsonSchema): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
    
    inline def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
    
    inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
    
    inline def setUnevaluatedProperties(value: JsonSchema): Self = StObject.set(x, "unevaluatedProperties", value.asInstanceOf[js.Any])
    
    inline def setUnevaluatedPropertiesUndefined: Self = StObject.set(x, "unevaluatedProperties", js.undefined)
  }
}
