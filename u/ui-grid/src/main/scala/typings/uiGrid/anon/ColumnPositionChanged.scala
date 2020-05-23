package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.moveColumns.columnPositionChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnPositionChanged extends js.Object {
  /**
    * Raised when a column is moved
    * @param {ng.IScope} scope Grid Scope
    * @param {columnPositionChangedHandler} handler Callback Function
    */
  var columnPositionChanged: js.UndefOr[
    js.Function2[/* scope */ IScope, /* handler */ columnPositionChangedHandler, Unit]
  ] = js.undefined
}

object ColumnPositionChanged {
  @scala.inline
  def apply(
    columnPositionChanged: (/* scope */ IScope, /* handler */ columnPositionChangedHandler) => Unit = null
  ): ColumnPositionChanged = {
    val __obj = js.Dynamic.literal()
    if (columnPositionChanged != null) __obj.updateDynamic("columnPositionChanged")(js.Any.fromFunction2(columnPositionChanged))
    __obj.asInstanceOf[ColumnPositionChanged]
  }
}

