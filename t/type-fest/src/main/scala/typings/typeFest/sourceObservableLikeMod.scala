package typings.typeFest

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceObservableLikeMod {
  
  @js.native
  trait ObservableLike[ValueType] extends StObject {
    
    def subscribe(): Unsubscribable = js.native
    def subscribe(observer: Partial[Observer[ValueType]]): Unsubscribable = js.native
  }
  
  trait Observer[ValueType] extends StObject {
    
    def complete(): Unit
    @JSName("complete")
    var complete_Original: OnComplete
    
    def error(error: Any): Unit
    @JSName("error")
    var error_Original: OnError
    
    def next(value: ValueType): Unit
    @JSName("next")
    var next_Original: OnNext[ValueType]
  }
  object Observer {
    
    inline def apply[ValueType](complete: () => Unit, error: /* error */ Any => Unit, next: ValueType => Unit): Observer[ValueType] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[ValueType]]
    }
    
    extension [Self <: Observer[?], ValueType](x: Self & Observer[ValueType]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setError(value: /* error */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: ValueType => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  /**
  @category Observable
  */
  type OnComplete = js.Function0[Unit]
  
  /**
  @category Observable
  */
  type OnError = js.Function1[/* error */ Any, Unit]
  
  /**
  @category Observable
  */
  type OnNext[ValueType] = js.Function1[/* value */ ValueType, Unit]
  
  trait Unsubscribable extends StObject {
    
    def unsubscribe(): Unit
  }
  object Unsubscribable {
    
    inline def apply(unsubscribe: () => Unit): Unsubscribable = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Unsubscribable]
    }
    
    extension [Self <: Unsubscribable](x: Self) {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  object global {
    
    // eslint-disable-next-line @typescript-eslint/consistent-type-definitions -- It has to be an `interface` so that it can be merged.
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      inline def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      extension [Self <: SymbolConstructor](x: Self) {
        
        inline def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
