package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnSizeChanged extends js.Object {
  /**
    * Raised when column is resized
    * @param {ng.IScope} scope Grid Scope
    * @param {columnSizeChangedHandler} handler Callback
    */
  def columnSizeChanged(
    scope: angularLib.angularMod.IScope,
    handler: uiDashGridLib.uiDashGridMod.resizeColumnsNs.columnSizeChangedHandler
  ): scala.Unit
}

object Anon_ColumnSizeChanged {
  @scala.inline
  def apply(
    columnSizeChanged: (angularLib.angularMod.IScope, uiDashGridLib.uiDashGridMod.resizeColumnsNs.columnSizeChangedHandler) => scala.Unit
  ): Anon_ColumnSizeChanged = {
    val __obj = js.Dynamic.literal(columnSizeChanged = js.Any.fromFunction2(columnSizeChanged))
  
    __obj.asInstanceOf[Anon_ColumnSizeChanged]
  }
}

