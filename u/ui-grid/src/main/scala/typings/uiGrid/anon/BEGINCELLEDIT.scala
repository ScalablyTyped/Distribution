package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BEGINCELLEDIT extends js.Object {
  var BEGIN_CELL_EDIT: String
  var CANCEL_CELL_EDIT: String
  var END_CELL_EDIT: String
}

object BEGINCELLEDIT {
  @scala.inline
  def apply(BEGIN_CELL_EDIT: String, CANCEL_CELL_EDIT: String, END_CELL_EDIT: String): BEGINCELLEDIT = {
    val __obj = js.Dynamic.literal(BEGIN_CELL_EDIT = BEGIN_CELL_EDIT.asInstanceOf[js.Any], CANCEL_CELL_EDIT = CANCEL_CELL_EDIT.asInstanceOf[js.Any], END_CELL_EDIT = END_CELL_EDIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BEGINCELLEDIT]
  }
}

