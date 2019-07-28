package typings.tsmonad.tsmonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "Either")
@js.native
class Either[L, R] protected ()
  extends typings.tsmonad.libSrcEitherMod.Either[L, R] {
  def this(`type`: typings.tsmonad.libSrcEitherMod.EitherType) = this()
  def this(`type`: typings.tsmonad.libSrcEitherMod.EitherType, l: L) = this()
  def this(`type`: typings.tsmonad.libSrcEitherMod.EitherType, l: L, r: R) = this()
}

/* static members */
@JSImport("tsmonad", "Either")
@js.native
object Either extends js.Object {
  def left[L, R](l: L): typings.tsmonad.libSrcEitherMod.Either[L, R] = js.native
  def right[L, R](r: R): typings.tsmonad.libSrcEitherMod.Either[L, R] = js.native
}

