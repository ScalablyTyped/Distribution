package typings.winrtDashUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserWatcherStatus with Double] = js.native
  /* 5 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 2 */ @js.native
  object enumerationCompleted extends TopLevel[enumerationCompleted with Double]
  
  /* 1 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 4 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
  /* 3 */ @js.native
  object stopping extends TopLevel[stopping with Double]
  
}

