package typings.xrm.Xrm.ProcessFlow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link XrmEnum.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.active
  - typings.xrm.xrmStrings.aborted
  - typings.xrm.xrmStrings.finished
*/
trait ProcessStatus extends js.Object

object ProcessStatus {
  @scala.inline
  def aborted: typings.xrm.xrmStrings.aborted = this.cast("aborted")
  @scala.inline
  def active: typings.xrm.xrmStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def finished: typings.xrm.xrmStrings.finished = this.cast("finished")
}

