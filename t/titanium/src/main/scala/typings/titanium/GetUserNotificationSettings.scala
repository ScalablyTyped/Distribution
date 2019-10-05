package typings.titanium

import typings.titanium.Titanium.App.iOS.UserNotificationCategory
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
  var alertSetting: js.UndefOr[Double] = js.undefined
  /**
  	 * The current alert style used to display notifications.
  	 */
  var alertStyle: js.UndefOr[Double] = js.undefined
  /**
  	 * The current authorization status for using notifications.
  	 */
  var authorizationStatus: js.UndefOr[Double] = js.undefined
  /**
  	 * The current badge settings.
  	 */
  var badgeSetting: js.UndefOr[Double] = js.undefined
  /**
  	 * The current CarPlay settings.
  	 */
  var carPlaySetting: js.UndefOr[Double] = js.undefined
  /**
  	 * Set of categories of user notification actions required by the applicaiton to use.
  	 */
  var categories: js.UndefOr[js.Array[UserNotificationCategory]] = js.undefined
  /**
  	 * The authorization status to play sounds for critical alerts.
  	 * Available in Titanium SDK 7.4.0 and later.
  	 */
  var criticalAlertSetting: js.UndefOr[Double] = js.undefined
  /**
  	 * The current lock-screen settings.
  	 */
  var lockScreenSetting: js.UndefOr[Double] = js.undefined
  /**
  	 * The current notication-center settings.
  	 */
  var notificationCenterSetting: js.UndefOr[Double] = js.undefined
  /**
  	 * A Boolean value indicating the system displays a button for in-app notification settings.
  	 * Available in Titanium SDK 7.4.0 and later.
  	 */
  var providesAppNotificationSettings: js.UndefOr[Double] = js.undefined
  /**
  	 * The current sound settings.
  	 */
  var soundSetting: js.UndefOr[Double] = js.undefined
  /**
  	 * Notification types to use.
  	 */
  var types: js.UndefOr[js.Array[Double]] = js.undefined
}

object GetUserNotificationSettings {
  @scala.inline
  def apply(
    alertSetting: Int | Double = null,
    alertStyle: Int | Double = null,
    authorizationStatus: Int | Double = null,
    badgeSetting: Int | Double = null,
    carPlaySetting: Int | Double = null,
    categories: js.Array[UserNotificationCategory] = null,
    criticalAlertSetting: Int | Double = null,
    lockScreenSetting: Int | Double = null,
    notificationCenterSetting: Int | Double = null,
    providesAppNotificationSettings: Int | Double = null,
    soundSetting: Int | Double = null,
    types: js.Array[Double] = null
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

