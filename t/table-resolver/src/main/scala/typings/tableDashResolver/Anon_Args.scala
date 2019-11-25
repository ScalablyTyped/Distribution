package typings.tableDashResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args[T] extends js.Object {
  var columns: js.Array[T]
  def method(args: Anon_Column[T]): T
}

object Anon_Args {
  @scala.inline
  def apply[T](columns: js.Array[T], method: Anon_Column[T] => T): Anon_Args[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], method = js.Any.fromFunction1(method))
  
    __obj.asInstanceOf[Anon_Args[T]]
  }
}

