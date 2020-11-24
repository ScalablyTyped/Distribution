package typings.tsmonad.eitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsmonad/lib/src/either", "either")
@js.native
object either extends js.Object {
  
  def apply[L, R](): Either_[L, R] = js.native
  def apply[L, R](l: L): Either_[L, R] = js.native
  def apply[L, R](l: L, r: R): Either_[L, R] = js.native
  def apply[L, R](l: js.UndefOr[scala.Nothing], r: R): Either_[L, R] = js.native
}
