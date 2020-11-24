package typings.uiGrid.mod.resizeColumns

import typings.uiGrid.anon.ColumnSizeChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridResizeColumnsApi extends js.Object {
  
  // Events
  var on: ColumnSizeChanged = js.native
}
object IGridResizeColumnsApi {
  
  @scala.inline
  def apply(on: ColumnSizeChanged): IGridResizeColumnsApi = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridResizeColumnsApi]
  }
  
  @scala.inline
  implicit class IGridResizeColumnsApiOps[Self <: IGridResizeColumnsApi] (val x: Self) extends AnyVal {
    
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
    def setOn(value: ColumnSizeChanged): Self = this.set("on", value.asInstanceOf[js.Any])
  }
}
