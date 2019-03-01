package typings
package urbanairshipDashCordovaLib.UrbanAirshipPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region API Definitions
trait UrbanAirshipStatic extends js.Object {
  /**
    * The enumeration values for use with setNotificationTypes().
    */
  var notificationType: urbanairshipDashCordovaLib.Anon_Alert
  /**
    * (Android Only)
    *
    * Clears the notifications posted by the application.
    *
    * @param callback The function to call on completion.
    */
  def clearNotifications(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Fluent API to edit the channel tag groups by adding or removing tags,
    * then applying the changes.
    *
    * For exmaple:
    *
    * UAirship.editChannelTagGroups()
    *      .addTags("loyalty", ["platinum-member", "gold-member"])
    *      .removeTags("loyalty", ["silver-member", "bronze-member"])
    *      .apply()
    */
  def editChannelTagGroups(): EditChannelTagGroupsApi
  /**
    * Fluent API to edit the named user tag groups by adding or removing
    * tags, then applying the changes.
    *
    * For example:
    *
    * UAirship.editNamedUserTagGroups()
    *      .addTags("loyalty", ["platinum-member", "gold-member"])
    *      .removeTags("loyalty", ["silver-member", "bronze-member"])
    *      .apply()
    *
    * @returns The chainable API instance.
    */
  def editNamedUserTagGroups(): EditNamedUserTagGroupsApi
  /**
    * Gets the alias for this device.
    *
    * @param callback The function to call on completion.
    */
  def getAlias(callback: js.Function1[/* alias */ java.lang.String, scala.Unit]): scala.Unit
  /**
    * (iOS Only)
    *
    * Gets the current application badge number.
    *
    * @param callback The function to call on completion.
    */
  def getBadgeNumber(callback: js.Function1[/* badgeNumber */ scala.Double, scala.Unit]): scala.Unit
  /**
    * Get the push identifier for the device. The channel ID is used to send
    * messages to the device for testing, and is the canonical identifier for
    * the device in Urban Airship.
    *
    * @param callback The function to call on completion.
    */
  def getChannelID(callback: js.Function1[/* id */ java.lang.String, scala.Unit]): scala.Unit
  /**
    * Returns the push message object that contains the data associated with a
    * push notification. The extras dictionary can contain arbitrary key/value
    * data that you use in your application.
    *
    * @param clear Set to true to clear the notification.
    * @param callback The function to call on completion.
    */
  def getLaunchNotification(clear: scala.Boolean, callback: js.Function1[/* push */ PushEvent, scala.Unit]): scala.Unit
  /**
    * Gets the named user ID for this device.
    *
    * @param callback The function to call on completion.
    */
  def getNamedUser(callback: js.Function1[/* namedUserId */ java.lang.String, scala.Unit]): scala.Unit
  /**
    * Get the current quiet time. The quietTime object represents a timespan
    * during which notifications should be silenced. The typical use case is
    * to expose a preference to your users so that they can enable this setting
    * and specify an interval during which they do not wish to be disturbed.
    *
    * @param callback The function to call on completion.
    */
  def getQuietTime(callback: js.Function1[/* quietTime */ QuietTimeTimeSpan, scala.Unit]): scala.Unit
  /**
    * Returns the tags for the device.
    *
    * @param callback The function to call on completion.
    */
  def getTags(callback: js.Function1[/* tags */ js.Array[java.lang.String], scala.Unit]): scala.Unit
  /**
    * Checks if analytics is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isAnalyticsEnabled(callback: js.Function1[/* enabled */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * Checks if background location updates are enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isBackgroundLocationEnabled(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Checks if quiet time is currently in effect.
    *
    * @param callback The function to call on completion.
    */
  def isInQuietTime(callback: js.Function1[/* inQuietTime */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * Checks if location is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isLocationEnabled(callback: js.Function1[/* enabled */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * Checks if quiet time is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isQuietTimeEnabled(callback: js.Function1[/* enabled */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * (Android Only)
    *
    * Checks if sound is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isSoundEnabled(callback: js.Function1[/* enabled */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * Checks if user notifications are enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isUserNotificationsEnabled(callback: js.Function1[/* enabled */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * (Android Only)
    *
    * Checks if vibration is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isVibrateEnabled(callback: js.Function1[/* enabled */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * Records the current location of the device.
    *
    * @param callback The function to call on completion.
    */
  def recordCurrentLocation(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * (iOS Only)
    *
    * Reset the badge number to zero.
    *
    * @param callback The function to call on completion.
    */
  def resetBadge(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Runs an Urban Airship action.
    *
    * @param actionName The name of the action to run.
    * @param actionValue The value for the action.
    * @param callback The function to call on completion.
    */
  def runAction(
    actionName: java.lang.String,
    actionValue: java.lang.String,
    callback: js.Function1[/* result */ RunActionResult, scala.Unit]
  ): scala.Unit
  /**
    * Set alias for the device.
    *
    * @param alias The alias to set for this device.
    * @param callback The function to call on completion.
    */
  def setAlias(alias: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Enables or disables analytics. Disabling analytics will delete any
    * locally stored events and prevent any events from uploading. Features
    * that depend on analytics being enabled may not work properly if it’s
    * disabled (reports, region triggers, location segmentation, push to
    * local time).
    *
    * @param enabled Set to true to enable analytics, false to disable.
    * @param callback The function to call on completion.
    */
  def setAnalyticsEnabled(enabled: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * (iOS Only)
    *
    * Set whether the UA Autobadge feature is enabled.
    *
    * @param enabled Set to true to enable Autobadge, false to disable.
    * @param callback The function to call on completion.
    */
  def setAutobadgeEnabled(enabled: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Enables or disables background location on the device.
    *
    * @param enabled Set to true to enable background location, false to disable.
    * @param callback The function to call on completion.
    */
  def setBackgroundLocationEnabled(enabled: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * (iOS Only)
    *
    * Set the current application badge number.
    *
    * @param badge The number to use for the badge.
    * @param callback The function to call on completion.
    */
  def setBadgeNumber(badge: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Enables or disables Urban Airship location services on the device.
    *
    * @param enabled Set to true to enable location, false to disable.
    * @param callback The function to call on completion.
    */
  def setLocationEnabled(enabled: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Set the named user ID for this device.
    *
    * @param namedUser The named user ID.
    * @param callback The function to call on completion.
    */
  def setNamedUser(namedUserId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * (iOS Only)
    *
    * On iOS, registration for push requires specifying what
    * combination of badges, sound and alerts are desired. This function
    * must be explicitly called in order to begin the registration process.
    *
    * For example:
    *
    * UAirship.setNotificationTypes(UAirship.notificationType.sound |
    *                                  UAirship.notificationType.alert);
    *
    * @param bitmask The notification types to set.
    * @param callback The function to call on completion.
    */
  def setNotificationTypes(bitmask: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Set the quiet time for the device.
    *
    * @param startHour The start hour for quiet time.
    * @param startMinute The start minute for quiet time.
    * @param endHour The end hour for quiet time.
    * @param endMinute the end minute for quiet time.
    * @param callback The function to call on completion.
    */
  def setQuietTime(
    startHour: scala.Double,
    startMinute: scala.Double,
    endHour: scala.Double,
    endMinute: scala.Double,
    callback: js.Function0[scala.Unit]
  ): scala.Unit
  /**
    * Enables or disables quiet time.
    *
    * @param enabled Set to true to enable quiet time, false to disable.
    * @param callback The function to call on completion.
    */
  def setQuietTimeEnabled(enabled: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * (Android only, iOS sound settings come in the push)
    *
    * Set whether the device makes sound on push.
    *
    * @param enabled Set to true to enable sound, false to disable.
    * @param callback The function to call on completion.
    */
  def setSoundEnabled(enabled: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Sets tags for the device.
    *
    * @param tags An array of tags.
    * @param callback The function to call on completion.
    */
  def setTags(tags: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Enables or disables user notifications on the device.
    * This will prompt users to opt-in to notifications on iOS.
    *
    * @param enabled Set to true to enable notifications, false to disable.
    * @param callback The function to call on completion.
    */
  def setUserNotificationsEnabled(enabled: scala.Boolean, callback: js.Function1[/* status */ java.lang.String, scala.Unit]): scala.Unit
  /**
    * (Android Only)
    *
    * Set whether the device vibrates on push.
    *
    * @param enabled Set to true to enable vibration, false to disable.
    * @param callback The function to call on completion.
    */
  def setVibrateEnabled(enabled: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit
}

object UrbanAirshipStatic {
  @scala.inline
  def apply(
    clearNotifications: js.Function1[js.Function0[scala.Unit], scala.Unit],
    editChannelTagGroups: js.Function0[EditChannelTagGroupsApi],
    editNamedUserTagGroups: js.Function0[EditNamedUserTagGroupsApi],
    getAlias: js.Function1[js.Function1[/* alias */ java.lang.String, scala.Unit], scala.Unit],
    getBadgeNumber: js.Function1[js.Function1[/* badgeNumber */ scala.Double, scala.Unit], scala.Unit],
    getChannelID: js.Function1[js.Function1[/* id */ java.lang.String, scala.Unit], scala.Unit],
    getLaunchNotification: js.Function2[scala.Boolean, js.Function1[/* push */ PushEvent, scala.Unit], scala.Unit],
    getNamedUser: js.Function1[js.Function1[/* namedUserId */ java.lang.String, scala.Unit], scala.Unit],
    getQuietTime: js.Function1[js.Function1[/* quietTime */ QuietTimeTimeSpan, scala.Unit], scala.Unit],
    getTags: js.Function1[js.Function1[/* tags */ js.Array[java.lang.String], scala.Unit], scala.Unit],
    isAnalyticsEnabled: js.Function1[js.Function1[/* enabled */ scala.Boolean, scala.Unit], scala.Unit],
    isBackgroundLocationEnabled: js.Function1[js.Function0[scala.Unit], scala.Unit],
    isInQuietTime: js.Function1[js.Function1[/* inQuietTime */ scala.Boolean, scala.Unit], scala.Unit],
    isLocationEnabled: js.Function1[js.Function1[/* enabled */ scala.Boolean, scala.Unit], scala.Unit],
    isQuietTimeEnabled: js.Function1[js.Function1[/* enabled */ scala.Boolean, scala.Unit], scala.Unit],
    isSoundEnabled: js.Function1[js.Function1[/* enabled */ scala.Boolean, scala.Unit], scala.Unit],
    isUserNotificationsEnabled: js.Function1[js.Function1[/* enabled */ scala.Boolean, scala.Unit], scala.Unit],
    isVibrateEnabled: js.Function1[js.Function1[/* enabled */ scala.Boolean, scala.Unit], scala.Unit],
    notificationType: urbanairshipDashCordovaLib.Anon_Alert,
    recordCurrentLocation: js.Function1[js.Function0[scala.Unit], scala.Unit],
    resetBadge: js.Function1[js.Function0[scala.Unit], scala.Unit],
    runAction: js.Function3[
      java.lang.String, 
      java.lang.String, 
      js.Function1[/* result */ RunActionResult, scala.Unit], 
      scala.Unit
    ],
    setAlias: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    setAnalyticsEnabled: js.Function2[scala.Boolean, js.Function0[scala.Unit], scala.Unit],
    setAutobadgeEnabled: js.Function2[scala.Boolean, js.Function0[scala.Unit], scala.Unit],
    setBackgroundLocationEnabled: js.Function2[scala.Boolean, js.Function0[scala.Unit], scala.Unit],
    setBadgeNumber: js.Function2[scala.Double, js.Function0[scala.Unit], scala.Unit],
    setLocationEnabled: js.Function2[scala.Boolean, js.Function0[scala.Unit], scala.Unit],
    setNamedUser: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    setNotificationTypes: js.Function2[scala.Double, js.Function0[scala.Unit], scala.Unit],
    setQuietTime: js.Function5[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      js.Function0[scala.Unit], 
      scala.Unit
    ],
    setQuietTimeEnabled: js.Function2[scala.Boolean, js.Function0[scala.Unit], scala.Unit],
    setSoundEnabled: js.Function2[scala.Boolean, js.Function0[scala.Unit], scala.Unit],
    setTags: js.Function2[js.Array[java.lang.String], js.Function0[scala.Unit], scala.Unit],
    setUserNotificationsEnabled: js.Function2[scala.Boolean, js.Function1[/* status */ java.lang.String, scala.Unit], scala.Unit],
    setVibrateEnabled: js.Function2[scala.Boolean, js.Function0[scala.Unit], scala.Unit]
  ): UrbanAirshipStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearNotifications")(clearNotifications)
    __obj.updateDynamic("editChannelTagGroups")(editChannelTagGroups)
    __obj.updateDynamic("editNamedUserTagGroups")(editNamedUserTagGroups)
    __obj.updateDynamic("getAlias")(getAlias)
    __obj.updateDynamic("getBadgeNumber")(getBadgeNumber)
    __obj.updateDynamic("getChannelID")(getChannelID)
    __obj.updateDynamic("getLaunchNotification")(getLaunchNotification)
    __obj.updateDynamic("getNamedUser")(getNamedUser)
    __obj.updateDynamic("getQuietTime")(getQuietTime)
    __obj.updateDynamic("getTags")(getTags)
    __obj.updateDynamic("isAnalyticsEnabled")(isAnalyticsEnabled)
    __obj.updateDynamic("isBackgroundLocationEnabled")(isBackgroundLocationEnabled)
    __obj.updateDynamic("isInQuietTime")(isInQuietTime)
    __obj.updateDynamic("isLocationEnabled")(isLocationEnabled)
    __obj.updateDynamic("isQuietTimeEnabled")(isQuietTimeEnabled)
    __obj.updateDynamic("isSoundEnabled")(isSoundEnabled)
    __obj.updateDynamic("isUserNotificationsEnabled")(isUserNotificationsEnabled)
    __obj.updateDynamic("isVibrateEnabled")(isVibrateEnabled)
    __obj.updateDynamic("notificationType")(notificationType)
    __obj.updateDynamic("recordCurrentLocation")(recordCurrentLocation)
    __obj.updateDynamic("resetBadge")(resetBadge)
    __obj.updateDynamic("runAction")(runAction)
    __obj.updateDynamic("setAlias")(setAlias)
    __obj.updateDynamic("setAnalyticsEnabled")(setAnalyticsEnabled)
    __obj.updateDynamic("setAutobadgeEnabled")(setAutobadgeEnabled)
    __obj.updateDynamic("setBackgroundLocationEnabled")(setBackgroundLocationEnabled)
    __obj.updateDynamic("setBadgeNumber")(setBadgeNumber)
    __obj.updateDynamic("setLocationEnabled")(setLocationEnabled)
    __obj.updateDynamic("setNamedUser")(setNamedUser)
    __obj.updateDynamic("setNotificationTypes")(setNotificationTypes)
    __obj.updateDynamic("setQuietTime")(setQuietTime)
    __obj.updateDynamic("setQuietTimeEnabled")(setQuietTimeEnabled)
    __obj.updateDynamic("setSoundEnabled")(setSoundEnabled)
    __obj.updateDynamic("setTags")(setTags)
    __obj.updateDynamic("setUserNotificationsEnabled")(setUserNotificationsEnabled)
    __obj.updateDynamic("setVibrateEnabled")(setVibrateEnabled)
    __obj.asInstanceOf[UrbanAirshipStatic]
  }
}

