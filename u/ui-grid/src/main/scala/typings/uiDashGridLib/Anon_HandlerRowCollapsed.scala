package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerRowCollapsed[TEntity] extends js.Object {
  /**
    * Raised when a row is collapsed.  Doesn't really have a purpose at the moment.  Included for symmetry
    * @param {ng.IScope} scope Grid scope
    * @param {rowCollapsedHandler} handler Callback
    */
  def rowCollapsed(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs.rowCollapsedHandler[TEntity]
  ): scala.Unit
  /**
    * Raised whenever a row is expanded.
    *
    * If you are dynamically rendering your tree,
    * in your callback you can retrieve the children of this row and load them into the grid data.
    *
    * When the data is loaded, the grid will automatically refresh to show these new rows.
    * @param {ng.IScope} scope Grid Scope
    * @param {rowExpandedHandler} handler Callback
    */
  def rowExpanded(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs.rowExpandedHandler[TEntity]
  ): scala.Unit
}

object Anon_HandlerRowCollapsed {
  @scala.inline
  def apply[TEntity](
    rowCollapsed: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs.rowCollapsedHandler[TEntity], 
      scala.Unit
    ],
    rowExpanded: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs.rowExpandedHandler[TEntity], 
      scala.Unit
    ]
  ): Anon_HandlerRowCollapsed[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rowCollapsed")(rowCollapsed)
    __obj.updateDynamic("rowExpanded")(rowExpanded)
    __obj.asInstanceOf[Anon_HandlerRowCollapsed[TEntity]]
  }
}

