package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixBaseImplementor")
@js.native
open class QuestionMatrixBaseImplementor protected () extends QuestionImplementor {
  def this(question: Any) = this()
  
  var _tableImplementor: ImplementorBase = js.native
  
  /* protected */ def addRow(): Unit = js.native
  
  /* protected */ def isAddRowBottom(): Boolean = js.native
  
  /* protected */ def isAddRowTop(): Boolean = js.native
  
  var koRecalc: Any = js.native
  
  def matrix: Any = js.native
  
  /* protected */ def removeRow(row: Any): Unit = js.native
}
