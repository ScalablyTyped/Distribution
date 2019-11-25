package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vis.visStrings.line
  - typings.vis.visStrings.bar
  - typings.vis.visStrings.points
*/
trait Graph2dStyleType extends js.Object

object Graph2dStyleType {
  @scala.inline
  def bar: typings.vis.visStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def line: typings.vis.visStrings.line = this.cast("line")
  @scala.inline
  def points: typings.vis.visStrings.points = this.cast("points")
}

