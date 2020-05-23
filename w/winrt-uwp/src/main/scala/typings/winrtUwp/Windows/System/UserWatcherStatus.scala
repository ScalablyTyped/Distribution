package typings.winrtUwp.Windows.System

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
  sealed trait aborted extends UserWatcherStatus
  
  /** The watcher has been created. */
  @js.native
  sealed trait created extends UserWatcherStatus
  
  /** The watcher's enumeration has completed. */
  @js.native
  sealed trait enumerationCompleted extends UserWatcherStatus
  
  /** The watcher has started. */
  @js.native
  sealed trait started extends UserWatcherStatus
  
  /** The watcher has stopped. */
  @js.native
  sealed trait stopped extends UserWatcherStatus
  
  /** The watcher is stopping. */
  @js.native
  sealed trait stopping extends UserWatcherStatus
  
}

