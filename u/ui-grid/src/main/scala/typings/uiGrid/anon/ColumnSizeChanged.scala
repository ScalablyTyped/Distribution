package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.resizeColumns.columnSizeChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSizeChanged extends js.Object {
  
  /**
    * Raised when column is resized
    * @param {ng.IScope} scope Grid Scope
    * @param {columnSizeChangedHandler} handler Callback
    */
  def columnSizeChanged(scope: IScope, handler: columnSizeChangedHandler): Unit = js.native
}
object ColumnSizeChanged {
  
  @scala.inline
  def apply(columnSizeChanged: (IScope, columnSizeChangedHandler) => Unit): ColumnSizeChanged = {
    val __obj = js.Dynamic.literal(columnSizeChanged = js.Any.fromFunction2(columnSizeChanged))
    __obj.asInstanceOf[ColumnSizeChanged]
  }
  
  @scala.inline
  implicit class ColumnSizeChangedOps[Self <: ColumnSizeChanged] (val x: Self) extends AnyVal {
    
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
    def setColumnSizeChanged(value: (IScope, columnSizeChangedHandler) => Unit): Self = this.set("columnSizeChanged", js.Any.fromFunction2(value))
  }
}
