package typings.uiGrid.mod.treeBase

import typings.uiGrid.AnonRowCollapsed
import typings.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridTreeBaseApi[TEntity] extends js.Object {
  // Events
  var on: AnonRowCollapsed[TEntity]
  // Methods
  /**
    * Collapse all tree rows
    */
  def collapseAllRows(): Unit
  /**
    * collapse the specified row. When you expand the row again, all grandchildren will retain their state
    * @param {IGridRow} row The row to collapse
    */
  def collapseRow(row: IGridRowOf[TEntity]): Unit
  /**
    * collapse all children of the specified row. When you expand the row again, all grandchildren will be
    * collapsed
    * @param {IGridRow} row The row to collapse children of
    */
  def collapseRowChildren(row: IGridRowOf[TEntity]): Unit
  /**
    * Expands all tree rows
    */
  def expandAllRows(): Unit
  /**
    * Expand the immediate children of the specified row
    * @param {IGridRow} row The row to expand
    */
  def expandRow(row: IGridRowOf[TEntity]): Unit
  /**
    * Get the children of the specified row
    * @param {IGridRow} row The row you want the children of
    * @returns Array<IGridRow> Array of children rows
    */
  def getRowChildren(row: IGridRowOf[TEntity]): js.Array[IGridRowOf[TEntity]]
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
  def setTreeState(config: ITreeState): Unit
  /**
    * call expand if row is collapsed, and collapse if it is expanded
    * @param {IGridRow} row The row to toggle
    */
  def toggleRowTreeState(row: IGridRowOf[TEntity]): Unit
}

object IGridTreeBaseApi {
  @scala.inline
  def apply[TEntity](
    collapseAllRows: () => Unit,
    collapseRow: IGridRowOf[TEntity] => Unit,
    collapseRowChildren: IGridRowOf[TEntity] => Unit,
    expandAllRows: () => Unit,
    expandRow: IGridRowOf[TEntity] => Unit,
    getRowChildren: IGridRowOf[TEntity] => js.Array[IGridRowOf[TEntity]],
    getTreeState: () => ITreeState,
    on: AnonRowCollapsed[TEntity],
    setTreeState: ITreeState => Unit,
    toggleRowTreeState: IGridRowOf[TEntity] => Unit
  ): IGridTreeBaseApi[TEntity] = {
    val __obj = js.Dynamic.literal(collapseAllRows = js.Any.fromFunction0(collapseAllRows), collapseRow = js.Any.fromFunction1(collapseRow), collapseRowChildren = js.Any.fromFunction1(collapseRowChildren), expandAllRows = js.Any.fromFunction0(expandAllRows), expandRow = js.Any.fromFunction1(expandRow), getRowChildren = js.Any.fromFunction1(getRowChildren), getTreeState = js.Any.fromFunction0(getTreeState), on = on.asInstanceOf[js.Any], setTreeState = js.Any.fromFunction1(setTreeState), toggleRowTreeState = js.Any.fromFunction1(toggleRowTreeState))
  
    __obj.asInstanceOf[IGridTreeBaseApi[TEntity]]
  }
}

