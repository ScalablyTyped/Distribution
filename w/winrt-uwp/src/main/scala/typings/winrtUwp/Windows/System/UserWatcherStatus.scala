package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserWatcherStatus extends StObject
/** Represents the status of a user watcher. */
@JSGlobal("Windows.System.UserWatcherStatus")
@js.native
object UserWatcherStatus extends StObject {
  
  /** The watcher was aborted. */
  @js.native
  sealed trait aborted
    extends StObject
       with UserWatcherStatus
  
  /** The watcher has been created. */
  @js.native
  sealed trait created
    extends StObject
       with UserWatcherStatus
  
  /** The watcher's enumeration has completed. */
  @js.native
  sealed trait enumerationCompleted
    extends StObject
       with UserWatcherStatus
  
  /** The watcher has started. */
  @js.native
  sealed trait started
    extends StObject
       with UserWatcherStatus
  
  /** The watcher has stopped. */
  @js.native
  sealed trait stopped
    extends StObject
       with UserWatcherStatus
  
  /** The watcher is stopping. */
  @js.native
  sealed trait stopping
    extends StObject
       with UserWatcherStatus
}
