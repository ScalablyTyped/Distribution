package typings.wonka

import typings.wonka.wonkaNumbers.`0`
import typings.wonka.wonkaNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Observer[T] extends StObject {
    
    def complete(): Unit
    
    def next(value: T): Unit
  }
  object Observer {
    
    inline def apply[T](complete: () => Unit, next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    extension [Self <: Observer[?], T](x: Self & Observer[T]) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  type Operator[In, Out] = js.Function1[/* a */ Source[In], Source[Out]]
  
  type Push[T] = Tag[`1`] & js.Array[T]
  
  type Signal[T] = Start[T] | Push[T] | `0`
  
  /* Rewritten from type alias, can be one of: 
    - typings.wonka.wonkaNumbers.`0`
    - typings.wonka.wonkaNumbers.`1`
  */
  trait SignalKind extends StObject
  object SignalKind {
    
    inline def End: `0` = 0.asInstanceOf[`0`]
    
    inline def Push: `1` = 1.asInstanceOf[`1`]
    
    inline def Start: `0` = 0.asInstanceOf[`0`]
  }
  
  type Sink[T] = js.Function1[/* signal */ Signal[T], Unit]
  
  type Source[T] = js.Function1[/* sink */ Sink[T], Unit]
  
  type Start[_T] = Tag[`0`] & js.Array[TalkbackFn]
  
  trait Subject[T]
    extends StObject
       with Observer[T] {
    
    def source(sink: Sink[T]): Unit
    @JSName("source")
    var source_Original: Source[T]
  }
  object Subject {
    
    inline def apply[T](complete: () => Unit, next: T => Unit, source: /* sink */ Sink[T] => Unit): Subject[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next), source = js.Any.fromFunction1(source))
      __obj.asInstanceOf[Subject[T]]
    }
    
    extension [Self <: Subject[?], T](x: Self & Subject[T]) {
      
      inline def setSource(value: /* sink */ Sink[T] => Unit): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
    }
  }
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  trait Tag[T] extends StObject {
    
    var tag: T
  }
  object Tag {
    
    inline def apply[T](tag: T): Tag[T] = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag[T]]
    }
    
    extension [Self <: Tag[?], T](x: Self & Tag[T]) {
      
      inline def setTag(value: T): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  type TalkbackFn = js.Function1[/* signal */ TalkbackKind, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wonka.wonkaNumbers.`0`
    - typings.wonka.wonkaNumbers.`1`
  */
  trait TalkbackKind extends StObject
  object TalkbackKind {
    
    inline def Close: `1` = 1.asInstanceOf[`1`]
    
    inline def Pull: `0` = 0.asInstanceOf[`0`]
  }
  
  type TeardownFn = js.Function0[Unit]
  
  type TypeOfSource[T] = Any
}
