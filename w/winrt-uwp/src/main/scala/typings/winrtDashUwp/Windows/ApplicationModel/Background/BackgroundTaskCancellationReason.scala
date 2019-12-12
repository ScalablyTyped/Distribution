package typings.winrtDashUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.abort
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.conditionLoss
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.energySaver
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.executionTimeExceeded
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.idleTask
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.loggingOff
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.quietHoursEntered
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.resourceRevocation
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.servicingUpdate
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.systemPolicy
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.terminating
import typings.winrtDashUwp.Windows.ApplicationModel.Background.BackgroundTaskCancellationReason.uninstall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTaskCancellationReason extends js.Object

/** Specifies the reasons for cancelling a background task. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskCancellationReason")
@js.native
object BackgroundTaskCancellationReason extends js.Object {
  /** The background task was canceled by the application. This can happen for one of the following four reasons: */
  @js.native
  sealed trait abort extends BackgroundTaskCancellationReason
  
  /** The background task was canceled because one or more of its required conditions is no longer met. */
  @js.native
  sealed trait conditionLoss extends BackgroundTaskCancellationReason
  
  /** The background task was cancelled because of the current Energy Saver policy. */
  @js.native
  sealed trait energySaver extends BackgroundTaskCancellationReason
  
  /** The background task was cancelled because it exceeded its allotted time to run. */
  @js.native
  sealed trait executionTimeExceeded extends BackgroundTaskCancellationReason
  
  /** The background task was canceled because it was active, but not doing any work. */
  @js.native
  sealed trait idleTask extends BackgroundTaskCancellationReason
  
  /** The background task was canceled because the user has logged off the system. */
  @js.native
  sealed trait loggingOff extends BackgroundTaskCancellationReason
  
  /** The background task was cancelled because the device entered the quiet hours period. */
  @js.native
  sealed trait quietHoursEntered extends BackgroundTaskCancellationReason
  
  /** The background task was cancelled because the system needed additional resources. The background task was cancelled to free up those resources. */
  @js.native
  sealed trait resourceRevocation extends BackgroundTaskCancellationReason
  
  /** The background task was canceled because the application was updated. */
  @js.native
  sealed trait servicingUpdate extends BackgroundTaskCancellationReason
  
  /** The background task was cancelled because of system policy. */
  @js.native
  sealed trait systemPolicy extends BackgroundTaskCancellationReason
  
  /** The background task was canceled because the application is about to be terminated due to system policy. The application should save any state that will be needed when the application restarts. */
  @js.native
  sealed trait terminating extends BackgroundTaskCancellationReason
  
  /** The background task was canceled because the application was uninstalled. */
  @js.native
  sealed trait uninstall extends BackgroundTaskCancellationReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTaskCancellationReason with Double] = js.native
  /* 0 */ @js.native
  object abort extends TopLevel[abort with Double]
  
  /* 6 */ @js.native
  object conditionLoss extends TopLevel[conditionLoss with Double]
  
  /* 11 */ @js.native
  object energySaver extends TopLevel[energySaver with Double]
  
  /* 9 */ @js.native
  object executionTimeExceeded extends TopLevel[executionTimeExceeded with Double]
  
  /* 4 */ @js.native
  object idleTask extends TopLevel[idleTask with Double]
  
  /* 2 */ @js.native
  object loggingOff extends TopLevel[loggingOff with Double]
  
  /* 8 */ @js.native
  object quietHoursEntered extends TopLevel[quietHoursEntered with Double]
  
  /* 10 */ @js.native
  object resourceRevocation extends TopLevel[resourceRevocation with Double]
  
  /* 3 */ @js.native
  object servicingUpdate extends TopLevel[servicingUpdate with Double]
  
  /* 7 */ @js.native
  object systemPolicy extends TopLevel[systemPolicy with Double]
  
  /* 1 */ @js.native
  object terminating extends TopLevel[terminating with Double]
  
  /* 5 */ @js.native
  object uninstall extends TopLevel[uninstall with Double]
  
}

