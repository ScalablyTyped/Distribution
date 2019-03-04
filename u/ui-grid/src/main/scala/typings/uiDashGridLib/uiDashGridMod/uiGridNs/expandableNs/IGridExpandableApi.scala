package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.expandableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridExpandableApi[TEntity] extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_HandlerRowExpandedStateChanged[TEntity]
  // Methods
  /**
    * Collapse all subgrids.
    */
  def collapseAllRows(): scala.Unit
  /**
    * expand all subgrids
    */
  def expandAllRows(): scala.Unit
  /**
    * Toggle all subgrids
    */
  def toggleAllRows(): scala.Unit
  /**
    * Toggle a specific row
    * @param {TEntity} rowEntity The data entity for the row you want to expand
    */
  def toggleRowExpansion(rowEntity: TEntity): scala.Unit
}

object IGridExpandableApi {
  @scala.inline
  def apply[TEntity](
    collapseAllRows: js.Function0[scala.Unit],
    expandAllRows: js.Function0[scala.Unit],
    on: uiDashGridLib.Anon_HandlerRowExpandedStateChanged[TEntity],
    toggleAllRows: js.Function0[scala.Unit],
    toggleRowExpansion: js.Function1[TEntity, scala.Unit]
  ): IGridExpandableApi[TEntity] = {
    val __obj = js.Dynamic.literal(collapseAllRows = collapseAllRows, expandAllRows = expandAllRows, on = on, toggleAllRows = toggleAllRows, toggleRowExpansion = toggleRowExpansion)
  
    __obj.asInstanceOf[IGridExpandableApi[TEntity]]
  }
}

