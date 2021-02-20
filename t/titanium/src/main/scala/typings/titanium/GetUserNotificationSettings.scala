package typings.titanium

import typings.titanium.Titanium.App.iOS.UserNotificationCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary object of parameters used to register the application with local notifications using
  * the <Titanium.App.iOS.registerUserNotificationSettings> method.
  */
@js.native
trait GetUserNotificationSettings extends StObject {
  
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
  implicit class GetUserNotificationSettingsMutableBuilder[Self <: GetUserNotificationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertSetting(value: Double): Self = StObject.set(x, "alertSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertSettingUndefined: Self = StObject.set(x, "alertSetting", js.undefined)
    
    @scala.inline
    def setAlertStyle(value: Double): Self = StObject.set(x, "alertStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertStyleUndefined: Self = StObject.set(x, "alertStyle", js.undefined)
    
    @scala.inline
    def setAuthorizationStatus(value: Double): Self = StObject.set(x, "authorizationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationStatusUndefined: Self = StObject.set(x, "authorizationStatus", js.undefined)
    
    @scala.inline
    def setBadgeSetting(value: Double): Self = StObject.set(x, "badgeSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeSettingUndefined: Self = StObject.set(x, "badgeSetting", js.undefined)
    
    @scala.inline
    def setCarPlaySetting(value: Double): Self = StObject.set(x, "carPlaySetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarPlaySettingUndefined: Self = StObject.set(x, "carPlaySetting", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Array[UserNotificationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: UserNotificationCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setCriticalAlertSetting(value: Double): Self = StObject.set(x, "criticalAlertSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalAlertSettingUndefined: Self = StObject.set(x, "criticalAlertSetting", js.undefined)
    
    @scala.inline
    def setLockScreenSetting(value: Double): Self = StObject.set(x, "lockScreenSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenSettingUndefined: Self = StObject.set(x, "lockScreenSetting", js.undefined)
    
    @scala.inline
    def setNotificationCenterSetting(value: Double): Self = StObject.set(x, "notificationCenterSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationCenterSettingUndefined: Self = StObject.set(x, "notificationCenterSetting", js.undefined)
    
    @scala.inline
    def setProvidesAppNotificationSettings(value: Double): Self = StObject.set(x, "providesAppNotificationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidesAppNotificationSettingsUndefined: Self = StObject.set(x, "providesAppNotificationSettings", js.undefined)
    
    @scala.inline
    def setSoundSetting(value: Double): Self = StObject.set(x, "soundSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundSettingUndefined: Self = StObject.set(x, "soundSetting", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[Double]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: Double*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
