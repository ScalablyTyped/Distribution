package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastNotifier extends js.Object {
  var setting: NotificationSetting
  def addToSchedule(scheduledToast: ScheduledToastNotification): Unit
  def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification]
  def hide(notification: ToastNotification): Unit
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit
  def show(notification: ToastNotification): Unit
}

object IToastNotifier {
  @scala.inline
  def apply(
    addToSchedule: ScheduledToastNotification => Unit,
    getScheduledToastNotifications: () => IVectorView[ScheduledToastNotification],
    hide: ToastNotification => Unit,
    removeFromSchedule: ScheduledToastNotification => Unit,
    setting: NotificationSetting,
    show: ToastNotification => Unit
  ): IToastNotifier = {
    val __obj = js.Dynamic.literal(addToSchedule = js.Any.fromFunction1(addToSchedule), getScheduledToastNotifications = js.Any.fromFunction0(getScheduledToastNotifications), hide = js.Any.fromFunction1(hide), removeFromSchedule = js.Any.fromFunction1(removeFromSchedule), setting = setting.asInstanceOf[js.Any], show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[IToastNotifier]
  }
}

