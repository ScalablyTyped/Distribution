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

object GetUserNotificationSettings {
  @scala.inline
  def apply(
    alertSetting: scala.Int | scala.Double = null,
    alertStyle: scala.Int | scala.Double = null,
    authorizationStatus: scala.Int | scala.Double = null,
    badgeSetting: scala.Int | scala.Double = null,
    carPlaySetting: scala.Int | scala.Double = null,
    categories: js.Array[titaniumLib.TitaniumNs.AppNs.iOSNs.UserNotificationCategory] = null,
    criticalAlertSetting: scala.Int | scala.Double = null,
    lockScreenSetting: scala.Int | scala.Double = null,
    notificationCenterSetting: scala.Int | scala.Double = null,
    providesAppNotificationSettings: scala.Int | scala.Double = null,
    soundSetting: scala.Int | scala.Double = null,
    types: js.Array[scala.Double] = null
  ): GetUserNotificationSettings = {
    val __obj = js.Dynamic.literal()
    if (alertSetting != null) __obj.updateDynamic("alertSetting")(alertSetting.asInstanceOf[js.Any])
    if (alertStyle != null) __obj.updateDynamic("alertStyle")(alertStyle.asInstanceOf[js.Any])
    if (authorizationStatus != null) __obj.updateDynamic("authorizationStatus")(authorizationStatus.asInstanceOf[js.Any])
    if (badgeSetting != null) __obj.updateDynamic("badgeSetting")(badgeSetting.asInstanceOf[js.Any])
    if (carPlaySetting != null) __obj.updateDynamic("carPlaySetting")(carPlaySetting.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (criticalAlertSetting != null) __obj.updateDynamic("criticalAlertSetting")(criticalAlertSetting.asInstanceOf[js.Any])
    if (lockScreenSetting != null) __obj.updateDynamic("lockScreenSetting")(lockScreenSetting.asInstanceOf[js.Any])
    if (notificationCenterSetting != null) __obj.updateDynamic("notificationCenterSetting")(notificationCenterSetting.asInstanceOf[js.Any])
    if (providesAppNotificationSettings != null) __obj.updateDynamic("providesAppNotificationSettings")(providesAppNotificationSettings.asInstanceOf[js.Any])
    if (soundSetting != null) __obj.updateDynamic("soundSetting")(soundSetting.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[GetUserNotificationSettings]
  }
}

