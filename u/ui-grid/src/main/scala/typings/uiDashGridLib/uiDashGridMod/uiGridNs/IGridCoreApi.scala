package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridCoreApi[TEntity] extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_RowsRendered[TEntity] = js.native
  // Methods
  /**
    * adds a row header column to the grid
    * @param {IColumnDef} column Column Definition
    * @param {number} order Number that indicates where the column should be placed in the grid.
    * @param {boolean} stopColumnBuild Prevents the buildColumn callback from being triggered. This is useful to improve performance of the grid during initial load.
    */
  def addRowHeaderColumn(column: IColumnDefOf[TEntity]): scala.Unit = js.native
  def addRowHeaderColumn(column: IColumnDefOf[TEntity], order: scala.Double): scala.Unit = js.native
  def addRowHeaderColumn(column: IColumnDefOf[TEntity], order: scala.Double, stopColumnBuild: scala.Boolean): scala.Unit = js.native
  /**
    * add items to the grid menu.  Used by features
    * to add their menu items if they are enabled, can also be used by
    * end users to add menu items.  This method has the advantage of allowing
    * remove again, which can simplify management of which items are included
    * in the menu when.  (Noting that in most cases the shown and active functions
    * provide a better way to handle visibility of menu items)
    * @param {IGridInstance} grid the grid on which we are acting
    * @param {Array<IMenuItem>} items menu items in the format as described in the tutorial, with
    * the added note that if you want to use remove you must also specify an `id` field,
    * which is provided when you want to remove an item.  The id should be unique.
    */
  def addToGridMenu(grid: IGridInstanceOf[TEntity], items: js.Array[IMenuItem]): scala.Unit = js.native
  /**
    * Clears all filters and optionally refreshes the visible rows.
    * @param {boolean} [refreshRows=true] Defaults to true.
    * @param {boolean} [clearConditions=false] Defaults to false.
    * @param {boolean} [clearFlags=false] Defaults to false.
    * @returns {ng.IPromise<any>} If `refreshRows` is true, returns a promise of the rows refreshing.
    */
  def clearAllFilters(): angularLib.angularMod.angularNs.IPromise[js.Array[IGridRowOf[TEntity]]] = js.native
  def clearAllFilters(refreshRows: scala.Boolean): angularLib.angularMod.angularNs.IPromise[js.Array[IGridRowOf[TEntity]]] = js.native
  def clearAllFilters(refreshRows: scala.Boolean, clearConditions: scala.Boolean): angularLib.angularMod.angularNs.IPromise[js.Array[IGridRowOf[TEntity]]] = js.native
  def clearAllFilters(refreshRows: scala.Boolean, clearConditions: scala.Boolean, clearFlags: scala.Boolean): angularLib.angularMod.angularNs.IPromise[js.Array[IGridRowOf[TEntity]]] = js.native
  /**
    * Clears any override on visibility for the row so that it returns to
    * using normal filtering and other visibility calculations.
    * If the row is currently invisible then sets it to visible and calls
    * both grid refresh and emits the rowsVisibleChanged event
    * TODO: if a filter is active then we can't just set it to visible?
    * @param {TEntity} rowEntity gridOptions.data[] array instance
    */
  def clearRowInvisible(rowEntity: TEntity): scala.Unit = js.native
  /**
    * Returns all visible rows
    * @returns {Array<IGridRow>} an array of gridRow
    */
  def getVisibleRows(): js.Array[IGridRowOf[TEntity]] = js.native
  /**
    * Trigger a grid resize, normally this would be picked
    * up by a watch on window size, but in some circumstances it is necessary
    * to call this manually
    * @returns {ng.IPromise<any>} promise that is resolved when render completes?
    */
  def handleWindowResize(): scala.Unit = js.native
  /**
    * Notify the grid that a data or config change has occurred,
    * where that change isn't something the grid was otherwise noticing.  This
    * might be particularly relevant where you've changed values within the data
    * and you'd like cell classes to be re-evaluated, or changed config within
    * the columnDef and you'd like headerCellClasses to be re-evaluated.
    * @param {string} type one of the
    *        uiGridConstants.dataChange values (ALL, ROW, EDIT, COLUMN), which tells
    *        us which refreshes to fire.
    */
  def notifyDataChange(`type`: java.lang.String): scala.Unit = js.native
  /**
    * queues a grid refresh, a way of debouncing all the refreshes we might otherwise issue
    */
  def queueGridRefresh(): scala.Unit = js.native
  /**
    * queues a grid refreshCanvas, a way of debouncing all the refreshes we might otherwise issue
    */
  def queueRefresh(): scala.Unit = js.native
  /**
    * Refresh the rendered grid on screen.
    *
    * @param {boolean} [rowsAltered] Optional flag for refreshing when the number of rows has changed.
    */
  def refresh(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def refresh(rowsAltered: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * Refresh the rendered rows on screen?  Note: not functional at present
    * @returns {ng.IPromise<any>} promise that is resolved when render completes?
    */
  def refreshRows(): angularLib.angularMod.angularNs.IPromise[scala.Boolean] = js.native
  /**
    * Register a "columns processor" function. When the columns are updated,
    * the grid calls each registered "columns processor", which has a chance
    * to alter the set of columns as long as the count is not
    * modified.
    *
    * @param {IColumnProcessor} processorFunction columns processor function, which
    *        is run in the context of the grid (i.e. this for the function will be the grid), and must
    *        return the updated columns list, which is passed to the next processor in the chain
    * @param {number} priority the priority of this processor.  In general we try to do them in 100s to leave room
    *        for other people to inject columns processors at intermediate priorities.  Lower priority
    *        columnsProcessors run earlier.
    *
    * At present allRowsVisible is running at 50, filter is running at 100, sort is at 200, grouping at 400,
    * selectable rows at 500, pagination at 900 (pagination will generally want to be last)
    */
  def registerColumnsProcessor(processorFunction: IColumnProcessor[TEntity], priority: scala.Double): scala.Unit = js.native
  /**
    * Register a "rows processor" function. When the rows are updated,
    * the grid calls each registered "rows processor", which has a chance
    * to alter the set of rows (sorting, etc) as long as the count is not
    * modified.
    *
    * @param {IRowProcessor} rowProcessor rows processor function, which
    *        is run in the context of the grid (i.e. this for the function will be the grid), and must
    *        return the updated rows list, which is passed to the next processor in the chain
    * @param {number} priority the priority of this processor.  In general we try to do them in 100s to leave room
    *        for other people to inject rows processors at intermediate priorities.  Lower priority rowsProcessors
    *        run earlier.
    *
    * At present all rows visible is running at 50, filter is running at 100, sort is at 200, grouping at 400,
    * selectable rows at 500, pagination at 900 (pagination will generally want to be last)
    */
  def registerRowsProcessor(rowProcessor: IRowProcessor[TEntity], priority: scala.Double): scala.Unit = js.native
  /**
    * Scroll the grid such that the specified
    * row and column is in view
    * @param {TEntity} entity gridOptions.data[] array instance to make visible
    * @param {IColumnDef} colDef to make visible
    * @returns {ng.IPromise<any>} a promise that is resolved after any scrolling is finished
    */
  def scrollTo(entity: TEntity, colDef: IColumnDefOf[TEntity]): scala.Unit = js.native
   /*A row entity can be anything?*/ /**
    * Scrolls the grid to make a certain row and column combo visible,
    * in the case that it is not completely visible on the screen already.
    * @param {IGridRow} gridRow row to make visible
    * @param {IGridColumn} gridCol column to make visible
    * @returns {ng.IPromise<any>} a promise that is resolved when scrolling is complete
    */
  def scrollToIfNecessary(gridRow: IGridRowOf[TEntity], gridCol: IGridColumnOf[TEntity]): scala.Unit = js.native
  /**
    * A null handling method that can be used when building custom sort
    * functions
    * @param {any} a Sort value a
    * @param {any} b Sort value b
    * @returns {number} null if there were no nulls/undefineds, otherwise returns
    * a sort value that should be passed back from the sort function
    */
  def sortHandleNulls(a: js.Any, b: js.Any): scala.Double = js.native
}

