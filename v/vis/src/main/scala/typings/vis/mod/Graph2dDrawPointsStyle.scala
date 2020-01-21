package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vis.visStrings.square
  - typings.vis.visStrings.circle
*/
trait Graph2dDrawPointsStyle extends js.Object

object Graph2dDrawPointsStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typings.vis.visStrings.circle = this.cast("circle")
  @scala.inline
  def square: typings.vis.visStrings.square = this.cast("square")
}

