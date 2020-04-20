package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete[T] extends js.Object {
  def complete(): Unit
  def fail(): Unit
  def success(res: T): Unit
}

object AnonComplete {
  @scala.inline
  def apply[T](complete: () => Unit, fail: () => Unit, success: T => Unit): AnonComplete[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), fail = js.Any.fromFunction0(fail), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[AnonComplete[T]]
  }
}

