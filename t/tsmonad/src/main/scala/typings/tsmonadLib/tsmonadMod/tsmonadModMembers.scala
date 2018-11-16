package typings
package tsmonadLib.tsmonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", JSImport.Namespace)
@js.native
object tsmonadModMembers extends js.Object {
  def either[L, R](): tsmonadLib.libSrcEitherMod.Either[L, R] = js.native
  def either[L, R](l: L): tsmonadLib.libSrcEitherMod.Either[L, R] = js.native
  def either[L, R](l: L, r: R): tsmonadLib.libSrcEitherMod.Either[L, R] = js.native
  def eq(a: js.Any, b: js.Any): js.Any = js.native
  def maybe[T](t: T): tsmonadLib.libSrcMaybeMod.Maybe[T] = js.native
  def writer[S, T](story: js.Array[S], value: T): tsmonadLib.libSrcWriterMod.Writer[S, T] = js.native
}

