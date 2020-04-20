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
  var alertAction: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Alert message.
  	 */
  var alertBody: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Image displayed instead of `Default.png` when launching the application.
  	 */
  var alertLaunchImage: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Subtitle of the notification.
  	 */
  var alertSubtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Title of the notification.
  	 */
  var alertTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Application badge value.
  	 */
  var badge: js.UndefOr[Double] = js.undefined
  /**
  	 * Category identifier of the notification.
  	 */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Date and time when the notification was configured to fire.
  	 */
  var date: js.UndefOr[Date] = js.undefined
  /**
  	 * The notification identifier.
  	 */
  var identifier: java.lang.String
  /**
  	 * Region of the notification.
  	 */
  var region: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Path to the sound file configured to play when the notification was fired.
  	 */
  var sound: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Timezone of the date when the notification was configured to fire.
  	 */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Custom data object.
  	 */
  var userInfo: js.UndefOr[js.Any] = js.undefined
}

object UserNotificationDictionary {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    alertAction: java.lang.String = null,
    alertBody: java.lang.String = null,
    alertLaunchImage: java.lang.String = null,
    alertSubtitle: java.lang.String = null,
    alertTitle: java.lang.String = null,
    badge: Int | Double = null,
    category: java.lang.String = null,
    date: Date = null,
    region: js.Any = null,
    sound: java.lang.String = null,
    timezone: java.lang.String = null,
    userInfo: js.Any = null
  ): UserNotificationDictionary = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (alertAction != null) __obj.updateDynamic("alertAction")(alertAction.asInstanceOf[js.Any])
    if (alertBody != null) __obj.updateDynamic("alertBody")(alertBody.asInstanceOf[js.Any])
    if (alertLaunchImage != null) __obj.updateDynamic("alertLaunchImage")(alertLaunchImage.asInstanceOf[js.Any])
    if (alertSubtitle != null) __obj.updateDynamic("alertSubtitle")(alertSubtitle.asInstanceOf[js.Any])
    if (alertTitle != null) __obj.updateDynamic("alertTitle")(alertTitle.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationDictionary]
  }
}

