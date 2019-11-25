package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vis.visStrings.currentTimeTick
  - typings.vis.visStrings.click
  - typings.vis.visStrings.contextmenu
  - typings.vis.visStrings.doubleClick
  - typings.vis.visStrings.drop
  - typings.vis.visStrings.mouseOver
  - typings.vis.visStrings.mouseDown
  - typings.vis.visStrings.mouseUp
  - typings.vis.visStrings.mouseMove
  - typings.vis.visStrings.groupDragged
  - typings.vis.visStrings.changed
  - typings.vis.visStrings.rangechange
  - typings.vis.visStrings.rangechanged
  - typings.vis.visStrings.select
  - typings.vis.visStrings.itemover
  - typings.vis.visStrings.itemout
  - typings.vis.visStrings.timechange
  - typings.vis.visStrings.timechanged
*/
trait TimelineEvents extends js.Object

object TimelineEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def changed: typings.vis.visStrings.changed = this.cast("changed")
  @scala.inline
  def click: typings.vis.visStrings.click = this.cast("click")
  @scala.inline
  def contextmenu: typings.vis.visStrings.contextmenu = this.cast("contextmenu")
  @scala.inline
  def currentTimeTick: typings.vis.visStrings.currentTimeTick = this.cast("currentTimeTick")
  @scala.inline
  def doubleClick: typings.vis.visStrings.doubleClick = this.cast("doubleClick")
  @scala.inline
  def drop: typings.vis.visStrings.drop = this.cast("drop")
  @scala.inline
  def groupDragged: typings.vis.visStrings.groupDragged = this.cast("groupDragged")
  @scala.inline
  def itemout: typings.vis.visStrings.itemout = this.cast("itemout")
  @scala.inline
  def itemover: typings.vis.visStrings.itemover = this.cast("itemover")
  @scala.inline
  def mouseDown: typings.vis.visStrings.mouseDown = this.cast("mouseDown")
  @scala.inline
  def mouseMove: typings.vis.visStrings.mouseMove = this.cast("mouseMove")
  @scala.inline
  def mouseOver: typings.vis.visStrings.mouseOver = this.cast("mouseOver")
  @scala.inline
  def mouseUp: typings.vis.visStrings.mouseUp = this.cast("mouseUp")
  @scala.inline
  def rangechange: typings.vis.visStrings.rangechange = this.cast("rangechange")
  @scala.inline
  def rangechanged: typings.vis.visStrings.rangechanged = this.cast("rangechanged")
  @scala.inline
  def select: typings.vis.visStrings.select = this.cast("select")
  @scala.inline
  def timechange: typings.vis.visStrings.timechange = this.cast("timechange")
  @scala.inline
  def timechanged: typings.vis.visStrings.timechanged = this.cast("timechanged")
}

