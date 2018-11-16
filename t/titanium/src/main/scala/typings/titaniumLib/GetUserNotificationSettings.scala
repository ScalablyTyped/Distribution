package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Dictionary object of parameters used to register the application with local notifications using
 * the <Titanium.App.iOS.registerUserNotificationSettings> method.
 */

trait GetUserNotificationSettings extends js.Object {
  /**
  	 * The current alert settings.
  	 */
  var alertSetting: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The current alert style used to display notifications.
  	 */
  var alertStyle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The current authorization status for using notifications.
  	 */
  var authorizationStatus: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The current badge settings.
  	 */
  var badgeSetting: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The current CarPlay settings.
  	 */
  var carPlaySetting: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set of categories of user notification actions required by the applicaiton to use.
  	 */
  var categories: js.UndefOr[js.Array[titaniumLib.TitaniumNs.AppNs.iOSNs.UserNotificationCategory]] = js.undefined
  /**
  	 * The authorization status to play sounds for critical alerts.
  	 * Available in Titanium SDK 7.4.0 and later.
  	 */
  var criticalAlertSetting: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The current lock-screen settings.
  	 */
  var lockScreenSetting: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The current notication-center settings.
  	 */
  var notificationCenterSetting: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A Boolean value indicating the system displays a button for in-app notification settings.
  	 * Available in Titanium SDK 7.4.0 and later.
  	 */
  var providesAppNotificationSettings: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The current sound settings.
  	 */
  var soundSetting: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Notification types to use.
  	 */
  var types: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

