package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastNotifier extends js.Object {
  var setting: NotificationSetting
  def addToSchedule(scheduledToast: ScheduledToastNotification): scala.Unit
  def getScheduledToastNotifications(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ScheduledToastNotification]
  def hide(notification: ToastNotification): scala.Unit
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): scala.Unit
  def show(notification: ToastNotification): scala.Unit
}

object IToastNotifier {
  @scala.inline
  def apply(
    addToSchedule: ScheduledToastNotification => scala.Unit,
    getScheduledToastNotifications: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ScheduledToastNotification],
    hide: ToastNotification => scala.Unit,
    removeFromSchedule: ScheduledToastNotification => scala.Unit,
    setting: NotificationSetting,
    show: ToastNotification => scala.Unit
  ): IToastNotifier = {
    val __obj = js.Dynamic.literal(addToSchedule = js.Any.fromFunction1(addToSchedule), getScheduledToastNotifications = js.Any.fromFunction0(getScheduledToastNotifications), hide = js.Any.fromFunction1(hide), removeFromSchedule = js.Any.fromFunction1(removeFromSchedule), setting = setting, show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[IToastNotifier]
  }
}

