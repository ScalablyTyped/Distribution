package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorTables.tabulatorTablesStrings.cellEdit
  - typings.tabulatorTables.tabulatorTablesStrings.rowAdd
  - typings.tabulatorTables.tabulatorTablesStrings.rowDelete
  - typings.tabulatorTables.tabulatorTablesStrings.rowMoved
*/
trait HistoryAction extends js.Object

object HistoryAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cellEdit: typings.tabulatorTables.tabulatorTablesStrings.cellEdit = this.cast("cellEdit")
  @scala.inline
  def rowAdd: typings.tabulatorTables.tabulatorTablesStrings.rowAdd = this.cast("rowAdd")
  @scala.inline
  def rowDelete: typings.tabulatorTables.tabulatorTablesStrings.rowDelete = this.cast("rowDelete")
  @scala.inline
  def rowMoved: typings.tabulatorTables.tabulatorTablesStrings.rowMoved = this.cast("rowMoved")
}

