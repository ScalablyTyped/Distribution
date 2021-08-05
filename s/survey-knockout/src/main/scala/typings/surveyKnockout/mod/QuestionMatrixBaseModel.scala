package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixBaseModel")
@js.native
class QuestionMatrixBaseModel[TRow, TColumn] protected () extends Question {
  def this(name: String) = this()
  
  /* protected */ def clearGeneratedRows(): Unit = js.native
  
  /* protected */ def clearInvisibleValuesInRows(): Unit = js.native
  
  /**
    * The list of columns. A column has a value and an optional text
    */
  var columns: js.Array[js.Any] = js.native
  
  /**
    * An expression that returns true or false. It runs against each column item and if for this item it returns true, then the item is visible otherwise the item becomes invisible. Please use {item} to get the current item value in the expression.
    * @see rowsVisibleIf
    */
  var columnsVisibleIf: String = js.native
  
  /* protected */ def createColumnValues(): js.Any = js.native
  
  /* protected */ def filterItems(): Boolean = js.native
  
  /* protected */ var filteredColumns: js.Array[TColumn] = js.native
  
  /* protected */ var filteredRows: js.Array[ItemValue] = js.native
  
  /* protected */ var generatedTotalRow: TRow = js.native
  
  /* protected */ var generatedVisibleRows: js.Array[TRow] = js.native
  
  /* protected */ def getVisibleRows(): js.Array[TRow] = js.native
  
  /* protected */ def hasRowsAsItems(): Boolean = js.native
  
  /* protected */ def onColumnsChanged(): Unit = js.native
  
  /* protected */ def onRowsChanged(): Unit = js.native
  
  /* protected */ def processRowsOnSet(newRows: js.Array[js.Any]): js.Array[js.Any] = js.native
  
  /**
    * The list of rows. A row has a value and an optional text
    */
  var rows: js.Array[js.Any] = js.native
  
  /**
    * An expression that returns true or false. It runs against each row item and if for this item it returns true, then the item is visible otherwise the item becomes invisible. Please use {item} to get the current item value in the expression.
    * @see visibleIf
    */
  var rowsVisibleIf: String = js.native
  
  /* protected */ def runItemsCondition(values: HashTable[js.Any], properties: HashTable[js.Any]): Boolean = js.native
  
  /* protected */ def shouldRunColumnExpression(): Boolean = js.native
  
  /**
    * Set this property to false, to hide table header. The default value is true.
    */
  var showHeader: Boolean = js.native
  
  val visibleColumns: js.Array[js.Any] = js.native
  
  /**
    * Returns the list of visible rows as model objects.
    * @see rowsVisibleIf
    */
  val visibleRows: js.Array[TRow] = js.native
  
  def visibleRowsChangedCallback(): Unit = js.native
}
