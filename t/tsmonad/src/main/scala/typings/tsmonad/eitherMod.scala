package typings.tsmonad

import typings.std.Partial
import typings.tsmonad.monadMod.Eq
import typings.tsmonad.monadMod.Functor
import typings.tsmonad.monadMod.Monad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherMod {
  
  @JSImport("tsmonad/lib/src/either", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait EitherType extends StObject
  @JSImport("tsmonad/lib/src/either", "EitherType")
  @js.native
  object EitherType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EitherType & Double] = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with EitherType
    /* 0 */ val Left: typings.tsmonad.eitherMod.EitherType.Left & Double = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with EitherType
    /* 1 */ val Right: typings.tsmonad.eitherMod.EitherType.Right & Double = js.native
  }
  
  @JSImport("tsmonad/lib/src/either", "Either")
  @js.native
  class Either_[L, R] protected ()
    extends StObject
       with Monad[R]
       with Functor[R]
       with Eq[Either_[L, R]] {
    def this(`type`: EitherType) = this()
    def this(`type`: EitherType, l: L) = this()
    def this(`type`: EitherType, l: L, r: R) = this()
    def this(`type`: EitherType, l: Unit, r: R) = this()
    
    /* CompleteClass */
    override def bind[U](f: js.Function1[R, Monad[U]]): Monad[U] = js.native
    
    def caseOf[T](pattern: EitherPatterns[L, R, T]): T = js.native
    
    /* CompleteClass */
    override def chain[U](f: js.Function1[R, Monad[U]]): Monad[U] = js.native
    
    def `do`(): Either_[L, R] = js.native
    def `do`(patterns: Partial[EitherPatterns[L, R, Unit]]): Either_[L, R] = js.native
    
    /* CompleteClass */
    override def fmap[U](f: js.Function1[R, U]): Functor[U] = js.native
    
    var l: js.Any = js.native
    
    /* CompleteClass */
    override def lift[U](f: js.Function1[R, U]): Functor[U] = js.native
    
    /* CompleteClass */
    override def map[U](f: js.Function1[R, U]): Functor[U] = js.native
    
    /* CompleteClass */
    override def of[U](t: U): Monad[U] = js.native
    
    var r: js.Any = js.native
    
    var `type`: js.Any = js.native
    
    /* CompleteClass */
    override def unit[U](t: U): Monad[U] = js.native
  }
  /* static members */
  object Either_ {
    
    @JSImport("tsmonad/lib/src/either", "Either")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def left[L, R](l: L): Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(l.asInstanceOf[js.Any]).asInstanceOf[Either_[L, R]]
    
    @scala.inline
    def right[L, R](r: R): Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(r.asInstanceOf[js.Any]).asInstanceOf[Either_[L, R]]
  }
  
  @scala.inline
  def either[L, R](): Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("either")().asInstanceOf[Either_[L, R]]
  @scala.inline
  def either[L, R](l: L): Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("either")(l.asInstanceOf[js.Any]).asInstanceOf[Either_[L, R]]
  @scala.inline
  def either[L, R](l: L, r: R): Either_[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Either_[L, R]]
  @scala.inline
  def either[L, R](l: Unit, r: R): Either_[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Either_[L, R]]
  
  trait EitherPatterns[L, R, T] extends StObject {
    
    def left(l: L): T
    
    def right(r: R): T
  }
  object EitherPatterns {
    
    @scala.inline
    def apply[L, R, T](left: L => T, right: R => T): EitherPatterns[L, R, T] = {
      val __obj = js.Dynamic.literal(left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right))
      __obj.asInstanceOf[EitherPatterns[L, R, T]]
    }
    
    @scala.inline
    implicit class EitherPatternsMutableBuilder[Self <: EitherPatterns[?, ?, ?], L, R, T] (val x: Self & (EitherPatterns[L, R, T])) extends AnyVal {
      
      @scala.inline
      def setLeft(value: L => T): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRight(value: R => T): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<tsmonad.tsmonad/lib/src/either.EitherPatterns<L, R, T>> */
  trait OptionalEitherPatterns[L, R, T] extends StObject {
    
    var left: js.UndefOr[js.Function1[/* l */ L, T]] = js.undefined
    
    var right: js.UndefOr[js.Function1[/* r */ R, T]] = js.undefined
  }
  object OptionalEitherPatterns {
    
    @scala.inline
    def apply[L, R, T](): OptionalEitherPatterns[L, R, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalEitherPatterns[L, R, T]]
    }
    
    @scala.inline
    implicit class OptionalEitherPatternsMutableBuilder[Self <: OptionalEitherPatterns[?, ?, ?], L, R, T] (val x: Self & (OptionalEitherPatterns[L, R, T])) extends AnyVal {
      
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
