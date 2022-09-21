package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IMatrixDropdownData because var conflicts: columns, value. Inlined onRowChanged, onRowChanging, isValidateOnValueChanging, getRowIndex, getRowValue, checkIfValueInRowDuplicated, hasDetailPanel, getIsDetailPanelShowing, setIsDetailPanelShowing, createRowDetailPanel, validateCell, createQuestion, getParentTextProcessor, getSharedQuestionByName, onTotalValueChanged */ @JSImport("survey-knockout", "QuestionMatrixDropdownModelBase")
@js.native
open class QuestionMatrixDropdownModelBase protected () extends QuestionMatrixBaseModel[MatrixDropdownRowModelBase, MatrixDropdownColumn] {
  def this(name: String) = this()
  
  def addColumn(name: String): MatrixDropdownColumn = js.native
  def addColumn(name: String, title: String): MatrixDropdownColumn = js.native
  
  /*
    * The Matrix toolbar and inner panel toolbars get adaptive if the property is set to true.
    */
  def allowAdaptiveActions: Boolean = js.native
  def allowAdaptiveActions_=(`val`: Boolean): Unit = js.native
  
  def beginUpdate(): Unit = js.native
  
  def canAddRow: Boolean = js.native
  
  def canRemoveRow(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  def canRemoveRows: Boolean = js.native
  
  /*
    * Use this property to change the default cell type.
    */
  def cellType: String = js.native
  def cellType_=(`val`: String): Unit = js.native
  
  def checkIfValueInRowDuplicated(checkedRow: MatrixDropdownRowModelBase, cellQuestion: Question): Boolean = js.native
  
  /*
    * The default choices for dropdown, checkbox and radiogroup cell types.
    */
  def choices: Any = js.native
  def choices_=(`val`: Any): Unit = js.native
  
  /* protected */ def clearRowsAndResetRenderedTable(): Unit = js.native
  
  /*
    * The default column count for radiogroup and checkbox  cell types.
    */
  def columnColCount: Double = js.native
  def columnColCount_=(`val`: Double): Unit = js.native
  
  /*
    * Set columnLayout to 'vertical' to place columns vertically and rows horizontally. It makes sense when we have many columns and few rows.
    */
  def columnLayout: String = js.native
  def columnLayout_=(`val`: String): Unit = js.native
  
  /*
    * Minimum column width in CSS values.
    */
  def columnMinWidth: String = js.native
  def columnMinWidth_=(`val`: String): Unit = js.native
  
  var columnsChangedCallback: Any = js.native
  
  def columnsLocation: String = js.native
  def columnsLocation_=(`val`: String): Unit = js.native
  
  /* protected */ def createNewDetailPanel(): PanelModel = js.native
  
  /* protected */ def createNewValue(): Any = js.native
  /* protected */ def createNewValue(nullOnEmpty: Boolean): Any = js.native
  
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question = js.native
  
  /* protected */ def createQuestionCore(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question = js.native
  
  /* protected */ def createRenderedTable(): QuestionMatrixDropdownRenderedTable = js.native
  
  def createRowDetailPanel(row: MatrixDropdownRowModelBase): PanelModel = js.native
  
  /* protected */ def deleteRowValue(newValue: Any, row: MatrixDropdownRowModelBase): Any = js.native
  
  /*
    * The template Panel elements, questions and panels.
    */
  def detailElements: Any = js.native
  
  /*
    * The detail template Panel. This panel is used as a template on creating detail panel for a row.
    */
  def detailPanel: PanelModel = js.native
  
  /*
    * Set the value to "underRow" to show the detailPanel under the row.
    */
  def detailPanelMode: String = js.native
  def detailPanelMode_=(`val`: String): Unit = js.native
  
  var detailPanelValue: PanelModel = js.native
  
  def endUpdate(): Unit = js.native
  
  /* protected */ def generateRows(): js.Array[MatrixDropdownRowModelBase] = js.native
  
  /* protected */ def generateTotalRow(): MatrixDropdownRowModelBase = js.native
  
  def getAddRowLocation(): String = js.native
  
  def getCellTemplateData(cell: QuestionMatrixDropdownRenderedCell): Any = js.native
  
  def getCellType(): String = js.native
  
  def getCellWrapperComponentData(cell: MatrixDropdownCell): Any = js.native
  
  def getCellWrapperComponentName(cell: MatrixDropdownCell): String = js.native
  
  /*
    * Returns the column by it's name. Returns null if a column with this name doesn't exist.
    */
  def getColumnByName(columnName: String): MatrixDropdownColumn = js.native
  
  def getColumnHeaderWrapperComponentData(cell: MatrixDropdownCell): Any = js.native
  
  def getColumnHeaderWrapperComponentName(cell: MatrixDropdownCell): String = js.native
  
  def getColumnName(columnName: String): MatrixDropdownColumn = js.native
  
  /*
    * Returns the column width.
    */
  def getColumnWidth(column: MatrixDropdownColumn): String = js.native
  
  /* protected */ def getConditionObjectRowName(index: Double): String = js.native
  
  /* protected */ def getConditionObjectRowText(index: Double): String = js.native
  
  /* protected */ def getConditionObjectsRowIndeces(): js.Array[Any] = js.native
  
  def getCustomCellType(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, cellType: String): String = js.native
  
  def getDetailPanelButtonCss(row: MatrixDropdownRowModelBase): String = js.native
  
  def getDetailPanelIconCss(row: MatrixDropdownRowModelBase): String = js.native
  
  def getDetailPanelIconId(row: MatrixDropdownRowModelBase): String = js.native
  
  /* protected */ def getFirstCellQuestion(onError: Boolean): Question = js.native
  
  def getFooterText(): LocalizableString = js.native
  
  def getIsDetailPanelShowing(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  def getParentTextProcessor(): ITextProcessor = js.native
  
  def getRequiredText(): String = js.native
  
  /* protected */ def getRowDisplayValue(keysAsText: Boolean, row: MatrixDropdownRowModelBase, rowValue: Any): Any = js.native
  
  def getRowHeaderWrapperComponentData(cell: MatrixDropdownCell): Any = js.native
  
  def getRowHeaderWrapperComponentName(cell: MatrixDropdownCell): String = js.native
  
  def getRowIndex(row: MatrixDropdownRowModelBase): Double = js.native
  
  /* protected */ def getRowObj(row: MatrixDropdownRowModelBase): Any = js.native
  
  def getRowTitleWidth(): String = js.native
  
  /*
    * Returns the row value. If the row value is empty, the object is empty: {}.
    */
  def getRowValue(rowIndex: Double): Any = js.native
  
  /* protected */ def getRowValueCore(row: MatrixDropdownRowModelBase, questionValue: Any): Any = js.native
  /* protected */ def getRowValueCore(row: MatrixDropdownRowModelBase, questionValue: Any, create: Boolean): Any = js.native
  
  def getSharedQuestionByName(columnName: String, row: MatrixDropdownRowModelBase): Question = js.native
  
  def getShowColumnsIfEmpty(): Boolean = js.native
  
  /* protected */ def getUniqueColumns(): js.Array[MatrixDropdownColumn] = js.native
  
  /* protected */ def getVisibleTotalRow(): MatrixDropdownRowModelBase = js.native
  
  def hasChoices(): Boolean = js.native
  
  def hasDetailPanel(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  def hasFooter: Boolean = js.native
  
  def hasRowText: Boolean = js.native
  
  def hasTotal: Boolean = js.native
  
  /*
    * Set this property to true to show the horizontal scroll.
    */
  def horizontalScroll: Boolean = js.native
  def horizontalScroll_=(`val`: Boolean): Unit = js.native
  
  /*
    * Returns true if columns are located horizontally
    */
  def isColumnLayoutHorizontal: Boolean = js.native
  
  var isDoingonAnyValueChanged: Boolean = js.native
  
  /* protected */ def isObject(value: Any): Boolean = js.native
  
  /* protected */ var isRowChanging: Boolean = js.native
  
  def isRowsDynamic: Boolean = js.native
  
  /*
    * Set this property to true if you want to differ case sensitive values in unique columns, for example to allow enter "ABC" into the first row and "abc" into the second.
    * It doesn't allow by default.
    */
  def isUniqueCaseSensitive: Boolean = js.native
  
  var isUniqueCaseSensitiveValue: Boolean = js.native
  
  def isUniqueCaseSensitive_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def isUpdateLocked: Boolean = js.native
  
  var isUpdating: Boolean = js.native
  
  def isValidateOnValueChanging: Boolean = js.native
  @JSName("isValidateOnValueChanging")
  var isValidateOnValueChanging_FQuestionMatrixDropdownModelBase: Boolean = js.native
  
  /*
    * The duplication value error text. Set it to show the text different from the default.
    */
  def keyDuplicationError: String = js.native
  def keyDuplicationError_=(`val`: String): Unit = js.native
  
  def locKeyDuplicationError: LocalizableString = js.native
  
  def locPlaceholder: LocalizableString = js.native
  
  var lockResetRenderedTable: Boolean = js.native
  
  def onAddColumn(column: MatrixDropdownColumn): Unit = js.native
  
  /* protected */ def onBeforeValueChanged(`val`: Any): Unit = js.native
  
  def onCellCreatedCallback(options: Any): Unit = js.native
  
  /* protected */ def onCellValueChanged(row: MatrixDropdownRowModelBase, columnName: String, rowValue: Any): Unit = js.native
  
  def onCellValueChangedCallback(options: Any): Unit = js.native
  
  def onColumnCellTypeChanged(column: MatrixDropdownColumn): Unit = js.native
  
  def onColumnItemValuePropertyChanged(
    column: MatrixDropdownColumn,
    propertyName: String,
    obj: ItemValue,
    name: String,
    newValue: Any,
    oldValue: Any
  ): Unit = js.native
  
  def onColumnPropertyChanged(column: MatrixDropdownColumn, name: String, newValue: Any): Unit = js.native
  
  def onCreateDetailPanelCallback(row: MatrixDropdownRowModelBase, panel: PanelModel): Unit = js.native
  
  def onCreateDetailPanelRenderedRowCallback(renderedRow: QuestionMatrixDropdownRenderedRow): Unit = js.native
  
  /* protected */ def onEndRowAdding(): Unit = js.native
  
  /* protected */ def onEndRowRemoving(row: MatrixDropdownRowModelBase): Unit = js.native
  
  def onHasDetailPanelCallback(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  /* protected */ def onMatrixRowCreated(row: MatrixDropdownRowModelBase): Unit = js.native
  
  def onPointerDown(pointerDownEvent: Any, row: MatrixDropdownRowModelBase): Unit = js.native
  
  def onRemoveColumn(column: MatrixDropdownColumn): Unit = js.native
  
  def onRenderedTableCreatedCallback(table: QuestionMatrixDropdownRenderedTable): Unit = js.native
  
  var onRenderedTableResetCallback: Any = js.native
  
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: String, newRowValue: Any, isDeletingValue: Boolean): Unit = js.native
  
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: String, rowValue: Any): Any = js.native
  
  def onShowInMultipleColumnsChanged(column: MatrixDropdownColumn): Unit = js.native
  
  /* protected */ def onStartRowAddingRemoving(): Unit = js.native
  
  def onTotalValueChanged(): Any = js.native
  
  def optionsCaption: String = js.native
  def optionsCaption_=(`val`: String): Unit = js.native
  
  /*
    * The default placeholder for dropdown cell type.
    */
  def placeholder: String = js.native
  def placeholder_=(`val`: String): Unit = js.native
  
  def renderedTable: QuestionMatrixDropdownRenderedTable = js.native
  
  /* protected */ def resetRenderedTable(): Unit = js.native
  
  /* protected */ def runCellsCondition(values: Any, properties: Any): Unit = js.native
  
  /* protected */ def runTotalsCondition(values: Any, properties: Any): Unit = js.native
  
  def setIsDetailPanelShowing(row: MatrixDropdownRowModelBase, `val`: Boolean): Unit = js.native
  
  /*
    * Set the row value.
    */
  def setRowValue(rowIndex: Double, rowValue: Any): Any = js.native
  
  def showHorizontalScroll: Boolean = js.native
  
  def storeOthersAsComment: Boolean = js.native
  
  def totalValue: Any = js.native
  
  /* protected */ def updateColumnsAndRows(): Unit = js.native
  
  /* protected */ def updateHasFooter(): Unit = js.native
  
  /* protected */ def updateProgressInfoByRow(res: IProgressInfo, rowValue: Any): Unit = js.native
  
  /* protected */ def updateProgressInfoByValues(res: IProgressInfo): Unit = js.native
  
  /* protected */ def updateShowTableAndAddRow(): Unit = js.native
  
  def validateCell(row: MatrixDropdownRowModelBase, columnName: String, rowValue: Any): SurveyError = js.native
  
  def visibleTotalRow: MatrixDropdownRowModelBase = js.native
}
/* static members */
object QuestionMatrixDropdownModelBase {
  
  @JSImport("survey-knockout", "QuestionMatrixDropdownModelBase")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDefaultColumns(matrix: QuestionMatrixDropdownModelBase): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addDefaultColumns")(matrix.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
