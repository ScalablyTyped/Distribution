package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Dictionary object of parameters used to create a notification using
 * <Titanium.App.iOS.scheduleLocalNotification>.
 */

trait NotificationParams extends js.Object {
  /**
  	 * Alert button text ('Open', by default) or home text ('Press Home to unlock', by default)
  	 * to display.
  	 */
  var alertAction: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Alert message to display.
  	 */
  var alertBody: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Image to display instead of `Default.png` when launching the application.
  	 */
  var alertLaunchImage: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Alert subtitle to display.
  	 */
  var alertSubtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Alert title to display.
  	 */
  var alertTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Notification attachments to display.
  	 */
  var attachments: js.UndefOr[js.Array[UserNotificationAttachment]] = js.undefined
  /**
  	 * Application badge value.
  	 */
  var badge: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * String identifier of category of actions to be displayed for an interactive notification.
  	 */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Date and time for the notification to occur.
  	 */
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /**
  	 * The notification identifier.
  	 */
  var identifier: java.lang.String
  /**
  	 * Region the notification will be triggered in. Allowed parameter are:
  	 * - `latitude`: Latitude of the location center, in decimal degrees (required).
  	 * - `longitude`: Longitude of the location center, in decimal degrees (required).
  	 * - `triggersOnce`: Whether or not the notification will only fire once (optional, default: true).
  	 */
  var region: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Interval to repeat the notification. One of `weekly`, `daily`, `yearly,` `monthly`.
  	 */
  var repeat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Path to the sound file to play when notification occurs, relative to the `Resources` folder.
  	 */
  var sound: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The string the notification adds to the category's summary format string.
  	 */
  var summaryArgument: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The number of items the notification adds to the category's summary format string.
  	 */
  var summaryArgumentCount: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Timezone of the date configured for the notification. If not set, the system timezone is used.
  	 */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Data to pass to the application with the notification event.
  	 */
  var userInfo: js.UndefOr[js.Any] = js.undefined
}

