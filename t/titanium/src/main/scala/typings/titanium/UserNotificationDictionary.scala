package typings.titanium

import typings.std.Date
import org.scalablytyped.runtime.StObject
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
trait UserNotificationDictionary extends StObject {
  
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
  implicit class UserNotificationDictionaryMutableBuilder[Self <: UserNotificationDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertAction(value: String): Self = StObject.set(x, "alertAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertActionUndefined: Self = StObject.set(x, "alertAction", js.undefined)
    
    @scala.inline
    def setAlertBody(value: String): Self = StObject.set(x, "alertBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertBodyUndefined: Self = StObject.set(x, "alertBody", js.undefined)
    
    @scala.inline
    def setAlertLaunchImage(value: String): Self = StObject.set(x, "alertLaunchImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertLaunchImageUndefined: Self = StObject.set(x, "alertLaunchImage", js.undefined)
    
    @scala.inline
    def setAlertSubtitle(value: String): Self = StObject.set(x, "alertSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertSubtitleUndefined: Self = StObject.set(x, "alertSubtitle", js.undefined)
    
    @scala.inline
    def setAlertTitle(value: String): Self = StObject.set(x, "alertTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertTitleUndefined: Self = StObject.set(x, "alertTitle", js.undefined)
    
    @scala.inline
    def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: js.Any): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
