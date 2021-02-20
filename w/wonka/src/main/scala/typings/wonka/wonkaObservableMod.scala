package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaObservableMod {
  
  @JSImport("wonka/src/web/wonka_observable", "fromObservable")
  @js.native
  def fromObservable[T](observable: JsObservable[T]): Source[T] = js.native
  
  @JSImport("wonka/src/web/wonka_observable", "toObservable")
  @js.native
  def toObservable[T](source: Source[T]): JsObservable[T] = js.native
  
  @js.native
  trait JsObservable[T] extends StObject {
    
    def subscribe(observer: JsObserver[T]): JsSubscription = js.native
  }
  object JsObservable {
    
    @scala.inline
    def apply[T](subscribe: JsObserver[T] => JsSubscription): JsObservable[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[JsObservable[T]]
    }
    
    @scala.inline
    implicit class JsObservableMutableBuilder[Self <: JsObservable[_], T] (val x: Self with JsObservable[T]) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: JsObserver[T] => JsSubscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait JsObserver[T] extends StObject {
    
    def complete(): Unit = js.native
    
    def error(errorValue: js.Any): Unit = js.native
    
    def next(value: T): Unit = js.native
  }
  object JsObserver {
    
    @scala.inline
    def apply[T](complete: () => Unit, error: js.Any => Unit, next: T => Unit): JsObserver[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[JsObserver[T]]
    }
    
    @scala.inline
    implicit class JsObserverMutableBuilder[Self <: JsObserver[_], T] (val x: Self with JsObserver[T]) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait JsSubscription extends StObject {
    
    def unsubscribe(): Unit = js.native
  }
  object JsSubscription {
    
    @scala.inline
    def apply(unsubscribe: () => Unit): JsSubscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[JsSubscription]
    }
    
    @scala.inline
    implicit class JsSubscriptionMutableBuilder[Self <: JsSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
