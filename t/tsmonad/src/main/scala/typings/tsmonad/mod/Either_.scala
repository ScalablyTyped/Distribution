package typings.tsmonad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsmonad", "Either")
@js.native
class Either_[L, R] protected ()
  extends typings.tsmonad.eitherMod.Either_[L, R] {
  def this(`type`: typings.tsmonad.eitherMod.EitherType) = this()
  def this(`type`: typings.tsmonad.eitherMod.EitherType, l: L) = this()
  def this(`type`: typings.tsmonad.eitherMod.EitherType, l: L, r: R) = this()
  def this(`type`: typings.tsmonad.eitherMod.EitherType, l: js.UndefOr[scala.Nothing], r: R) = this()
}
/* static members */
@JSImport("tsmonad", "Either")
@js.native
object Either_ extends js.Object {
  
  def left[L, R](l: L): typings.tsmonad.eitherMod.Either_[L, R] = js.native
  
  def right[L, R](r: R): typings.tsmonad.eitherMod.Either_[L, R] = js.native
}
