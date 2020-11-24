package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.moveColumns.columnPositionChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnPositionChanged extends js.Object {
  
  /**
    * Raised when a column is moved
    * @param {ng.IScope} scope Grid Scope
    * @param {columnPositionChangedHandler} handler Callback Function
    */
  var columnPositionChanged: js.UndefOr[
    js.Function2[/* scope */ IScope, /* handler */ columnPositionChangedHandler, Unit]
  ] = js.native
}
object ColumnPositionChanged {
  
  @scala.inline
  def apply(): ColumnPositionChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnPositionChanged]
  }
  
  @scala.inline
  implicit class ColumnPositionChangedOps[Self <: ColumnPositionChanged] (val x: Self) extends AnyVal {
    
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
    def setColumnPositionChanged(value: (/* scope */ IScope, /* handler */ columnPositionChangedHandler) => Unit): Self = this.set("columnPositionChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteColumnPositionChanged: Self = this.set("columnPositionChanged", js.undefined)
  }
}
