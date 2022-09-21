package typings.tablestore.anon

import typings.tablestore.mod.EnumValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldName extends StObject {
  
  var fieldName: String
  
  var mode: js.UndefOr[EnumValues[SORTMODEAVG]] = js.undefined
  
  var order: EnumValues[SORTORDERASC]
}
object FieldName {
  
  inline def apply(fieldName: String, order: EnumValues[SORTORDERASC]): FieldName = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldName]
  }
  
  extension [Self <: FieldName](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setMode(value: EnumValues[SORTMODEAVG]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOrder(value: EnumValues[SORTORDERASC]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
