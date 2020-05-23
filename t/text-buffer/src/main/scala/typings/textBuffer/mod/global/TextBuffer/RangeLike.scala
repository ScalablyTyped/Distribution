package typings.textBuffer.mod.global.TextBuffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface that should be implemented for all "range-compatible" objects. */
trait RangeLike extends js.Object {
  /** A Point representing the end of the Range. */
  var end: PointLike
  /** A Point representing the start of the Range. */
  var start: PointLike
}

object RangeLike {
  @scala.inline
  def apply(end: PointLike, start: PointLike): RangeLike = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeLike]
  }
}

