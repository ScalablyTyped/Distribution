package typings.titanium

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary object of parameters used to create a notification using
  * <Titanium.App.iOS.scheduleLocalNotification>.
  */
@js.native
trait NotificationParams extends StObject {
  
  /**
    * Alert button text ('Open', by default) or home text ('Press Home to unlock', by default)
    * to display.
    */
  var alertAction: js.UndefOr[String] = js.native
  
  /**
    * Alert message to display.
    */
  var alertBody: js.UndefOr[String] = js.native
  
  /**
    * Image to display instead of `Default.png` when launching the application.
    */
  var alertLaunchImage: js.UndefOr[String] = js.native
  
  /**
    * Alert subtitle to display.
    */
  var alertSubtitle: js.UndefOr[String] = js.native
  
  /**
    * Alert title to display.
    */
  var alertTitle: js.UndefOr[String] = js.native
  
  /**
    * Notification attachments to display.
    */
  var attachments: js.UndefOr[js.Array[UserNotificationAttachment]] = js.native
  
  /**
    * Application badge value.
    */
  var badge: js.UndefOr[Double] = js.native
  
  /**
    * String identifier of category of actions to be displayed for an interactive notification.
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * Date and time for the notification to occur.
    */
  var date: js.UndefOr[Date] = js.native
  
  /**
    * The notification identifier.
    */
  var identifier: String = js.native
  
  /**
    * Region the notification will be triggered in. Allowed parameter are:
    * - `latitude`: Latitude of the location center, in decimal degrees (required).
    * - `longitude`: Longitude of the location center, in decimal degrees (required).
    * - `triggersOnce`: Whether or not the notification will only fire once (optional, default: true).
    */
  var region: js.UndefOr[js.Any] = js.native
  
  /**
    * Interval to repeat the notification. One of `weekly`, `daily`, `yearly,` `monthly`.
    */
  var repeat: js.UndefOr[String] = js.native
  
  /**
    * Path to the sound file to play when notification occurs, relative to the `Resources` folder.
    */
  var sound: js.UndefOr[String] = js.native
  
  /**
    * The string the notification adds to the category's summary format string.
    */
  var summaryArgument: js.UndefOr[String] = js.native
  
  /**
    * The number of items the notification adds to the category's summary format string.
    */
  var summaryArgumentCount: js.UndefOr[String] = js.native
  
  /**
    * Timezone of the date configured for the notification. If not set, the system timezone is used.
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * Data to pass to the application with the notification event.
    */
  var userInfo: js.UndefOr[js.Any] = js.native
}
object NotificationParams {
  
  @scala.inline
  def apply(identifier: String): NotificationParams = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationParams]
  }
  
  @scala.inline
  implicit class NotificationParamsMutableBuilder[Self <: NotificationParams] (val x: Self) extends AnyVal {
    
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
    def setAttachments(value: js.Array[UserNotificationAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: UserNotificationAttachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
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
    def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    @scala.inline
    def setSummaryArgument(value: String): Self = StObject.set(x, "summaryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryArgumentCount(value: String): Self = StObject.set(x, "summaryArgumentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryArgumentCountUndefined: Self = StObject.set(x, "summaryArgumentCount", js.undefined)
    
    @scala.inline
    def setSummaryArgumentUndefined: Self = StObject.set(x, "summaryArgument", js.undefined)
    
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
