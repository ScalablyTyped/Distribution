package typings.tsmonad.eitherMod

import typings.std.Partial
import typings.tsmonad.monadMod.Eq_
import typings.tsmonad.monadMod.Functor
import typings.tsmonad.monadMod.Monad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsmonad/lib/src/either", "Either")
@js.native
class Either_[L, R] protected ()
  extends Monad[R]
     with Functor[R]
     with Eq_[Either_[L, R]] {
  def this(`type`: EitherType) = this()
  def this(`type`: EitherType, l: L) = this()
  def this(`type`: EitherType, l: L, r: R) = this()
  def this(`type`: EitherType, l: js.UndefOr[scala.Nothing], r: R) = this()
  
  def caseOf[T](pattern: EitherPatterns[L, R, T]): T = js.native
  
  def `do`(): Either_[L, R] = js.native
  def `do`(patterns: Partial[EitherPatterns[L, R, Unit]]): Either_[L, R] = js.native
  
  var l: js.Any = js.native
  
  var r: js.Any = js.native
  
  var `type`: js.Any = js.native
}
/* static members */
@JSImport("tsmonad/lib/src/either", "Either")
@js.native
object Either_ extends js.Object {
  
  def left[L, R](l: L): Either_[L, R] = js.native
  
  def right[L, R](r: R): Either_[L, R] = js.native
}
