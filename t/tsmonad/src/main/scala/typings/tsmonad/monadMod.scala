package typings.tsmonad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monadMod {
  
  @JSImport("tsmonad/lib/src/monad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def eq_(a: js.Any, b: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait Eq[T] extends StObject
  
  trait Functor[T] extends StObject {
    
    def fmap[U](f: js.Function1[/* t */ T, U]): Functor[U]
    
    def lift[U](f: js.Function1[/* t */ T, U]): Functor[U]
    
    def map[U](f: js.Function1[/* t */ T, U]): Functor[U]
  }
  object Functor {
    
    @scala.inline
    def apply[T](
      fmap: js.Function1[/* t */ T, js.Any] => Functor[js.Any],
      lift: js.Function1[/* t */ T, js.Any] => Functor[js.Any],
      map: js.Function1[/* t */ T, js.Any] => Functor[js.Any]
    ): Functor[T] = {
      val __obj = js.Dynamic.literal(fmap = js.Any.fromFunction1(fmap), lift = js.Any.fromFunction1(lift), map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[Functor[T]]
    }
    
    @scala.inline
    implicit class FunctorMutableBuilder[Self <: Functor[?], T] (val x: Self & Functor[T]) extends AnyVal {
      
      @scala.inline
      def setFmap(value: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Self = StObject.set(x, "fmap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLift(value: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Self = StObject.set(x, "lift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMap(value: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    }
  }
  
  trait Monad[T] extends StObject {
    
    def bind[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U]
    
    def chain[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U]
    
    def of[U](t: U): Monad[U]
    
    def unit[U](t: U): Monad[U]
  }
  object Monad {
    
    @scala.inline
    def apply[T](
      bind: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any],
      chain: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any],
      of: js.Any => Monad[js.Any],
      unit: js.Any => Monad[js.Any]
    ): Monad[T] = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), chain = js.Any.fromFunction1(chain), of = js.Any.fromFunction1(of), unit = js.Any.fromFunction1(unit))
      __obj.asInstanceOf[Monad[T]]
    }
    
    @scala.inline
    implicit class MonadMutableBuilder[Self <: Monad[?], T] (val x: Self & Monad[T]) extends AnyVal {
      
      @scala.inline
      def setBind(value: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any]): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChain(value: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any]): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOf(value: js.Any => Monad[js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnit(value: js.Any => Monad[js.Any]): Self = StObject.set(x, "unit", js.Any.fromFunction1(value))
    }
  }
}
