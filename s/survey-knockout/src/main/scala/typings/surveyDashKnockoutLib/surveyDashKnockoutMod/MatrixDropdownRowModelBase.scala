package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

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
  val id: java.lang.String = js.native
  val isEmpty: scala.Boolean = js.native
  val locText: LocalizableString = js.native
  val rowIndex: scala.Double = js.native
  val rowName: js.Any = js.native
  var value: js.Any = js.native
  /* protected */ def buildCells(value: js.Any): scala.Unit = js.native
  def clearIncorrectValues(`val`: js.Any): scala.Unit = js.native
  /* protected */ def createCell(column: MatrixDropdownColumn): MatrixDropdownCell = js.native
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  /* CompleteClass */
  override def getAllValues(): js.Any = js.native
  /* CompleteClass */
  override def getComment(name: java.lang.String): java.lang.String = js.native
  def getDataValueCore(valuesHash: js.Any, key: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def getFilteredProperties(): js.Any = js.native
  /* CompleteClass */
  override def getFilteredValues(): js.Any = js.native
  /* CompleteClass */
  override def getLocale(): java.lang.String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getProcessedText(text: java.lang.String): java.lang.String = js.native
  def getQuestionByColumn(column: MatrixDropdownColumn): Question = js.native
  def getQuestionByColumnName(columnName: java.lang.String): Question = js.native
  /* protected */ def getSharedQuestionByName(columnName: java.lang.String): Question = js.native
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  /* CompleteClass */
  override def getValue(name: java.lang.String): js.Any = js.native
  def locStrsChanged(): scala.Unit = js.native
  def onAnyValueChanged(name: java.lang.String): scala.Unit = js.native
  def onQuestionReadOnlyChanged(parentIsReadOnly: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def processText(text: java.lang.String, returnDisplayValue: scala.Boolean): java.lang.String = js.native
  def processTextEx(text: java.lang.String, returnDisplayValue: scala.Boolean): js.Any = js.native
  /* CompleteClass */
  override def processTextEx(text: java.lang.String, returnDisplayValue: scala.Boolean, doEncoding: scala.Boolean): js.Any = js.native
  def runCondition(values: HashTable[_], properties: HashTable[_]): scala.Unit = js.native
  /* CompleteClass */
  override def setComment(name: java.lang.String, newValue: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def setValue(name: java.lang.String, newValue: js.Any): js.Any = js.native
  /* protected */ def updateCellOnColumnChanged(cell: MatrixDropdownCell): scala.Unit = js.native
  def updateCellQuestionOnColumnChanged(column: MatrixDropdownColumn): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "MatrixDropdownRowModelBase")
@js.native
object MatrixDropdownRowModelBase extends js.Object {
  var IndexVariableName: java.lang.String = js.native
  var OwnerVariableName: java.lang.String = js.native
  var RowVariableName: java.lang.String = js.native
}

