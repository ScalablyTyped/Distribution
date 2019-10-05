package typings.uiDashGrid.uiDashGridMod.edit

import typings.uiDashGrid.Anon_BEGINCELLEDIT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridEditConstants extends js.Object {
  var EDITABLE_CELL_DIRECTIVE: String
  var EDITABLE_CELL_TEMPLATE: String
  var events: Anon_BEGINCELLEDIT
}

object IUiGridEditConstants {
  @scala.inline
  def apply(EDITABLE_CELL_DIRECTIVE: String, EDITABLE_CELL_TEMPLATE: String, events: Anon_BEGINCELLEDIT): IUiGridEditConstants = {
    val __obj = js.Dynamic.literal(EDITABLE_CELL_DIRECTIVE = EDITABLE_CELL_DIRECTIVE, EDITABLE_CELL_TEMPLATE = EDITABLE_CELL_TEMPLATE, events = events)
  
    __obj.asInstanceOf[IUiGridEditConstants]
  }
}

