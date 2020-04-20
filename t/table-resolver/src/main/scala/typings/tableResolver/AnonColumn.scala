package typings.tableResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn[T] extends js.Object {
  var column: T
}

object AnonColumn {
  @scala.inline
  def apply[T](column: T): AnonColumn[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn[T]]
  }
}

