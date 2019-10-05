package typings.uiDashGrid.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridRowOf[TEntity]
  extends typings.uiDashGrid.uiDashGridMod.cellNav.IGridRow
     with typings.uiDashGrid.uiDashGridMod.edit.IGridRow
     with typings.uiDashGrid.uiDashGridMod.exporter.IGridRow
     with typings.uiDashGrid.uiDashGridMod.selection.IGridRow
     with typings.uiDashGrid.uiDashGridMod.expandable.IGridRow {
  /** A reference to an item in gridOptions.data[] */
  var entity: TEntity = js.native
  // Additional features enabled by other modules
  /**
    * If set to false, then don't export this row,
    * notwithstanding visible or other settings
    * Defaults to true
    * @default true
    */
  @JSName("exporterEnableExporting")
  var exporterEnableExporting_IGridRowOf: Boolean = js.native
  /** A reference back to the grid */
  var grid: IGridInstanceOf[TEntity] = js.native
  /**
    * height of each individual row. changing the height will flag all
    * row renderContainers to recalculate their canvas height
    */
  var height: Double = js.native
  /** uniqueId of row */
  var uid: String = js.native
  /** if true, row will be rendered */
  var visible: Boolean = js.native
  /**
    * Clears any override on the row visibility, returning it to normal visibility calculations.
    * Emits the rowsVisibleChanged event
    * @param reason the reason (usually the module) for the row to be invisible. E.g. grouping, user, filter
    * @param fromRowsProcessor whether we were called from a rowsProcessor, passed through to evaluateRowVisibility
    */
  def clearRowInvisible(reason: String, fromRowsProcessor: Boolean): Unit = js.native
  /**
    * Clears an override on the row that forces it to always be invisible.
    * Emits the rowsVisibleChanged event if it changed the row visibility.
    *
    * This method can be called from the api, passing in the gridRow we want altered.
    * It should really work by calling gridRow.clearRowInvisible,
    * but that's not the way I coded it, and too late to change now.
    * Changed to just call the internal function row.clearThisRowInvisible().
    * @param row the row we want to clear the invisible flag
    */
  def clearRowInvisible(row: IGridRowOf[TEntity]): Unit = js.native
  /**
    * Determines whether the row should be visible based on invisibleReason,
    * and if it changes the row visibility, then emits the rowsVisibleChanged event.
    * Queues a grid refresh, but doesn't call it directly to avoid hitting lots of
    * grid refreshes.
    */
  def evaluateRowVisibility(fromRowProcessor: Boolean): Unit = js.native
  /**
    * returns the qualified field name minus the row path ie: entity.fieldA
    * @param col column instance
    * @returns resulting name that can be evaluated against a row
    */
  def getEntityQualifiedColField(col: IGridColumnOf[TEntity]): String = js.native
  /**
    * returns the qualified field name as it exists on scope ie: row.entity.fieldA
    * @param col column instance
    * @returns resulting name that can be evaluated on scope
    */
  def getQualifiedColField(col: IGridColumnOf[TEntity]): String = js.native
  /**
    * Sets an override on the row that forces it to always be invisible.
    * Emits the rowsVisibleChanged event if it changed the row visibility.
    * This method can be called from the api, passing in the gridRow we want altered.
    * It should really work by calling gridRow.setRowInvisible,
    * but that's not the way I coded it, and too late to change now.
    * Changed to just call the internal function row.setThisRowInvisible().
    * @param row the row we want to set to invisible
    */
  def setRowInvisible(row: IGridRowOf[TEntity]): Unit = js.native
  /**
    * Sets an override on the row that forces it to always be invisible.
    * Emits the rowsVisibleChanged event if it changed the row visibility
    * @param reason the reason (usually the module) for the row to be invisible. E.g. grouping, user, filter
    * @param fromRowsProcessor whether we were called from a rowsProcessor, passed through to evaluateRowVisibility
    */
  def setThisRowInvisible(reason: String, fromRowsProcessor: Boolean): Unit = js.native
}

