package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MatrixDropdownRowModelBase")
@js.native
class MatrixDropdownRowModelBase protected ()
  extends ISurveyData
     with ISurveyImpl
     with ILocalizableOwner
     with ITextProcessor {
  def this(data: IMatrixDropdownData, value: js.Any) = this()
  
  /* protected */ def buildCells(value: js.Any): Unit = js.native
  
  var cells: js.Array[MatrixDropdownCell] = js.native
  
  def clearIncorrectValues(`val`: js.Any): Unit = js.native
  
  /* protected */ def createCell(column: MatrixDropdownColumn): MatrixDropdownCell = js.native
  
  var data: IMatrixDropdownData = js.native
  
  val detailPanel: PanelModel = js.native
  
  val detailPanelId: String = js.native
  
  def dispose(): Unit = js.native
  
  val editingObj: Base = js.native
  
  def getDataValueCore(valuesHash: js.Any, key: String): js.Any = js.native
  
  def getQuestionByColumn(column: MatrixDropdownColumn): Question = js.native
  
  def getQuestionByColumnName(columnName: String): Question = js.native
  
  def getQuestionByName(name: String): Question = js.native
  
  /* protected */ def getSharedQuestionByName(columnName: String): Question = js.native
  
  def hasErrors(fireCallback: Boolean, rec: js.Any, raiseOnCompletedAsyncValidators: js.Function0[Unit]): Boolean = js.native
  
  val hasPanel: Boolean = js.native
  
  def hideDetailPanel(): Unit = js.native
  
  val id: String = js.native
  
  val isDetailPanelShowing: Boolean = js.native
  
  val isEmpty: Boolean = js.native
  
  var isSettingValue: Boolean = js.native
  
  def locStrsChanged(): Unit = js.native
  
  val locText: LocalizableString = js.native
  
  def onAnyValueChanged(name: String): Unit = js.native
  
  def onQuestionReadOnlyChanged(parentIsReadOnly: Boolean): Unit = js.native
  
  def processTextEx(text: String, returnDisplayValue: Boolean): js.Any = js.native
  
  val questions: js.Array[Question] = js.native
  
  val rowIndex: Double = js.native
  
  val rowName: js.Any = js.native
  
  def runCondition(values: HashTable[_], properties: HashTable[_]): Unit = js.native
  
  def setValue(name: String, newColumnValue: js.Any): Unit = js.native
  
  def showDetailPanel(): Unit = js.native
  
  var showHideDetailPanelClick: js.Any = js.native
  
  /* protected */ def updateCellOnColumnChanged(cell: MatrixDropdownCell, name: String, newValue: js.Any): Unit = js.native
  
  def updateCellQuestionOnColumnChanged(column: MatrixDropdownColumn, name: String, newValue: js.Any): Unit = js.native
  
  var value: js.Any = js.native
}
/* static members */
@JSImport("survey-knockout", "MatrixDropdownRowModelBase")
@js.native
object MatrixDropdownRowModelBase extends js.Object {
  
  var IndexVariableName: String = js.native
  
  var OwnerVariableName: String = js.native
  
  var RowValueVariableName: String = js.native
  
  var RowVariableName: String = js.native
}
