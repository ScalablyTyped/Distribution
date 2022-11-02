package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixDynamicModel")
@js.native
open class QuestionMatrixDynamicModel protected () extends QuestionMatrixDropdownModelBase {
  def this(name: String) = this()
  
  /*
    * Creates and add a new row.
    */
  def addRow(): Unit = js.native
  
  /*
    * Specifies the location of the Add Row button.
    * 
    * Possible values:
    * 
    * - `"top"` - Displays the Add Row button at the top of the matrix.
    * - `"bottom"` - Displays the Add Row button at the bottom of the matrix.
    * - `"topBottom"` - Displays the Add Row button at the top and bottom of the matrix.
    * 
    * Default value: `"top"` if `columnLayout` is `vertical`; `"bottom"` if `columnLayout` is `"horizontal"` or the matrix is in compact mode.
    */
  def addRowLocation: String = js.native
  def addRowLocation_=(`val`: String): Unit = js.native
  
  /*
    * A caption for the Add Row button.
    */
  def addRowText: String = js.native
  def addRowText_=(`val`: String): Unit = js.native
  
  /*
    * Creates and add a new row and focus the cell in the first column.
    */
  def addRowUI(): Unit = js.native
  
  /*
    * Specifies whether users are allowed to add new rows.
    * 
    * Default value: `true`
    */
  def allowAddRows: Boolean = js.native
  def allowAddRows_=(`val`: Boolean): Unit = js.native
  
  /*
    * Specifies whether users are allowed to delete rows.
    * 
    * Default value: `true`
    */
  def allowRemoveRows: Boolean = js.native
  def allowRemoveRows_=(`val`: Boolean): Unit = js.native
  
  /*
    * Specifies whether users can drag and drop matrix rows to reorder them.
    * 
    * Default value: `false`
    */
  def allowRowsDragAndDrop: Boolean = js.native
  def allowRowsDragAndDrop_=(`val`: Boolean): Unit = js.native
  
  def canRemoveRowsCallback(allow: Boolean): Boolean = js.native
  
  /*
    * Specifies whether to display a confirmation dialog when a respondent wants to delete a row.
    */
  def confirmDelete: Boolean = js.native
  
  /*
    * A message displayed in a confirmation dialog that appears when a respondent wants to delete a row.
    */
  def confirmDeleteText: String = js.native
  def confirmDeleteText_=(`val`: String): Unit = js.native
  
  def confirmDelete_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def createMatrixRow(value: Any): MatrixDynamicRowModel = js.native
  
  /*
    * If it is not empty, then this value is set to every new row, including rows created initially, unless the defaultValue is not empty
    */
  def defaultRowValue: Any = js.native
  def defaultRowValue_=(`val`: Any): Unit = js.native
  
  /*
    * Specifies whether default values for a new row/column should be copied from the last row/column.
    * 
    * If you also specify `defaultValue`, it will be merged with the copied values.
    */
  def defaultValueFromLastRow: Boolean = js.native
  def defaultValueFromLastRow_=(`val`: Boolean): Unit = js.native
  
  /*
    * Specifies whether to expand the detail section immediately when a respondent adds a new row.
    */
  def detailPanelShowOnAdding: Boolean = js.native
  def detailPanelShowOnAdding_=(`val`: Boolean): Unit = js.native
  
  var dragDropMatrixRows: DragDropMatrixRows = js.native
  
  var draggedRow: MatrixDropdownRowModelBase = js.native
  
  /*
    * A message displayed when the matrix does not contain any rows. Applies only if `hideColumnsIfEmpty` is enabled.
    */
  def emptyRowsText: String = js.native
  def emptyRowsText_=(`val`: String): Unit = js.native
  
  def getAddRowButtonCss(): String = js.native
  def getAddRowButtonCss(isEmptySection: Boolean): String = js.native
  
  def getRemoveRowButtonCss(): String = js.native
  
  /*
    * Specifies whether to hide columns when the matrix does not contain any rows. If you enable this property, the matrix displays the `emptyRowsText` message and the Add Row button.
    * 
    * Default value: `false`
    */
  def hideColumnsIfEmpty: Boolean = js.native
  def hideColumnsIfEmpty_=(`val`: Boolean): Unit = js.native
  
  def iconDragElement: String = js.native
  
  var initialRowCount: Double = js.native
  
  def isRequireConfirmOnRowDelete(index: Double): Boolean = js.native
  
  /*
    * Specifies a key column. Set this property to a column name, and the question will display `keyDuplicationError` if a user tries to enter a duplicate value in this column.
    */
  def keyName: String = js.native
  def keyName_=(`val`: String): Unit = js.native
  
  def locAddRowText: LocalizableString = js.native
  
  def locConfirmDeleteText: LocalizableString = js.native
  
  def locEmptyRowsText: LocalizableString = js.native
  
  def locRemoveRowText: LocalizableString = js.native
  
  /*
    * A maximum number of rows in the matrix. Users cannot add new rows if `rowCount` equals `maxRowCount`.
    * 
    * Default value: 1000 (inherited from [`settings.matrixMaximumRowCount`](https://surveyjs.io/form-library/documentation/settings#matrixMaximumRowCount))
    */
  def maxRowCount: Double = js.native
  def maxRowCount_=(`val`: Double): Unit = js.native
  
  /*
    * A minimum number of rows in the matrix. Users cannot delete rows if `rowCount` equals `minRowCount`.
    * 
    * Default value: 0
    */
  def minRowCount: Double = js.native
  def minRowCount_=(`val`: Double): Unit = js.native
  
  def moveRowByIndex(fromIndex: Double, toIndex: Double): Unit = js.native
  
  def onGetValueForNewRowCallBack(sender: QuestionMatrixDynamicModel): Any = js.native
  
  /*
    * Removes a row by it's index.
    */
  def removeRow(index: Double): Unit = js.native
  
  /*
    * Use this property to change the default value of remove row button text.
    */
  def removeRowText: String = js.native
  def removeRowText_=(`val`: String): Unit = js.native
  
  /*
    * Removes a row by it's index. If confirmDelete is true, show a confirmation dialog
    */
  def removeRowUI(value: Any): Unit = js.native
  
  /*
    * The number of rows in the matrix.
    */
  def rowCount: Double = js.native
  def rowCount_=(`val`: Double): Unit = js.native
  
  var rowCounter: Double = js.native
  
  var setRowCountValueFromData: Boolean = js.native
  
  def startDragMatrixRow(event: Any, currentTarget: Any): Unit = js.native
}
