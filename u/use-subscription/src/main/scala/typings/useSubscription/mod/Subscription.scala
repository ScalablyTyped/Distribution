package typings.useSubscription.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription[T] extends js.Object {
  
  /**
    * (Synchronously) returns the current value of our subscription.
    */
  def getCurrentValue(): T = js.native
  
  /**
    * This function is passed an event handler to attach to the subscription.
    * It must return an unsubscribe function that removes the handler.
    */
  def subscribe(callback: js.Function0[Unit]): Unsubscribe = js.native
}
object Subscription {
  
  @scala.inline
  def apply[T](getCurrentValue: () => T, subscribe: js.Function0[Unit] => Unsubscribe): Subscription[T] = {
    val __obj = js.Dynamic.literal(getCurrentValue = js.Any.fromFunction0(getCurrentValue), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscription[T]]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription[_], T] (val x: Self with Subscription[T]) extends AnyVal {
    
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
    def setGetCurrentValue(value: () => T): Self = this.set("getCurrentValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubscribe(value: js.Function0[Unit] => Unsubscribe): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
}
