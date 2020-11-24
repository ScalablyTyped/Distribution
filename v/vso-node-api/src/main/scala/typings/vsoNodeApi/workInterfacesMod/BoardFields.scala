package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardFields extends js.Object {
  
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
  implicit class BoardFieldsOps[Self <: BoardFields] (val x: Self) extends AnyVal {
    
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
    def setColumnField(value: FieldReference): Self = this.set("columnField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneField(value: FieldReference): Self = this.set("doneField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowField(value: FieldReference): Self = this.set("rowField", value.asInstanceOf[js.Any])
  }
}
