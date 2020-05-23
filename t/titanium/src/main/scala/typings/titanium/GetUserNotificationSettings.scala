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
    alertSetting: js.UndefOr[Double] = js.undefined,
    alertStyle: js.UndefOr[Double] = js.undefined,
    authorizationStatus: js.UndefOr[Double] = js.undefined,
    badgeSetting: js.UndefOr[Double] = js.undefined,
    carPlaySetting: js.UndefOr[Double] = js.undefined,
    categories: js.Array[UserNotificationCategory] = null,
    criticalAlertSetting: js.UndefOr[Double] = js.undefined,
    lockScreenSetting: js.UndefOr[Double] = js.undefined,
    notificationCenterSetting: js.UndefOr[Double] = js.undefined,
    providesAppNotificationSettings: js.UndefOr[Double] = js.undefined,
    soundSetting: js.UndefOr[Double] = js.undefined,
    types: js.Array[Double] = null
  ): GetUserNotificationSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alertSetting)) __obj.updateDynamic("alertSetting")(alertSetting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alertStyle)) __obj.updateDynamic("alertStyle")(alertStyle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(authorizationStatus)) __obj.updateDynamic("authorizationStatus")(authorizationStatus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeSetting)) __obj.updateDynamic("badgeSetting")(badgeSetting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(carPlaySetting)) __obj.updateDynamic("carPlaySetting")(carPlaySetting.get.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(criticalAlertSetting)) __obj.updateDynamic("criticalAlertSetting")(criticalAlertSetting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreenSetting)) __obj.updateDynamic("lockScreenSetting")(lockScreenSetting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationCenterSetting)) __obj.updateDynamic("notificationCenterSetting")(notificationCenterSetting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(providesAppNotificationSettings)) __obj.updateDynamic("providesAppNotificationSettings")(providesAppNotificationSettings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(soundSetting)) __obj.updateDynamic("soundSetting")(soundSetting.get.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserNotificationSettings]
  }
}

