package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandAccountWatcherStatus extends js.Object

/** Describes different states of a MobileBroadbandAccountWatcherStatus object. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus")
@js.native
object MobileBroadbandAccountWatcherStatus extends js.Object {
  /** The watcher has aborted its watching operation due to an unexpected error condition. No events will be delivered while the watcher is in this state. */
  @js.native
  sealed trait aborted extends MobileBroadbandAccountWatcherStatus
  
  /** The watcher has been created but not started and is in its initial state. */
  @js.native
  sealed trait created extends MobileBroadbandAccountWatcherStatus
  
  /** The watcher is running and has finished enumerating the existing accounts. */
  @js.native
  sealed trait enumerationCompleted extends MobileBroadbandAccountWatcherStatus
  
  /** The watcher has been started and has yet to enumerate the existing accounts. */
  @js.native
  sealed trait started extends MobileBroadbandAccountWatcherStatus
  
  /** The watcher has been stopped. No events will be delivered while the watcher is in this state. */
  @js.native
  sealed trait stopped extends MobileBroadbandAccountWatcherStatus
  
  /* 4 */ val aborted: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.created with Double = js.native
  /* 2 */ val enumerationCompleted: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.enumerationCompleted with Double = js.native
  /* 1 */ val started: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.started with Double = js.native
  /* 3 */ val stopped: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus.stopped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandAccountWatcherStatus with Double] = js.native
}

