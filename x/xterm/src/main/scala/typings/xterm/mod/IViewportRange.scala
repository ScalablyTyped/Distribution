package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewportRange extends js.Object {
  /**
    * The end of the range.
    */
  var end: IViewportRangePosition
  /**
    * The start of the range.
    */
  var start: IViewportRangePosition
}

object IViewportRange {
  @scala.inline
  def apply(end: IViewportRangePosition, start: IViewportRangePosition): IViewportRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewportRange]
  }
}

