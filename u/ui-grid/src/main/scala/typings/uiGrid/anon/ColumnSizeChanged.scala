package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.resizeColumns.columnSizeChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSizeChanged extends js.Object {
  /**
    * Raised when column is resized
    * @param {ng.IScope} scope Grid Scope
    * @param {columnSizeChangedHandler} handler Callback
    */
  def columnSizeChanged(scope: IScope, handler: columnSizeChangedHandler): Unit
}

object ColumnSizeChanged {
  @scala.inline
  def apply(columnSizeChanged: (IScope, columnSizeChangedHandler) => Unit): ColumnSizeChanged = {
    val __obj = js.Dynamic.literal(columnSizeChanged = js.Any.fromFunction2(columnSizeChanged))
    __obj.asInstanceOf[ColumnSizeChanged]
  }
}

