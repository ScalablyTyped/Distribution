package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MartrixCells")
@js.native
class MartrixCells protected () extends js.Object {
  def this(cellsOwner: IMatrixCellsOwner) = this()
  var cellsOwner: IMatrixCellsOwner = js.native
  val columns: js.Array[_] = js.native
  val isEmpty: scala.Boolean = js.native
  val rows: js.Array[_] = js.native
  /* protected */ def createString(): LocalizableString = js.native
  def getCellDisplayLocText(row: js.Any, column: js.Any): LocalizableString = js.native
  def getCellDisplayText(row: js.Any, column: js.Any): java.lang.String = js.native
  def getCellLocText(row: js.Any, column: js.Any): LocalizableString = js.native
  def getCellText(row: js.Any, column: js.Any): java.lang.String = js.native
  def getDefaultCellLocText(column: js.Any, `val`: java.lang.String): LocalizableString = js.native
  def getDefaultCellText(column: js.Any): java.lang.String = js.native
  def getJson(): js.Any = js.native
  def setCellText(row: js.Any, column: js.Any, `val`: java.lang.String): scala.Unit = js.native
  def setDefaultCellText(column: js.Any, `val`: java.lang.String): scala.Unit = js.native
  def setJson(value: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "MartrixCells")
@js.native
object MartrixCells extends js.Object {
  var DefaultRowName: java.lang.String = js.native
}

