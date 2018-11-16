package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.expandableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGridExpandableApi[TEntity] extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_RowExpandedStateChanged[TEntity]
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

