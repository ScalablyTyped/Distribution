package typings.uiGrid

import typings.angular.mod.IScope
import typings.uiGrid.mod.pagination.paginationChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaginationChanged extends js.Object {
  /**
    * This event fires when the pageSize or currentPage changes
    * @param {ng.IScope} scope The grid scope
    * @param {paginationChangedHandler} handler Callback
    */
  def paginationChanged(scope: IScope, handler: paginationChangedHandler): Unit
}

object AnonPaginationChanged {
  @scala.inline
  def apply(paginationChanged: (IScope, paginationChangedHandler) => Unit): AnonPaginationChanged = {
    val __obj = js.Dynamic.literal(paginationChanged = js.Any.fromFunction2(paginationChanged))
  
    __obj.asInstanceOf[AnonPaginationChanged]
  }
}

