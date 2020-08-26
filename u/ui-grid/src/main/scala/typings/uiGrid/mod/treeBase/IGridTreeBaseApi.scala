package typings.uiGrid.mod.treeBase

import typings.uiGrid.anon.RowCollapsed
import typings.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridTreeBaseApi[TEntity] extends js.Object {
  // Events
  var on: RowCollapsed[TEntity] = js.native
  // Methods
  /**
    * Collapse all tree rows
    */
  def collapseAllRows(): Unit = js.native
  /**
    * collapse the specified row. When you expand the row again, all grandchildren will retain their state
    * @param {IGridRow} row The row to collapse
    */
  def collapseRow(row: IGridRowOf[TEntity]): Unit = js.native
  /**
    * collapse all children of the specified row. When you expand the row again, all grandchildren will be
    * collapsed
    * @param {IGridRow} row The row to collapse children of
    */
  def collapseRowChildren(row: IGridRowOf[TEntity]): Unit = js.native
  /**
    * Expands all tree rows
    */
  def expandAllRows(): Unit = js.native
  /**
    * Expand the immediate children of the specified row
    * @param {IGridRow} row The row to expand
    */
  def expandRow(row: IGridRowOf[TEntity]): Unit = js.native
  /**
    * Get the children of the specified row
    * @param {IGridRow} row The row you want the children of
    * @returns Array<IGridRow> Array of children rows
    */
  def getRowChildren(row: IGridRowOf[TEntity]): js.Array[IGridRowOf[TEntity]] = js.native
  /**
    * Get the tree state for this grid, used by the saveState feature Returned treeState as an object
    * ```{ expandedState: { uid: 'expanded', uid: 'collapsed' } }```
    * where expandedState is a hash of row uid and the current expanded state
    * @returns {ITreeState} tree state
    * NOTE this is an incomplete feature in uiGrid
    */
  def getTreeState(): ITreeState = js.native
  /**
    * Set the expanded states of the tree
    * @param {ITreeState} config The config you want to apply, in the format provided by getTreeState
    */
  def setTreeState(config: ITreeState): Unit = js.native
  /**
    * call expand if row is collapsed, and collapse if it is expanded
    * @param {IGridRow} row The row to toggle
    */
  def toggleRowTreeState(row: IGridRowOf[TEntity]): Unit = js.native
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
    on: RowCollapsed[TEntity],
    setTreeState: ITreeState => Unit,
    toggleRowTreeState: IGridRowOf[TEntity] => Unit
  ): IGridTreeBaseApi[TEntity] = {
    val __obj = js.Dynamic.literal(collapseAllRows = js.Any.fromFunction0(collapseAllRows), collapseRow = js.Any.fromFunction1(collapseRow), collapseRowChildren = js.Any.fromFunction1(collapseRowChildren), expandAllRows = js.Any.fromFunction0(expandAllRows), expandRow = js.Any.fromFunction1(expandRow), getRowChildren = js.Any.fromFunction1(getRowChildren), getTreeState = js.Any.fromFunction0(getTreeState), on = on.asInstanceOf[js.Any], setTreeState = js.Any.fromFunction1(setTreeState), toggleRowTreeState = js.Any.fromFunction1(toggleRowTreeState))
    __obj.asInstanceOf[IGridTreeBaseApi[TEntity]]
  }
  @scala.inline
  implicit class IGridTreeBaseApiOps[Self <: IGridTreeBaseApi[_], TEntity] (val x: Self with IGridTreeBaseApi[TEntity]) extends AnyVal {
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
    def setCollapseAllRows(value: () => Unit): Self = this.set("collapseAllRows", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapseRow(value: IGridRowOf[TEntity] => Unit): Self = this.set("collapseRow", js.Any.fromFunction1(value))
    @scala.inline
    def setCollapseRowChildren(value: IGridRowOf[TEntity] => Unit): Self = this.set("collapseRowChildren", js.Any.fromFunction1(value))
    @scala.inline
    def setExpandAllRows(value: () => Unit): Self = this.set("expandAllRows", js.Any.fromFunction0(value))
    @scala.inline
    def setExpandRow(value: IGridRowOf[TEntity] => Unit): Self = this.set("expandRow", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRowChildren(value: IGridRowOf[TEntity] => js.Array[IGridRowOf[TEntity]]): Self = this.set("getRowChildren", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTreeState(value: () => ITreeState): Self = this.set("getTreeState", js.Any.fromFunction0(value))
    @scala.inline
    def setOn(value: RowCollapsed[TEntity]): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetTreeState(value: ITreeState => Unit): Self = this.set("setTreeState", js.Any.fromFunction1(value))
    @scala.inline
    def setToggleRowTreeState(value: IGridRowOf[TEntity] => Unit): Self = this.set("toggleRowTreeState", js.Any.fromFunction1(value))
  }
  
}

