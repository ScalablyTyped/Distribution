package typings.tablesorter.filteringColumnFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tablesorter.tablesorterStrings.`false`
  - typings.tablesorter.tablesorterStrings.parsed
  - typings.tablesorter.tablesorterStrings.default
*/
trait ColumnFilter extends js.Object

object ColumnFilter {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.tablesorter.tablesorterStrings.default = this.cast("default")
  @scala.inline
  def `false`: typings.tablesorter.tablesorterStrings.`false` = this.cast("false")
  @scala.inline
  def parsed: typings.tablesorter.tablesorterStrings.parsed = this.cast("parsed")
}

