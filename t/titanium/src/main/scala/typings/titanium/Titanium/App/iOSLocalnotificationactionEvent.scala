package typings.titanium.Titanium.App

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a user selects an action for an interactive local notification.
  */
@js.native
trait iOSLocalnotificationactionEvent extends iOSBaseEvent {
  
  /**
    * Alert button text ('Open', by default) or slider text ('slide to unlock...', by default).
    */
  var alertAction: String = js.native
  
  /**
    * Alert message.
    */
  var alertBody: String = js.native
  
  /**
    * Image displayed instead of `Default.png` when launching the application.
    */
  var alertLaunchImage: String = js.native
  
  /**
    * Application badge value.
    */
  var badge: Double = js.native
  
  /**
    * The identifier of the app-defined [category object](Titanium.App.iOS.UserNotificationCategory). Available in Titanium SDK 7.5.0+ and iOS 10+.
    */
  var category: String = js.native
  
  /**
    * Date and time when the notification was configured to fire.
    */
  var date: Date = js.native
  
  /**
    * Identifier of the action that was selected of the interactive notification.
    */
  var identifier: String = js.native
  
  /**
    * Boolean indicating if notification was received while app was in background (since Titanium SDK 6.2.0).
    * On iOS 10+ this is no longer available since the event will only fire when opening the app after interacting
    * with a notification from the iOS notification center (which means the app was in background when the
    * notification was received).
    */
  var inBackground: Boolean = js.native
  
  /**
    * Path to the sound file configured to play when the notification was fired.
    */
  var sound: String = js.native
  
  /**
    * The unique identifier for the thread or conversation related to this notification request.
    * It will be used to visually group notifications together. Available in Titanium SDK 7.5.0+ and iOS 10+.
    */
  var threadIdentifier: String = js.native
  
  /**
    * Timezone of the date when the notification was configured to fire.
    */
  var timezone: String = js.native
  
  /**
    * User input if the notification used the `USER_NOTIFICATION_BEHAVIOR_TEXTINPUT` behavior.
    */
  var typedText: String = js.native
  
  /**
    * Custom data object.
    */
  var userInfo: js.Any = js.native
}
object iOSLocalnotificationactionEvent {
  
  @scala.inline
  def apply(
    alertAction: String,
    alertBody: String,
    alertLaunchImage: String,
    badge: Double,
    category: String,
    date: Date,
    identifier: String,
    inBackground: Boolean,
    sound: String,
    source: iOS,
    threadIdentifier: String,
    timezone: String,
    typedText: String,
    userInfo: js.Any
  ): iOSLocalnotificationactionEvent = {
    val __obj = js.Dynamic.literal(alertAction = alertAction.asInstanceOf[js.Any], alertBody = alertBody.asInstanceOf[js.Any], alertLaunchImage = alertLaunchImage.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], inBackground = inBackground.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], threadIdentifier = threadIdentifier.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], typedText = typedText.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSLocalnotificationactionEvent]
  }
  
  @scala.inline
  implicit class iOSLocalnotificationactionEventMutableBuilder[Self <: iOSLocalnotificationactionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertAction(value: String): Self = StObject.set(x, "alertAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertBody(value: String): Self = StObject.set(x, "alertBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertLaunchImage(value: String): Self = StObject.set(x, "alertLaunchImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInBackground(value: Boolean): Self = StObject.set(x, "inBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadIdentifier(value: String): Self = StObject.set(x, "threadIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedText(value: String): Self = StObject.set(x, "typedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
