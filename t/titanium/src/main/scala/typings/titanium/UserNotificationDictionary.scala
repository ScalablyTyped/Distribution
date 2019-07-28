package typings.titanium

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of notification data used in the array of `notifications`
  * when receiving pending or local notifications in
  * <Titanium.App.iOS.UserNotificationCenter.getPendingNotifications> and
  * <Titanium.App.iOS.UserNotificationCenter.getDeliveredNotifications>.
  */
trait UserNotificationDictionary extends js.Object {
  /**
  	 * Alert button text ('Open', by default) or home text ('Press Home to unlock', by default)
  	 * type: String
  	 */
  var alertAction: js.UndefOr[String] = js.undefined
  /**
  	 * Alert message.
  	 */
  var alertBody: js.UndefOr[String] = js.undefined
  /**
  	 * Image displayed instead of `Default.png` when launching the application.
  	 */
  var alertLaunchImage: js.UndefOr[String] = js.undefined
  /**
  	 * Subtitle of the notification.
  	 */
  var alertSubtitle: js.UndefOr[String] = js.undefined
  /**
  	 * Title of the notification.
  	 */
  var alertTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Application badge value.
  	 */
  var badge: js.UndefOr[Double] = js.undefined
  /**
  	 * Category identifier of the notification.
  	 */
  var category: js.UndefOr[String] = js.undefined
  /**
  	 * Date and time when the notification was configured to fire.
  	 */
  var date: js.UndefOr[Date] = js.undefined
  /**
  	 * The notification identifier.
  	 */
  var identifier: String
  /**
  	 * Region of the notification.
  	 */
  var region: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Path to the sound file configured to play when the notification was fired.
  	 */
  var sound: js.UndefOr[String] = js.undefined
  /**
  	 * Timezone of the date when the notification was configured to fire.
  	 */
  var timezone: js.UndefOr[String] = js.undefined
  /**
  	 * Custom data object.
  	 */
  var userInfo: js.UndefOr[js.Any] = js.undefined
}

object UserNotificationDictionary {
  @scala.inline
  def apply(
    identifier: String,
    alertAction: String = null,
    alertBody: String = null,
    alertLaunchImage: String = null,
    alertSubtitle: String = null,
    alertTitle: String = null,
    badge: Int | Double = null,
    category: String = null,
    date: Date = null,
    region: js.Any = null,
    sound: String = null,
    timezone: String = null,
    userInfo: js.Any = null
  ): UserNotificationDictionary = {
    val __obj = js.Dynamic.literal(identifier = identifier)
    if (alertAction != null) __obj.updateDynamic("alertAction")(alertAction)
    if (alertBody != null) __obj.updateDynamic("alertBody")(alertBody)
    if (alertLaunchImage != null) __obj.updateDynamic("alertLaunchImage")(alertLaunchImage)
    if (alertSubtitle != null) __obj.updateDynamic("alertSubtitle")(alertSubtitle)
    if (alertTitle != null) __obj.updateDynamic("alertTitle")(alertTitle)
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category)
    if (date != null) __obj.updateDynamic("date")(date)
    if (region != null) __obj.updateDynamic("region")(region)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo)
    __obj.asInstanceOf[UserNotificationDictionary]
  }
}

