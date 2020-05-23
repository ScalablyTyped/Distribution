package typings.titanium.Titanium.App

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a user selects an action for an interactive local notification.
  */
trait iOSLocalnotificationactionEvent extends iOSBaseEvent {
  /**
    * Alert button text ('Open', by default) or slider text ('slide to unlock...', by default).
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
    * Identifier of the action that was selected of the interactive notification.
    */
  var identifier: String
  /**
    * Boolean indicating if notification was received while app was in background (since Titanium SDK 6.2.0).
    * On iOS 10+ this is no longer available since the event will only fire when opening the app after interacting
    * with a notification from the iOS notification center (which means the app was in background when the
    * notification was received).
    */
  var inBackground: Boolean
  /**
    * Path to the sound file configured to play when the notification was fired.
    */
  var sound: String
  /**
    * The unique identifier for the thread or conversation related to this notification request.
    * It will be used to visually group notifications together. Available in Titanium SDK 7.5.0+ and iOS 10+.
    */
  var threadIdentifier: String
  /**
    * Timezone of the date when the notification was configured to fire.
    */
  var timezone: String
  /**
    * User input if the notification used the `USER_NOTIFICATION_BEHAVIOR_TEXTINPUT` behavior.
    */
  var typedText: String
  /**
    * Custom data object.
    */
  var userInfo: js.Any
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
}

