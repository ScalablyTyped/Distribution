package typings.uiGrid.mod.cellNav

import typings.angular.mod.IPromise
import typings.uiGrid.anon.Navigate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellNavApi[TEntity] extends js.Object {
  // Events
  var on: Navigate[TEntity] = js.native
  // Methods
  /**
    * Gets the currently selected rows and columns.  array is empty if no selection has occurred
    * @returns {Array<IRowCol>} an array containing the current selection
    */
  def getCurrentSelection(): js.Array[IRowCol[TEntity]] = js.native
  /**
    * Gets the current focused cell.  value is null if no selection has occurred
    * @returns {IRowCol} the current (or last if Grid does not have focus) focused row and column
    */
  def getFocusedCell(): IRowCol[TEntity] = js.native
  /**
    * Gets the index of the passed rowCol.  Returns -1 if the RowCol isn't selected
    * @param rowCol
    * @returns the index in the order in which the RowCol was selected
    */
  def rowColSelectIndex(rowCol: IRowCol[TEntity]): Double = js.native
  /**
    * Brings the specified row and column into view, and sets focus to that cell
    * @param {TEntity} rowEntity gridOptions.data[] array instance to make visible and set focus
    * @param {IColumnDef} colDef Column definition to make visible and set focus
    */
  def scrollToFocus(rowEntity: TEntity, colDef: IColumnDef): IPromise[_] = js.native
}

object ICellNavApi {
  @scala.inline
  def apply[TEntity](
    getCurrentSelection: () => js.Array[IRowCol[TEntity]],
    getFocusedCell: () => IRowCol[TEntity],
    on: Navigate[TEntity],
    rowColSelectIndex: IRowCol[TEntity] => Double,
    scrollToFocus: (TEntity, IColumnDef) => IPromise[_]
  ): ICellNavApi[TEntity] = {
    val __obj = js.Dynamic.literal(getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getFocusedCell = js.Any.fromFunction0(getFocusedCell), on = on.asInstanceOf[js.Any], rowColSelectIndex = js.Any.fromFunction1(rowColSelectIndex), scrollToFocus = js.Any.fromFunction2(scrollToFocus))
    __obj.asInstanceOf[ICellNavApi[TEntity]]
  }
  @scala.inline
  implicit class ICellNavApiOps[Self <: ICellNavApi[_], TEntity] (val x: Self with ICellNavApi[TEntity]) extends AnyVal {
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
    def setGetCurrentSelection(value: () => js.Array[IRowCol[TEntity]]): Self = this.set("getCurrentSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFocusedCell(value: () => IRowCol[TEntity]): Self = this.set("getFocusedCell", js.Any.fromFunction0(value))
    @scala.inline
    def setOn(value: Navigate[TEntity]): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowColSelectIndex(value: IRowCol[TEntity] => Double): Self = this.set("rowColSelectIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollToFocus(value: (TEntity, IColumnDef) => IPromise[_]): Self = this.set("scrollToFocus", js.Any.fromFunction2(value))
  }
  
}

