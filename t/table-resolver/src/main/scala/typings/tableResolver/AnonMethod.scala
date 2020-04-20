package typings.tableResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod[T] extends js.Object {
  var columns: js.Array[T]
  def method(args: AnonColumn[T]): T
}

object AnonMethod {
  @scala.inline
  def apply[T](columns: js.Array[T], method: AnonColumn[T] => T): AnonMethod[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], method = js.Any.fromFunction1(method))
    __obj.asInstanceOf[AnonMethod[T]]
  }
}

