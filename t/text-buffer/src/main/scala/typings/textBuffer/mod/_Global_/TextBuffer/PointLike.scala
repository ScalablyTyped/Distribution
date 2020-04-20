package typings.textBuffer.mod._Global_.TextBuffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface that should be implemented for all "point-compatible" objects. */
trait PointLike extends js.Object {
  /** A zero-indexed number representing the column of the Point. */
  var column: Double
  /** A zero-indexed number representing the row of the Point. */
  var row: Double
}

object PointLike {
  @scala.inline
  def apply(column: Double, row: Double): PointLike = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLike]
  }
}

