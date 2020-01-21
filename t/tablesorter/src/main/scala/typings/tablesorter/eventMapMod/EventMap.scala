package typings.tablesorter.eventMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tablesorter.tablesorterStrings.`tablesorter-initialized`
  - typings.tablesorter.tablesorterStrings.`tablesorter-ready`
  - typings.tablesorter.tablesorterStrings.refreshComplete
  - typings.tablesorter.tablesorterStrings.updateComplete
  - typings.tablesorter.tablesorterStrings.widgetRemoveEnd
  - typings.tablesorter.tablesorterStrings.sortStart
  - typings.tablesorter.tablesorterStrings.sortBegin
  - typings.tablesorter.tablesorterStrings.sortEnd
*/
trait EventMap extends js.Object

object EventMap {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def refreshComplete: typings.tablesorter.tablesorterStrings.refreshComplete = this.cast("refreshComplete")
  @scala.inline
  def sortBegin: typings.tablesorter.tablesorterStrings.sortBegin = this.cast("sortBegin")
  @scala.inline
  def sortEnd: typings.tablesorter.tablesorterStrings.sortEnd = this.cast("sortEnd")
  @scala.inline
  def sortStart: typings.tablesorter.tablesorterStrings.sortStart = this.cast("sortStart")
  @scala.inline
  def `tablesorter-initialized`: typings.tablesorter.tablesorterStrings.`tablesorter-initialized` = this.cast("tablesorter-initialized")
  @scala.inline
  def `tablesorter-ready`: typings.tablesorter.tablesorterStrings.`tablesorter-ready` = this.cast("tablesorter-ready")
  @scala.inline
  def updateComplete: typings.tablesorter.tablesorterStrings.updateComplete = this.cast("updateComplete")
  @scala.inline
  def widgetRemoveEnd: typings.tablesorter.tablesorterStrings.widgetRemoveEnd = this.cast("widgetRemoveEnd")
}

