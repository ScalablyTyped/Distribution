package typings.urqlCore.subscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverLike[T] extends js.Object {
  def complete(): Unit
  def error(err: js.Any): Unit
  def next(value: T): Unit
}

object ObserverLike {
  @scala.inline
  def apply[T](complete: () => Unit, error: js.Any => Unit, next: T => Unit): ObserverLike[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[ObserverLike[T]]
  }
}

