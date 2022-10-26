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
    * An array of matrix columns.
    * 
    * This array can contain primitive values or objects with the `text` (display value) and `value` (value to be saved in survey results) properties.
    * 
    * [View Demo](https://surveyjs.io/form-library/examples/single-selection-matrix-table-question/ (linkStyle))
    */
  def columns: Any = js.native
  
  /*
    * A Boolean expression that is evaluated against each matrix column. If the expression evaluates to `false`, the column becomes hidden.
    * 
    * A survey parses and runs all expressions on startup. If any values used in the expression change, the survey re-evaluates it.
    * 
    * Use the `{item}` placeholder to reference the current column in the expression.
    * 
    * Refer to the following help topic for more information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility).
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
    * An array of matrix rows.
    * 
    * This array can contain primitive values or objects with the `text` (display value) and `value` (value to be saved in survey results) properties.
    * 
    * [View Demo](https://surveyjs.io/form-library/examples/single-selection-matrix-table-question/ (linkStyle))
    */
  def rows: Any = js.native
  
  /*
    * A Boolean expression that is evaluated against each matrix row. If the expression evaluates to `false`, the row becomes hidden.
    * 
    * A survey parses and runs all expressions on startup. If any values used in the expression change, the survey re-evaluates it.
    * 
    * Use the `{item}` placeholder to reference the current row in the expression.
    * 
    * Refer to the following help topic for more information: [Conditional Visibility](https://surveyjs.io/form-library/documentation/design-survey-conditional-logic#conditional-visibility).
    */
  def rowsVisibleIf: String = js.native
  def rowsVisibleIf_=(`val`: String): Unit = js.native
  
  def rows_=(`val`: Any): Unit = js.native
  
  /* protected */ def runItemsCondition(values: Any, properties: Any): Boolean = js.native
  
  /* protected */ def shouldRunColumnExpression(): Boolean = js.native
  
  /*
    * Specifies whether to display the table header that contains column captions.
    * 
    * Default value: `true`
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
    * Returns an array of visible matrix rows.
    */
  def visibleRows: Any = js.native
  
  var visibleRowsChangedCallback: Any = js.native
}
