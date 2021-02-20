package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardFields extends StObject {
  
  var columnField: FieldReference = js.native
  
  var doneField: FieldReference = js.native
  
  var rowField: FieldReference = js.native
}
object BoardFields {
  
  @scala.inline
  def apply(columnField: FieldReference, doneField: FieldReference, rowField: FieldReference): BoardFields = {
    val __obj = js.Dynamic.literal(columnField = columnField.asInstanceOf[js.Any], doneField = doneField.asInstanceOf[js.Any], rowField = rowField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardFields]
  }
  
  @scala.inline
  implicit class BoardFieldsMutableBuilder[Self <: BoardFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnField(value: FieldReference): Self = StObject.set(x, "columnField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneField(value: FieldReference): Self = StObject.set(x, "doneField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowField(value: FieldReference): Self = StObject.set(x, "rowField", value.asInstanceOf[js.Any])
  }
}
