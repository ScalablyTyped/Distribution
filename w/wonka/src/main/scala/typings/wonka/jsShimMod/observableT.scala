package typings.wonka.jsShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait observableT[a] extends js.Object {
  def subscribe(observer: observableObserverT[a]): observableSubscriptionT
}

object observableT {
  @scala.inline
  def apply[a](subscribe: observableObserverT[a] => observableSubscriptionT): observableT[a] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[observableT[a]]
  }
}

