package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable[T] extends js.Object {
  def subscribe(listener: Listener[T]): Subscription
}

object Observable {
  @scala.inline
  def apply[T](subscribe: Listener[T] => Subscription): Observable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Observable[T]]
  }
}

