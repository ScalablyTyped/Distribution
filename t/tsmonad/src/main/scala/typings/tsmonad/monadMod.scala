package typings.tsmonad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monadMod {
  
  @JSImport("tsmonad/lib/src/monad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eq_(a: Any, b: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Eq[T] extends StObject
  
  trait Functor[T] extends StObject {
    
    def fmap[U](f: js.Function1[/* t */ T, U]): Functor[U]
    
    def lift[U](f: js.Function1[/* t */ T, U]): Functor[U]
    
    def map[U](f: js.Function1[/* t */ T, U]): Functor[U]
  }
  object Functor {
    
    inline def apply[T](
      fmap: js.Function1[/* t */ T, Any] => Functor[Any],
      lift: js.Function1[/* t */ T, Any] => Functor[Any],
      map: js.Function1[/* t */ T, Any] => Functor[Any]
    ): Functor[T] = {
      val __obj = js.Dynamic.literal(fmap = js.Any.fromFunction1(fmap), lift = js.Any.fromFunction1(lift), map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[Functor[T]]
    }
    
    extension [Self <: Functor[?], T](x: Self & Functor[T]) {
      
      inline def setFmap(value: js.Function1[/* t */ T, Any] => Functor[Any]): Self = StObject.set(x, "fmap", js.Any.fromFunction1(value))
      
      inline def setLift(value: js.Function1[/* t */ T, Any] => Functor[Any]): Self = StObject.set(x, "lift", js.Any.fromFunction1(value))
      
      inline def setMap(value: js.Function1[/* t */ T, Any] => Functor[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    }
  }
  
  trait Monad[T] extends StObject {
    
    def bind[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U]
    
    def chain[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U]
    
    def of[U](t: U): Monad[U]
    
    def unit[U](t: U): Monad[U]
  }
  object Monad {
    
    inline def apply[T](
      bind: js.Function1[/* t */ T, Monad[Any]] => Monad[Any],
      chain: js.Function1[/* t */ T, Monad[Any]] => Monad[Any],
      of: Any => Monad[Any],
      unit: Any => Monad[Any]
    ): Monad[T] = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), chain = js.Any.fromFunction1(chain), of = js.Any.fromFunction1(of), unit = js.Any.fromFunction1(unit))
      __obj.asInstanceOf[Monad[T]]
    }
    
    extension [Self <: Monad[?], T](x: Self & Monad[T]) {
      
      inline def setBind(value: js.Function1[/* t */ T, Monad[Any]] => Monad[Any]): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
      
      inline def setChain(value: js.Function1[/* t */ T, Monad[Any]] => Monad[Any]): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setOf(value: Any => Monad[Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      inline def setUnit(value: Any => Monad[Any]): Self = StObject.set(x, "unit", js.Any.fromFunction1(value))
    }
  }
}
