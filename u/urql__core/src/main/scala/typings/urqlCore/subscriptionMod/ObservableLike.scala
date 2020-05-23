package typings.urqlCore.subscriptionMod

import typings.urqlCore.anon.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableLike[T] extends js.Object {
  def subscribe(observer: ObserverLike[T]): Unsubscribe
}

object ObservableLike {
  @scala.inline
  def apply[T](subscribe: ObserverLike[T] => Unsubscribe): ObservableLike[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[ObservableLike[T]]
  }
}

