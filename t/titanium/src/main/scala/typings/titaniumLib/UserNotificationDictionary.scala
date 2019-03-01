package typings
package titaniumLib

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
  var badge: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Category identifier of the notification.
  	 */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Date and time when the notification was configured to fire.
  	 */
  var date: js.UndefOr[stdLib.Date] = js.undefined
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
    badge: scala.Int | scala.Double = null,
    category: java.lang.String = null,
    date: stdLib.Date = null,
    region: js.Any = null,
    sound: java.lang.String = null,
    timezone: java.lang.String = null,
    userInfo: js.Any = null
  ): UserNotificationDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifier")(identifier)
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

