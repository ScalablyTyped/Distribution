package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MartrixCells")
@js.native
class MartrixCells protected () extends js.Object {
  def this(cellsOwner: IMatrixCellsOwner) = this()
  
  var cellsOwner: IMatrixCellsOwner = js.native
  
  val columns: js.Array[_] = js.native
  
  /* protected */ def createString(): LocalizableString = js.native
  
  def getCellDisplayLocText(row: js.Any, column: js.Any): LocalizableString = js.native
  
  def getCellDisplayText(row: js.Any, column: js.Any): String = js.native
  
  def getCellLocText(row: js.Any, column: js.Any): LocalizableString = js.native
  
  def getCellText(row: js.Any, column: js.Any): String = js.native
  
  def getDefaultCellLocText(column: js.Any, `val`: String): LocalizableString = js.native
  
  def getDefaultCellText(column: js.Any): String = js.native
  
  def getJson(): js.Any = js.native
  
  val isEmpty: Boolean = js.native
  
  val rows: js.Array[_] = js.native
  
  def setCellText(row: js.Any, column: js.Any, `val`: String): Unit = js.native
  
  def setDefaultCellText(column: js.Any, `val`: String): Unit = js.native
  
  def setJson(value: js.Any): Unit = js.native
}
