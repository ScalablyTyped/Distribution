package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixDropdownData extends js.Object {
  var columns: js.Array[MatrixDropdownColumn]
  var value: js.Any
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question
  def getLocale(): String
  def getMarkdownHtml(text: String): String
  def getProcessedText(text: String): String
  def getRowIndex(row: MatrixDropdownRowModelBase): Double
  def getSharedQuestionByName(columnName: String, row: MatrixDropdownRowModelBase): Question
  def getSurvey(): ISurvey
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: String, newRowValue: js.Any, isDeletingValue: Boolean): Unit
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): js.Any
  def onTotalValueChanged(): js.Any
  def validateCell(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): SurveyError
}

object IMatrixDropdownData {
  @scala.inline
  def apply(
    columns: js.Array[MatrixDropdownColumn],
    createQuestion: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => Question,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String,
    getRowIndex: MatrixDropdownRowModelBase => Double,
    getSharedQuestionByName: (String, MatrixDropdownRowModelBase) => Question,
    getSurvey: () => ISurvey,
    onRowChanged: (MatrixDropdownRowModelBase, String, js.Any, Boolean) => Unit,
    onRowChanging: (MatrixDropdownRowModelBase, String, js.Any) => js.Any,
    onTotalValueChanged: () => js.Any,
    validateCell: (MatrixDropdownRowModelBase, String, js.Any) => SurveyError,
    value: js.Any
  ): IMatrixDropdownData = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], createQuestion = js.Any.fromFunction2(createQuestion), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRowIndex = js.Any.fromFunction1(getRowIndex), getSharedQuestionByName = js.Any.fromFunction2(getSharedQuestionByName), getSurvey = js.Any.fromFunction0(getSurvey), onRowChanged = js.Any.fromFunction4(onRowChanged), onRowChanging = js.Any.fromFunction3(onRowChanging), onTotalValueChanged = js.Any.fromFunction0(onTotalValueChanged), validateCell = js.Any.fromFunction3(validateCell), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMatrixDropdownData]
  }
}

