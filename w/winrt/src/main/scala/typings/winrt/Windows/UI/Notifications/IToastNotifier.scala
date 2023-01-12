package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToastNotifier extends StObject {
  
  def addToSchedule(scheduledToast: ScheduledToastNotification): Unit
  
  def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification]
  
  def hide(notification: ToastNotification): Unit
  
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit
  
  var setting: NotificationSetting
  
  def show(notification: ToastNotification): Unit
}
object IToastNotifier {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IToastNotifier] (val x: Self) extends AnyVal {
    
    inline def setAddToSchedule(value: ScheduledToastNotification => Unit): Self = StObject.set(x, "addToSchedule", js.Any.fromFunction1(value))
    
    inline def setGetScheduledToastNotifications(value: () => IVectorView[ScheduledToastNotification]): Self = StObject.set(x, "getScheduledToastNotifications", js.Any.fromFunction0(value))
    
    inline def setHide(value: ToastNotification => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setRemoveFromSchedule(value: ScheduledToastNotification => Unit): Self = StObject.set(x, "removeFromSchedule", js.Any.fromFunction1(value))
    
    inline def setSetting(value: NotificationSetting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setShow(value: ToastNotification => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
