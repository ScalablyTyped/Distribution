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
    * By default the 'Add Row' button is shown on bottom if columnLayout is horizontal and on top if columnLayout is vertical.
    * You may set it to "top", "bottom" or "topBottom" (to show on top and bottom).
    */
  def addRowLocation: String = js.native
  def addRowLocation_=(`val`: String): Unit = js.native
  
  /*
    * Use this property to change the default value of add row button text.
    */
  def addRowText: String = js.native
  def addRowText_=(`val`: String): Unit = js.native
  
  /*
    * Creates and add a new row and focus the cell in the first column.
    */
  def addRowUI(): Unit = js.native
  
  /*
    * Set this property to false to disable ability to add new rows. "Add new Row" button becomes invsible in UI
    */
  def allowAddRows: Boolean = js.native
  def allowAddRows_=(`val`: Boolean): Unit = js.native
  
  /*
    * Set this property to false to disable ability to remove rows. "Remove" row buttons become invsible in UI
    */
  def allowRemoveRows: Boolean = js.native
  def allowRemoveRows_=(`val`: Boolean): Unit = js.native
  
  /*
    * Set this property to true, to allow rows drag and drop.
    */
  def allowRowsDragAndDrop: Boolean = js.native
  def allowRowsDragAndDrop_=(`val`: Boolean): Unit = js.native
  
  def canRemoveRowsCallback(allow: Boolean): Boolean = js.native
  
  /*
    * Set it to true, to show a confirmation dialog on removing a row
    */
  def confirmDelete: Boolean = js.native
  
  /*
    * Use this property to change the default text showing in the confirmation delete dialog on removing a row.
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
    * Set it to true to copy the value into new added row from the last row. If defaultRowValue is set and this property equals to true,
    * then the value for new added row is merging.
    */
  def defaultValueFromLastRow: Boolean = js.native
  def defaultValueFromLastRow_=(`val`: Boolean): Unit = js.native
  
  /*
    * Set this property to true to show detail panel immediately on adding a new row.
    */
  def detailPanelShowOnAdding: Boolean = js.native
  def detailPanelShowOnAdding_=(`val`: Boolean): Unit = js.native
  
  var dragDropMatrixRows: DragDropMatrixRows = js.native
  
  var draggedRow: MatrixDropdownRowModelBase = js.native
  
  /*
    * Use this property to change the default value of remove row button text.
    */
  def emptyRowsText: String = js.native
  def emptyRowsText_=(`val`: String): Unit = js.native
  
  def getAddRowButtonCss(): String = js.native
  def getAddRowButtonCss(isEmptySection: Boolean): String = js.native
  
  def getRemoveRowButtonCss(): String = js.native
  
  /*
    * Set this property to true to hide matrix columns when there is no any row.
    */
  def hideColumnsIfEmpty: Boolean = js.native
  def hideColumnsIfEmpty_=(`val`: Boolean): Unit = js.native
  
  def iconDragElement: String = js.native
  
  var initialRowCount: Double = js.native
  
  def isRequireConfirmOnRowDelete(index: Double): Boolean = js.native
  
  /*
    * Set it to a column name and the library shows duplication error, if there are same values in different rows in the column.
    */
  def keyName: String = js.native
  def keyName_=(`val`: String): Unit = js.native
  
  def locAddRowText: LocalizableString = js.native
  
  def locConfirmDeleteText: LocalizableString = js.native
  
  def locEmptyRowsText: LocalizableString = js.native
  
  def locRemoveRowText: LocalizableString = js.native
  
  /*
    * The maximum row count. A user could not add a row if the rowCount equals to maxRowCount
    */
  def maxRowCount: Double = js.native
  def maxRowCount_=(`val`: Double): Unit = js.native
  
  /*
    * The minimum row count. A user could not delete a row if the rowCount equals to minRowCount
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
