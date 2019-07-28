package typings.xrm.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Direction types for a process stage change event
  * @see {@link ProcessFlow.StageChangeDirection}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.Next
  - typings.xrm.xrmStrings.Previous
*/
trait StageChangeDirection extends js.Object

object StageChangeDirection {
  @scala.inline
  def Next: typings.xrm.xrmStrings.Next = this.cast("Next")
  @scala.inline
  def Previous: typings.xrm.xrmStrings.Previous = this.cast("Previous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

