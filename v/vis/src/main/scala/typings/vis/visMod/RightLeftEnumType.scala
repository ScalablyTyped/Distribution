package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vis.visStrings.right
  - typings.vis.visStrings.left
*/
trait RightLeftEnumType extends js.Object

object RightLeftEnumType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.vis.visStrings.left = this.cast("left")
  @scala.inline
  def right: typings.vis.visStrings.right = this.cast("right")
}

