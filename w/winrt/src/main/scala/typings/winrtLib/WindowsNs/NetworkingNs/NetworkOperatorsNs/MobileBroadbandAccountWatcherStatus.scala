package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandAccountWatcherStatus extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus")
@js.native
object MobileBroadbandAccountWatcherStatus extends js.Object {
  @js.native
  sealed trait aborted
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait created
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait enumerationCompleted
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait started
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait stopped
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  /* 4 */ val aborted: aborted with scala.Double = js.native
  /* 0 */ val created: created with scala.Double = js.native
  /* 2 */ val enumerationCompleted: enumerationCompleted with scala.Double = js.native
  /* 1 */ val started: started with scala.Double = js.native
  /* 3 */ val stopped: stopped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus with scala.Double
  ] = js.native
}

