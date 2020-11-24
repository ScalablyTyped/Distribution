package typings.uiGrid.mod.resizeColumns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnDef extends js.Object {
  
  /**
    * Enable column resizing on an individual column
    * Defaults to GridOptions.enableColumnResizing
    */
  var enableColumnResizing: js.UndefOr[Boolean] = js.native
}
object IColumnDef {
  
  @scala.inline
  def apply(): IColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef]
  }
  
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef] (val x: Self) extends AnyVal {
    
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
    def setEnableColumnResizing(value: Boolean): Self = this.set("enableColumnResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnResizing: Self = this.set("enableColumnResizing", js.undefined)
  }
}
