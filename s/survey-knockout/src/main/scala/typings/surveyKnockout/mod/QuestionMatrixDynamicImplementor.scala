package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixDynamicImplementor")
@js.native
class QuestionMatrixDynamicImplementor protected () extends QuestionMatrixBaseImplementor {
  def this(question: Question) = this()
  
  /* protected */ def removeRow(row: MatrixDynamicRowModel): Unit = js.native
}
