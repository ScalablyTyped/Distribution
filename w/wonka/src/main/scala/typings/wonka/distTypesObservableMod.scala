package typings.wonka

import typings.wonka.distTypesTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesObservableMod {
  
  @JSImport("wonka/dist/types/observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromObservable[T](input: Observable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(input.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def toObservable[T](source: Source[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(source.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  trait Observable[T] extends StObject {
    
    def subscribe(observer: ObservableObserver[T]): ObservableSubscription
  }
  object Observable {
    
    inline def apply[T](subscribe: ObservableObserver[T] => ObservableSubscription): Observable[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Observable[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observable[?], T] (val x: Self & Observable[T]) extends AnyVal {
      
      inline def setSubscribe(value: ObservableObserver[T] => ObservableSubscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait ObservableObserver[T] extends StObject {
    
    def complete(): Unit
    
    def error(error: Any): Unit
    
    def next(value: T): Unit
  }
  object ObservableObserver {
    
    inline def apply[T](complete: () => Unit, error: Any => Unit, next: T => Unit): ObservableObserver[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[ObservableObserver[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObservableObserver[?], T] (val x: Self & ObservableObserver[T]) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  trait ObservableSubscription extends StObject {
    
    var closed: js.UndefOr[Boolean] = js.undefined
    
    def unsubscribe(): Unit
  }
  object ObservableSubscription {
    
    inline def apply(unsubscribe: () => Unit): ObservableSubscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[ObservableSubscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObservableSubscription] (val x: Self) extends AnyVal {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
