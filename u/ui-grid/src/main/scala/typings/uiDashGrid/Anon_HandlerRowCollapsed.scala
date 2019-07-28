package typings.uiDashGrid

import typings.angular.angularMod.IScope
import typings.uiDashGrid.uiDashGridMod.treeBaseNs.rowCollapsedHandler
import typings.uiDashGrid.uiDashGridMod.treeBaseNs.rowExpandedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerRowCollapsed[TEntity] extends js.Object {
  /**
    * Raised when a row is collapsed.  Doesn't really have a purpose at the moment.  Included for symmetry
    * @param {ng.IScope} scope Grid scope
    * @param {rowCollapsedHandler} handler Callback
    */
  def rowCollapsed(scope: IScope, handler: rowCollapsedHandler[TEntity]): Unit
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
  def rowExpanded(scope: IScope, handler: rowExpandedHandler[TEntity]): Unit
}

object Anon_HandlerRowCollapsed {
  @scala.inline
  def apply[TEntity](
    rowCollapsed: (IScope, rowCollapsedHandler[TEntity]) => Unit,
    rowExpanded: (IScope, rowExpandedHandler[TEntity]) => Unit
  ): Anon_HandlerRowCollapsed[TEntity] = {
    val __obj = js.Dynamic.literal(rowCollapsed = js.Any.fromFunction2(rowCollapsed), rowExpanded = js.Any.fromFunction2(rowExpanded))
  
    __obj.asInstanceOf[Anon_HandlerRowCollapsed[TEntity]]
  }
}

