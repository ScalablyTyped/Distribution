package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BEGINCELLEDIT extends js.Object {
  var BEGIN_CELL_EDIT: java.lang.String
  var CANCEL_CELL_EDIT: java.lang.String
  var END_CELL_EDIT: java.lang.String
}

object Anon_BEGINCELLEDIT {
  @scala.inline
  def apply(
    BEGIN_CELL_EDIT: java.lang.String,
    CANCEL_CELL_EDIT: java.lang.String,
    END_CELL_EDIT: java.lang.String
  ): Anon_BEGINCELLEDIT = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BEGIN_CELL_EDIT")(BEGIN_CELL_EDIT)
    __obj.updateDynamic("CANCEL_CELL_EDIT")(CANCEL_CELL_EDIT)
    __obj.updateDynamic("END_CELL_EDIT")(END_CELL_EDIT)
    __obj.asInstanceOf[Anon_BEGINCELLEDIT]
  }
}

