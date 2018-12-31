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

