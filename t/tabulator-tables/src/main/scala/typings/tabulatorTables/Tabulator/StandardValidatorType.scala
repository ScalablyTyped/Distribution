package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorTables.tabulatorTablesStrings.required
  - typings.tabulatorTables.tabulatorTablesStrings.unique
  - typings.tabulatorTables.tabulatorTablesStrings.integer
  - typings.tabulatorTables.tabulatorTablesStrings.float
  - typings.tabulatorTables.tabulatorTablesStrings.numeric
  - typings.tabulatorTables.tabulatorTablesStrings.string
*/
trait StandardValidatorType extends js.Object

object StandardValidatorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def float: typings.tabulatorTables.tabulatorTablesStrings.float = this.cast("float")
  @scala.inline
  def integer: typings.tabulatorTables.tabulatorTablesStrings.integer = this.cast("integer")
  @scala.inline
  def numeric: typings.tabulatorTables.tabulatorTablesStrings.numeric = this.cast("numeric")
  @scala.inline
  def required: typings.tabulatorTables.tabulatorTablesStrings.required = this.cast("required")
  @scala.inline
  def string: typings.tabulatorTables.tabulatorTablesStrings.string = this.cast("string")
  @scala.inline
  def unique: typings.tabulatorTables.tabulatorTablesStrings.unique = this.cast("unique")
}

