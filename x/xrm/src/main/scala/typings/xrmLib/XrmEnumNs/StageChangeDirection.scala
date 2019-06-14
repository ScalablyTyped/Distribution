package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Direction types for a process stage change event
  * @see {@link ProcessFlow.StageChangeDirection}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.Next
  - xrmLib.xrmLibStrings.Previous
*/
trait StageChangeDirection extends js.Object

object StageChangeDirection {
  @scala.inline
  def Next: xrmLib.xrmLibStrings.Next = this.cast("Next")
  @scala.inline
  def Previous: xrmLib.xrmLibStrings.Previous = this.cast("Previous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

