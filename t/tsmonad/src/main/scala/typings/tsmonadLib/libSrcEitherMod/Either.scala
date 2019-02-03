package typings
package tsmonadLib.libSrcEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad/lib/src/either", "Either")
@js.native
class Either[L, R] protected ()
  extends tsmonadLib.libSrcMonadMod.Monad[R]
     with tsmonadLib.libSrcMonadMod.Functor[R]
     with tsmonadLib.libSrcMonadMod.Eq[Either[L, R]] {
  def this(`type`: EitherType) = this()
  def this(`type`: EitherType, l: L) = this()
  def this(`type`: EitherType, l: L, r: R) = this()
  var l: js.Any = js.native
  var r: js.Any = js.native
  var `type`: js.Any = js.native
  /* CompleteClass */
  override def bind[U](f: js.Function1[R, tsmonadLib.libSrcMonadMod.Monad[U]]): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  def caseOf[T](pattern: EitherPatterns[L, R, T]): T = js.native
  /* CompleteClass */
  override def chain[U](f: js.Function1[R, tsmonadLib.libSrcMonadMod.Monad[U]]): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  def `do`(): Either[L, R] = js.native
  def `do`(patterns: stdLib.Partial[EitherPatterns[L, R, scala.Unit]]): Either[L, R] = js.native
  /* CompleteClass */
  override def fmap[U](f: js.Function1[R, U]): tsmonadLib.libSrcMonadMod.Functor[U] = js.native
  /* CompleteClass */
  override def lift[U](f: js.Function1[R, U]): tsmonadLib.libSrcMonadMod.Functor[U] = js.native
  /* CompleteClass */
  override def map[U](f: js.Function1[R, U]): tsmonadLib.libSrcMonadMod.Functor[U] = js.native
  /* CompleteClass */
  override def of[U](t: U): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  /* CompleteClass */
  override def unit[U](t: U): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
}

/* static members */
@JSImport("tsmonad/lib/src/either", "Either")
@js.native
object Either extends js.Object {
  def left[L, R](l: L): tsmonadLib.libSrcEitherMod.Either[L, R] = js.native
  def right[L, R](r: R): tsmonadLib.libSrcEitherMod.Either[L, R] = js.native
}

