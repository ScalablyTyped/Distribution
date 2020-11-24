package typings.uiGrid.mod.rowEdit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridOptions extends js.Object {
  
  /**
    * How long the grid should wait for another change on this row before triggering a save (in milliseconds).
    * If set to -1, then saves are never triggered by timer
    * (implying that the user will call flushDirtyRows() manually)
    */
  var rowEditWaitInterval: js.UndefOr[Double] = js.native
}
object IGridOptions {
  
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    
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
    def setRowEditWaitInterval(value: Double): Self = this.set("rowEditWaitInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowEditWaitInterval: Self = this.set("rowEditWaitInterval", js.undefined)
  }
}
