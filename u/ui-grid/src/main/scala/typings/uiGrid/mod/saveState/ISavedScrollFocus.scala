package typings.uiGrid.mod.saveState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISavedScrollFocus extends js.Object {
  
  var colName: js.UndefOr[String] = js.native
  
  var focus: js.UndefOr[Boolean] = js.native
  
  var rowVal: js.UndefOr[IRowVal] = js.native
}
object ISavedScrollFocus {
  
  @scala.inline
  def apply(): ISavedScrollFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISavedScrollFocus]
  }
  
  @scala.inline
  implicit class ISavedScrollFocusOps[Self <: ISavedScrollFocus] (val x: Self) extends AnyVal {
    
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
    def setColName(value: String): Self = this.set("colName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColName: Self = this.set("colName", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setRowVal(value: IRowVal): Self = this.set("rowVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowVal: Self = this.set("rowVal", js.undefined)
  }
}
