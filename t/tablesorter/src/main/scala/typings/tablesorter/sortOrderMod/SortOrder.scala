package typings.tablesorter.sortOrderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tablesorter.tablesorterStrings.asc
  - typings.tablesorter.tablesorterStrings.desc
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def asc: typings.tablesorter.tablesorterStrings.asc = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typings.tablesorter.tablesorterStrings.desc = this.cast("desc")
}

