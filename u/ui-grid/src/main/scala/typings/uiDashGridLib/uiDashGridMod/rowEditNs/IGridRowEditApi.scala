package typings
package uiDashGridLib.uiDashGridMod.rowEditNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridRowEditApi[TEntity] extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_HandlerSaveRow[TEntity] = js.native
  // Methods
  /**
    * Triggers a save event for all currently dirty rows.
    * Could be used where user presses a save button or navigates away from the page
    * @param {IGridInstance} grid The grid
    * @returns {ng.IPromise<Array<any>>} a promise that represents the aggregate of all of the individual save
    *          promises.  i.e. it will be resolved when all the individual save promises have been resolved.
    */
  def flushDirtyRows(): angularLib.angularMod.IPromise[js.Array[_]] = js.native
  def flushDirtyRows(grid: uiDashGridLib.uiDashGridMod.IGridInstanceOf[TEntity]): angularLib.angularMod.IPromise[js.Array[_]] = js.native
  /**
    * Returns all currently dirty rows
    * @param {IGridInstance} grid The target grid
    * @returns {Array<IGridRow>} An array of gridRows that are currently dirty
    */
  def getDirtyRows(): js.Array[uiDashGridLib.uiDashGridMod.IGridRowOf[TEntity]] = js.native
  def getDirtyRows(grid: uiDashGridLib.uiDashGridMod.IGridInstanceOf[TEntity]): js.Array[uiDashGridLib.uiDashGridMod.IGridRowOf[TEntity]] = js.native
  /**
    * Returns all currently errored rows
    * @param {IGridInstance} grid The target grid
    * @returns {Array<IGridRow>} An array of gridRows that are currently in error
    */
  def getErrorRows(): js.Array[uiDashGridLib.uiDashGridMod.IGridRowOf[TEntity]] = js.native
  def getErrorRows(grid: uiDashGridLib.uiDashGridMod.IGridInstanceOf[TEntity]): js.Array[uiDashGridLib.uiDashGridMod.IGridRowOf[TEntity]] = js.native
  /**
    * Sets each of the rows passed in dataRows to be clean,
    * removing them from the dirty cache and the error cache,
    * and clearing the error flag and the dirty flag
    * @param {Array<TEntity>} dataRows the data entities for which the gridRows should be set clean
    */
  def setRowsClean(dataRows: js.Array[TEntity]): scala.Unit = js.native
  /**
    * Sets each of the rows passed in dataRows to be dirty,
    * Note that if you have only just inserted the rows into your data,
    * you will need to wait for a $digest cycle before the gridRows are present.  As a result, this is often
    * wrapped with $interval or $timeout.
    * @param {Array<TEntity>} dataRows the data entities for which the gridRows should be set dirty
    */
  def setRowsDirty(dataRows: js.Array[TEntity]): scala.Unit = js.native
  /**
    * Sets the promise associated with the row save, mandatory that the saveRow event handler calls this method
    * somewhere before returning
    * @param {any} rowEntity A data row from the grid for which a save has been initiated
    * @param {ng.IPromise<any>} savePromise A promise that will be resolved when the save is successful, or
    *        rejected if the save fails
    */
  def setSavePromise(rowEntity: js.Object, savePromise: angularLib.angularMod.IPromise[_]): scala.Unit = js.native
}

