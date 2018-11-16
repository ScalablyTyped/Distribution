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
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val enumerationCompleted: enumerationCompleted with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  val stopping: stopping with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.UserWatcherStatus with java.lang.String] = js.native
}

