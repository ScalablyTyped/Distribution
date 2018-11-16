package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  /** The watcher has been created but not started and is in its initial state. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  /** The watcher is running and has finished enumerating the existing accounts. */
  @js.native
  sealed trait enumerationCompleted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  /** The watcher has been started and has yet to enumerate the existing accounts. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  /** The watcher has been stopped. No events will be delivered while the watcher is in this state. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val enumerationCompleted: enumerationCompleted with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandAccountWatcherStatus with java.lang.String
  ] = js.native
}

