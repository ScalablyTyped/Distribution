package typings.yaml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySchema
  extends StObject
     with CommonSchema
     with _JsonSchema {
  
  var contains: js.UndefOr[JsonSchema] = js.undefined
  
  var items: js.UndefOr[JsonSchema] = js.undefined
  
  var maxContains: js.UndefOr[Double] = js.undefined
  
  var maxItems: js.UndefOr[Double] = js.undefined
  
  var minContains: js.UndefOr[Double] = js.undefined
  
  var minItems: js.UndefOr[Double] = js.undefined
  
  var prefixItems: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  
  var unevaluatedItems: js.UndefOr[JsonSchema] = js.undefined
  
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}
object ArraySchema {
  
  inline def apply(): ArraySchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArraySchema]
  }
  
  extension [Self <: ArraySchema](x: Self) {
    
    inline def setContains(value: JsonSchema): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setItems(value: JsonSchema): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setMaxContains(value: Double): Self = StObject.set(x, "maxContains", value.asInstanceOf[js.Any])
    
    inline def setMaxContainsUndefined: Self = StObject.set(x, "maxContains", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMinContains(value: Double): Self = StObject.set(x, "minContains", value.asInstanceOf[js.Any])
    
    inline def setMinContainsUndefined: Self = StObject.set(x, "minContains", js.undefined)
    
    inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    inline def setPrefixItems(value: js.Array[JsonSchema]): Self = StObject.set(x, "prefixItems", value.asInstanceOf[js.Any])
    
    inline def setPrefixItemsUndefined: Self = StObject.set(x, "prefixItems", js.undefined)
    
    inline def setPrefixItemsVarargs(value: JsonSchema*): Self = StObject.set(x, "prefixItems", js.Array(value*))
    
    inline def setUnevaluatedItems(value: JsonSchema): Self = StObject.set(x, "unevaluatedItems", value.asInstanceOf[js.Any])
    
    inline def setUnevaluatedItemsUndefined: Self = StObject.set(x, "unevaluatedItems", js.undefined)
    
    inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
  }
}
