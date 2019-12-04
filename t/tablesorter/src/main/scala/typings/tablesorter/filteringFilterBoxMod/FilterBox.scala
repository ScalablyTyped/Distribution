package typings.tablesorter.filteringFilterBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tablesorter.tablesorterStrings.search
  - typings.tablesorter.tablesorterStrings.select
  - typings.tablesorter.tablesorterStrings.from
  - typings.tablesorter.tablesorterStrings.to
*/
trait FilterBox extends js.Object

object FilterBox {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def from: typings.tablesorter.tablesorterStrings.from = this.cast("from")
  @scala.inline
  def search: typings.tablesorter.tablesorterStrings.search = this.cast("search")
  @scala.inline
  def select: typings.tablesorter.tablesorterStrings.select = this.cast("select")
  @scala.inline
  def to: typings.tablesorter.tablesorterStrings.to = this.cast("to")
}

