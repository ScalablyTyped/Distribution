package typings.urbanairshipCordova

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.urbanairshipCordova.anon.Alert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UrbanAirshipPlugin {
  
  /**
    * Describes the chainable API object returned by editChannelTagGroups().
    */
  @js.native
  trait EditChannelTagGroupsApi extends StObject {
    
    /**
      * Used to add the given tags to the given tag group.
      *
      * @param tagGroup The tag group to add tags to.
      * @param tags The tags to add to the group.
      *
      * @returns The chainable API instance.
      */
    def addTags(tagGroup: String, tags: js.Array[String]): EditChannelTagGroupsApi = js.native
    
    /**
      * Used to apply the changes from the chained API call.
      *
      * @param callback The optional function to call on completion.
      */
    @JSName("apply")
    def apply(): Unit = js.native
    @JSName("apply")
    def apply(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Used to remove the given tags from the given tag group.
      *
      * @param tagGroup The tag group to remove tags from.
      * @param tags The tags to remove from the group.
      *
      * @returns The chainable API instance.
      */
    def removeTags(tagGroup: String, tags: js.Array[String]): EditChannelTagGroupsApi = js.native
  }
  
  /**
    * Describes the chainable API object returned by editNamedUserTagGroups().
    */
  @js.native
  trait EditNamedUserTagGroupsApi extends StObject {
    
    /**
      * Used to add the given tags to the given tag group.
      *
      * @param tagGroup The tag group to add tags to.
      * @param tags The tags to add to the group.
      *
      * @returns The chainable API instance.
      */
    def addTags(tagGroup: String, tags: js.Array[String]): EditNamedUserTagGroupsApi = js.native
    
    /**
      * Used to apply the changes from the chained API call.
      *
      * @param callback The optional function to call on completion.
      */
    @JSName("apply")
    def apply(): Unit = js.native
    @JSName("apply")
    def apply(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Used to remove the given tags from the given tag group.
      *
      * @param tagGroup The tag group to remove tags from.
      * @param tags The tags to remove from the group.
      *
      * @returns The chainable API instance.
      */
    def removeTags(tagGroup: String, tags: js.Array[String]): EditNamedUserTagGroupsApi = js.native
  }
  
  //#endregion
  //#region Data Types
  @js.native
  trait PushEvent
    extends StObject
       with Event {
    
    var extras: StringDictionary[Any] = js.native
    
    var message: String = js.native
  }
  
  /**
    * Represents a timespan during which notifications should be silenced.
    *
    * For example, 10PM - 6AM would be:
    * { startHour: 22, startMinute: 0, endHour: 6, endMinute: 0 }
    */
  trait QuietTimeTimeSpan extends StObject {
    
    var endHour: Double
    
    var endMinute: Double
    
    var startHour: Double
    
    var startMinute: Double
  }
  object QuietTimeTimeSpan {
    
    inline def apply(endHour: Double, endMinute: Double, startHour: Double, startMinute: Double): QuietTimeTimeSpan = {
      val __obj = js.Dynamic.literal(endHour = endHour.asInstanceOf[js.Any], endMinute = endMinute.asInstanceOf[js.Any], startHour = startHour.asInstanceOf[js.Any], startMinute = startMinute.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuietTimeTimeSpan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuietTimeTimeSpan] (val x: Self) extends AnyVal {
      
      inline def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
      
      inline def setEndMinute(value: Double): Self = StObject.set(x, "endMinute", value.asInstanceOf[js.Any])
      
      inline def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
      
      inline def setStartMinute(value: Double): Self = StObject.set(x, "startMinute", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RegistrationEvent
    extends StObject
       with Event {
    
    /**
      * The channel ID for the device.
      */
    var channelID: String = js.native
    
    /**
      * (iOS Only)
      *
      * The push token for the device.
      */
    var deviceToken: String = js.native
    
    var error: String = js.native
  }
  
  /**
    * The result of the runAction() call.
    */
  trait RunActionResult extends StObject {
    
    var error: String
    
    var value: Any
  }
  object RunActionResult {
    
    inline def apply(error: String, value: Any): RunActionResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunActionResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunActionResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  //#region API Definitions
  trait UrbanAirshipStatic extends StObject {
    
    /**
      * (Android Only)
      *
      * Clears the notifications posted by the application.
      *
      * @param callback The function to call on completion.
      */
    def clearNotifications(callback: js.Function0[Unit]): Unit
    
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
    def getAlias(callback: js.Function1[/* alias */ String, Unit]): Unit
    
    /**
      * (iOS Only)
      *
      * Gets the current application badge number.
      *
      * @param callback The function to call on completion.
      */
    def getBadgeNumber(callback: js.Function1[/* badgeNumber */ Double, Unit]): Unit
    
    /**
      * Get the push identifier for the device. The channel ID is used to send
      * messages to the device for testing, and is the canonical identifier for
      * the device in Urban Airship.
      *
      * @param callback The function to call on completion.
      */
    def getChannelID(callback: js.Function1[/* id */ String, Unit]): Unit
    
    /**
      * Returns the push message object that contains the data associated with a
      * push notification. The extras dictionary can contain arbitrary key/value
      * data that you use in your application.
      *
      * @param clear Set to true to clear the notification.
      * @param callback The function to call on completion.
      */
    def getLaunchNotification(clear: Boolean, callback: js.Function1[/* push */ PushEvent, Unit]): Unit
    
    /**
      * Gets the named user ID for this device.
      *
      * @param callback The function to call on completion.
      */
    def getNamedUser(callback: js.Function1[/* namedUserId */ String, Unit]): Unit
    
    /**
      * Get the current quiet time. The quietTime object represents a timespan
      * during which notifications should be silenced. The typical use case is
      * to expose a preference to your users so that they can enable this setting
      * and specify an interval during which they do not wish to be disturbed.
      *
      * @param callback The function to call on completion.
      */
    def getQuietTime(callback: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit]): Unit
    
    /**
      * Returns the tags for the device.
      *
      * @param callback The function to call on completion.
      */
    def getTags(callback: js.Function1[/* tags */ js.Array[String], Unit]): Unit
    
    /**
      * Checks if analytics is enabled or not.
      *
      * @param callback The function to call on completion.
      */
    def isAnalyticsEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
    
    /**
      * Checks if background location updates are enabled or not.
      *
      * @param callback The function to call on completion.
      */
    def isBackgroundLocationEnabled(callback: js.Function0[Unit]): Unit
    
    /**
      * Checks if quiet time is currently in effect.
      *
      * @param callback The function to call on completion.
      */
    def isInQuietTime(callback: js.Function1[/* inQuietTime */ Boolean, Unit]): Unit
    
    /**
      * Checks if location is enabled or not.
      *
      * @param callback The function to call on completion.
      */
    def isLocationEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
    
    /**
      * Checks if quiet time is enabled or not.
      *
      * @param callback The function to call on completion.
      */
    def isQuietTimeEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
    
    /**
      * (Android Only)
      *
      * Checks if sound is enabled or not.
      *
      * @param callback The function to call on completion.
      */
    def isSoundEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
    
    /**
      * Checks if user notifications are enabled or not.
      *
      * @param callback The function to call on completion.
      */
    def isUserNotificationsEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
    
    /**
      * (Android Only)
      *
      * Checks if vibration is enabled or not.
      *
      * @param callback The function to call on completion.
      */
    def isVibrateEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
    
    /**
      * The enumeration values for use with setNotificationTypes().
      */
    var notificationType: Alert
    
    /**
      * Records the current location of the device.
      *
      * @param callback The function to call on completion.
      */
    def recordCurrentLocation(callback: js.Function0[Unit]): Unit
    
    /**
      * (iOS Only)
      *
      * Reset the badge number to zero.
      *
      * @param callback The function to call on completion.
      */
    def resetBadge(callback: js.Function0[Unit]): Unit
    
    /**
      * Runs an Urban Airship action.
      *
      * @param actionName The name of the action to run.
      * @param actionValue The value for the action.
      * @param callback The function to call on completion.
      */
    def runAction(
      actionName: String,
      actionValue: String,
      callback: js.Function1[/* result */ RunActionResult, Unit]
    ): Unit
    
    /**
      * Set alias for the device.
      *
      * @param alias The alias to set for this device.
      * @param callback The function to call on completion.
      */
    def setAlias(alias: String, callback: js.Function0[Unit]): Unit
    
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
    def setAnalyticsEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
    
    /**
      * (iOS Only)
      *
      * Set whether the UA Autobadge feature is enabled.
      *
      * @param enabled Set to true to enable Autobadge, false to disable.
      * @param callback The function to call on completion.
      */
    def setAutobadgeEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
    
    /**
      * Enables or disables background location on the device.
      *
      * @param enabled Set to true to enable background location, false to disable.
      * @param callback The function to call on completion.
      */
    def setBackgroundLocationEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
    
    /**
      * (iOS Only)
      *
      * Set the current application badge number.
      *
      * @param badge The number to use for the badge.
      * @param callback The function to call on completion.
      */
    def setBadgeNumber(badge: Double, callback: js.Function0[Unit]): Unit
    
    /**
      * Enables or disables Urban Airship location services on the device.
      *
      * @param enabled Set to true to enable location, false to disable.
      * @param callback The function to call on completion.
      */
    def setLocationEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
    
    /**
      * Set the named user ID for this device.
      *
      * @param namedUser The named user ID.
      * @param callback The function to call on completion.
      */
    def setNamedUser(namedUserId: String, callback: js.Function0[Unit]): Unit
    
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
    def setNotificationTypes(bitmask: Double, callback: js.Function0[Unit]): Unit
    
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
      startHour: Double,
      startMinute: Double,
      endHour: Double,
      endMinute: Double,
      callback: js.Function0[Unit]
    ): Unit
    
    /**
      * Enables or disables quiet time.
      *
      * @param enabled Set to true to enable quiet time, false to disable.
      * @param callback The function to call on completion.
      */
    def setQuietTimeEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
    
    /**
      * (Android only, iOS sound settings come in the push)
      *
      * Set whether the device makes sound on push.
      *
      * @param enabled Set to true to enable sound, false to disable.
      * @param callback The function to call on completion.
      */
    def setSoundEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
    
    /**
      * Sets tags for the device.
      *
      * @param tags An array of tags.
      * @param callback The function to call on completion.
      */
    def setTags(tags: js.Array[String], callback: js.Function0[Unit]): Unit
    
    /**
      * Enables or disables user notifications on the device.
      * This will prompt users to opt-in to notifications on iOS.
      *
      * @param enabled Set to true to enable notifications, false to disable.
      * @param callback The function to call on completion.
      */
    def setUserNotificationsEnabled(enabled: Boolean, callback: js.Function1[/* status */ String, Unit]): Unit
    
    /**
      * (Android Only)
      *
      * Set whether the device vibrates on push.
      *
      * @param enabled Set to true to enable vibration, false to disable.
      * @param callback The function to call on completion.
      */
    def setVibrateEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
  }
  object UrbanAirshipStatic {
    
    inline def apply(
      clearNotifications: js.Function0[Unit] => Unit,
      editChannelTagGroups: () => EditChannelTagGroupsApi,
      editNamedUserTagGroups: () => EditNamedUserTagGroupsApi,
      getAlias: js.Function1[/* alias */ String, Unit] => Unit,
      getBadgeNumber: js.Function1[/* badgeNumber */ Double, Unit] => Unit,
      getChannelID: js.Function1[/* id */ String, Unit] => Unit,
      getLaunchNotification: (Boolean, js.Function1[/* push */ PushEvent, Unit]) => Unit,
      getNamedUser: js.Function1[/* namedUserId */ String, Unit] => Unit,
      getQuietTime: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit] => Unit,
      getTags: js.Function1[/* tags */ js.Array[String], Unit] => Unit,
      isAnalyticsEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
      isBackgroundLocationEnabled: js.Function0[Unit] => Unit,
      isInQuietTime: js.Function1[/* inQuietTime */ Boolean, Unit] => Unit,
      isLocationEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
      isQuietTimeEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
      isSoundEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
      isUserNotificationsEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
      isVibrateEnabled: js.Function1[/* enabled */ Boolean, Unit] => Unit,
      notificationType: Alert,
      recordCurrentLocation: js.Function0[Unit] => Unit,
      resetBadge: js.Function0[Unit] => Unit,
      runAction: (String, String, js.Function1[/* result */ RunActionResult, Unit]) => Unit,
      setAlias: (String, js.Function0[Unit]) => Unit,
      setAnalyticsEnabled: (Boolean, js.Function0[Unit]) => Unit,
      setAutobadgeEnabled: (Boolean, js.Function0[Unit]) => Unit,
      setBackgroundLocationEnabled: (Boolean, js.Function0[Unit]) => Unit,
      setBadgeNumber: (Double, js.Function0[Unit]) => Unit,
      setLocationEnabled: (Boolean, js.Function0[Unit]) => Unit,
      setNamedUser: (String, js.Function0[Unit]) => Unit,
      setNotificationTypes: (Double, js.Function0[Unit]) => Unit,
      setQuietTime: (Double, Double, Double, Double, js.Function0[Unit]) => Unit,
      setQuietTimeEnabled: (Boolean, js.Function0[Unit]) => Unit,
      setSoundEnabled: (Boolean, js.Function0[Unit]) => Unit,
      setTags: (js.Array[String], js.Function0[Unit]) => Unit,
      setUserNotificationsEnabled: (Boolean, js.Function1[/* status */ String, Unit]) => Unit,
      setVibrateEnabled: (Boolean, js.Function0[Unit]) => Unit
    ): UrbanAirshipStatic = {
      val __obj = js.Dynamic.literal(clearNotifications = js.Any.fromFunction1(clearNotifications), editChannelTagGroups = js.Any.fromFunction0(editChannelTagGroups), editNamedUserTagGroups = js.Any.fromFunction0(editNamedUserTagGroups), getAlias = js.Any.fromFunction1(getAlias), getBadgeNumber = js.Any.fromFunction1(getBadgeNumber), getChannelID = js.Any.fromFunction1(getChannelID), getLaunchNotification = js.Any.fromFunction2(getLaunchNotification), getNamedUser = js.Any.fromFunction1(getNamedUser), getQuietTime = js.Any.fromFunction1(getQuietTime), getTags = js.Any.fromFunction1(getTags), isAnalyticsEnabled = js.Any.fromFunction1(isAnalyticsEnabled), isBackgroundLocationEnabled = js.Any.fromFunction1(isBackgroundLocationEnabled), isInQuietTime = js.Any.fromFunction1(isInQuietTime), isLocationEnabled = js.Any.fromFunction1(isLocationEnabled), isQuietTimeEnabled = js.Any.fromFunction1(isQuietTimeEnabled), isSoundEnabled = js.Any.fromFunction1(isSoundEnabled), isUserNotificationsEnabled = js.Any.fromFunction1(isUserNotificationsEnabled), isVibrateEnabled = js.Any.fromFunction1(isVibrateEnabled), notificationType = notificationType.asInstanceOf[js.Any], recordCurrentLocation = js.Any.fromFunction1(recordCurrentLocation), resetBadge = js.Any.fromFunction1(resetBadge), runAction = js.Any.fromFunction3(runAction), setAlias = js.Any.fromFunction2(setAlias), setAnalyticsEnabled = js.Any.fromFunction2(setAnalyticsEnabled), setAutobadgeEnabled = js.Any.fromFunction2(setAutobadgeEnabled), setBackgroundLocationEnabled = js.Any.fromFunction2(setBackgroundLocationEnabled), setBadgeNumber = js.Any.fromFunction2(setBadgeNumber), setLocationEnabled = js.Any.fromFunction2(setLocationEnabled), setNamedUser = js.Any.fromFunction2(setNamedUser), setNotificationTypes = js.Any.fromFunction2(setNotificationTypes), setQuietTime = js.Any.fromFunction5(setQuietTime), setQuietTimeEnabled = js.Any.fromFunction2(setQuietTimeEnabled), setSoundEnabled = js.Any.fromFunction2(setSoundEnabled), setTags = js.Any.fromFunction2(setTags), setUserNotificationsEnabled = js.Any.fromFunction2(setUserNotificationsEnabled), setVibrateEnabled = js.Any.fromFunction2(setVibrateEnabled))
      __obj.asInstanceOf[UrbanAirshipStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrbanAirshipStatic] (val x: Self) extends AnyVal {
      
      inline def setClearNotifications(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "clearNotifications", js.Any.fromFunction1(value))
      
      inline def setEditChannelTagGroups(value: () => EditChannelTagGroupsApi): Self = StObject.set(x, "editChannelTagGroups", js.Any.fromFunction0(value))
      
      inline def setEditNamedUserTagGroups(value: () => EditNamedUserTagGroupsApi): Self = StObject.set(x, "editNamedUserTagGroups", js.Any.fromFunction0(value))
      
      inline def setGetAlias(value: js.Function1[/* alias */ String, Unit] => Unit): Self = StObject.set(x, "getAlias", js.Any.fromFunction1(value))
      
      inline def setGetBadgeNumber(value: js.Function1[/* badgeNumber */ Double, Unit] => Unit): Self = StObject.set(x, "getBadgeNumber", js.Any.fromFunction1(value))
      
      inline def setGetChannelID(value: js.Function1[/* id */ String, Unit] => Unit): Self = StObject.set(x, "getChannelID", js.Any.fromFunction1(value))
      
      inline def setGetLaunchNotification(value: (Boolean, js.Function1[/* push */ PushEvent, Unit]) => Unit): Self = StObject.set(x, "getLaunchNotification", js.Any.fromFunction2(value))
      
      inline def setGetNamedUser(value: js.Function1[/* namedUserId */ String, Unit] => Unit): Self = StObject.set(x, "getNamedUser", js.Any.fromFunction1(value))
      
      inline def setGetQuietTime(value: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit] => Unit): Self = StObject.set(x, "getQuietTime", js.Any.fromFunction1(value))
      
      inline def setGetTags(value: js.Function1[/* tags */ js.Array[String], Unit] => Unit): Self = StObject.set(x, "getTags", js.Any.fromFunction1(value))
      
      inline def setIsAnalyticsEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = StObject.set(x, "isAnalyticsEnabled", js.Any.fromFunction1(value))
      
      inline def setIsBackgroundLocationEnabled(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "isBackgroundLocationEnabled", js.Any.fromFunction1(value))
      
      inline def setIsInQuietTime(value: js.Function1[/* inQuietTime */ Boolean, Unit] => Unit): Self = StObject.set(x, "isInQuietTime", js.Any.fromFunction1(value))
      
      inline def setIsLocationEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = StObject.set(x, "isLocationEnabled", js.Any.fromFunction1(value))
      
      inline def setIsQuietTimeEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = StObject.set(x, "isQuietTimeEnabled", js.Any.fromFunction1(value))
      
      inline def setIsSoundEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = StObject.set(x, "isSoundEnabled", js.Any.fromFunction1(value))
      
      inline def setIsUserNotificationsEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = StObject.set(x, "isUserNotificationsEnabled", js.Any.fromFunction1(value))
      
      inline def setIsVibrateEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Unit): Self = StObject.set(x, "isVibrateEnabled", js.Any.fromFunction1(value))
      
      inline def setNotificationType(value: Alert): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      inline def setRecordCurrentLocation(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "recordCurrentLocation", js.Any.fromFunction1(value))
      
      inline def setResetBadge(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "resetBadge", js.Any.fromFunction1(value))
      
      inline def setRunAction(value: (String, String, js.Function1[/* result */ RunActionResult, Unit]) => Unit): Self = StObject.set(x, "runAction", js.Any.fromFunction3(value))
      
      inline def setSetAlias(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setAlias", js.Any.fromFunction2(value))
      
      inline def setSetAnalyticsEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setAnalyticsEnabled", js.Any.fromFunction2(value))
      
      inline def setSetAutobadgeEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setAutobadgeEnabled", js.Any.fromFunction2(value))
      
      inline def setSetBackgroundLocationEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setBackgroundLocationEnabled", js.Any.fromFunction2(value))
      
      inline def setSetBadgeNumber(value: (Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setBadgeNumber", js.Any.fromFunction2(value))
      
      inline def setSetLocationEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setLocationEnabled", js.Any.fromFunction2(value))
      
      inline def setSetNamedUser(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setNamedUser", js.Any.fromFunction2(value))
      
      inline def setSetNotificationTypes(value: (Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setNotificationTypes", js.Any.fromFunction2(value))
      
      inline def setSetQuietTime(value: (Double, Double, Double, Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setQuietTime", js.Any.fromFunction5(value))
      
      inline def setSetQuietTimeEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setQuietTimeEnabled", js.Any.fromFunction2(value))
      
      inline def setSetSoundEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setSoundEnabled", js.Any.fromFunction2(value))
      
      inline def setSetTags(value: (js.Array[String], js.Function0[Unit]) => Unit): Self = StObject.set(x, "setTags", js.Any.fromFunction2(value))
      
      inline def setSetUserNotificationsEnabled(value: (Boolean, js.Function1[/* status */ String, Unit]) => Unit): Self = StObject.set(x, "setUserNotificationsEnabled", js.Any.fromFunction2(value))
      
      inline def setSetVibrateEnabled(value: (Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "setVibrateEnabled", js.Any.fromFunction2(value))
    }
  }
}
