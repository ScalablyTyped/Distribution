package typings.tsmonad

import org.scalablytyped.runtime.StringDictionary
import typings.tsmonad.eitherMod.EitherType
import typings.tsmonad.maybeMod.MaybeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tsmonad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tsmonad", "EitherType")
  @js.native
  object EitherType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsmonad.eitherMod.EitherType & Double] = js.native
    
    /* 0 */ val Left: typings.tsmonad.eitherMod.EitherType.Left & Double = js.native
    
    /* 1 */ val Right: typings.tsmonad.eitherMod.EitherType.Right & Double = js.native
  }
  
  @JSImport("tsmonad", "Either")
  @js.native
  class Either_[L, R] protected ()
    extends typings.tsmonad.eitherMod.Either_[L, R] {
    def this(`type`: EitherType) = this()
    def this(`type`: EitherType, l: L) = this()
    def this(`type`: EitherType, l: L, r: R) = this()
    def this(`type`: EitherType, l: Unit, r: R) = this()
  }
  /* static members */
  object Either_ {
    
    @JSImport("tsmonad", "Either")
    @js.native
    val ^ : js.Any = js.native
    
    inline def left[L, R](l: L): typings.tsmonad.eitherMod.Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(l.asInstanceOf[js.Any]).asInstanceOf[typings.tsmonad.eitherMod.Either_[L, R]]
    
    inline def right[L, R](r: R): typings.tsmonad.eitherMod.Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(r.asInstanceOf[js.Any]).asInstanceOf[typings.tsmonad.eitherMod.Either_[L, R]]
  }
  
  @JSImport("tsmonad", "MaybeType")
  @js.native
  object MaybeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsmonad.maybeMod.MaybeType & Double] = js.native
    
    /* 1 */ val Just: typings.tsmonad.maybeMod.MaybeType.Just & Double = js.native
    
    /* 0 */ val Nothing: typings.tsmonad.maybeMod.MaybeType.Nothing & Double = js.native
  }
  
  @JSImport("tsmonad", "Maybe")
  @js.native
  class Maybe_[T] protected ()
    extends typings.tsmonad.maybeMod.Maybe_[T] {
    def this(`type`: MaybeType) = this()
    def this(`type`: MaybeType, value: T) = this()
  }
  /* static members */
  object Maybe_ {
    
    @JSImport("tsmonad", "Maybe")
    @js.native
    val ^ : js.Any = js.native
    
    inline def all(t: StringDictionary[typings.tsmonad.maybeMod.Maybe_[js.Any]]): typings.tsmonad.maybeMod.Maybe_[StringDictionary[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(t.asInstanceOf[js.Any]).asInstanceOf[typings.tsmonad.maybeMod.Maybe_[StringDictionary[js.Any]]]
    
    inline def isJust[T](t: typings.tsmonad.maybeMod.Maybe_[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJust")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNothing[T](t: typings.tsmonad.maybeMod.Maybe_[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNothing")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def just[T](t: T): typings.tsmonad.maybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("just")(t.asInstanceOf[js.Any]).asInstanceOf[typings.tsmonad.maybeMod.Maybe_[T]]
    
    inline def maybe[T](): typings.tsmonad.maybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")().asInstanceOf[typings.tsmonad.maybeMod.Maybe_[T]]
    inline def maybe[T](t: T): typings.tsmonad.maybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(t.asInstanceOf[js.Any]).asInstanceOf[typings.tsmonad.maybeMod.Maybe_[T]]
    
    inline def nothing[T](): typings.tsmonad.maybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nothing")().asInstanceOf[typings.tsmonad.maybeMod.Maybe_[T]]
    
    inline def sequence[T](t: StringDictionary[typings.tsmonad.maybeMod.Maybe_[T]]): typings.tsmonad.maybeMod.Maybe_[StringDictionary[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(t.asInstanceOf[js.Any]).asInstanceOf[typings.tsmonad.maybeMod.Maybe_[StringDictionary[T]]]
  }
  
  @JSImport("tsmonad", "Writer")
  @js.native
  class Writer_[S, T] protected ()
    extends typings.tsmonad.writerMod.Writer_[S, T] {
    def this(story: js.Array[S], value: T) = this()
  }
  /* static members */
  object Writer_ {
    
    @JSImport("tsmonad", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def tell[S](s: S): typings.tsmonad.writerMod.Writer_[S, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("tell")(s.asInstanceOf[js.Any]).asInstanceOf[typings.tsmonad.writerMod.Writer_[S, Double]]
    
    inline def writer[S, T](story: js.Array[S], value: T): typings.tsmonad.writerMod.Writer_[S, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writer")(story.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.tsmonad.writerMod.Writer_[S, T]]
  }
  
  inline def either[L, R](): typings.tsmonad.eitherMod.Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("either")().asInstanceOf[typings.tsmonad.eitherMod.Either_[L, R]]
  inline def either[L, R](l: L): typings.tsmonad.eitherMod.Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("either")(l.asInstanceOf[js.Any]).asInstanceOf[typings.tsmonad.eitherMod.Either_[L, R]]
  inline def either[L, R](l: L, r: R): typings.tsmonad.eitherMod.Either_[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[typings.tsmonad.eitherMod.Either_[L, R]]
  inline def either[L, R](l: Unit, r: R): typings.tsmonad.eitherMod.Either_[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[typings.tsmonad.eitherMod.Either_[L, R]]
  
  inline def eq_(a: js.Any, b: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def maybe[T](t: T): typings.tsmonad.maybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(t.asInstanceOf[js.Any]).asInstanceOf[typings.tsmonad.maybeMod.Maybe_[T]]
  
  inline def writer[S, T](story: js.Array[S], value: T): typings.tsmonad.writerMod.Writer_[S, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writer")(story.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.tsmonad.writerMod.Writer_[S, T]]
}
