package typings.titanium

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary object of parameters used to create a notification using
  * <Titanium.App.iOS.scheduleLocalNotification>.
  */
@js.native
trait NotificationParams extends js.Object {
  
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
  implicit class NotificationParamsOps[Self <: NotificationParams] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsVarargs(value: UserNotificationAttachment*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[UserNotificationAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
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
    def setRepeat(value: String): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def setSummaryArgument(value: String): Self = this.set("summaryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryArgument: Self = this.set("summaryArgument", js.undefined)
    
    @scala.inline
    def setSummaryArgumentCount(value: String): Self = this.set("summaryArgumentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryArgumentCount: Self = this.set("summaryArgumentCount", js.undefined)
    
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
