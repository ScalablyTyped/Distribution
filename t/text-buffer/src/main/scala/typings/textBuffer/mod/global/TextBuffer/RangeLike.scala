package typings.textBuffer.mod.global.TextBuffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface that should be implemented for all "range-compatible" objects. */
@js.native
trait RangeLike extends js.Object {
  /** A Point representing the end of the Range. */
  var end: PointLike = js.native
  /** A Point representing the start of the Range. */
  var start: PointLike = js.native
}

object RangeLike {
  @scala.inline
  def apply(end: PointLike, start: PointLike): RangeLike = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeLike]
  }
  @scala.inline
  implicit class RangeLikeOps[Self <: RangeLike] (val x: Self) extends AnyVal {
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
    def setEnd(value: PointLike): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: PointLike): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

