package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Status for {@link ProcessFlow.Stage.getStatus Stage.getStatus()}.
  * @see {@link ProcessFlow.StageStatus}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.active
  - xrmLib.xrmLibStrings.inactive
*/
trait StageStatus extends js.Object

object StageStatus {
  @scala.inline
  def Active: xrmLib.xrmLibStrings.active = this.cast("active")
  @scala.inline
  def Inactive: xrmLib.xrmLibStrings.inactive = this.cast("inactive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

