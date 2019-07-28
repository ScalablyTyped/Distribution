package typings.tsmonad.tsmonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def either[L, R](): typings.tsmonad.libSrcEitherMod.Either[L, R] = js.native
  def either[L, R](l: L): typings.tsmonad.libSrcEitherMod.Either[L, R] = js.native
  def either[L, R](l: L, r: R): typings.tsmonad.libSrcEitherMod.Either[L, R] = js.native
  def eq(a: js.Any, b: js.Any): js.Any = js.native
  def maybe[T](t: T): typings.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
  def writer[S, T](story: js.Array[S], value: T): typings.tsmonad.libSrcWriterMod.Writer[S, T] = js.native
}

