package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MatrixCells")
@js.native
open class MatrixCells protected () extends StObject {
  def this(cellsOwner: IMatrixCellsOwner) = this()
  
  var cellsOwner: IMatrixCellsOwner = js.native
  
  def columns: Any = js.native
  
  /* protected */ def createString(): LocalizableString = js.native
  
  def getCellDisplayLocText(row: Any, column: Any): LocalizableString = js.native
  
  def getCellDisplayText(row: Any, column: Any): String = js.native
  
  def getCellLocText(row: Any, column: Any): LocalizableString = js.native
  
  def getCellText(row: Any, column: Any): String = js.native
  
  def getDefaultCellLocText(column: Any, `val`: String): LocalizableString = js.native
  
  def getDefaultCellText(column: Any): String = js.native
  
  def getJson(): Any = js.native
  
  def isEmpty: Boolean = js.native
  
  var onValuesChanged: Any = js.native
  
  def rows: Any = js.native
  
  def setCellText(row: Any, column: Any, `val`: String): Unit = js.native
  
  def setDefaultCellText(column: Any, `val`: String): Unit = js.native
  
  def setJson(value: Any): Unit = js.native
  
  var values: Any = js.native
}
