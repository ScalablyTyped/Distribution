package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandAccountWatcherStatus with Double] = js.native
  /* 4 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 2 */ @js.native
  object enumerationCompleted extends TopLevel[enumerationCompleted with Double]
  
  /* 1 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 3 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
}

