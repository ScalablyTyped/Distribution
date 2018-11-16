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

