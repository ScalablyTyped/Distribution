package typings.tsmonad

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.tsmonad.monadMod.Eq
import typings.tsmonad.monadMod.Functor
import typings.tsmonad.monadMod.Monad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeMod {
  
  @JSImport("tsmonad/lib/src/maybe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait MaybeType extends StObject
  @JSImport("tsmonad/lib/src/maybe", "MaybeType")
  @js.native
  object MaybeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MaybeType & Double] = js.native
    
    @js.native
    sealed trait Just
      extends StObject
         with MaybeType
    /* 1 */ val Just: typings.tsmonad.maybeMod.MaybeType.Just & Double = js.native
    
    @js.native
    sealed trait Nothing
      extends StObject
         with MaybeType
    /* 0 */ val Nothing: typings.tsmonad.maybeMod.MaybeType.Nothing & Double = js.native
  }
  
  @JSImport("tsmonad/lib/src/maybe", "Maybe")
  @js.native
  open class Maybe_[T] protected ()
    extends StObject
       with Monad[T]
       with Functor[T]
       with Eq[Maybe_[T]] {
    def this(`type`: MaybeType) = this()
    def this(`type`: MaybeType, value: T) = this()
    
    /* CompleteClass */
    override def bind[U](f: js.Function1[T, Monad[U]]): Monad[U] = js.native
    
    def caseOf[U](patterns: MaybePatterns[T, U]): U = js.native
    
    /* CompleteClass */
    override def chain[U](f: js.Function1[T, Monad[U]]): Monad[U] = js.native
    
    def defaulting(defaultValue: T): Maybe_[T] = js.native
    
    def `do`(): Maybe_[T] = js.native
    def `do`(patterns: Partial[MaybePatterns[T, Unit]]): Maybe_[T] = js.native
    
    /* CompleteClass */
    override def fmap[U](f: js.Function1[T, U]): Functor[U] = js.native
    
    /* CompleteClass */
    override def lift[U](f: js.Function1[T, U]): Functor[U] = js.native
    
    /* CompleteClass */
    override def map[U](f: js.Function1[T, U]): Functor[U] = js.native
    
    /* CompleteClass */
    override def of[U](t: U): Monad[U] = js.native
    
    /* private */ var `type`: Any = js.native
    
    /* CompleteClass */
    override def unit[U](t: U): Monad[U] = js.native
    
    /* private */ var value: Any = js.native
    
    def valueOr[U /* <: T */](defaultValue: U): T | U = js.native
    
    def valueOrCompute[U /* <: T */](defaultValueFunction: js.Function0[U]): T | U = js.native
    
    def valueOrThrow(): T = js.native
    def valueOrThrow(error: js.Error): T = js.native
  }
  /* static members */
  object Maybe_ {
    
    @JSImport("tsmonad/lib/src/maybe", "Maybe")
    @js.native
    val ^ : js.Any = js.native
    
    inline def all(t: StringDictionary[Maybe_[Any]]): Maybe_[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(t.asInstanceOf[js.Any]).asInstanceOf[Maybe_[StringDictionary[Any]]]
    
    inline def isJust[T](t: Maybe_[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJust")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNothing[T](t: Maybe_[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNothing")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def just[T](t: T): Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("just")(t.asInstanceOf[js.Any]).asInstanceOf[Maybe_[T]]
    
    inline def maybe[T](): Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")().asInstanceOf[Maybe_[T]]
    inline def maybe[T](t: T): Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(t.asInstanceOf[js.Any]).asInstanceOf[Maybe_[T]]
    
    inline def nothing[T](): Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nothing")().asInstanceOf[Maybe_[T]]
    
    inline def sequence[T](t: StringDictionary[Maybe_[T]]): Maybe_[StringDictionary[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(t.asInstanceOf[js.Any]).asInstanceOf[Maybe_[StringDictionary[T]]]
  }
  
  inline def maybe[T](t: T): Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(t.asInstanceOf[js.Any]).asInstanceOf[Maybe_[T]]
  
  trait MaybePatterns[T, U] extends StObject {
    
    def just(t: T): U
    
    def nothing(): U
  }
  object MaybePatterns {
    
    inline def apply[T, U](just: T => U, nothing: () => U): MaybePatterns[T, U] = {
      val __obj = js.Dynamic.literal(just = js.Any.fromFunction1(just), nothing = js.Any.fromFunction0(nothing))
      __obj.asInstanceOf[MaybePatterns[T, U]]
    }
    
    extension [Self <: MaybePatterns[?, ?], T, U](x: Self & (MaybePatterns[T, U])) {
      
      inline def setJust(value: T => U): Self = StObject.set(x, "just", js.Any.fromFunction1(value))
      
      inline def setNothing(value: () => U): Self = StObject.set(x, "nothing", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Partial<tsmonad.tsmonad/lib/src/maybe.MaybePatterns<T, U>> */
  trait OptionalMaybePatterns[T, U] extends StObject {
    
    var just: js.UndefOr[js.Function1[/* t */ T, U]] = js.undefined
    
    var nothing: js.UndefOr[js.Function0[U]] = js.undefined
  }
  object OptionalMaybePatterns {
    
    inline def apply[T, U](): OptionalMaybePatterns[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalMaybePatterns[T, U]]
    }
    
    extension [Self <: OptionalMaybePatterns[?, ?], T, U](x: Self & (OptionalMaybePatterns[T, U])) {
      
      inline def setJust(value: /* t */ T => U): Self = StObject.set(x, "just", js.Any.fromFunction1(value))
      
      inline def setJustUndefined: Self = StObject.set(x, "just", js.undefined)
      
      inline def setNothing(value: () => U): Self = StObject.set(x, "nothing", js.Any.fromFunction0(value))
      
      inline def setNothingUndefined: Self = StObject.set(x, "nothing", js.undefined)
    }
  }
}
