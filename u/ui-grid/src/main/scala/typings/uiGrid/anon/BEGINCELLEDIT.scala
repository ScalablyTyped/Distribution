package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BEGINCELLEDIT extends js.Object {
  
  var BEGIN_CELL_EDIT: String = js.native
  
  var CANCEL_CELL_EDIT: String = js.native
  
  var END_CELL_EDIT: String = js.native
}
object BEGINCELLEDIT {
  
  @scala.inline
  def apply(BEGIN_CELL_EDIT: String, CANCEL_CELL_EDIT: String, END_CELL_EDIT: String): BEGINCELLEDIT = {
    val __obj = js.Dynamic.literal(BEGIN_CELL_EDIT = BEGIN_CELL_EDIT.asInstanceOf[js.Any], CANCEL_CELL_EDIT = CANCEL_CELL_EDIT.asInstanceOf[js.Any], END_CELL_EDIT = END_CELL_EDIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BEGINCELLEDIT]
  }
  
  @scala.inline
  implicit class BEGINCELLEDITOps[Self <: BEGINCELLEDIT] (val x: Self) extends AnyVal {
    
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
    def setBEGIN_CELL_EDIT(value: String): Self = this.set("BEGIN_CELL_EDIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCANCEL_CELL_EDIT(value: String): Self = this.set("CANCEL_CELL_EDIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEND_CELL_EDIT(value: String): Self = this.set("END_CELL_EDIT", value.asInstanceOf[js.Any])
  }
}
