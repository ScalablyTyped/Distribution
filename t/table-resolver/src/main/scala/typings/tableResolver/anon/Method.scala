package typings.tableResolver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method[T] extends js.Object {
  var columns: js.Array[T]
  def method(args: Column[T]): T
}

object Method {
  @scala.inline
  def apply[T](columns: js.Array[T], method: Column[T] => T): Method[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], method = js.Any.fromFunction1(method))
    __obj.asInstanceOf[Method[T]]
  }
}

