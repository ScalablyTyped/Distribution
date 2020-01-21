package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vis.visStrings.from
  - typings.vis.visStrings.to
*/
trait DirectionType extends js.Object

object DirectionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def from: typings.vis.visStrings.from = this.cast("from")
  @scala.inline
  def to: typings.vis.visStrings.to = this.cast("to")
}

