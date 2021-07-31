package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MatrixDropdownRowModelBase")
@js.native
class MatrixDropdownRowModelBase protected ()
  extends StObject
     with ISurveyData
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
  
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  
  def getDataValueCore(valuesHash: js.Any, key: String): js.Any = js.native
  
  /* CompleteClass */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String): String = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  def getQuestionByColumn(column: MatrixDropdownColumn): Question = js.native
  
  def getQuestionByColumnName(columnName: String): Question = js.native
  
  def getQuestionByName(name: String): Question = js.native
  
  /* protected */ def getSharedQuestionByName(columnName: String): Question = js.native
  
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  
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
  
  /* CompleteClass */
  override def processText(text: String, returnDisplayValue: Boolean): String = js.native
  
  def processTextEx(text: String, returnDisplayValue: Boolean): js.Any = js.native
  /* CompleteClass */
  override def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): js.Any = js.native
  
  val questions: js.Array[Question] = js.native
  
  val rowIndex: Double = js.native
  
  val rowName: js.Any = js.native
  
  def runCondition(values: HashTable[js.Any], properties: HashTable[js.Any]): Unit = js.native
  
  def setValue(name: String, newColumnValue: js.Any): Unit = js.native
  
  def showDetailPanel(): Unit = js.native
  
  var showHideDetailPanelClick: js.Any = js.native
  
  /* protected */ def updateCellOnColumnChanged(cell: MatrixDropdownCell, name: String, newValue: js.Any): Unit = js.native
  
  def updateCellQuestionOnColumnChanged(column: MatrixDropdownColumn, name: String, newValue: js.Any): Unit = js.native
  
  var value: js.Any = js.native
}
/* static members */
object MatrixDropdownRowModelBase {
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase.IndexVariableName")
  @js.native
  def IndexVariableName: String = js.native
  @scala.inline
  def IndexVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase.OwnerVariableName")
  @js.native
  def OwnerVariableName: String = js.native
  @scala.inline
  def OwnerVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OwnerVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase.RowValueVariableName")
  @js.native
  def RowValueVariableName: String = js.native
  @scala.inline
  def RowValueVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RowValueVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase.RowVariableName")
  @js.native
  def RowVariableName: String = js.native
  @scala.inline
  def RowVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RowVariableName")(x.asInstanceOf[js.Any])
}
