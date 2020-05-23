package typings.tableResolver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns[T] extends js.Object {
  var columns: js.Array[T]
}

object Columns {
  @scala.inline
  def apply[T](columns: js.Array[T]): Columns[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns[T]]
  }
}

