package typings.tablesorter.configEventMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tablesorter.tablesorterStrings.filterInit
  - typings.tablesorter.tablesorterStrings.filterEnd
*/
trait ConfigEventMap extends js.Object

object ConfigEventMap {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def filterEnd: typings.tablesorter.tablesorterStrings.filterEnd = this.cast("filterEnd")
  @scala.inline
  def filterInit: typings.tablesorter.tablesorterStrings.filterInit = this.cast("filterInit")
}

