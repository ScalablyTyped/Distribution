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
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.resizeColumnsNs.columnSizeChangedHandler
  ): scala.Unit
}

object Anon_ColumnSizeChanged {
  @scala.inline
  def apply(
    columnSizeChanged: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.resizeColumnsNs.columnSizeChangedHandler, 
      scala.Unit
    ]
  ): Anon_ColumnSizeChanged = {
    val __obj = js.Dynamic.literal(columnSizeChanged = columnSizeChanged)
  
    __obj.asInstanceOf[Anon_ColumnSizeChanged]
  }
}

