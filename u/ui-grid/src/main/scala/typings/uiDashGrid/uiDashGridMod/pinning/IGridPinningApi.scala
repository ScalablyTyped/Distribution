package typings.uiDashGrid.uiDashGridMod.pinning

import typings.angular.angularMod.IScope
import typings.uiDashGrid.uiDashGridMod.IGridColumnOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridPinningApi[TEntity] extends js.Object {
  // Events
  /**
    * raised when column pin state has changed
    * @param {ng.IScope} scope The grid scope
    * @param {columnPinHandler} handler Callback
    */
  def columnPin(scope: IScope, handler: columnPinHandler): Unit
  // Methods
  /**
    * Pin column left, right, or none
    * @param {IGridColumn} col The column being pinned
    * @param {string} container One of the recognized container types from uiGridPinningConstants
    */
  def pinColumn(col: IGridColumnOf[TEntity], container: String): Unit
}

object IGridPinningApi {
  @scala.inline
  def apply[TEntity](columnPin: (IScope, columnPinHandler) => Unit, pinColumn: (IGridColumnOf[TEntity], String) => Unit): IGridPinningApi[TEntity] = {
    val __obj = js.Dynamic.literal(columnPin = js.Any.fromFunction2(columnPin), pinColumn = js.Any.fromFunction2(pinColumn))
  
    __obj.asInstanceOf[IGridPinningApi[TEntity]]
  }
}

