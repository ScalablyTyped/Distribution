package typings.twilioDashSync.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashSync.twilioDashSyncStrings.open_or_create
  - typings.twilioDashSync.twilioDashSyncStrings.open_existing
  - typings.twilioDashSync.twilioDashSyncStrings.create_new
*/
trait OpenMode extends js.Object

object OpenMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create_new: typings.twilioDashSync.twilioDashSyncStrings.create_new = this.cast("create_new")
  @scala.inline
  def open_existing: typings.twilioDashSync.twilioDashSyncStrings.open_existing = this.cast("open_existing")
  @scala.inline
  def open_or_create: typings.twilioDashSync.twilioDashSyncStrings.open_or_create = this.cast("open_or_create")
}

