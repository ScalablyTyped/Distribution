package typings.xrm.Xrm.ProcessFlow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status for {@link ProcessFlow.Stage.getStatus Stage.getStatus()}.
  * @see {@link XrmEnum.StageStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.active
  - typings.xrm.xrmStrings.inactive
*/
trait StageStatus extends js.Object

object StageStatus {
  @scala.inline
  def active: typings.xrm.xrmStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typings.xrm.xrmStrings.inactive = this.cast("inactive")
}

