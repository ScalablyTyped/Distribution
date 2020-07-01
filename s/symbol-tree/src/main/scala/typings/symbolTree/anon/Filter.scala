package typings.symbolTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter[THIS, T /* <: js.Object */] extends js.Object {
  var thisArg: THIS
  def filter(`object`: T): js.Any
}

object Filter {
  @scala.inline
  def apply[THIS, /* <: js.Object */ T](filter: T => js.Any, thisArg: THIS): Filter[THIS, T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), thisArg = thisArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter[THIS, T]]
  }
}

