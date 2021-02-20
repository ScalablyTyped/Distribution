package typings.tsmonad

import typings.std.Partial
import typings.tsmonad.monadMod.Eq
import typings.tsmonad.monadMod.Functor
import typings.tsmonad.monadMod.Monad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherMod {
  
  @js.native
  sealed trait EitherType extends StObject
  @JSImport("tsmonad/lib/src/either", "EitherType")
  @js.native
  object EitherType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EitherType with Double] = js.native
    
    @js.native
    sealed trait Left extends EitherType
    /* 0 */ val Left: typings.tsmonad.eitherMod.EitherType.Left with Double = js.native
    
    @js.native
    sealed trait Right extends EitherType
    /* 1 */ val Right: typings.tsmonad.eitherMod.EitherType.Right with Double = js.native
  }
  
  @JSImport("tsmonad/lib/src/either", "Either")
  @js.native
  class Either_[L, R] protected ()
    extends Monad[R]
       with Functor[R]
       with Eq[Either_[L, R]] {
    def this(`type`: EitherType) = this()
    def this(`type`: EitherType, l: L) = this()
    def this(`type`: EitherType, l: L, r: R) = this()
    def this(`type`: EitherType, l: js.UndefOr[scala.Nothing], r: R) = this()
    
    def caseOf[T](pattern: EitherPatterns[L, R, T]): T = js.native
    
    def `do`(): Either_[L, R] = js.native
    def `do`(patterns: Partial[EitherPatterns[L, R, Unit]]): Either_[L, R] = js.native
    
    var l: js.Any = js.native
    
    var r: js.Any = js.native
    
    var `type`: js.Any = js.native
  }
  /* static members */
  object Either_ {
    
    @JSImport("tsmonad/lib/src/either", "Either.left")
    @js.native
    def left[L, R](l: L): Either_[L, R] = js.native
    
    @JSImport("tsmonad/lib/src/either", "Either.right")
    @js.native
    def right[L, R](r: R): Either_[L, R] = js.native
  }
  
  @JSImport("tsmonad/lib/src/either", "either")
  @js.native
  def either[L, R](): Either_[L, R] = js.native
  @JSImport("tsmonad/lib/src/either", "either")
  @js.native
  def either[L, R](l: L): Either_[L, R] = js.native
  @JSImport("tsmonad/lib/src/either", "either")
  @js.native
  def either[L, R](l: L, r: R): Either_[L, R] = js.native
  @JSImport("tsmonad/lib/src/either", "either")
  @js.native
  def either[L, R](l: js.UndefOr[scala.Nothing], r: R): Either_[L, R] = js.native
  
  @js.native
  trait EitherPatterns[L, R, T] extends StObject {
    
    def left(l: L): T = js.native
    
    def right(r: R): T = js.native
  }
  object EitherPatterns {
    
    @scala.inline
    def apply[L, R, T](left: L => T, right: R => T): EitherPatterns[L, R, T] = {
      val __obj = js.Dynamic.literal(left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right))
      __obj.asInstanceOf[EitherPatterns[L, R, T]]
    }
    
    @scala.inline
    implicit class EitherPatternsMutableBuilder[Self <: EitherPatterns[_, _, _], L, R, T] (val x: Self with (EitherPatterns[L, R, T])) extends AnyVal {
      
      @scala.inline
      def setLeft(value: L => T): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRight(value: R => T): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<tsmonad.tsmonad/lib/src/either.EitherPatterns<L, R, T>> */
  @js.native
  trait OptionalEitherPatterns[L, R, T] extends StObject {
    
    var left: js.UndefOr[js.Function1[/* l */ L, T]] = js.native
    
    var right: js.UndefOr[js.Function1[/* r */ R, T]] = js.native
  }
  object OptionalEitherPatterns {
    
    @scala.inline
    def apply[L, R, T](): OptionalEitherPatterns[L, R, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalEitherPatterns[L, R, T]]
    }
    
    @scala.inline
    implicit class OptionalEitherPatternsMutableBuilder[Self <: OptionalEitherPatterns[_, _, _], L, R, T] (val x: Self with (OptionalEitherPatterns[L, R, T])) extends AnyVal {
      
      @scala.inline
      def setLeft(value: /* l */ L => T): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: /* r */ R => T): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
}
