package typings.tableResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns[T] extends js.Object {
  var columns: js.Array[T]
}

object AnonColumns {
  @scala.inline
  def apply[T](columns: js.Array[T]): AnonColumns[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumns[T]]
  }
}

