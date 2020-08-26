package typings.urqlCore.subscriptionMod

import typings.urqlCore.anon.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableLike[T] extends js.Object {
  def subscribe(observer: ObserverLike[T]): Unsubscribe = js.native
}

object ObservableLike {
  @scala.inline
  def apply[T](subscribe: ObserverLike[T] => Unsubscribe): ObservableLike[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[ObservableLike[T]]
  }
  @scala.inline
  implicit class ObservableLikeOps[Self <: ObservableLike[_], T] (val x: Self with ObservableLike[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubscribe(value: ObserverLike[T] => Unsubscribe): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
  
}

