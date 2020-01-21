package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MatrixDropdownTotalCell")
@js.native
class MatrixDropdownTotalCell protected () extends MatrixDropdownCell {
  def this(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, data: IMatrixDropdownData) = this()
  def getTotalExpression(): String = js.native
  def updateCellQuestion(): Unit = js.native
}

