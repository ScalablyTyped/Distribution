package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MatrixDropdownCell")
@js.native
class MatrixDropdownCell protected () extends js.Object {
  def this(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, data: IMatrixDropdownData) = this()
  var column: MatrixDropdownColumn = js.native
  var data: IMatrixDropdownData = js.native
  val hasCondition: Boolean = js.native
  val question: Question = js.native
  var row: MatrixDropdownRowModelBase = js.native
  var value: js.Any = js.native
  /* protected */ def createQuestion(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, data: IMatrixDropdownData): Question = js.native
  def locStrsChanged(): Unit = js.native
  def runCondition(values: HashTable[_], properties: HashTable[_]): Unit = js.native
}

