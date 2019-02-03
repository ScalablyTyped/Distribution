package typings
package tsmonadLib.libSrcWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad/lib/src/writer", "Writer")
@js.native
class Writer[S, T] protected ()
  extends tsmonadLib.libSrcMonadMod.Monad[T]
     with tsmonadLib.libSrcMonadMod.Eq[Writer[S, T]] {
  def this(story: js.Array[S], value: T) = this()
  var story: js.Any = js.native
  var value: js.Any = js.native
  /* CompleteClass */
  override def bind[U](f: js.Function1[T, tsmonadLib.libSrcMonadMod.Monad[U]]): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  def caseOf[U](patterns: WriterPatterns[S, T, U]): U = js.native
  /* CompleteClass */
  override def chain[U](f: js.Function1[T, tsmonadLib.libSrcMonadMod.Monad[U]]): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  def fmap[U](f: js.Function1[/* t */ T, U]): Writer[S, U] = js.native
  def lift[U](f: js.Function1[/* t */ T, U]): Writer[S, U] = js.native
  def map[U](f: js.Function1[/* t */ T, U]): Writer[S, U] = js.native
  /* CompleteClass */
  override def of[U](t: U): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
  /* CompleteClass */
  override def unit[U](t: U): tsmonadLib.libSrcMonadMod.Monad[U] = js.native
}

/* static members */
@JSImport("tsmonad/lib/src/writer", "Writer")
@js.native
object Writer extends js.Object {
  def tell[S](s: S): tsmonadLib.libSrcWriterMod.Writer[S, scala.Double] = js.native
  def writer[S, T](story: js.Array[S], value: T): tsmonadLib.libSrcWriterMod.Writer[S, T] = js.native
}

