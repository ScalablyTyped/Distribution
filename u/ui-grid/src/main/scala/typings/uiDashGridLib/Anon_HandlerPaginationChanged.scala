package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerPaginationChanged extends js.Object {
  /**
    * This event fires when the pageSize or currentPage changes
    * @param {ng.IScope} scope The grid scope
    * @param {paginationChangedHandler} handler Callback
    */
  def paginationChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.paginationNs.paginationChangedHandler
  ): scala.Unit
}

object Anon_HandlerPaginationChanged {
  @scala.inline
  def apply(
    paginationChanged: (angularLib.angularMod.angularNs.IScope, uiDashGridLib.uiDashGridMod.uiGridNs.paginationNs.paginationChangedHandler) => scala.Unit
  ): Anon_HandlerPaginationChanged = {
    val __obj = js.Dynamic.literal(paginationChanged = js.Any.fromFunction2(paginationChanged))
  
    __obj.asInstanceOf[Anon_HandlerPaginationChanged]
  }
}

