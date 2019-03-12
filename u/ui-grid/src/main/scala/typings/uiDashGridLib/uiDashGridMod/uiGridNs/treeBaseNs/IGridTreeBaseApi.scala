package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridTreeBaseApi[TEntity] extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_HandlerRowCollapsed[TEntity]
  // Methods
  /**
    * Collapse all tree rows
    */
  def collapseAllRows(): scala.Unit
  /**
    * collapse the specified row. When you expand the row again, all grandchildren will retain their state
    * @param {IGridRow} row The row to collapse
    */
  def collapseRow(row: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]): scala.Unit
  /**
    * collapse all children of the specified row. When you expand the row again, all grandchildren will be
    * collapsed
    * @param {IGridRow} row The row to collapse children of
    */
  def collapseRowChildren(row: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]): scala.Unit
  /**
    * Expands all tree rows
    */
  def expandAllRows(): scala.Unit
  /**
    * Expand the immediate children of the specified row
    * @param {IGridRow} row The row to expand
    */
  def expandRow(row: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]): scala.Unit
  /**
    * Get the children of the specified row
    * @param {IGridRow} row The row you want the children of
    * @returns Array<IGridRow> Array of children rows
    */
  def getRowChildren(row: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]): js.Array[uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]]
  /**
    * Get the tree state for this grid, used by the saveState feature Returned treeState as an object
    * ```{ expandedState: { uid: 'expanded', uid: 'collapsed' } }```
    * where expandedState is a hash of row uid and the current expanded state
    * @returns {ITreeState} tree state
    * NOTE this is an incomplete feature in uiGrid
    */
  def getTreeState(): ITreeState
  /**
    * Set the expanded states of the tree
    * @param {ITreeState} config The config you want to apply, in the format provided by getTreeState
    */
  def setTreeState(config: ITreeState): scala.Unit
  /**
    * call expand if row is collapsed, and collapse if it is expanded
    * @param {IGridRow} row The row to toggle
    */
  def toggleRowTreeState(row: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]): scala.Unit
}

object IGridTreeBaseApi {
  @scala.inline
  def apply[TEntity](
    collapseAllRows: () => scala.Unit,
    collapseRow: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity] => scala.Unit,
    collapseRowChildren: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity] => scala.Unit,
    expandAllRows: () => scala.Unit,
    expandRow: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity] => scala.Unit,
    getRowChildren: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity] => js.Array[uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity]],
    getTreeState: () => ITreeState,
    on: uiDashGridLib.Anon_HandlerRowCollapsed[TEntity],
    setTreeState: ITreeState => scala.Unit,
    toggleRowTreeState: uiDashGridLib.uiDashGridMod.uiGridNs.IGridRowOf[TEntity] => scala.Unit
  ): IGridTreeBaseApi[TEntity] = {
    val __obj = js.Dynamic.literal(collapseAllRows = js.Any.fromFunction0(collapseAllRows), collapseRow = js.Any.fromFunction1(collapseRow), collapseRowChildren = js.Any.fromFunction1(collapseRowChildren), expandAllRows = js.Any.fromFunction0(expandAllRows), expandRow = js.Any.fromFunction1(expandRow), getRowChildren = js.Any.fromFunction1(getRowChildren), getTreeState = js.Any.fromFunction0(getTreeState), on = on, setTreeState = js.Any.fromFunction1(setTreeState), toggleRowTreeState = js.Any.fromFunction1(toggleRowTreeState))
  
    __obj.asInstanceOf[IGridTreeBaseApi[TEntity]]
  }
}

