package typings.uiGrid

import typings.angular.mod.IScope
import typings.uiGrid.mod.treeBase.rowCollapsedHandler
import typings.uiGrid.mod.treeBase.rowExpandedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandlerRowCollapsed[TEntity] extends js.Object {
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

object AnonHandlerRowCollapsed {
  @scala.inline
  def apply[TEntity](
    rowCollapsed: (IScope, rowCollapsedHandler[TEntity]) => Unit,
    rowExpanded: (IScope, rowExpandedHandler[TEntity]) => Unit
  ): AnonHandlerRowCollapsed[TEntity] = {
    val __obj = js.Dynamic.literal(rowCollapsed = js.Any.fromFunction2(rowCollapsed), rowExpanded = js.Any.fromFunction2(rowExpanded))
  
    __obj.asInstanceOf[AnonHandlerRowCollapsed[TEntity]]
  }
}

