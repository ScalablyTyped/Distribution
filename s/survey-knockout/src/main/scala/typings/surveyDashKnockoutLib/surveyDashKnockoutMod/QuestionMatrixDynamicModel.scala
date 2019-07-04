package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionMatrixDynamicModel")
@js.native
class QuestionMatrixDynamicModel protected () extends QuestionMatrixDropdownModelBase {
  def this(name: java.lang.String) = this()
  /**
    * By default the 'Add Row' button is shown on bottom if columnLayout is horizontal and on top if columnLayout is vertical. <br/>
    * You may set it to "top", "bottom" or "topBottom" (to show on top and bottom).
    * @see columnLayout
    */
  var addRowLocation: java.lang.String = js.native
  /**
    * Use this property to change the default value of add row button text.
    */
  var addRowText: java.lang.String = js.native
  /**
    * Returns true, if a new row can be added.
    * @see maxRowCount
    * @see canRemoveRow
    * @see rowCount
    */
  val canAddRow: scala.Boolean = js.native
  /**
    * Set it to true, to show a confirmation dialog on removing a row
    * @see ConfirmDeleteText
    */
  var confirmDelete: scala.Boolean = js.native
  /**
    * Use this property to change the default text showing in the confirmation delete dialog on removing a row.
    */
  var confirmDeleteText: java.lang.String = js.native
  /**
    * If it is not empty, then this value is set to every new row, including rows created initially, unless the defaultValue is not empty
    * @see defaultValue
    * @see defaultValueFromLastRow
    */
  var defaultRowValue: js.Any = js.native
  /**
    * Set it to true to copy the value into new added row from the last row. If defaultRowValue is set and this property equals to true,
    * then the value for new added row is merging.
    * @see defaultValue
    * @see defaultRowValue
    */
  var defaultValueFromLastRow: scala.Boolean = js.native
  val isAddRowOnBottom: scala.Boolean = js.native
  val isAddRowOnTop: scala.Boolean = js.native
  /**
    * The duplication value error text. Set it to show the text different from the default.
    * @see keyName
    */
  var keyDuplicationError: java.lang.String = js.native
  /**
    * Set it to a column name and the library shows duplication error, if there are same values in different rows in the column.
    * @see keyDuplicationError
    */
  var keyName: java.lang.String = js.native
  val locAddRowText: LocalizableString = js.native
  val locConfirmDeleteText: LocalizableString = js.native
  val locKeyDuplicationError: LocalizableString = js.native
  val locRemoveRowText: LocalizableString = js.native
  /**
    * The maximum row count. A user could not add a row if the rowCount equals to maxRowCount
    * @see rowCount
    * @see minRowCount
    */
  var maxRowCount: scala.Double = js.native
  /**
    * The minimum row count. A user could not delete a row if the rowCount equals to minRowCount
    * @see rowCount
    * @see maxRowCount
    */
  var minRowCount: scala.Double = js.native
  /**
    * Use this property to change the default value of remove row button text.
    */
  var removeRowText: java.lang.String = js.native
  /**
    * The number of rows in the matrix.
    * @see minRowCount
    * @see maxRowCount
    */
  var rowCount: scala.Double = js.native
  /**
    * Creates and add a new row.
    */
  def addRow(): scala.Unit = js.native
  /* protected */ def createMatrixRow(value: js.Any): MatrixDynamicRowModel = js.native
  def isRequireConfirmOnRowDelete(index: scala.Double): scala.Boolean = js.native
  /**
    * Removes a row by it's index.
    * @param index a row index, from 0 to rowCount - 1
    */
  def removeRow(index: scala.Double): scala.Unit = js.native
  /**
    * Removes a row by it's index. If confirmDelete is true, show a confirmation dialog
    * @param index a row index, from 0 to rowCount - 1
    * @see removeRow
    * @see confirmDelete
    */
  def removeRowUI(value: js.Any): scala.Unit = js.native
}

