package typings.xterm.xtermMod

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
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[IViewportRange]
  }
}

