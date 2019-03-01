package typings
package uiDashGridLib

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
    js.Function2[
      /* scope */ angularLib.angularMod.angularNs.IScope, 
      /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.moveColumnsNs.columnPositionChangedHandler, 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_ColumnPositionChanged {
  @scala.inline
  def apply(
    columnPositionChanged: js.Function2[
      /* scope */ angularLib.angularMod.angularNs.IScope, 
      /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.moveColumnsNs.columnPositionChangedHandler, 
      scala.Unit
    ] = null
  ): Anon_ColumnPositionChanged = {
    val __obj = js.Dynamic.literal()
    if (columnPositionChanged != null) __obj.updateDynamic("columnPositionChanged")(columnPositionChanged)
    __obj.asInstanceOf[Anon_ColumnPositionChanged]
  }
}

