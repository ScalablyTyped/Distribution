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
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val enumerationCompleted: enumerationCompleted with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus with java.lang.String
  ] = js.native
}

