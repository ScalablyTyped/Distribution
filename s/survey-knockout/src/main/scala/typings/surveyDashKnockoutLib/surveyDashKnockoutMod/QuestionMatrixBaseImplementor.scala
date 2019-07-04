package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionMatrixBaseImplementor")
@js.native
class QuestionMatrixBaseImplementor protected () extends QuestionImplementor {
  def this(question: Question) = this()
  var koAddRowClick: js.Any = js.native
  var koCanRemoveRow: js.Any = js.native
  var koCellAfterRender: js.Any = js.native
  var koIsAddRowOnBottom: js.Any = js.native
  var koIsAddRowOnTop: js.Any = js.native
  var koRecalc: js.Any = js.native
  var koRemoveRowClick: js.Any = js.native
  var koTable: js.Any = js.native
  /* protected */ def addRow(): scala.Unit = js.native
  /* protected */ def canRemoveRow(): scala.Boolean = js.native
  /* protected */ def isAddRowBottom(): scala.Boolean = js.native
  /* protected */ def isAddRowTop(): scala.Boolean = js.native
  /* protected */ def removeRow(row: MatrixDropdownRowModelBase): scala.Unit = js.native
}

