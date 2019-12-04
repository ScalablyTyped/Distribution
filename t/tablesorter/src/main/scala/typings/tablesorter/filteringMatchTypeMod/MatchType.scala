package typings.tablesorter.filteringMatchTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tablesorter.tablesorterStrings.exact
  - typings.tablesorter.tablesorterStrings.`match`
*/
trait MatchType extends js.Object

object MatchType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exact: typings.tablesorter.tablesorterStrings.exact = this.cast("exact")
  @scala.inline
  def `match`: typings.tablesorter.tablesorterStrings.`match` = this.cast("match")
}

