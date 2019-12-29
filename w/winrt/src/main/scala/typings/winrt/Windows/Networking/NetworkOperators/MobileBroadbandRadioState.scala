package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandRadioState extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioState")
@js.native
object MobileBroadbandRadioState extends js.Object {
  @js.native
  sealed trait off extends MobileBroadbandRadioState
  
  @js.native
  sealed trait on extends MobileBroadbandRadioState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandRadioState with Double] = js.native
  /* 0 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 1 */ @js.native
  object on extends TopLevel[on with Double]
  
}

