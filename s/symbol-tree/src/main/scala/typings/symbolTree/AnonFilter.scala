package typings.symbolTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter[THIS, T /* <: js.Object */] extends js.Object {
  var thisArg: THIS
  def filter(`object`: T): js.Any
}

object AnonFilter {
  @scala.inline
  def apply[THIS, T /* <: js.Object */](filter: T => js.Any, thisArg: THIS): AnonFilter[THIS, T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), thisArg = thisArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter[THIS, T]]
  }
}

