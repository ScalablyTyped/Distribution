package typings.tablestore.mod

import typings.tablestore.anon.BOOLEAN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSchemas extends StObject {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var dateFormats: js.UndefOr[String] = js.undefined
  
  var enableSortAndAgg: js.UndefOr[Boolean] = js.undefined
  
  var fieldName: String
  
  var fieldSchemas: js.UndefOr[js.Array[FieldSchemas]] = js.undefined
  
  var fieldType: EnumValues[BOOLEAN]
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var isAnArray: js.UndefOr[Boolean] = js.undefined
  
  var store: js.UndefOr[Boolean] = js.undefined
}
object FieldSchemas {
  
  inline def apply(fieldName: String, fieldType: EnumValues[BOOLEAN]): FieldSchemas = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemas]
  }
  
  extension [Self <: FieldSchemas](x: Self) {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setDateFormats(value: String): Self = StObject.set(x, "dateFormats", value.asInstanceOf[js.Any])
    
    inline def setDateFormatsUndefined: Self = StObject.set(x, "dateFormats", js.undefined)
    
    inline def setEnableSortAndAgg(value: Boolean): Self = StObject.set(x, "enableSortAndAgg", value.asInstanceOf[js.Any])
    
    inline def setEnableSortAndAggUndefined: Self = StObject.set(x, "enableSortAndAgg", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldSchemas(value: js.Array[FieldSchemas]): Self = StObject.set(x, "fieldSchemas", value.asInstanceOf[js.Any])
    
    inline def setFieldSchemasUndefined: Self = StObject.set(x, "fieldSchemas", js.undefined)
    
    inline def setFieldSchemasVarargs(value: FieldSchemas*): Self = StObject.set(x, "fieldSchemas", js.Array(value*))
    
    inline def setFieldType(value: EnumValues[BOOLEAN]): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIsAnArray(value: Boolean): Self = StObject.set(x, "isAnArray", value.asInstanceOf[js.Any])
    
    inline def setIsAnArrayUndefined: Self = StObject.set(x, "isAnArray", js.undefined)
    
    inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
