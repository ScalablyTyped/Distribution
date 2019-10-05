package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotifier")
@js.native
class ToastNotifier () extends IToastNotifier {
  /* CompleteClass */
  override var setting: NotificationSetting = js.native
  /* CompleteClass */
  override def addToSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  /* CompleteClass */
  override def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification] = js.native
  /* CompleteClass */
  override def hide(notification: ToastNotification): Unit = js.native
  /* CompleteClass */
  override def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  /* CompleteClass */
  override def show(notification: ToastNotification): Unit = js.native
}

