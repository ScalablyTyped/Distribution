package typings.titanium

import typings.titanium.Titanium.App.iOS.UserNotificationCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters used to register the application with local notifications using
  * the <Titanium.App.iOS.registerUserNotificationSettings> method.
  */
@js.native
trait GetUserNotificationSettings extends js.Object {
  /**
    * The current alert settings.
    */
  var alertSetting: js.UndefOr[Double] = js.native
  /**
    * The current alert style used to display notifications.
    */
  var alertStyle: js.UndefOr[Double] = js.native
  /**
    * The current authorization status for using notifications.
    */
  var authorizationStatus: js.UndefOr[Double] = js.native
  /**
    * The current badge settings.
    */
  var badgeSetting: js.UndefOr[Double] = js.native
  /**
    * The current CarPlay settings.
    */
  var carPlaySetting: js.UndefOr[Double] = js.native
  /**
    * Set of categories of user notification actions required by the applicaiton to use.
    */
  var categories: js.UndefOr[js.Array[UserNotificationCategory]] = js.native
  /**
    * The authorization status to play sounds for critical alerts.
    * Available in Titanium SDK 7.4.0 and later.
    */
  var criticalAlertSetting: js.UndefOr[Double] = js.native
  /**
    * The current lock-screen settings.
    */
  var lockScreenSetting: js.UndefOr[Double] = js.native
  /**
    * The current notication-center settings.
    */
  var notificationCenterSetting: js.UndefOr[Double] = js.native
  /**
    * A Boolean value indicating the system displays a button for in-app notification settings.
    * Available in Titanium SDK 7.4.0 and later.
    */
  var providesAppNotificationSettings: js.UndefOr[Double] = js.native
  /**
    * The current sound settings.
    */
  var soundSetting: js.UndefOr[Double] = js.native
  /**
    * Notification types to use.
    */
  var types: js.UndefOr[js.Array[Double]] = js.native
}

object GetUserNotificationSettings {
  @scala.inline
  def apply(): GetUserNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserNotificationSettings]
  }
  @scala.inline
  implicit class GetUserNotificationSettingsOps[Self <: GetUserNotificationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlertSetting(value: Double): Self = this.set("alertSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlertSetting: Self = this.set("alertSetting", js.undefined)
    @scala.inline
    def setAlertStyle(value: Double): Self = this.set("alertStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlertStyle: Self = this.set("alertStyle", js.undefined)
    @scala.inline
    def setAuthorizationStatus(value: Double): Self = this.set("authorizationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationStatus: Self = this.set("authorizationStatus", js.undefined)
    @scala.inline
    def setBadgeSetting(value: Double): Self = this.set("badgeSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeSetting: Self = this.set("badgeSetting", js.undefined)
    @scala.inline
    def setCarPlaySetting(value: Double): Self = this.set("carPlaySetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarPlaySetting: Self = this.set("carPlaySetting", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: UserNotificationCategory*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[UserNotificationCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setCriticalAlertSetting(value: Double): Self = this.set("criticalAlertSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriticalAlertSetting: Self = this.set("criticalAlertSetting", js.undefined)
    @scala.inline
    def setLockScreenSetting(value: Double): Self = this.set("lockScreenSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScreenSetting: Self = this.set("lockScreenSetting", js.undefined)
    @scala.inline
    def setNotificationCenterSetting(value: Double): Self = this.set("notificationCenterSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationCenterSetting: Self = this.set("notificationCenterSetting", js.undefined)
    @scala.inline
    def setProvidesAppNotificationSettings(value: Double): Self = this.set("providesAppNotificationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvidesAppNotificationSettings: Self = this.set("providesAppNotificationSettings", js.undefined)
    @scala.inline
    def setSoundSetting(value: Double): Self = this.set("soundSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoundSetting: Self = this.set("soundSetting", js.undefined)
    @scala.inline
    def setTypesVarargs(value: Double*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[Double]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

