package typings.symbolDashTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter[THIS, T /* <: js.Object */] extends js.Object {
  var thisArg: THIS
  def filter(`object`: T): js.Any
}

object Anon_Filter {
  @scala.inline
  def apply[THIS, T /* <: js.Object */](filter: T => js.Any, thisArg: THIS): Anon_Filter[THIS, T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), thisArg = thisArg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Filter[THIS, T]]
  }
}

