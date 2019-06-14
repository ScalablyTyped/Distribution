package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link ProcessFlow.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.active
  - xrmLib.xrmLibStrings.aborted
  - xrmLib.xrmLibStrings.finished
*/
trait ProcessStatus extends js.Object

object ProcessStatus {
  @scala.inline
  def Aborted: xrmLib.xrmLibStrings.aborted = this.cast("aborted")
  @scala.inline
  def Active: xrmLib.xrmLibStrings.active = this.cast("active")
  @scala.inline
  def Finished: xrmLib.xrmLibStrings.finished = this.cast("finished")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

