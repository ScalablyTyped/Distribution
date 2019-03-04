package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.editNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridEditConstants extends js.Object {
  var EDITABLE_CELL_DIRECTIVE: java.lang.String
  var EDITABLE_CELL_TEMPLATE: java.lang.String
  var events: uiDashGridLib.Anon_BEGINCELLEDIT
}

object IUiGridEditConstants {
  @scala.inline
  def apply(
    EDITABLE_CELL_DIRECTIVE: java.lang.String,
    EDITABLE_CELL_TEMPLATE: java.lang.String,
    events: uiDashGridLib.Anon_BEGINCELLEDIT
  ): IUiGridEditConstants = {
    val __obj = js.Dynamic.literal(EDITABLE_CELL_DIRECTIVE = EDITABLE_CELL_DIRECTIVE, EDITABLE_CELL_TEMPLATE = EDITABLE_CELL_TEMPLATE, events = events)
  
    __obj.asInstanceOf[IUiGridEditConstants]
  }
}

