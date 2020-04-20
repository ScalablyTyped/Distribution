package typings.useSubscription.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription[T] extends js.Object {
  /**
    * (Synchronously) returns the current value of our subscription.
    */
  def getCurrentValue(): T
  /**
    * This function is passed an event handler to attach to the subscription.
    * It must return an unsubscribe function that removes the handler.
    */
  def subscribe(callback: js.Function0[Unit]): Unsubscribe
}

object Subscription {
  @scala.inline
  def apply[T](getCurrentValue: () => T, subscribe: js.Function0[Unit] => Unsubscribe): Subscription[T] = {
    val __obj = js.Dynamic.literal(getCurrentValue = js.Any.fromFunction0(getCurrentValue), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscription[T]]
  }
}

