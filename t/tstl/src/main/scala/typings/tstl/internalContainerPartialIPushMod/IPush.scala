package typings.tstl.internalContainerPartialIPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPush[T] extends js.Object {
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  def push(items: T*): Double
}

object IPush {
  @scala.inline
  def apply[T](push: /* repeated */ T => Double): IPush[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
  
    __obj.asInstanceOf[IPush[T]]
  }
}

