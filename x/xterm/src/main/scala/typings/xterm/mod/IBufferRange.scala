package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range within a buffer.
  */
@js.native
trait IBufferRange extends js.Object {
  /**
    * The end position of the range.
    */
  var end: IBufferCellPosition = js.native
  /**
    * The start position of the range.
    */
  var start: IBufferCellPosition = js.native
}

object IBufferRange {
  @scala.inline
  def apply(end: IBufferCellPosition, start: IBufferCellPosition): IBufferRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferRange]
  }
  @scala.inline
  implicit class IBufferRangeOps[Self <: IBufferRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: IBufferCellPosition): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: IBufferCellPosition): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

