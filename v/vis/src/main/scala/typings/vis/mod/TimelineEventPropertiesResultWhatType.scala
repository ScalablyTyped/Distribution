package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vis.visStrings.item
  - typings.vis.visStrings.background
  - typings.vis.visStrings.axis
  - typings.vis.visStrings.`group-label`
  - typings.vis.visStrings.`custom-time`
  - typings.vis.visStrings.`current-time`
*/
trait TimelineEventPropertiesResultWhatType extends js.Object

object TimelineEventPropertiesResultWhatType {
  @scala.inline
  def axis: typings.vis.visStrings.axis = this.cast("axis")
  @scala.inline
  def background: typings.vis.visStrings.background = this.cast("background")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `current-time`: typings.vis.visStrings.`current-time` = this.cast("current-time")
  @scala.inline
  def `custom-time`: typings.vis.visStrings.`custom-time` = this.cast("custom-time")
  @scala.inline
  def `group-label`: typings.vis.visStrings.`group-label` = this.cast("group-label")
  @scala.inline
  def item: typings.vis.visStrings.item = this.cast("item")
}

