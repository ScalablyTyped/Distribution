package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to an instance of a background task. */
@JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstanceRuntimeClass")
@js.native
abstract class WebUIBackgroundTaskInstanceRuntimeClass () extends js.Object {
  /** Gets the instance ID of the background task instance. */
  var instanceId: java.lang.String = js.native
  /** Attaches a cancellation event handler to the background task instance. */
  @JSName("oncanceled")
  var oncanceled_Original: winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCanceledEventHandler = js.native
  /** Gets or sets progress status for a background task instance. */
  var progress: scala.Double = js.native
  /** Gets or sets the success value for the background task. The success value is what is returned to the foreground instance of your app in the completed event. */
  var succeeded: scala.Boolean = js.native
  /** Gets the number of times resource management policy caused the background task to be suspended. */
  var suspendedCount: scala.Double = js.native
  /** Gets access to the registered background task for this background task instance. */
  var task: winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskRegistration = js.native
  /** Gets additional information associated with a background task instance. */
  var triggerDetails: js.Any = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canceled(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.canceled,
    listener: winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCanceledEventHandler
  ): scala.Unit = js.native
  /**
                   * Informs the system that the background task might continue to perform work after the IBackgroundTask.Run method returns. This method is not applicable to JavaScript background tasks.
                   * @return A background task deferral.
                   */
  def getDeferral(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskDeferral = js.native
  /** Attaches a cancellation event handler to the background task instance. */
  def oncanceled(
    ev: winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCancellationReason with (winrtDashUwpLib.WindowsNs.WinRTEvent[
      winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTaskInstance
    ])
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canceled(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.canceled,
    listener: winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.BackgroundTaskCanceledEventHandler
  ): scala.Unit = js.native
}

