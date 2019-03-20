package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- surveyDashKnockoutLib.surveyDashKnockoutMod.IMatrixDropdownData because var conflicts: columns. Inlined onRowChanged, onRowChanging, getRowIndex, validateCell, createQuestion, getLocale, getMarkdownHtml, getProcessedText, getSurvey */ @JSImport("survey-knockout", "QuestionMatrixDropdownModelBase")
@js.native
class QuestionMatrixDropdownModelBase protected () extends QuestionMatrixBaseModel[MatrixDropdownRowModelBase, MatrixDropdownColumn] {
  def this(name: java.lang.String) = this()
  /**
    * Use this property to change the default cell type.
    */
  var cellType: java.lang.String = js.native
  /**
    * The default choices for dropdown, checkbox and radiogroup cell types.
    */
  var choices: js.Array[_] = js.native
  /**
    * The default column count for radiogroup and checkbox  cell types.
    */
  var columnColCount: scala.Double = js.native
  /**
    * Set columnLayout to 'vertical' to place columns vertically and rows horizontally. It makes sense when we have many columns and few rows.
    * @see columns
    * @see rowCount
    */
  var columnLayout: java.lang.String = js.native
  /**
    * Use this property to set the mimimum column width.
    */
  var columnMinWidth: java.lang.String = js.native
  var columnsLocation: java.lang.String = js.native
  /**
    * Set this property to true to show the horizontal scroll.
    */
  var horizontalScroll: scala.Boolean = js.native
  /**
    * Returns true if columns are located horizontally
    * @see columnLayout
    */
  val isColumnLayoutHorizontal: scala.Boolean = js.native
  var isRowChanging: scala.Boolean = js.native
  val isRowsDynamic: scala.Boolean = js.native
  val locOptionsCaption: LocalizableString = js.native
  /**
    * The default options caption for dropdown cell type.
    */
  var optionsCaption: java.lang.String = js.native
  def addColumn(name: java.lang.String): MatrixDropdownColumn = js.native
  def addColumn(name: java.lang.String, title: java.lang.String): MatrixDropdownColumn = js.native
  def columnLayoutChangedCallback(): scala.Unit = js.native
  def columnsChangedCallback(): scala.Unit = js.native
  /* protected */ def createNewValue(): js.Any = js.native
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question = js.native
  /* protected */ def createQuestionCore(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question = js.native
  /* protected */ def deleteRowValue(newValue: js.Any, row: MatrixDropdownRowModelBase): js.Any = js.native
  /* protected */ def generateRows(): js.Array[MatrixDropdownRowModelBase] = js.native
  def getCellType(): java.lang.String = js.native
  /**
    * Returns the column by it's name. Retuns null if a column with this name doesn't exist.
    * @param column
    */
  def getColumnByName(columnName: java.lang.String): MatrixDropdownColumn = js.native
  def getColumnName(columnName: java.lang.String): MatrixDropdownColumn = js.native
  /**
    * Returns the column width.
    * @param column
    */
  def getColumnWidth(column: MatrixDropdownColumn): java.lang.String = js.native
  /* protected */ def getFirstCellQuestion(onError: scala.Boolean): Question = js.native
  def getRequiredText(): java.lang.String = js.native
  /* protected */ def getRowDisplayValue(row: MatrixDropdownRowModelBase, rowValue: js.Any): js.Any = js.native
  def getRowIndex(row: MatrixDropdownRowModelBase): scala.Double = js.native
  /**
    * Returns the row value. If the row value is empty, the object is empty: {}.
    * @param rowIndex row index from 0 to visible row count - 1.
    */
  def getRowValue(rowIndex: scala.Double): js.Any = js.native
  /* protected */ def getRowValueCore(row: MatrixDropdownRowModelBase, questionValue: js.Any): js.Any = js.native
  /* protected */ def getRowValueCore(row: MatrixDropdownRowModelBase, questionValue: js.Any, create: scala.Boolean): js.Any = js.native
  def getSurvey(): ISurvey = js.native
  /* protected */ def isObject(value: js.Any): scala.Boolean = js.native
  /* protected */ def onBeforeValueChanged(`val`: js.Any): scala.Unit = js.native
  /* protected */ def onCellValueChanged(row: MatrixDropdownRowModelBase, columnName: java.lang.String, rowValue: js.Any): scala.Unit = js.native
  def onColumnPropertiesChanged(column: MatrixDropdownColumn): scala.Unit = js.native
  /* protected */ def onMatrixRowCreated(row: MatrixDropdownRowModelBase): scala.Unit = js.native
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: java.lang.String, newRowValue: js.Any): scala.Unit = js.native
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: java.lang.String, rowValue: js.Any): js.Any = js.native
  /* protected */ def runCellsCondition(values: HashTable[_], properties: HashTable[_]): scala.Unit = js.native
  /**
    * Set the row value.
    * @param rowIndex row index from 0 to visible row count - 1.
    * @param rowValue an object {"column name": columnValue,... }
    */
  def setRowValue(rowIndex: scala.Double, rowValue: js.Any): js.Any = js.native
  def updateCellsCallback(): scala.Unit = js.native
  def validateCell(row: MatrixDropdownRowModelBase, columnName: java.lang.String, rowValue: js.Any): SurveyError = js.native
}

/* static members */
@JSImport("survey-knockout", "QuestionMatrixDropdownModelBase")
@js.native
object QuestionMatrixDropdownModelBase extends js.Object {
  def addDefaultColumns(matrix: surveyDashKnockoutLib.surveyDashKnockoutMod.QuestionMatrixDropdownModelBase): scala.Unit = js.native
}

