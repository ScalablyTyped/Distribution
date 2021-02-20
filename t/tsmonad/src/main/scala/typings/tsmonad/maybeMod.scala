package typings.tsmonad

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Partial
import typings.tsmonad.monadMod.Eq
import typings.tsmonad.monadMod.Functor
import typings.tsmonad.monadMod.Monad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeMod {
  
  @js.native
  sealed trait MaybeType extends StObject
  @JSImport("tsmonad/lib/src/maybe", "MaybeType")
  @js.native
  object MaybeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MaybeType with Double] = js.native
    
    @js.native
    sealed trait Just extends MaybeType
    /* 1 */ val Just: typings.tsmonad.maybeMod.MaybeType.Just with Double = js.native
    
    @js.native
    sealed trait Nothing extends MaybeType
    /* 0 */ val Nothing: typings.tsmonad.maybeMod.MaybeType.Nothing with Double = js.native
  }
  
  @JSImport("tsmonad/lib/src/maybe", "Maybe")
  @js.native
  class Maybe_[T] protected ()
    extends Monad[T]
       with Functor[T]
       with Eq[Maybe_[T]] {
    def this(`type`: MaybeType) = this()
    def this(`type`: MaybeType, value: T) = this()
    
    def caseOf[U](patterns: MaybePatterns[T, U]): U = js.native
    
    def defaulting(defaultValue: T): Maybe_[T] = js.native
    
    def `do`(): Maybe_[T] = js.native
    def `do`(patterns: Partial[MaybePatterns[T, Unit]]): Maybe_[T] = js.native
    
    var `type`: js.Any = js.native
    
    var value: js.Any = js.native
    
    def valueOr[U /* <: T */](defaultValue: U): T | U = js.native
    
    def valueOrCompute[U /* <: T */](defaultValueFunction: js.Function0[U]): T | U = js.native
    
    def valueOrThrow(): T = js.native
    def valueOrThrow(error: Error): T = js.native
  }
  /* static members */
  object Maybe_ {
    
    @JSImport("tsmonad/lib/src/maybe", "Maybe.all")
    @js.native
    def all(t: StringDictionary[Maybe_[_]]): Maybe_[StringDictionary[_]] = js.native
    
    @JSImport("tsmonad/lib/src/maybe", "Maybe.isJust")
    @js.native
    def isJust[T](t: Maybe_[T]): Boolean = js.native
    
    @JSImport("tsmonad/lib/src/maybe", "Maybe.isNothing")
    @js.native
    def isNothing[T](t: Maybe_[T]): Boolean = js.native
    
    @JSImport("tsmonad/lib/src/maybe", "Maybe.just")
    @js.native
    def just[T](t: T): Maybe_[T] = js.native
    
    @JSImport("tsmonad/lib/src/maybe", "Maybe.maybe")
    @js.native
    def maybe[T](): Maybe_[T] = js.native
    @JSImport("tsmonad/lib/src/maybe", "Maybe.maybe")
    @js.native
    def maybe[T](t: T): Maybe_[T] = js.native
    
    @JSImport("tsmonad/lib/src/maybe", "Maybe.nothing")
    @js.native
    def nothing[T](): Maybe_[T] = js.native
    
    @JSImport("tsmonad/lib/src/maybe", "Maybe.sequence")
    @js.native
    def sequence[T](t: StringDictionary[Maybe_[T]]): Maybe_[StringDictionary[T]] = js.native
  }
  
  @JSImport("tsmonad/lib/src/maybe", "maybe")
  @js.native
  def maybe[T](t: T): Maybe_[T] = js.native
  
  @js.native
  trait MaybePatterns[T, U] extends StObject {
    
    def just(t: T): U = js.native
    
    def nothing(): U = js.native
  }
  object MaybePatterns {
    
    @scala.inline
    def apply[T, U](just: T => U, nothing: () => U): MaybePatterns[T, U] = {
      val __obj = js.Dynamic.literal(just = js.Any.fromFunction1(just), nothing = js.Any.fromFunction0(nothing))
      __obj.asInstanceOf[MaybePatterns[T, U]]
    }
    
    @scala.inline
    implicit class MaybePatternsMutableBuilder[Self <: MaybePatterns[_, _], T, U] (val x: Self with (MaybePatterns[T, U])) extends AnyVal {
      
      @scala.inline
      def setJust(value: T => U): Self = StObject.set(x, "just", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNothing(value: () => U): Self = StObject.set(x, "nothing", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Partial<tsmonad.tsmonad/lib/src/maybe.MaybePatterns<T, U>> */
  @js.native
  trait OptionalMaybePatterns[T, U] extends StObject {
    
    var just: js.UndefOr[js.Function1[/* t */ T, U]] = js.native
    
    var nothing: js.UndefOr[js.Function0[U]] = js.native
  }
  object OptionalMaybePatterns {
    
    @scala.inline
    def apply[T, U](): OptionalMaybePatterns[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalMaybePatterns[T, U]]
    }
    
    @scala.inline
    implicit class OptionalMaybePatternsMutableBuilder[Self <: OptionalMaybePatterns[_, _], T, U] (val x: Self with (OptionalMaybePatterns[T, U])) extends AnyVal {
      
      @scala.inline
      def setJust(value: /* t */ T => U): Self = StObject.set(x, "just", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJustUndefined: Self = StObject.set(x, "just", js.undefined)
      
      @scala.inline
      def setNothing(value: () => U): Self = StObject.set(x, "nothing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNothingUndefined: Self = StObject.set(x, "nothing", js.undefined)
    }
  }
}
