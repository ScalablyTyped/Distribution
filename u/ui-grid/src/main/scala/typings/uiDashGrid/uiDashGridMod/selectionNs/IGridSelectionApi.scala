package typings.uiDashGrid.uiDashGridMod.selectionNs

import typings.angular.angularMod.IAngularEvent
import typings.uiDashGrid.Anon_HandlerRowSelectionChanged
import typings.uiDashGrid.uiDashGridMod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridSelectionApi[TEntity] extends js.Object {
  // Events
  var on: Anon_HandlerRowSelectionChanged[TEntity] = js.native
  // Methods
  /**
    * Unselects All Rows
    * @param {ng.IAngularEvent} event object if raised from event
    */
  def clearSelectedRows(): Unit = js.native
  def clearSelectedRows(event: IAngularEvent): Unit = js.native
  /**
    * Returns whether or not the selectAll checkbox is currently ticked.
    * The grid doesn't automatically select rows when you add extra data -
    * so when you add data you need to explicitly check whether the selectAll is set,
    * and then call setVisible rows if it is
    * @returns {boolean} Whether or not selectAll checkbox is ticked
    */
  def getSelectAllState(): Boolean = js.native
  /**
    * returns all selected rows as gridRows
    * @returns {Array<IGridRow>} The selected rows
    */
  def getSelectedGridRows(): js.Array[IGridRowOf[TEntity]] = js.native
  /**
    * Gets selected rows as entities
    * @returns {Array<TEntity>} Selected row entities
    */
  def getSelectedRows(): js.Array[TEntity] = js.native
  /**
    * Selects all rows.  Does nothing if multiselect = false
    * @param {ng.IAngularEvent} event object if raised from event
    */
  def selectAllRows(): Unit = js.native
  def selectAllRows(event: IAngularEvent): Unit = js.native
  /**
    * Selects all visible rows.  Does nothing if multiselect = false
    * @param {ng.IAngularEvent} event object if raised from event
    */
  def selectAllVisibleRows(): Unit = js.native
  def selectAllVisibleRows(event: IAngularEvent): Unit = js.native
  /**
    * Select row by data
    * @param {TEntity} rowEntity gridOptions.data[] array value
    * @param {ng.IAngularEvent} event object if raised from event
    */
  def selectRow(rowEntity: TEntity): Unit = js.native
  def selectRow(rowEntity: TEntity, event: IAngularEvent): Unit = js.native
  /**
    * Select the specified row by visible index
    * (i.e. if you specify row 0 you'll get the first visible row selected).
    *
    * In this context visible means of those rows that are theoretically visible (i.e. not filtered),
    * rather than rows currently rendered on the screen.
    *
    * @param {number} index Index within rowsVisible array
    * @param {ng.IAngularEvent} event object if raised from event
    */
  def selectRowByVisibleIndex(index: Double): Unit = js.native
  def selectRowByVisibleIndex(index: Double, event: IAngularEvent): Unit = js.native
  /**
    * Sets the current gridOption.modifierKeysToMultiSelect to true or false
    * @param {boolean} multiSelect true to only allow multiple rows when using ctrlKey or shiftKey is used
    */
  def setModifierKeysToMultiSelect(multiSelect: Boolean): Unit = js.native
  /**
    * Sets the current gridOption.multiSelect to true or false
    * @param {boolean} multiSelect true to allow multiple rows
    */
  def setMultiSelect(multiSelect: Boolean): Unit = js.native
  /**
    * Toggles data row as selected or unselected
    * @param {TEntity} rowEntity gridOptions.data[] array value
    * @param {ng.IAngularEvent} event object if raised from event
    */
  def toggleRowSelection(rowEntity: TEntity): Unit = js.native
  def toggleRowSelection(rowEntity: TEntity, event: IAngularEvent): Unit = js.native
  /**
    * UnSelect the data row
    * @param {TEntity} rowEntity gridOptions.data[] array value
    * @param {ng.IAngularEvent} event object if raised from event
    */
  def unSelectRow(rowEntity: TEntity): Unit = js.native
  def unSelectRow(rowEntity: TEntity, event: IAngularEvent): Unit = js.native
}

