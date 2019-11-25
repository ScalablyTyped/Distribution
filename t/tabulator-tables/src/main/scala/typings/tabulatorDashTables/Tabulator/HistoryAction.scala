package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorDashTables.tabulatorDashTablesStrings.cellEdit
  - typings.tabulatorDashTables.tabulatorDashTablesStrings.rowAdd
  - typings.tabulatorDashTables.tabulatorDashTablesStrings.rowDelete
  - typings.tabulatorDashTables.tabulatorDashTablesStrings.rowMoved
*/
trait HistoryAction extends js.Object

object HistoryAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cellEdit: typings.tabulatorDashTables.tabulatorDashTablesStrings.cellEdit = this.cast("cellEdit")
  @scala.inline
  def rowAdd: typings.tabulatorDashTables.tabulatorDashTablesStrings.rowAdd = this.cast("rowAdd")
  @scala.inline
  def rowDelete: typings.tabulatorDashTables.tabulatorDashTablesStrings.rowDelete = this.cast("rowDelete")
  @scala.inline
  def rowMoved: typings.tabulatorDashTables.tabulatorDashTablesStrings.rowMoved = this.cast("rowMoved")
}

