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
  
  def allowAdaptiveActions: Boolean = js.native
  def allowAdaptiveActions_=(`val`: Boolean): Unit = js.native
  
  def beginUpdate(): Unit = js.native
  
  def canAddRow: Boolean = js.native
  
  def canRemoveRow(row: MatrixDropdownRowModelBase): Boolean = js.native
  
  def canRemoveRows: Boolean = js.native
  
  /*
    * Specifies the type of matrix cells. You can override this property for individual columns.
    * 
    * Possible values:
    * 
    * - `"dropdown"`
    * - `"checkbox"`
    * - `"radiogroup"`
    * - `"text"`
    * - `"comment"`
    * - `"boolean"`
    * - `"expression"`
    * - `"rating"`
    * 
    * Default value: "dropdown" (inherited from [`settings.matrixDefaultCellType`](https://surveyjs.io/form-library/documentation/settings#matrixDefaultCellType))
    */
  def cellType: String = js.native
  def cellType_=(`val`: String): Unit = js.native
  
  def checkIfValueInRowDuplicated(checkedRow: MatrixDropdownRowModelBase, cellQuestion: Question): Boolean = js.native
  
  /*
    * Gets or sets choice items for Dropdown, Checkbox, and Radiogroup matrix cells. You can override this property for individual columns.
    * 
    * This property accepts an array of objects with the following structure:
    * 
    * ```js
    * {
    *   "value": any, // A value to be saved in survey results
    *   "text": String, // A display text. This property supports Markdown. When `text` is undefined, `value` is used.
    * }
    * ```
    * 
    * If you need to specify only the `value` property, you can set the `choices` property to an array of primitive values, for example, `[ "item1", "item2", "item3" ]`. These values are both saved in survey results and used as display text.
    */
  def choices: Any = js.native
  def choices_=(`val`: Any): Unit = js.native
  
  /* protected */ def clearRowsAndResetRenderedTable(): Unit = js.native
  
  /*
    * Specifies the number of columns in Radiogroup and Checkbox cells.
    * 
    * Default value: 0 (the number of columns is selected automatically based on the available column width)
    */
  def columnColCount: Double = js.native
  def columnColCount_=(`val`: Double): Unit = js.native
  
  /*
    * Specifies the matrix layout. Set this property to `"vertical"` if you want to display columns instead of rows and rows instead of columns.
    * 
    * Default value: `"horizontal"`
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
    * An array of survey elements (questions and panels) to be displayed in detail sections.
    * 
    * Detail sections are expandable panels displayed under each matrix row. You can use them to display questions that do not fit into the row.
    * 
    * Set the `detailPanelMode` property to `"underRow"` or `"underRowSingle"` to display detail sections.
    */
  def detailElements: Any = js.native
  
  /*
    * Contains a [`PanelModel`](https://surveyjs.io/form-library/documentation/panelmodel) instance that represents a detail section template.
    */
  def detailPanel: PanelModel = js.native
  
  /*
    * Specifies the location of detail sections.
    * 
    * Possible values:
    * 
    * - `"underRow"` - Displays detail sections under their respective rows. Users can expand any number of detail sections.
    * - `"underRowSingle"` - Displays detail sections under their respective rows, but only one detail section can be expanded at a time.
    * - `"none"` (default) - Hides detail sections.
    * 
    * Use the `detailElements` property to specify content of detail sections.
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
    * Returns a matrix column with a given `name` or `null` if a column with this is not found.
    */
  def getColumnByName(columnName: String): MatrixDropdownColumn = js.native
  
  def getColumnHeaderWrapperComponentData(cell: MatrixDropdownCell): Any = js.native
  
  def getColumnHeaderWrapperComponentName(cell: MatrixDropdownCell): String = js.native
  
  def getColumnName(columnName: String): MatrixDropdownColumn = js.native
  
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
    * Returns an object with row values. If a row has no answers, this method returns an empty object.
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
  
  def horizontalScroll: Boolean = js.native
  def horizontalScroll_=(`val`: Boolean): Unit = js.native
  
  /*
    * Returns `true` if columns are placed in the horizontal direction and rows in the vertical direction.
    * 
    * To specify the layout, use the `columnLayout` property. If you set it to `"vertical"`, the survey applies it only when the screen has enough space. Otherwise, the survey falls back to the horizontal layout, but the `columnLayout` property remains set to `"vertical"`. Unlike `columnLayout`, the `isColumnLayoutHorizontal` property always indicates the current layout.
    */
  def isColumnLayoutHorizontal: Boolean = js.native
  
  var isDoingonAnyValueChanged: Boolean = js.native
  
  /* protected */ def isObject(value: Any): Boolean = js.native
  
  /* protected */ var isRowChanging: Boolean = js.native
  
  def isRowsDynamic: Boolean = js.native
  
  /*
    * Enables case-sensitive comparison in columns with the `isUnique` property set to `true`.
    * 
    * When this property is `true`, `"ABC"` and `"abc"` are considered different values.
    * 
    * Default value: `false`
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
    * An error message displayed when users enter a duplicate value into a column that accepts only unique values (`isUnique` is set to `true` or `keyName` is specified).
    * 
    * A default value for this property is taken from a [localization dictionary](https://github.com/surveyjs/survey-library/tree/master/src/localization). Refer to the following help topic for more information: [Localization & Globalization](https://surveyjs.io/form-library/documentation/localization).
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
    * A placeholder for Dropdown matrix cells.
    */
  def placeholder: String = js.native
  def placeholder_=(`val`: String): Unit = js.native
  
  def renderedTable: QuestionMatrixDropdownRenderedTable = js.native
  
  /* protected */ def resetRenderedTable(): Unit = js.native
  
  /* protected */ def runCellsCondition(values: Any, properties: Any): Unit = js.native
  
  /* protected */ def runTotalsCondition(values: Any, properties: Any): Unit = js.native
  
  def setIsDetailPanelShowing(row: MatrixDropdownRowModelBase, `val`: Boolean): Unit = js.native
  
  /*
    * Assigns values to a row.
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
