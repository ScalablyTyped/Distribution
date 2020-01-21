package typings.tsmonad.maybeMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Partial
import typings.tsmonad.monadMod.Eq_
import typings.tsmonad.monadMod.Functor
import typings.tsmonad.monadMod.Monad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad/lib/src/maybe", "Maybe")
@js.native
class Maybe_[T] protected ()
  extends Monad[T]
     with Functor[T]
     with Eq_[Maybe_[T]] {
  def this(`type`: MaybeType) = this()
  def this(`type`: MaybeType, value: T) = this()
  var `type`: js.Any = js.native
  var value: js.Any = js.native
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
  /* CompleteClass */
  override def unit[U](t: U): Monad[U] = js.native
  def valueOr[U /* <: T */](defaultValue: U): T | U = js.native
  def valueOrCompute[U /* <: T */](defaultValueFunction: js.Function0[U]): T | U = js.native
  def valueOrThrow(): T = js.native
  def valueOrThrow(error: Error): T = js.native
}

/* static members */
@JSImport("tsmonad/lib/src/maybe", "Maybe")
@js.native
object Maybe_ extends js.Object {
  def all(t: StringDictionary[Maybe_[_]]): Maybe_[StringDictionary[_]] = js.native
  def isJust[T](t: Maybe_[T]): Boolean = js.native
  def isNothing[T](t: Maybe_[T]): Boolean = js.native
  def just[T](t: T): Maybe_[T] = js.native
  def maybe[T](): Maybe_[T] = js.native
  def maybe[T](t: T): Maybe_[T] = js.native
  def nothing[T](): Maybe_[T] = js.native
  def sequence[T](t: StringDictionary[Maybe_[T]]): Maybe_[StringDictionary[T]] = js.native
}

