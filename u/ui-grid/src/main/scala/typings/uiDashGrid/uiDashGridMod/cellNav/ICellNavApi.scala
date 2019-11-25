package typings.uiDashGrid.uiDashGridMod.cellNav

import typings.angular.angularMod.IPromise
import typings.uiDashGrid.Anon_Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellNavApi[TEntity] extends js.Object {
  // Events
  var on: Anon_Handler[TEntity]
  // Methods
  /**
    * Gets the currently selected rows and columns.  array is empty if no selection has occurred
    * @returns {Array<IRowCol>} an array containing the current selection
    */
  def getCurrentSelection(): js.Array[IRowCol[TEntity]]
  /**
    * Gets the current focused cell.  value is null if no selection has occurred
    * @returns {IRowCol} the current (or last if Grid does not have focus) focused row and column
    */
  def getFocusedCell(): IRowCol[TEntity]
  /**
    * Gets the index of the passed rowCol.  Returns -1 if the RowCol isn't selected
    * @param rowCol
    * @returns the index in the order in which the RowCol was selected
    */
  def rowColSelectIndex(rowCol: IRowCol[TEntity]): Double
  /**
    * Brings the specified row and column into view, and sets focus to that cell
    * @param {TEntity} rowEntity gridOptions.data[] array instance to make visible and set focus
    * @param {IColumnDef} colDef Column definition to make visible and set focus
    */
  def scrollToFocus(rowEntity: TEntity, colDef: typings.uiDashGrid.uiDashGridMod.cellNav.IColumnDef): IPromise[_]
}

object ICellNavApi {
  @scala.inline
  def apply[TEntity](
    getCurrentSelection: () => js.Array[IRowCol[TEntity]],
    getFocusedCell: () => IRowCol[TEntity],
    on: Anon_Handler[TEntity],
    rowColSelectIndex: IRowCol[TEntity] => Double,
    scrollToFocus: (TEntity, typings.uiDashGrid.uiDashGridMod.cellNav.IColumnDef) => IPromise[_]
  ): ICellNavApi[TEntity] = {
    val __obj = js.Dynamic.literal(getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getFocusedCell = js.Any.fromFunction0(getFocusedCell), on = on.asInstanceOf[js.Any], rowColSelectIndex = js.Any.fromFunction1(rowColSelectIndex), scrollToFocus = js.Any.fromFunction2(scrollToFocus))
  
    __obj.asInstanceOf[ICellNavApi[TEntity]]
  }
}

