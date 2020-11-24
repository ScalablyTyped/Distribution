package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixBaseImplementor")
@js.native
class QuestionMatrixBaseImplementor protected () extends QuestionImplementor {
  def this(question: Question) = this()
  
  /* protected */ def addRow(): Unit = js.native
  
  /* protected */ def canRemoveRows(): Boolean = js.native
  
  /* protected */ def isAddRowBottom(): Boolean = js.native
  
  /* protected */ def isAddRowTop(): Boolean = js.native
  
  var koAddRowClick: js.Any = js.native
  
  var koCellAfterRender: js.Any = js.native
  
  var koCellQuestionAfterRender: js.Any = js.native
  
  var koIsAddRowOnBottom: js.Any = js.native
  
  var koIsAddRowOnTop: js.Any = js.native
  
  var koRecalc: js.Any = js.native
  
  var koRemoveRowClick: js.Any = js.native
  
  var koTable: js.Any = js.native
  
  /* protected */ def removeRow(row: MatrixDropdownRowModelBase): Unit = js.native
}
