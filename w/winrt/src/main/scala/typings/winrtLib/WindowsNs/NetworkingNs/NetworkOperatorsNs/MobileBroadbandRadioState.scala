package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandRadioState extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioState")
@js.native
object MobileBroadbandRadioState extends js.Object {
  @js.native
  sealed trait off
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandRadioState
  
  @js.native
  sealed trait on
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandRadioState
  
  val off: off with java.lang.String = js.native
  val on: on with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandRadioState with java.lang.String
  ] = js.native
}

