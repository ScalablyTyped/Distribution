package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatrixDropdownData extends js.Object {
  var columns: js.Array[MatrixDropdownColumn] = js.native
  var value: js.Any = js.native
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question = js.native
  def getLocale(): String = js.native
  def getMarkdownHtml(text: String): String = js.native
  def getProcessedText(text: String): String = js.native
  def getRowIndex(row: MatrixDropdownRowModelBase): Double = js.native
  def getSharedQuestionByName(columnName: String, row: MatrixDropdownRowModelBase): Question = js.native
  def getSurvey(): ISurvey = js.native
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: String, newRowValue: js.Any, isDeletingValue: Boolean): Unit = js.native
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): js.Any = js.native
  def onTotalValueChanged(): js.Any = js.native
  def validateCell(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): SurveyError = js.native
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
  @scala.inline
  implicit class IMatrixDropdownDataOps[Self <: IMatrixDropdownData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnsVarargs(value: MatrixDropdownColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[MatrixDropdownColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateQuestion(value: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => Question): Self = this.set("createQuestion", js.Any.fromFunction2(value))
    @scala.inline
    def setGetLocale(value: () => String): Self = this.set("getLocale", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMarkdownHtml(value: String => String): Self = this.set("getMarkdownHtml", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProcessedText(value: String => String): Self = this.set("getProcessedText", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRowIndex(value: MatrixDropdownRowModelBase => Double): Self = this.set("getRowIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSharedQuestionByName(value: (String, MatrixDropdownRowModelBase) => Question): Self = this.set("getSharedQuestionByName", js.Any.fromFunction2(value))
    @scala.inline
    def setGetSurvey(value: () => ISurvey): Self = this.set("getSurvey", js.Any.fromFunction0(value))
    @scala.inline
    def setOnRowChanged(value: (MatrixDropdownRowModelBase, String, js.Any, Boolean) => Unit): Self = this.set("onRowChanged", js.Any.fromFunction4(value))
    @scala.inline
    def setOnRowChanging(value: (MatrixDropdownRowModelBase, String, js.Any) => js.Any): Self = this.set("onRowChanging", js.Any.fromFunction3(value))
    @scala.inline
    def setOnTotalValueChanged(value: () => js.Any): Self = this.set("onTotalValueChanged", js.Any.fromFunction0(value))
    @scala.inline
    def setValidateCell(value: (MatrixDropdownRowModelBase, String, js.Any) => SurveyError): Self = this.set("validateCell", js.Any.fromFunction3(value))
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

