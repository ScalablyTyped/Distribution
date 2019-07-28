package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MatrixDropdownRowModelBase")
@js.native
class MatrixDropdownRowModelBase protected ()
  extends ISurveyData
     with ISurveyImpl
     with ILocalizableOwner
     with ITextProcessor {
  def this(data: IMatrixDropdownData, value: js.Any) = this()
  var cells: js.Array[MatrixDropdownCell] = js.native
  var data: IMatrixDropdownData = js.native
  val id: String = js.native
  val isEmpty: Boolean = js.native
  val locText: LocalizableString = js.native
  val rowIndex: Double = js.native
  val rowName: js.Any = js.native
  var value: js.Any = js.native
  /* protected */ def buildCells(value: js.Any): Unit = js.native
  def clearIncorrectValues(`val`: js.Any): Unit = js.native
  /* protected */ def createCell(column: MatrixDropdownColumn): MatrixDropdownCell = js.native
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  /* CompleteClass */
  override def getAllValues(): js.Any = js.native
  /* CompleteClass */
  override def getComment(name: String): String = js.native
  def getDataValueCore(valuesHash: js.Any, key: String): js.Any = js.native
  /* CompleteClass */
  override def getFilteredProperties(): js.Any = js.native
  /* CompleteClass */
  override def getFilteredValues(): js.Any = js.native
  /* CompleteClass */
  override def getLocale(): String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: String): String = js.native
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  def getQuestionByColumn(column: MatrixDropdownColumn): Question = js.native
  def getQuestionByColumnName(columnName: String): Question = js.native
  /* protected */ def getSharedQuestionByName(columnName: String): Question = js.native
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  /* CompleteClass */
  override def getValue(name: String): js.Any = js.native
  def locStrsChanged(): Unit = js.native
  def onAnyValueChanged(name: String): Unit = js.native
  def onQuestionReadOnlyChanged(parentIsReadOnly: Boolean): Unit = js.native
  /* CompleteClass */
  override def processText(text: String, returnDisplayValue: Boolean): String = js.native
  def processTextEx(text: String, returnDisplayValue: Boolean): js.Any = js.native
  /* CompleteClass */
  override def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): js.Any = js.native
  def runCondition(values: HashTable[_], properties: HashTable[_]): Unit = js.native
  /* CompleteClass */
  override def setComment(name: String, newValue: String): js.Any = js.native
  def setValue(name: String, newColumnValue: js.Any): Unit = js.native
  /* CompleteClass */
  override def setValue(name: String, newValue: js.Any, locNotification: Boolean): js.Any = js.native
  /* protected */ def updateCellOnColumnChanged(cell: MatrixDropdownCell): Unit = js.native
  def updateCellQuestionOnColumnChanged(column: MatrixDropdownColumn): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "MatrixDropdownRowModelBase")
@js.native
object MatrixDropdownRowModelBase extends js.Object {
  var IndexVariableName: String = js.native
  var OwnerVariableName: String = js.native
  var RowVariableName: String = js.native
}

