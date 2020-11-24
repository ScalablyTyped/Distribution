package typings.winrtUwp.Windows.UI.Notifications

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Raises a toast notification to the specific app to which the ToastNotifier is bound. This class also lets you schedule and remove toast notifications. */
@js.native
trait ToastNotifier extends js.Object {
  
  /**
    * Adds a ScheduledToastNotification for later display by Windows.
    * @param scheduledToast The scheduled toast notification, which includes its content and timing instructions.
    */
  def addToSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  
  /**
    * Gets the collection of ScheduledToastNotification objects that this app has scheduled for display.
    * @return The collection of scheduled toast notifications that the app bound to this notifier has scheduled for timed display.
    */
  def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification] = js.native
  
  /**
    * Removes the specified toast notification from the screen.
    * @param notification The object that specifies the toast to hide.
    */
  def hide(notification: ToastNotification): Unit = js.native
  
  /**
    * Cancels the scheduled display of a specified ScheduledToastNotification .
    * @param scheduledToast The notification to remove from the schedule.
    */
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  
  /** Gets a value that tells you whether there is an app, user, or system block that prevents the display of a toast notification. */
  var setting: NotificationSetting = js.native
  
  /**
    * Displays the specified toast notification.
    * @param notification The object that contains the content of the toast notification to display.
    */
  def show(notification: ToastNotification): Unit = js.native
}
object ToastNotifier {
  
  @scala.inline
  def apply(
    addToSchedule: ScheduledToastNotification => Unit,
    getScheduledToastNotifications: () => IVectorView[ScheduledToastNotification],
    hide: ToastNotification => Unit,
    removeFromSchedule: ScheduledToastNotification => Unit,
    setting: NotificationSetting,
    show: ToastNotification => Unit
  ): ToastNotifier = {
    val __obj = js.Dynamic.literal(addToSchedule = js.Any.fromFunction1(addToSchedule), getScheduledToastNotifications = js.Any.fromFunction0(getScheduledToastNotifications), hide = js.Any.fromFunction1(hide), removeFromSchedule = js.Any.fromFunction1(removeFromSchedule), setting = setting.asInstanceOf[js.Any], show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[ToastNotifier]
  }
  
  @scala.inline
  implicit class ToastNotifierOps[Self <: ToastNotifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddToSchedule(value: ScheduledToastNotification => Unit): Self = this.set("addToSchedule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScheduledToastNotifications(value: () => IVectorView[ScheduledToastNotification]): Self = this.set("getScheduledToastNotifications", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: ToastNotification => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFromSchedule(value: ScheduledToastNotification => Unit): Self = this.set("removeFromSchedule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetting(value: NotificationSetting): Self = this.set("setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: ToastNotification => Unit): Self = this.set("show", js.Any.fromFunction1(value))
  }
}
