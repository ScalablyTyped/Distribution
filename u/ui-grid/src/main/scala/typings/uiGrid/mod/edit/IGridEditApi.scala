package typings.uiGrid.mod.edit

import typings.uiGrid.anon.AfterCellEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridEditApi[TEntity] extends js.Object {
  
  var on: AfterCellEdit[TEntity] = js.native
}
object IGridEditApi {
  
  @scala.inline
  def apply[TEntity](on: AfterCellEdit[TEntity]): IGridEditApi[TEntity] = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridEditApi[TEntity]]
  }
  
  @scala.inline
  implicit class IGridEditApiOps[Self <: IGridEditApi[_], TEntity] (val x: Self with IGridEditApi[TEntity]) extends AnyVal {
    
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
    def setOn(value: AfterCellEdit[TEntity]): Self = this.set("on", value.asInstanceOf[js.Any])
  }
}
