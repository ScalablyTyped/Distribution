package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastNotifier extends js.Object {
  
  def addToSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  
  def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification] = js.native
  
  def hide(notification: ToastNotification): Unit = js.native
  
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit = js.native
  
  var setting: NotificationSetting = js.native
  
  def show(notification: ToastNotification): Unit = js.native
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
  
  @scala.inline
  implicit class IToastNotifierOps[Self <: IToastNotifier] (val x: Self) extends AnyVal {
    
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
