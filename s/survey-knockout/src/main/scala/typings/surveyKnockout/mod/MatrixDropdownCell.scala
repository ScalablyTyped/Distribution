package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MatrixDropdownCell")
@js.native
open class MatrixDropdownCell protected () extends StObject {
  def this(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, data: IMatrixDropdownData) = this()
  
  var column: MatrixDropdownColumn = js.native
  
  /* protected */ def createQuestion(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, data: IMatrixDropdownData): Question = js.native
  
  var data: IMatrixDropdownData = js.native
  
  def locStrsChanged(): Unit = js.native
  
  def question: Question = js.native
  
  var questionValue: Question = js.native
  
  var row: MatrixDropdownRowModelBase = js.native
  
  def runCondition(values: Any, properties: Any): Unit = js.native
  
  def value: Any = js.native
  def value_=(`val`: Any): Unit = js.native
}
