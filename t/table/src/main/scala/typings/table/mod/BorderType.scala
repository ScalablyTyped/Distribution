package typings.table.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.table.tableStrings.honeywell
  - typings.table.tableStrings.norc
  - typings.table.tableStrings.ramac
  - typings.table.tableStrings.void
*/
trait BorderType extends js.Object

object BorderType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def honeywell: typings.table.tableStrings.honeywell = this.cast("honeywell")
  @scala.inline
  def norc: typings.table.tableStrings.norc = this.cast("norc")
  @scala.inline
  def ramac: typings.table.tableStrings.ramac = this.cast("ramac")
  @scala.inline
  def void: typings.table.tableStrings.void = this.cast("void")
}

