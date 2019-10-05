package typings.uiDashGrid

import typings.angular.angularMod.IScope
import typings.uiDashGrid.uiDashGridMod.resizeColumns.columnSizeChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnSizeChanged extends js.Object {
  /**
    * Raised when column is resized
    * @param {ng.IScope} scope Grid Scope
    * @param {columnSizeChangedHandler} handler Callback
    */
  def columnSizeChanged(scope: IScope, handler: columnSizeChangedHandler): Unit
}

object Anon_ColumnSizeChanged {
  @scala.inline
  def apply(columnSizeChanged: (IScope, columnSizeChangedHandler) => Unit): Anon_ColumnSizeChanged = {
    val __obj = js.Dynamic.literal(columnSizeChanged = js.Any.fromFunction2(columnSizeChanged))
  
    __obj.asInstanceOf[Anon_ColumnSizeChanged]
  }
}

