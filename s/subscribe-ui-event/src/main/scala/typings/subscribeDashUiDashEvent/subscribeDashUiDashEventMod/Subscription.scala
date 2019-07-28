package typings.subscribeDashUiDashEvent.subscribeDashUiDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  def unsubscribe(): Unit
}

object Subscription {
  @scala.inline
  def apply(unsubscribe: () => Unit): Subscription = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Subscription]
  }
}

