package typings.surveyKnockout.mod

import typings.surveyKnockout.anon.Calculations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IMatrixDropdownData because var conflicts: columns, value. Inlined onRowChanged, onRowChanging, getRowIndex, getRowValue, hasDetailPanel, getIsDetailPanelShowing, setIsDetailPanelShowing, createRowDetailPanel, validateCell, createQuestion, getSharedQuestionByName, onTotalValueChanged, getSurvey */ @JSImport("survey-knockout", "QuestionMatrixDropdownModelBase")
@js.native
class QuestionMatrixDropdownModelBase protected () extends QuestionMatrixBaseModel[MatrixDropdownRowModelBase, MatrixDropdownColumn] {
  def this(name: String) = this()
  
  def addColumn(name: String): MatrixDropdownColumn = js.native
  def addColumn(name: String, title: String): MatrixDropdownColumn = js.native
  
  def canRemoveRow(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  val canRemoveRows: Boolean = js.native
  
  /**
    * Use this property to change the default cell type.
    */
  var cellType: String = js.native
  
  /**
    * The default choices for dropdown, checkbox and radiogroup cell types.
    */
  var choices: js.Array[_] = js.native
  
  /**
    * The default column count for radiogroup and checkbox  cell types.
    */
  var columnColCount: Double = js.native
  
  /**
    * Set columnLayout to 'vertical' to place columns vertically and rows horizontally. It makes sense when we have many columns and few rows.
    * @see columns
    * @see rowCount
    */
  var columnLayout: String = js.native
  
  def columnLayoutChangedCallback(): Unit = js.native
  
  /**
    * Use this property to set the minimum column width.
    */
  var columnMinWidth: String = js.native
  
  def columnsChangedCallback(): Unit = js.native
  
  var columnsLocation: String = js.native
  
  /* protected */ def createNewDetailPanel(): PanelModel = js.native
  
  /* protected */ def createNewValue(): js.Any = js.native
  /* protected */ def createNewValue(nullOnEmpty: Boolean): js.Any = js.native
  
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question = js.native
  
  /* protected */ def createQuestionCore(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question = js.native
  
  /* protected */ def createRenderedTable(): QuestionMatrixDropdownRenderedTable = js.native
  
  def createRowDetailPanel(row: MatrixDropdownRowModelBase): PanelModel = js.native
  
  /* protected */ def deleteRowValue(newValue: js.Any, row: MatrixDropdownRowModelBase): js.Any = js.native
  
  /**
    * The template Panel elements, questions and panels.
    * @see  detailPanel
    * @see detailPanelMode
    */
  val detailElements: js.Array[IElement] = js.native
  
  /**
    * The detail template Panel. This panel is used as a template on creating detail panel for a row.
    * @see  detailElements
    * @see detailPanelMode
    */
  val detailPanel: PanelModel = js.native
  
  /**
    * Set the value to "underRow" to show the detailPanel under the row.
    */
  var detailPanelMode: String = js.native
  
  /* protected */ def generateRows(): js.Array[MatrixDropdownRowModelBase] = js.native
  
  /* protected */ def generateTotalRow(): MatrixDropdownRowModelBase = js.native
  
  def getCellType(): String = js.native
  
  /**
    * Returns the column by it's name. Returns null if a column with this name doesn't exist.
    * @param column
    */
  def getColumnByName(columnName: String): MatrixDropdownColumn = js.native
  
  def getColumnName(columnName: String): MatrixDropdownColumn = js.native
  
  /**
    * Returns the column width.
    * @param column
    */
  def getColumnWidth(column: MatrixDropdownColumn): String = js.native
  
  def getDetailPanelButtonCss(row: MatrixDropdownRowModelBase): String = js.native
  
  def getDetailPanelIconCss(row: MatrixDropdownRowModelBase): String = js.native
  
  /* protected */ def getFirstCellQuestion(onError: Boolean): Question = js.native
  
  def getFooterText(): LocalizableString = js.native
  
  def getIsDetailPanelShowing(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  def getPlainData(options: Calculations): js.Any = js.native
  
  def getRequiredText(): String = js.native
  
  /* protected */ def getRowDisplayValue(row: MatrixDropdownRowModelBase, rowValue: js.Any): js.Any = js.native
  
  def getRowIndex(row: MatrixDropdownRowModelBase): Double = js.native
  
  /* protected */ def getRowObj(row: MatrixDropdownRowModelBase): js.Any = js.native
  
  def getRowTitleWidth(): String = js.native
  
  /**
    * Returns the row value. If the row value is empty, the object is empty: {}.
    * @param rowIndex row index from 0 to visible row count - 1.
    */
  def getRowValue(rowIndex: Double): js.Any = js.native
  
  /* protected */ def getRowValueCore(row: MatrixDropdownRowModelBase, questionValue: js.Any): js.Any = js.native
  /* protected */ def getRowValueCore(row: MatrixDropdownRowModelBase, questionValue: js.Any, create: Boolean): js.Any = js.native
  
  def getSharedQuestionByName(columnName: String, row: MatrixDropdownRowModelBase): Question = js.native
  
  def getSurvey(): ISurvey = js.native
  
  /* protected */ def getVisibleTotalRow(): MatrixDropdownRowModelBase = js.native
  
  def hasDetailPanel(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  val hasFooter: Boolean = js.native
  
  val hasRowText: Boolean = js.native
  
  val hasTotal: Boolean = js.native
  
  /**
    * Set this property to true to show the horizontal scroll.
    */
  var horizontalScroll: Boolean = js.native
  
  /**
    * Returns true if columns are located horizontally
    * @see columnLayout
    */
  val isColumnLayoutHorizontal: Boolean = js.native
  
  /* protected */ def isObject(value: js.Any): Boolean = js.native
  
  var isRowChanging: Boolean = js.native
  
  val isRowsDynamic: Boolean = js.native
  
  val locOptionsCaption: LocalizableString = js.native
  
  /* protected */ def onBeforeValueChanged(`val`: js.Any): Unit = js.native
  
  def onCellCreatedCallback(options: js.Any): Unit = js.native
  
  /* protected */ def onCellValueChanged(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): Unit = js.native
  
  def onCellValueChangedCallback(options: js.Any): Unit = js.native
  
  def onColumnCellTypeChanged(column: MatrixDropdownColumn): Unit = js.native
  
  def onColumnPropertyChanged(column: MatrixDropdownColumn, name: String, newValue: js.Any): Unit = js.native
  
  def onCreateDetailPanelCallback(row: MatrixDropdownRowModelBase, panel: PanelModel): Unit = js.native
  
  /* protected */ def onEndRowAdding(): Unit = js.native
  
  /* protected */ def onEndRowRemoving(row: MatrixDropdownRowModelBase): Unit = js.native
  
  def onHasDetailPanelCallback(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  /* protected */ def onMatrixRowCreated(row: MatrixDropdownRowModelBase): Unit = js.native
  
  def onRenderedTableCreatedCallback(table: QuestionMatrixDropdownRenderedTable): Unit = js.native
  
  def onRenderedTableResetCallback(): Unit = js.native
  
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: String, newRowValue: js.Any, isDeletingValue: Boolean): Unit = js.native
  
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): js.Any = js.native
  
  def onShowInMultipleColumnsChanged(column: MatrixDropdownColumn): Unit = js.native
  
  /* protected */ def onStartRowAddingRemoving(): Unit = js.native
  
  def onTotalValueChanged(): js.Any = js.native
  
  /**
    * The default options caption for dropdown cell type.
    */
  var optionsCaption: String = js.native
  
  val renderedTable: QuestionMatrixDropdownRenderedTable = js.native
  
  /* protected */ def resetRenderedTable(): Unit = js.native
  
  /* protected */ def runCellsCondition(values: HashTable[_], properties: HashTable[_]): Unit = js.native
  
  /* protected */ def runTotalsCondition(values: HashTable[_], properties: HashTable[_]): Unit = js.native
  
  def setIsDetailPanelShowing(row: MatrixDropdownRowModelBase, `val`: Boolean): Unit = js.native
  
  /**
    * Set the row value.
    * @param rowIndex row index from 0 to visible row count - 1.
    * @param rowValue an object {"column name": columnValue,... }
    */
  def setRowValue(rowIndex: Double, rowValue: js.Any): js.Any = js.native
  
  val storeOthersAsComment: Boolean = js.native
  
  val totalValue: js.Any = js.native
  
  def updateCellsCallback(): Unit = js.native
  
  /* protected */ def updateHasFooter(): Unit = js.native
  
  def validateCell(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): SurveyError = js.native
  
  val visibleTotalRow: MatrixDropdownRowModelBase = js.native
}
/* static members */
object QuestionMatrixDropdownModelBase {
  
  @JSImport("survey-knockout", "QuestionMatrixDropdownModelBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "QuestionMatrixDropdownModelBase.addDefaultColumns")
  @js.native
  def addDefaultColumns(matrix: QuestionMatrixDropdownModelBase): Unit = js.native
  
  @JSImport("survey-knockout", "QuestionMatrixDropdownModelBase.defaultCellType")
  @js.native
  def defaultCellType: String = js.native
  @scala.inline
  def defaultCellType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCellType")(x.asInstanceOf[js.Any])
}
