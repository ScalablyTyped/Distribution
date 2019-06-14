package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserWatcherStatus extends js.Object

/** Represents the status of a user watcher. */
@JSGlobal("Windows.System.UserWatcherStatus")
@js.native
object UserWatcherStatus extends js.Object {
  /** The watcher was aborted. */
  @js.native
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserWatcherStatus
  
  /** The watcher has been created. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserWatcherStatus
  
  /** The watcher's enumeration has completed. */
  @js.native
  sealed trait enumerationCompleted
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserWatcherStatus
  
  /** The watcher has started. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserWatcherStatus
  
  /** The watcher has stopped. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserWatcherStatus
  
  /** The watcher is stopping. */
  @js.native
  sealed trait stopping
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserWatcherStatus
  
  /* 5 */ val aborted: aborted with scala.Double = js.native
  /* 0 */ val created: created with scala.Double = js.native
  /* 2 */ val enumerationCompleted: enumerationCompleted with scala.Double = js.native
  /* 1 */ val started: started with scala.Double = js.native
  /* 4 */ val stopped: stopped with scala.Double = js.native
  /* 3 */ val stopping: stopping with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.UserWatcherStatus with scala.Double] = js.native
}

