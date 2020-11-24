package typings.titanium

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of notification data used in the array of `notifications`
  * when receiving pending or local notifications in
  * <Titanium.App.iOS.UserNotificationCenter.getPendingNotifications> and
  * <Titanium.App.iOS.UserNotificationCenter.getDeliveredNotifications>.
  */
@js.native
trait UserNotificationDictionary extends js.Object {
  
  /**
    * Alert button text ('Open', by default) or home text ('Press Home to unlock', by default)
    * type: String
    */
  var alertAction: js.UndefOr[String] = js.native
  
  /**
    * Alert message.
    */
  var alertBody: js.UndefOr[String] = js.native
  
  /**
    * Image displayed instead of `Default.png` when launching the application.
    */
  var alertLaunchImage: js.UndefOr[String] = js.native
  
  /**
    * Subtitle of the notification.
    */
  var alertSubtitle: js.UndefOr[String] = js.native
  
  /**
    * Title of the notification.
    */
  var alertTitle: js.UndefOr[String] = js.native
  
  /**
    * Application badge value.
    */
  var badge: js.UndefOr[Double] = js.native
  
  /**
    * Category identifier of the notification.
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * Date and time when the notification was configured to fire.
    */
  var date: js.UndefOr[Date] = js.native
  
  /**
    * The notification identifier.
    */
  var identifier: String = js.native
  
  /**
    * Region of the notification.
    */
  var region: js.UndefOr[js.Any] = js.native
  
  /**
    * Path to the sound file configured to play when the notification was fired.
    */
  var sound: js.UndefOr[String] = js.native
  
  /**
    * Timezone of the date when the notification was configured to fire.
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * Custom data object.
    */
  var userInfo: js.UndefOr[js.Any] = js.native
}
object UserNotificationDictionary {
  
  @scala.inline
  def apply(identifier: String): UserNotificationDictionary = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationDictionary]
  }
  
  @scala.inline
  implicit class UserNotificationDictionaryOps[Self <: UserNotificationDictionary] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertAction(value: String): Self = this.set("alertAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertAction: Self = this.set("alertAction", js.undefined)
    
    @scala.inline
    def setAlertBody(value: String): Self = this.set("alertBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertBody: Self = this.set("alertBody", js.undefined)
    
    @scala.inline
    def setAlertLaunchImage(value: String): Self = this.set("alertLaunchImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertLaunchImage: Self = this.set("alertLaunchImage", js.undefined)
    
    @scala.inline
    def setAlertSubtitle(value: String): Self = this.set("alertSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertSubtitle: Self = this.set("alertSubtitle", js.undefined)
    
    @scala.inline
    def setAlertTitle(value: String): Self = this.set("alertTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertTitle: Self = this.set("alertTitle", js.undefined)
    
    @scala.inline
    def setBadge(value: Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setRegion(value: js.Any): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserInfo: Self = this.set("userInfo", js.undefined)
  }
}
