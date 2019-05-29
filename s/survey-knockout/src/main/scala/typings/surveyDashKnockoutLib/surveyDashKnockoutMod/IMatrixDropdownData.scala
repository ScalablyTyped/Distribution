package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixDropdownData extends js.Object {
  var columns: js.Array[MatrixDropdownColumn]
  var value: js.Any
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question
  def getLocale(): java.lang.String
  def getMarkdownHtml(text: java.lang.String): java.lang.String
  def getProcessedText(text: java.lang.String): java.lang.String
  def getRowIndex(row: MatrixDropdownRowModelBase): scala.Double
  def getSharedQuestionByName(columnName: java.lang.String, row: MatrixDropdownRowModelBase): Question
  def getSurvey(): ISurvey
  def onRowChanged(
    row: MatrixDropdownRowModelBase,
    columnName: java.lang.String,
    newRowValue: js.Any,
    isDeletingValue: scala.Boolean
  ): scala.Unit
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: java.lang.String, rowValue: js.Any): js.Any
  def onTotalValueChanged(): js.Any
  def validateCell(row: MatrixDropdownRowModelBase, columnName: java.lang.String, rowValue: js.Any): SurveyError
}

object IMatrixDropdownData {
  @scala.inline
  def apply(
    columns: js.Array[MatrixDropdownColumn],
    createQuestion: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => Question,
    getLocale: () => java.lang.String,
    getMarkdownHtml: java.lang.String => java.lang.String,
    getProcessedText: java.lang.String => java.lang.String,
    getRowIndex: MatrixDropdownRowModelBase => scala.Double,
    getSharedQuestionByName: (java.lang.String, MatrixDropdownRowModelBase) => Question,
    getSurvey: () => ISurvey,
    onRowChanged: (MatrixDropdownRowModelBase, java.lang.String, js.Any, scala.Boolean) => scala.Unit,
    onRowChanging: (MatrixDropdownRowModelBase, java.lang.String, js.Any) => js.Any,
    onTotalValueChanged: () => js.Any,
    validateCell: (MatrixDropdownRowModelBase, java.lang.String, js.Any) => SurveyError,
    value: js.Any
  ): IMatrixDropdownData = {
    val __obj = js.Dynamic.literal(columns = columns, createQuestion = js.Any.fromFunction2(createQuestion), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRowIndex = js.Any.fromFunction1(getRowIndex), getSharedQuestionByName = js.Any.fromFunction2(getSharedQuestionByName), getSurvey = js.Any.fromFunction0(getSurvey), onRowChanged = js.Any.fromFunction4(onRowChanged), onRowChanging = js.Any.fromFunction3(onRowChanging), onTotalValueChanged = js.Any.fromFunction0(onTotalValueChanged), validateCell = js.Any.fromFunction3(validateCell), value = value)
  
    __obj.asInstanceOf[IMatrixDropdownData]
  }
}

