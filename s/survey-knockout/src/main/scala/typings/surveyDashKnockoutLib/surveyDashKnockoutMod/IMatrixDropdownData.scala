package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixDropdownData extends js.Object {
  var columns: js.Array[MatrixDropdownColumn]
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question
  def getLocale(): java.lang.String
  def getMarkdownHtml(text: java.lang.String): java.lang.String
  def getProcessedText(text: java.lang.String): java.lang.String
  def getRowIndex(row: MatrixDropdownRowModelBase): scala.Double
  def getSurvey(): ISurvey
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: java.lang.String, newRowValue: js.Any): scala.Unit
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: java.lang.String, rowValue: js.Any): js.Any
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
    getSurvey: () => ISurvey,
    onRowChanged: (MatrixDropdownRowModelBase, java.lang.String, js.Any) => scala.Unit,
    onRowChanging: (MatrixDropdownRowModelBase, java.lang.String, js.Any) => js.Any,
    validateCell: (MatrixDropdownRowModelBase, java.lang.String, js.Any) => SurveyError
  ): IMatrixDropdownData = {
    val __obj = js.Dynamic.literal(columns = columns, createQuestion = js.Any.fromFunction2(createQuestion), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRowIndex = js.Any.fromFunction1(getRowIndex), getSurvey = js.Any.fromFunction0(getSurvey), onRowChanged = js.Any.fromFunction3(onRowChanged), onRowChanging = js.Any.fromFunction3(onRowChanging), validateCell = js.Any.fromFunction3(validateCell))
  
    __obj.asInstanceOf[IMatrixDropdownData]
  }
}

