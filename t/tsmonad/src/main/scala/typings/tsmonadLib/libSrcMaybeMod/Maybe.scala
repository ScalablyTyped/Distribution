package typings
package tsmonadLib.libSrcMaybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad/lib/src/maybe", "Maybe")
@js.native
class Maybe[T] protected ()
  extends tsmonadLib.libSrcMonadMod.Monad[T]
     with tsmonadLib.libSrcMonadMod.Functor[T]
     with tsmonadLib.libSrcMonadMod.Eq[Maybe[T]] {
  def this(`type`: MaybeType) = this()
  def this(`type`: MaybeType, value: T) = this()
  var `type`: js.Any = js.native
  var value: js.Any = js.native
  /* CompleteClass */
  override def bind[U](f: js.Function1[T, tsmonadLib.libSrcMonadMod.Monad[U]]): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  def caseOf[U](patterns: MaybePatterns[T, U]): U = js.native
  /* CompleteClass */
  override def chain[U](f: js.Function1[T, tsmonadLib.libSrcMonadMod.Monad[U]]): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  def defaulting(defaultValue: T): Maybe[T] = js.native
  def `do`(): Maybe[T] = js.native
  def `do`(patterns: stdLib.Partial[MaybePatterns[T, scala.Unit]]): Maybe[T] = js.native
  /* CompleteClass */
  override def fmap[U](f: js.Function1[T, U]): tsmonadLib.libSrcMonadMod.Functor[U] = js.native
  /* CompleteClass */
  override def lift[U](f: js.Function1[T, U]): tsmonadLib.libSrcMonadMod.Functor[U] = js.native
  /* CompleteClass */
  override def map[U](f: js.Function1[T, U]): tsmonadLib.libSrcMonadMod.Functor[U] = js.native
  /* CompleteClass */
  override def of[U](t: U): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  /* CompleteClass */
  override def unit[U](t: U): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  def valueOr[U /* <: T */](defaultValue: U): T | U = js.native
  def valueOrCompute[U /* <: T */](defaultValueFunction: js.Function0[U]): T | U = js.native
  def valueOrThrow(): T = js.native
  def valueOrThrow(error: stdLib.Error): T = js.native
}

@JSImport("tsmonad/lib/src/maybe", "Maybe")
@js.native
object Maybe extends js.Object {
  def all(t: ScalablyTyped.runtime.StringDictionary[tsmonadLib.libSrcMaybeMod.Maybe[_]]): tsmonadLib.libSrcMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def isJust[T](t: tsmonadLib.libSrcMaybeMod.Maybe[T]): scala.Boolean = js.native
  def isNothing[T](t: tsmonadLib.libSrcMaybeMod.Maybe[T]): scala.Boolean = js.native
  def just[T](t: T): tsmonadLib.libSrcMaybeMod.Maybe[T] = js.native
  def maybe[T](): tsmonadLib.libSrcMaybeMod.Maybe[T] = js.native
  def maybe[T](t: T): tsmonadLib.libSrcMaybeMod.Maybe[T] = js.native
  def nothing[T](): tsmonadLib.libSrcMaybeMod.Maybe[T] = js.native
  def sequence[T](t: ScalablyTyped.runtime.StringDictionary[tsmonadLib.libSrcMaybeMod.Maybe[T]]): tsmonadLib.libSrcMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[T]] = js.native
}

