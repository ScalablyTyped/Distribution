package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandAccountWatcherStatus extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus")
@js.native
object MobileBroadbandAccountWatcherStatus extends js.Object {
  @js.native
  sealed trait aborted extends MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait created extends MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait enumerationCompleted extends MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait started extends MobileBroadbandAccountWatcherStatus
  
  @js.native
  sealed trait stopped extends MobileBroadbandAccountWatcherStatus
  
  /* 4 */ val aborted: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.created with Double = js.native
  /* 2 */ val enumerationCompleted: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.enumerationCompleted with Double = js.native
  /* 1 */ val started: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.started with Double = js.native
  /* 3 */ val stopped: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.stopped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandAccountWatcherStatus with Double] = js.native
}

