package typings.uiDashGrid

import typings.angular.angularMod.IScope
import typings.uiDashGrid.uiDashGridMod.pagination.paginationChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerPaginationChanged extends js.Object {
  /**
    * This event fires when the pageSize or currentPage changes
    * @param {ng.IScope} scope The grid scope
    * @param {paginationChangedHandler} handler Callback
    */
  def paginationChanged(scope: IScope, handler: paginationChangedHandler): Unit
}

object Anon_HandlerPaginationChanged {
  @scala.inline
  def apply(paginationChanged: (IScope, paginationChangedHandler) => Unit): Anon_HandlerPaginationChanged = {
    val __obj = js.Dynamic.literal(paginationChanged = js.Any.fromFunction2(paginationChanged))
  
    __obj.asInstanceOf[Anon_HandlerPaginationChanged]
  }
}

