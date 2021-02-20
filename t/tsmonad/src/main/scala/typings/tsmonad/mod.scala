package typings.tsmonad

import org.scalablytyped.runtime.StringDictionary
import typings.tsmonad.eitherMod.EitherType
import typings.tsmonad.maybeMod.MaybeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tsmonad", "EitherType")
  @js.native
  object EitherType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsmonad.eitherMod.EitherType with Double] = js.native
    
    /* 0 */ val Left: typings.tsmonad.eitherMod.EitherType.Left with Double = js.native
    
    /* 1 */ val Right: typings.tsmonad.eitherMod.EitherType.Right with Double = js.native
  }
  
  @JSImport("tsmonad", "Either")
  @js.native
  class Either_[L, R] protected ()
    extends typings.tsmonad.eitherMod.Either_[L, R] {
    def this(`type`: EitherType) = this()
    def this(`type`: EitherType, l: L) = this()
    def this(`type`: EitherType, l: L, r: R) = this()
    def this(`type`: EitherType, l: js.UndefOr[scala.Nothing], r: R) = this()
  }
  /* static members */
  object Either_ {
    
    @JSImport("tsmonad", "Either.left")
    @js.native
    def left[L, R](l: L): typings.tsmonad.eitherMod.Either_[L, R] = js.native
    
    @JSImport("tsmonad", "Either.right")
    @js.native
    def right[L, R](r: R): typings.tsmonad.eitherMod.Either_[L, R] = js.native
  }
  
  @JSImport("tsmonad", "MaybeType")
  @js.native
  object MaybeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsmonad.maybeMod.MaybeType with Double] = js.native
    
    /* 1 */ val Just: typings.tsmonad.maybeMod.MaybeType.Just with Double = js.native
    
    /* 0 */ val Nothing: typings.tsmonad.maybeMod.MaybeType.Nothing with Double = js.native
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
    
    @JSImport("tsmonad", "Maybe.all")
    @js.native
    def all(t: StringDictionary[typings.tsmonad.maybeMod.Maybe_[_]]): typings.tsmonad.maybeMod.Maybe_[StringDictionary[_]] = js.native
    
    @JSImport("tsmonad", "Maybe.isJust")
    @js.native
    def isJust[T](t: typings.tsmonad.maybeMod.Maybe_[T]): Boolean = js.native
    
    @JSImport("tsmonad", "Maybe.isNothing")
    @js.native
    def isNothing[T](t: typings.tsmonad.maybeMod.Maybe_[T]): Boolean = js.native
    
    @JSImport("tsmonad", "Maybe.just")
    @js.native
    def just[T](t: T): typings.tsmonad.maybeMod.Maybe_[T] = js.native
    
    @JSImport("tsmonad", "Maybe.maybe")
    @js.native
    def maybe[T](): typings.tsmonad.maybeMod.Maybe_[T] = js.native
    @JSImport("tsmonad", "Maybe.maybe")
    @js.native
    def maybe[T](t: T): typings.tsmonad.maybeMod.Maybe_[T] = js.native
    
    @JSImport("tsmonad", "Maybe.nothing")
    @js.native
    def nothing[T](): typings.tsmonad.maybeMod.Maybe_[T] = js.native
    
    @JSImport("tsmonad", "Maybe.sequence")
    @js.native
    def sequence[T](t: StringDictionary[typings.tsmonad.maybeMod.Maybe_[T]]): typings.tsmonad.maybeMod.Maybe_[StringDictionary[T]] = js.native
  }
  
  @JSImport("tsmonad", "Writer")
  @js.native
  class Writer_[S, T] protected ()
    extends typings.tsmonad.writerMod.Writer_[S, T] {
    def this(story: js.Array[S], value: T) = this()
  }
  /* static members */
  object Writer_ {
    
    @JSImport("tsmonad", "Writer.tell")
    @js.native
    def tell[S](s: S): typings.tsmonad.writerMod.Writer_[S, Double] = js.native
    
    @JSImport("tsmonad", "Writer.writer")
    @js.native
    def writer[S, T](story: js.Array[S], value: T): typings.tsmonad.writerMod.Writer_[S, T] = js.native
  }
  
  @JSImport("tsmonad", "either")
  @js.native
  def either[L, R](): typings.tsmonad.eitherMod.Either_[L, R] = js.native
  @JSImport("tsmonad", "either")
  @js.native
  def either[L, R](l: L): typings.tsmonad.eitherMod.Either_[L, R] = js.native
  @JSImport("tsmonad", "either")
  @js.native
  def either[L, R](l: L, r: R): typings.tsmonad.eitherMod.Either_[L, R] = js.native
  @JSImport("tsmonad", "either")
  @js.native
  def either[L, R](l: js.UndefOr[scala.Nothing], r: R): typings.tsmonad.eitherMod.Either_[L, R] = js.native
  
  @JSImport("tsmonad", "eq")
  @js.native
  def eq_(a: js.Any, b: js.Any): js.Any = js.native
  
  @JSImport("tsmonad", "maybe")
  @js.native
  def maybe[T](t: T): typings.tsmonad.maybeMod.Maybe_[T] = js.native
  
  @JSImport("tsmonad", "writer")
  @js.native
  def writer[S, T](story: js.Array[S], value: T): typings.tsmonad.writerMod.Writer_[S, T] = js.native
}
