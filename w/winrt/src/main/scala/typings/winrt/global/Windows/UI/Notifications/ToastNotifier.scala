package typings.winrt.global.Windows.UI.Notifications

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotifier")
@js.native
class ToastNotifier ()
  extends typings.winrt.Windows.UI.Notifications.ToastNotifier {
  /* CompleteClass */
  override var setting: typings.winrt.Windows.UI.Notifications.NotificationSetting = js.native
  /* CompleteClass */
  override def addToSchedule(scheduledToast: typings.winrt.Windows.UI.Notifications.ScheduledToastNotification): Unit = js.native
  /* CompleteClass */
  override def getScheduledToastNotifications(): IVectorView[typings.winrt.Windows.UI.Notifications.ScheduledToastNotification] = js.native
  /* CompleteClass */
  override def hide(notification: typings.winrt.Windows.UI.Notifications.ToastNotification): Unit = js.native
  /* CompleteClass */
  override def removeFromSchedule(scheduledToast: typings.winrt.Windows.UI.Notifications.ScheduledToastNotification): Unit = js.native
  /* CompleteClass */
  override def show(notification: typings.winrt.Windows.UI.Notifications.ToastNotification): Unit = js.native
}

