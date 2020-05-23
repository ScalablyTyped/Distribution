package typings.tableResolver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column[T] extends js.Object {
  var column: T
}

object Column {
  @scala.inline
  def apply[T](column: T): Column[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
}

