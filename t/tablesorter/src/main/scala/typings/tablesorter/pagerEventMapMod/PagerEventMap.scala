package typings.tablesorter.pagerEventMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tablesorter.tablesorterStrings.pagerInitialized
  - typings.tablesorter.tablesorterStrings.pageMoved
  - typings.tablesorter.tablesorterStrings.pagerChange
  - typings.tablesorter.tablesorterStrings.pagerComplete
  - typings.tablesorter.tablesorterStrings.pagerBeforeInitialized
*/
trait PagerEventMap extends js.Object

object PagerEventMap {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pageMoved: typings.tablesorter.tablesorterStrings.pageMoved = this.cast("pageMoved")
  @scala.inline
  def pagerBeforeInitialized: typings.tablesorter.tablesorterStrings.pagerBeforeInitialized = this.cast("pagerBeforeInitialized")
  @scala.inline
  def pagerChange: typings.tablesorter.tablesorterStrings.pagerChange = this.cast("pagerChange")
  @scala.inline
  def pagerComplete: typings.tablesorter.tablesorterStrings.pagerComplete = this.cast("pagerComplete")
  @scala.inline
  def pagerInitialized: typings.tablesorter.tablesorterStrings.pagerInitialized = this.cast("pagerInitialized")
}

