package typings.uiGrid.mod.expandable

import typings.uiGrid.AnonRowExpandedStateChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridExpandableApi[TEntity] extends js.Object {
  // Events
  var on: AnonRowExpandedStateChanged[TEntity]
  // Methods
  /**
    * Collapse all subgrids.
    */
  def collapseAllRows(): Unit
  /**
    * expand all subgrids
    */
  def expandAllRows(): Unit
  /**
    * Toggle all subgrids
    */
  def toggleAllRows(): Unit
  /**
    * Toggle a specific row
    * @param {TEntity} rowEntity The data entity for the row you want to expand
    */
  def toggleRowExpansion(rowEntity: TEntity): Unit
}

object IGridExpandableApi {
  @scala.inline
  def apply[TEntity](
    collapseAllRows: () => Unit,
    expandAllRows: () => Unit,
    on: AnonRowExpandedStateChanged[TEntity],
    toggleAllRows: () => Unit,
    toggleRowExpansion: TEntity => Unit
  ): IGridExpandableApi[TEntity] = {
    val __obj = js.Dynamic.literal(collapseAllRows = js.Any.fromFunction0(collapseAllRows), expandAllRows = js.Any.fromFunction0(expandAllRows), on = on.asInstanceOf[js.Any], toggleAllRows = js.Any.fromFunction0(toggleAllRows), toggleRowExpansion = js.Any.fromFunction1(toggleRowExpansion))
    __obj.asInstanceOf[IGridExpandableApi[TEntity]]
  }
}

