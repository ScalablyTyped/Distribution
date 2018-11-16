package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Raises a toast notification to the specific app to which the ToastNotifier is bound. This class also lets you schedule and remove toast notifications. */
@JSGlobal("Windows.UI.Notifications.ToastNotifier")
@js.native
abstract class ToastNotifier () extends js.Object {
  /** Gets a value that tells you whether there is an app, user, or system block that prevents the display of a toast notification. */
  var setting: NotificationSetting = js.native
  /**
                   * Adds a ScheduledToastNotification for later display by Windows.
                   * @param scheduledToast The scheduled toast notification, which includes its content and timing instructions.
                   */
  def addToSchedule(scheduledToast: ScheduledToastNotification): scala.Unit = js.native
  /**
                   * Gets the collection of ScheduledToastNotification objects that this app has scheduled for display.
                   * @return The collection of scheduled toast notifications that the app bound to this notifier has scheduled for timed display.
                   */
  def getScheduledToastNotifications(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ScheduledToastNotification] = js.native
  /**
                   * Removes the specified toast notification from the screen.
                   * @param notification The object that specifies the toast to hide.
                   */
  def hide(notification: ToastNotification): scala.Unit = js.native
  /**
                   * Cancels the scheduled display of a specified ScheduledToastNotification .
                   * @param scheduledToast The notification to remove from the schedule.
                   */
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): scala.Unit = js.native
  /**
                   * Displays the specified toast notification.
                   * @param notification The object that contains the content of the toast notification to display.
                   */
  def show(notification: ToastNotification): scala.Unit = js.native
}

