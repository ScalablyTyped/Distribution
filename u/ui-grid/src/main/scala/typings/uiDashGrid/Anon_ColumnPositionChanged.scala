package typings.uiDashGrid

import typings.angular.angularMod.IScope
import typings.uiDashGrid.uiDashGridMod.moveColumns.columnPositionChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnPositionChanged extends js.Object {
  /**
    * Raised when a column is moved
    * @param {ng.IScope} scope Grid Scope
    * @param {columnPositionChangedHandler} handler Callback Function
    */
  var columnPositionChanged: js.UndefOr[
    js.Function2[/* scope */ IScope, /* handler */ columnPositionChangedHandler, Unit]
  ] = js.undefined
}

object Anon_ColumnPositionChanged {
  @scala.inline
  def apply(
    columnPositionChanged: (/* scope */ IScope, /* handler */ columnPositionChangedHandler) => Unit = null
  ): Anon_ColumnPositionChanged = {
    val __obj = js.Dynamic.literal()
    if (columnPositionChanged != null) __obj.updateDynamic("columnPositionChanged")(js.Any.fromFunction2(columnPositionChanged))
    __obj.asInstanceOf[Anon_ColumnPositionChanged]
  }
}

