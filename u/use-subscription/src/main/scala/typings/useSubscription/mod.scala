package typings.useSubscription

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-subscription", "useSubscription")
  @js.native
  def useSubscription[T](subscription: Subscription[T]): T = js.native
  
  @js.native
  trait Subscription[T] extends StObject {
    
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
    implicit class SubscriptionMutableBuilder[Self <: Subscription[_], T] (val x: Self with Subscription[T]) extends AnyVal {
      
      @scala.inline
      def setGetCurrentValue(value: () => T): Self = StObject.set(x, "getCurrentValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscribe(value: js.Function0[Unit] => Unsubscribe): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
