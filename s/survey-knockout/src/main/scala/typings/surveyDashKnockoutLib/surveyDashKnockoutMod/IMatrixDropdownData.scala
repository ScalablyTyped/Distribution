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
  def validateCell(row: MatrixDropdownRowModelBase, columnName: java.lang.String, rowValue: js.Any): SurveyError
}

