package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task that has been registered with the system. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
abstract class BackgroundTaskRegistration () extends js.Object {
  /** Gets the name of a registered background task. */
  var name: java.lang.String = js.native
  /** Attaches a completed event handler to the registered background task. */
  @JSName("oncompleted")
  var oncompleted_Original: BackgroundTaskCompletedEventHandler = js.native
  /** Attaches a progress event handler to the registered background task. */
  @JSName("onprogress")
  var onprogress_Original: BackgroundTaskProgressEventHandler = js.native
  /** Gets the identifier of a registered background task. */
  var taskId: java.lang.String = js.native
  /** This is not intended for use in your code. For all unsupported trigger types, the value returned by this property is null. */
  var trigger: IBackgroundTrigger = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: BackgroundTaskCompletedEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.progress,
    listener: BackgroundTaskProgressEventHandler
  ): scala.Unit = js.native
  /** Attaches a completed event handler to the registered background task. */
  def oncompleted(
    ev: BackgroundTaskCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[BackgroundTaskRegistration]
  ): scala.Unit = js.native
  /** Attaches a progress event handler to the registered background task. */
  def onprogress(
    ev: BackgroundTaskProgressEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[BackgroundTaskRegistration]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: BackgroundTaskCompletedEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.progress,
    listener: BackgroundTaskProgressEventHandler
  ): scala.Unit = js.native
  /**
                   * Cancels the registration of a registered background task.
                   * @param cancelTask True if currently running instances of this background task should be canceled. If this parameter is false, currently running instances are allowed to finish. Canceled instances receive a Canceled event with a cancellation reason of Abort.
                   */
  def unregister(cancelTask: scala.Boolean): scala.Unit = js.native
}

/** Represents a background task that has been registered with the system. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
object BackgroundTaskRegistration extends js.Object {
  /** Enumerates an application's registered background tasks. */
  var allTasks: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTaskRegistration
  ] = js.native
}

