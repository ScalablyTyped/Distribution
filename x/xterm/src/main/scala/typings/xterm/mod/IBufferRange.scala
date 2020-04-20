package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range within a buffer.
  */
trait IBufferRange extends js.Object {
  /**
    * The end position of the range.
    */
  var end: IBufferCellPosition
  /**
    * The start position of the range.
    */
  var start: IBufferCellPosition
}

object IBufferRange {
  @scala.inline
  def apply(end: IBufferCellPosition, start: IBufferCellPosition): IBufferRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferRange]
  }
}

