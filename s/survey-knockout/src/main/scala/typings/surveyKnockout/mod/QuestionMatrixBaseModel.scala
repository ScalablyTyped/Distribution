package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.middle
import typings.surveyKnockout.surveyKnockoutStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrixBaseModel")
@js.native
open class QuestionMatrixBaseModel[TRow, TColumn] protected () extends Question {
  def this(name: String) = this()
  
  /*
    * Specifies whether to apply shading to alternate matrix rows.
    */
  var alternateRows: Boolean = js.native
  
  /* protected */ def clearGeneratedRows(): Unit = js.native
  
  /* protected */ def clearInvisibleValuesInRows(): Unit = js.native
  
  /*
    * The list of columns. A column has a value and an optional text
    */
  def columns: Any = js.native
  
  /*
    * An expression that returns true or false. It runs against each column item and if for this item it returns true, then the item is visible otherwise the item becomes invisible. Please use {item} to get the current item value in the expression.
    */
  def columnsVisibleIf: String = js.native
  def columnsVisibleIf_=(`val`: String): Unit = js.native
  
  def columns_=(`val`: Any): Unit = js.native
  
  /* protected */ def createColumnValues(): Any = js.native
  
  /* protected */ def filterItems(): Boolean = js.native
  
  /* protected */ var filteredColumns: Any = js.native
  
  /* protected */ var filteredRows: Any = js.native
  
  /* protected */ var generatedTotalRow: Any = js.native
  
  /* protected */ var generatedVisibleRows: Any = js.native
  
  def getTableCss(): String = js.native
  
  /* protected */ def getVisibleRows(): js.Array[TRow] = js.native
  
  /* protected */ def hasRowsAsItems(): Boolean = js.native
  
  /* protected */ def onColumnsChanged(): Unit = js.native
  
  /* protected */ def onRowsChanged(): Unit = js.native
  
  /* protected */ def processRowsOnSet(newRows: Any): Any = js.native
  
  /*
    * The list of rows. A row has a value and an optional text
    */
  def rows: Any = js.native
  
  /*
    * An expression that returns true or false. It runs against each row item and if for this item it returns true, then the item is visible otherwise the item becomes invisible. Please use {item} to get the current item value in the expression.
    */
  def rowsVisibleIf: String = js.native
  def rowsVisibleIf_=(`val`: String): Unit = js.native
  
  def rows_=(`val`: Any): Unit = js.native
  
  /* protected */ def runItemsCondition(values: Any, properties: Any): Boolean = js.native
  
  /* protected */ def shouldRunColumnExpression(): Boolean = js.native
  
  /*
    * Set this property to false, to hide table header. The default value is true.
    */
  def showHeader: Boolean = js.native
  def showHeader_=(`val`: Boolean): Unit = js.native
  
  /* protected */ def updateVisibilityBasedOnRows(): Unit = js.native
  
  /*
    * Aligns matrix cell content in the vertical direction.
    */
  var verticalAlign: top | middle = js.native
  
  def visibleColumns: Any = js.native
  
  /*
    * Returns the list of visible rows as model objects.
    */
  def visibleRows: Any = js.native
  
  var visibleRowsChangedCallback: Any = js.native
}
