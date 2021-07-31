package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundTaskCancellationReason extends StObject
/** Specifies the reasons for cancelling a background task. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCancellationReason")
@js.native
object BackgroundTaskCancellationReason extends StObject {
  
  /** The background task was canceled by the application. This can happen for one of the following four reasons: */
  @js.native
  sealed trait abort
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was canceled because one or more of its required conditions is no longer met. */
  @js.native
  sealed trait conditionLoss
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was cancelled because of the current Energy Saver policy. */
  @js.native
  sealed trait energySaver
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was cancelled because it exceeded its allotted time to run. */
  @js.native
  sealed trait executionTimeExceeded
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was canceled because it was active, but not doing any work. */
  @js.native
  sealed trait idleTask
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was canceled because the user has logged off the system. */
  @js.native
  sealed trait loggingOff
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was cancelled because the device entered the quiet hours period. */
  @js.native
  sealed trait quietHoursEntered
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was cancelled because the system needed additional resources. The background task was cancelled to free up those resources. */
  @js.native
  sealed trait resourceRevocation
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was canceled because the application was updated. */
  @js.native
  sealed trait servicingUpdate
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was cancelled because of system policy. */
  @js.native
  sealed trait systemPolicy
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was canceled because the application is about to be terminated due to system policy. The application should save any state that will be needed when the application restarts. */
  @js.native
  sealed trait terminating
    extends StObject
       with BackgroundTaskCancellationReason
  
  /** The background task was canceled because the application was uninstalled. */
  @js.native
  sealed trait uninstall
    extends StObject
       with BackgroundTaskCancellationReason
}
