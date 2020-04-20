package typings.wonka.jsShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait observableSubscriptionT extends js.Object {
  def unsubscribe(): Unit
}

object observableSubscriptionT {
  @scala.inline
  def apply(unsubscribe: () => Unit): observableSubscriptionT = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[observableSubscriptionT]
  }
}

