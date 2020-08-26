package typings.wonka.jsShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait observableT[a] extends js.Object {
  def subscribe(observer: observableObserverT[a]): observableSubscriptionT = js.native
}

object observableT {
  @scala.inline
  def apply[a](subscribe: observableObserverT[a] => observableSubscriptionT): observableT[a] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[observableT[a]]
  }
  @scala.inline
  implicit class observableTOps[Self <: observableT[_], a] (val x: Self with observableT[a]) extends AnyVal {
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
    def setSubscribe(value: observableObserverT[a] => observableSubscriptionT): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
  
}

