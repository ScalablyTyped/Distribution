package typings.vis.visMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineWindow extends js.Object {
  var end: Date
  var start: Date
}

object TimelineWindow {
  @scala.inline
  def apply(end: Date, start: Date): TimelineWindow = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[TimelineWindow]
  }
}

