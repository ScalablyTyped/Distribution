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
    createQuestion: js.Function2[MatrixDropdownRowModelBase, MatrixDropdownColumn, Question],
    getLocale: js.Function0[java.lang.String],
    getMarkdownHtml: js.Function1[java.lang.String, java.lang.String],
    getProcessedText: js.Function1[java.lang.String, java.lang.String],
    getRowIndex: js.Function1[MatrixDropdownRowModelBase, scala.Double],
    getSurvey: js.Function0[ISurvey],
    onRowChanged: js.Function3[MatrixDropdownRowModelBase, java.lang.String, js.Any, scala.Unit],
    onRowChanging: js.Function3[MatrixDropdownRowModelBase, java.lang.String, js.Any, js.Any],
    validateCell: js.Function3[MatrixDropdownRowModelBase, java.lang.String, js.Any, SurveyError]
  ): IMatrixDropdownData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("createQuestion")(createQuestion)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getMarkdownHtml")(getMarkdownHtml)
    __obj.updateDynamic("getProcessedText")(getProcessedText)
    __obj.updateDynamic("getRowIndex")(getRowIndex)
    __obj.updateDynamic("getSurvey")(getSurvey)
    __obj.updateDynamic("onRowChanged")(onRowChanged)
    __obj.updateDynamic("onRowChanging")(onRowChanging)
    __obj.updateDynamic("validateCell")(validateCell)
    __obj.asInstanceOf[IMatrixDropdownData]
  }
}

