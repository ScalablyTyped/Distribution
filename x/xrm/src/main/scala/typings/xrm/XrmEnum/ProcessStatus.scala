package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.aborted
import typings.xrm.xrmStrings.active
import typings.xrm.xrmStrings.finished
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link ProcessFlow.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.active
  - typings.xrm.xrmStrings.aborted
  - typings.xrm.xrmStrings.finished
*/
trait ProcessStatus extends js.Object

object ProcessStatus {
  @scala.inline
  def Aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def Active: active = "active".asInstanceOf[active]
  @scala.inline
  def Finished: finished = "finished".asInstanceOf[finished]
}

