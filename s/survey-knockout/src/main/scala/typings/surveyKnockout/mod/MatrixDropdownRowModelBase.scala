package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "MatrixDropdownRowModelBase")
@js.native
open class MatrixDropdownRowModelBase protected ()
  extends StObject
     with ISurveyData
     with ISurveyImpl
     with ILocalizableOwner {
  def this(data: IMatrixDropdownData, value: Any) = this()
  
  /* protected */ def buildCells(value: Any): Unit = js.native
  
  var cells: Any = js.native
  
  def clearIncorrectValues(`val`: Any): Unit = js.native
  
  def clearValue(): Unit = js.native
  
  /* protected */ def createCell(column: MatrixDropdownColumn): MatrixDropdownCell = js.native
  
  /* protected */ var data: IMatrixDropdownData = js.native
  
  def detailPanel: PanelModel = js.native
  
  def detailPanelId: String = js.native
  
  var detailPanelValue: PanelModel = js.native
  
  def dispose(): Unit = js.native
  
  def editingObj: Base = js.native
  
  var editingObjValue: Base = js.native
  
  def getCellByColumn(column: MatrixDropdownColumn): MatrixDropdownCell = js.native
  
  def getDataValueCore(valuesHash: Any, key: String): Any = js.native
  
  /* CompleteClass */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  def getQuestionByColumn(column: MatrixDropdownColumn): Question = js.native
  
  def getQuestionByColumnName(columnName: String): Question = js.native
  
  def getQuestionByName(name: String): Question = js.native
  
  def getQuestionsByName(name: String): js.Array[Question] = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  /* protected */ def getSharedQuestionByName(columnName: String): Question = js.native
  
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  
  /* CompleteClass */
  override def getSurveyData(): ISurveyData = js.native
  
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  
  def hasErrors(fireCallback: Boolean, rec: Any, raiseOnCompletedAsyncValidators: Any): Boolean = js.native
  
  def hasPanel: Boolean = js.native
  
  def hideDetailPanel(): Unit = js.native
  def hideDetailPanel(destroyPanel: Boolean): Unit = js.native
  
  def id: String = js.native
  
  var idValue: String = js.native
  
  var isCreatingDetailPanel: Boolean = js.native
  
  def isDetailPanelShowing: Boolean = js.native
  
  def isEmpty: Boolean = js.native
  
  /* protected */ var isSettingValue: Boolean = js.native
  
  /* protected */ def isTwoValueEquals(val1: Any, val2: Any): Boolean = js.native
  
  def locStrsChanged(): Unit = js.native
  
  def locText: LocalizableString = js.native
  
  def onAnyValueChanged(name: String): Unit = js.native
  
  var onDetailPanelShowingChanged: Any = js.native
  
  def onEditingObjPropertyChanged(sender: Base, options: Any): Unit = js.native
  
  def onQuestionReadOnlyChanged(parentIsReadOnly: Boolean): Unit = js.native
  
  def questions: Any = js.native
  
  def rowIndex: Double = js.native
  
  def rowName: Any = js.native
  
  def runCondition(values: Any, properties: Any): Unit = js.native
  
  def setValue(name: String, newColumnValue: Any): Unit = js.native
  
  def showDetailPanel(): Unit = js.native
  
  var showHideDetailPanelClick: Any = js.native
  
  def text: Any = js.native
  
  var textPreProcessor: MatrixDropdownRowTextProcessor = js.native
  
  /* protected */ def updateCellOnColumnChanged(cell: MatrixDropdownCell, name: String, newValue: Any): Unit = js.native
  
  def updateCellOnColumnItemValueChanged(
    cell: MatrixDropdownCell,
    propertyName: String,
    obj: ItemValue,
    name: String,
    newValue: Any,
    oldValue: Any
  ): Unit = js.native
  
  def updateCellQuestionOnColumnChanged(column: MatrixDropdownColumn, name: String, newValue: Any): Unit = js.native
  
  def updateCellQuestionOnColumnItemValueChanged(
    column: MatrixDropdownColumn,
    propertyName: String,
    obj: ItemValue,
    name: String,
    newValue: Any,
    oldValue: Any
  ): Unit = js.native
  
  def value: Any = js.native
  def value_=(`val`: Any): Unit = js.native
}
/* static members */
object MatrixDropdownRowModelBase {
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase.IndexVariableName")
  @js.native
  def IndexVariableName: String = js.native
  inline def IndexVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase.OwnerVariableName")
  @js.native
  def OwnerVariableName: String = js.native
  inline def OwnerVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OwnerVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase.RowValueVariableName")
  @js.native
  def RowValueVariableName: String = js.native
  inline def RowValueVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RowValueVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase.RowVariableName")
  @js.native
  def RowVariableName: String = js.native
  inline def RowVariableName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RowVariableName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "MatrixDropdownRowModelBase.idCounter")
  @js.native
  def idCounter: Double = js.native
  inline def idCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idCounter")(x.asInstanceOf[js.Any])
}
