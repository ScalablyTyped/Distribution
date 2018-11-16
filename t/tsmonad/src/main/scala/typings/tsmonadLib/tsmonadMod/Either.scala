package typings
package tsmonadLib.tsmonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "Either")
@js.native
class Either[L, R] protected ()
  extends tsmonadLib.libSrcEitherMod.Either[L, R] {
  def this(`type`: tsmonadLib.libSrcEitherMod.EitherType) = this()
  def this(`type`: tsmonadLib.libSrcEitherMod.EitherType, l: L) = this()
  def this(`type`: tsmonadLib.libSrcEitherMod.EitherType, l: L, r: R) = this()
}

@JSImport("tsmonad", "Either")
@js.native
object Either extends js.Object {
  def left[L, R](l: L): tsmonadLib.libSrcEitherMod.Either[L, R] = js.native
  def right[L, R](r: R): tsmonadLib.libSrcEitherMod.Either[L, R] = js.native
}

