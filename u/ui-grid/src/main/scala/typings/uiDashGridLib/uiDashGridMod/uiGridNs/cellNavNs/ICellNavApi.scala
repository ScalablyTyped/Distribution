package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellNavApi[TEntity] extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_Handler[TEntity]
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
  def rowColSelectIndex(rowCol: IRowCol[TEntity]): scala.Double
  /**
    * Brings the specified row and column into view, and sets focus to that cell
    * @param {TEntity} rowEntity gridOptions.data[] array instance to make visible and set focus
    * @param {IColumnDef} colDef Column definition to make visible and set focus
    */
  def scrollToFocus(rowEntity: TEntity, colDef: IColumnDef): angularLib.angularMod.angularNs.IPromise[_]
}

object ICellNavApi {
  @scala.inline
  def apply[TEntity](
    getCurrentSelection: js.Function0[js.Array[IRowCol[TEntity]]],
    getFocusedCell: js.Function0[IRowCol[TEntity]],
    on: uiDashGridLib.Anon_Handler[TEntity],
    rowColSelectIndex: js.Function1[IRowCol[TEntity], scala.Double],
    scrollToFocus: js.Function2[TEntity, IColumnDef, angularLib.angularMod.angularNs.IPromise[_]]
  ): ICellNavApi[TEntity] = {
    val __obj = js.Dynamic.literal(getCurrentSelection = getCurrentSelection, getFocusedCell = getFocusedCell, on = on, rowColSelectIndex = rowColSelectIndex, scrollToFocus = scrollToFocus)
  
    __obj.asInstanceOf[ICellNavApi[TEntity]]
  }
}

