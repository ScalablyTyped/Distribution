package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculationComponent extends js.Object {
  
  def getCell(column: String): CellComponent = js.native
  def getCell(column: HTMLElement): CellComponent = js.native
  /** The getCell function returns the CellComponent for the specified column from this row.*/
  def getCell(column: ColumnComponent): CellComponent = js.native
  
  /** The getCells function returns an array of CellComponent objects, one for each cell in the row.*/
  def getCells(): js.Array[CellComponent] = js.native
  
  /** The getData function returns the data object for the row.*/
  def getData(): js.Any = js.native
  
  /** The getElement function returns the DOM node for the row.*/
  def getElement(): HTMLElement = js.native
  
  /** The getTable function returns the Tabulator object for the table containing the row. */
  def getTable(): typings.tabulatorTables.Tabulator = js.native
}
