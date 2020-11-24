package typings.uiGrid.mod.pinning

import typings.angular.mod.IScope
import typings.uiGrid.mod.IGridColumnOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridPinningApi[TEntity] extends js.Object {
  
  // Events
  /**
    * raised when column pin state has changed
    * @param {ng.IScope} scope The grid scope
    * @param {columnPinHandler} handler Callback
    */
  def columnPin(scope: IScope, handler: columnPinHandler): Unit = js.native
  
  // Methods
  /**
    * Pin column left, right, or none
    * @param {IGridColumn} col The column being pinned
    * @param {string} container One of the recognized container types from uiGridPinningConstants
    */
  def pinColumn(col: IGridColumnOf[TEntity], container: String): Unit = js.native
}
object IGridPinningApi {
  
  @scala.inline
  def apply[TEntity](columnPin: (IScope, columnPinHandler) => Unit, pinColumn: (IGridColumnOf[TEntity], String) => Unit): IGridPinningApi[TEntity] = {
    val __obj = js.Dynamic.literal(columnPin = js.Any.fromFunction2(columnPin), pinColumn = js.Any.fromFunction2(pinColumn))
    __obj.asInstanceOf[IGridPinningApi[TEntity]]
  }
  
  @scala.inline
  implicit class IGridPinningApiOps[Self <: IGridPinningApi[_], TEntity] (val x: Self with IGridPinningApi[TEntity]) extends AnyVal {
    
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
    def setColumnPin(value: (IScope, columnPinHandler) => Unit): Self = this.set("columnPin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPinColumn(value: (IGridColumnOf[TEntity], String) => Unit): Self = this.set("pinColumn", js.Any.fromFunction2(value))
  }
}
