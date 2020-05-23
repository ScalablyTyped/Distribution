package typings.titanium.Titanium.App

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a local notification is received by the application.
  */
trait iOSNotificationEvent extends iOSBaseEvent {
  /**
    * Alert button text ('View', by default) or slider text ('slide to unlock...', by default).
    */
  var alertAction: String
  /**
    * Alert message.
    */
  var alertBody: String
  /**
    * Image displayed instead of `Default.png` when launching the application.
    */
  var alertLaunchImage: String
  /**
    * Application badge value.
    */
  var badge: Double
  /**
    * The identifier of the app-defined [category object](Titanium.App.iOS.UserNotificationCategory). Available in Titanium SDK 7.5.0+ and iOS 10+.
    */
  var category: String
  /**
    * Date and time when the notification was configured to fire.
    */
  var date: Date
  /**
    * Boolean indicating if notification was received while app was in background. Available in Titanium SDK 6.2.0.
    * On iOS 10+ this is no longer available since this event will only fire if the app is in foreground.
    */
  var inBackground: Boolean
  /**
    * Name of the sound file configured to play when the notification was fired.
    */
  var sound: String
  /**
    * The unique identifier for the thread or conversation related to this notification request.
    * It will be used to visually group notifications together. Available in Titanium SDK 7.5.0+ and iOS 10+.
    */
  var threadIdentifier: String
  /**
    * Timezone of the date when the notification was configured to fire. Available in Titanium SDK 7.4.0+.
    */
  var timezone: String
  /**
    * Custom data object.
    */
  var userInfo: js.Any
}

object iOSNotificationEvent {
  @scala.inline
  def apply(
    alertAction: String,
    alertBody: String,
    alertLaunchImage: String,
    badge: Double,
    category: String,
    date: Date,
    inBackground: Boolean,
    sound: String,
    source: iOS,
    threadIdentifier: String,
    timezone: String,
    userInfo: js.Any
  ): iOSNotificationEvent = {
    val __obj = js.Dynamic.literal(alertAction = alertAction.asInstanceOf[js.Any], alertBody = alertBody.asInstanceOf[js.Any], alertLaunchImage = alertLaunchImage.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], inBackground = inBackground.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], threadIdentifier = threadIdentifier.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSNotificationEvent]
  }
}

