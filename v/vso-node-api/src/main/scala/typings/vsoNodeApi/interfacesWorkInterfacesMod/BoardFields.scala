package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardFields extends StObject {
  
  var columnField: FieldReference
  
  var doneField: FieldReference
  
  var rowField: FieldReference
}
object BoardFields {
  
  inline def apply(columnField: FieldReference, doneField: FieldReference, rowField: FieldReference): BoardFields = {
    val __obj = js.Dynamic.literal(columnField = columnField.asInstanceOf[js.Any], doneField = doneField.asInstanceOf[js.Any], rowField = rowField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardFields]
  }
  
  extension [Self <: BoardFields](x: Self) {
    
    inline def setColumnField(value: FieldReference): Self = StObject.set(x, "columnField", value.asInstanceOf[js.Any])
    
    inline def setDoneField(value: FieldReference): Self = StObject.set(x, "doneField", value.asInstanceOf[js.Any])
    
    inline def setRowField(value: FieldReference): Self = StObject.set(x, "rowField", value.asInstanceOf[js.Any])
  }
}
