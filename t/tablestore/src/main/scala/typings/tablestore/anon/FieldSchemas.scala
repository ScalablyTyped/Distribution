package typings.tablestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSchemas extends StObject {
  
  var fieldSchemas: js.Array[typings.tablestore.mod.FieldSchemas]
  
  var indexSetting: js.UndefOr[RoutingFields] = js.undefined
  
  var indexSort: js.UndefOr[Sorters] = js.undefined
}
object FieldSchemas {
  
  inline def apply(fieldSchemas: js.Array[typings.tablestore.mod.FieldSchemas]): FieldSchemas = {
    val __obj = js.Dynamic.literal(fieldSchemas = fieldSchemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemas]
  }
  
  extension [Self <: FieldSchemas](x: Self) {
    
    inline def setFieldSchemas(value: js.Array[typings.tablestore.mod.FieldSchemas]): Self = StObject.set(x, "fieldSchemas", value.asInstanceOf[js.Any])
    
    inline def setFieldSchemasVarargs(value: typings.tablestore.mod.FieldSchemas*): Self = StObject.set(x, "fieldSchemas", js.Array(value*))
    
    inline def setIndexSetting(value: RoutingFields): Self = StObject.set(x, "indexSetting", value.asInstanceOf[js.Any])
    
    inline def setIndexSettingUndefined: Self = StObject.set(x, "indexSetting", js.undefined)
    
    inline def setIndexSort(value: Sorters): Self = StObject.set(x, "indexSort", value.asInstanceOf[js.Any])
    
    inline def setIndexSortUndefined: Self = StObject.set(x, "indexSort", js.undefined)
  }
}
