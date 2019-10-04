package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionMatrixBaseModel")
@js.native
class QuestionMatrixBaseModel[TRow, TColumn] protected () extends Question {
  def this(name: String) = this()
  /**
    * The list of columns. A column has a value and an optional text
    */
  var columns: js.Array[_] = js.native
  /**
    * An expression that returns true or false. It runs against each column item and if for this item it returns true, then the item is visible otherwise the item becomes invisible. Please use {item} to get the current item value in the expression.
    * @see rowsVisibleIf
    */
  var columnsVisibleIf: String = js.native
  var filteredColumns: js.Array[TColumn] = js.native
  var filteredRows: js.Array[ItemValue] = js.native
  var generatedTotalRow: TRow = js.native
  var generatedVisibleRows: js.Array[TRow] = js.native
  /**
    * The list of rows. A row has a value and an optional text
    */
  var rows: js.Array[_] = js.native
  /**
    * An expression that returns true or false. It runs against each row item and if for this item it returns true, then the item is visible otherwise the item becomes invisible. Please use {item} to get the current item value in the expression.
    * @see visibleIf
    */
  var rowsVisibleIf: String = js.native
  /**
    * Set this property to false, to hide table header. The default value is true.
    */
  var showHeader: Boolean = js.native
  val visibleColumns: js.Array[_] = js.native
  /**
    * Returns the list of visible rows as model objects.
    * @see rowsVisibleIf
    */
  val visibleRows: js.Array[TRow] = js.native
  /* protected */ def clearInvisibleValuesInRows(): Unit = js.native
  /* protected */ def createColumnValues(): js.Any = js.native
  /* protected */ def filterItems(): Boolean = js.native
  /* protected */ def getVisibleRows(): js.Array[TRow] = js.native
  /* protected */ def hasRowsAsItems(): Boolean = js.native
  /* protected */ def onColumnsChanged(): Unit = js.native
  /* protected */ def onRowsChanged(): Unit = js.native
  /* protected */ def processRowsOnSet(newRows: js.Array[_]): js.Array[_] = js.native
  /* protected */ def runItemsCondition(values: HashTable[_], properties: HashTable[_]): Boolean = js.native
  /* protected */ def shouldRunColumnExpression(): Boolean = js.native
  def visibleRowsChangedCallback(): Unit = js.native
}

