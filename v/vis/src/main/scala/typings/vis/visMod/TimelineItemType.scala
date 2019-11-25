package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vis.visStrings.box
  - typings.vis.visStrings.point
  - typings.vis.visStrings.range
  - typings.vis.visStrings.background
*/
trait TimelineItemType extends js.Object

object TimelineItemType {
  @scala.inline
  def background: typings.vis.visStrings.background = this.cast("background")
  @scala.inline
  def box: typings.vis.visStrings.box = this.cast("box")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def point: typings.vis.visStrings.point = this.cast("point")
  @scala.inline
  def range: typings.vis.visStrings.range = this.cast("range")
}

