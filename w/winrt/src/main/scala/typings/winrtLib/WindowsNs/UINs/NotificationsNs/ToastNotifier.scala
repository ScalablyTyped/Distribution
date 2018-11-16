package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotifier")
@js.native
class ToastNotifier () extends IToastNotifier {
  /* CompleteClass */
  override var setting: NotificationSetting = js.native
  /* CompleteClass */
  override def addToSchedule(scheduledToast: ScheduledToastNotification): scala.Unit = js.native
  /* CompleteClass */
  override def getScheduledToastNotifications(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ScheduledToastNotification] = js.native
  /* CompleteClass */
  override def hide(notification: ToastNotification): scala.Unit = js.native
  /* CompleteClass */
  override def removeFromSchedule(scheduledToast: ScheduledToastNotification): scala.Unit = js.native
  /* CompleteClass */
  override def show(notification: ToastNotification): scala.Unit = js.native
}

