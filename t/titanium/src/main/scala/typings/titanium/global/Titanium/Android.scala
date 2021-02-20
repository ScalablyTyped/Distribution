package typings.titanium.global.Titanium

import typings.titanium.Dictionary
import typings.titanium.RequestPermissionAccessResult
import typings.titanium.ServiceIntentOptions
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.Android.DrawerLayout
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level Android module.
  */
@JSGlobal("Titanium.Android")
@js.native
class Android ()
  extends typings.titanium.Titanium.Proxy
/**
  * The top-level Android module.
  */
object Android {
  
  @JSGlobal("Titanium.Android")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * User switched airplane mode on or off.
    */
  @JSGlobal("Titanium.Android.ACTION_AIRPLANE_MODE_CHANGED")
  @js.native
  val ACTION_AIRPLANE_MODE_CHANGED: String = js.native
  
  /**
    * List all applications.
    */
  @JSGlobal("Titanium.Android.ACTION_ALL_APPS")
  @js.native
  val ACTION_ALL_APPS: String = js.native
  
  /**
    * Handle an incoming phone call.
    */
  @JSGlobal("Titanium.Android.ACTION_ANSWER")
  @js.native
  val ACTION_ANSWER: String = js.native
  
  /**
    * Used to indicate that the data is an attachment.
    */
  @JSGlobal("Titanium.Android.ACTION_ATTACH_DATA")
  @js.native
  val ACTION_ATTACH_DATA: String = js.native
  
  /**
    * Listen to battery state change status.
    */
  @JSGlobal("Titanium.Android.ACTION_BATTERY_CHANGED")
  @js.native
  val ACTION_BATTERY_CHANGED: String = js.native
  
  /**
    * Indicates low battery condition on the device.
    */
  @JSGlobal("Titanium.Android.ACTION_BATTERY_LOW")
  @js.native
  val ACTION_BATTERY_LOW: String = js.native
  
  /**
    * Inidicates the battery is now okay after being low.
    */
  @JSGlobal("Titanium.Android.ACTION_BATTERY_OKAY")
  @js.native
  val ACTION_BATTERY_OKAY: String = js.native
  
  /**
    * Indicates the system has finished booting.
    */
  @JSGlobal("Titanium.Android.ACTION_BOOT_COMPLETED")
  @js.native
  val ACTION_BOOT_COMPLETED: String = js.native
  
  /**
    * Show activity for reporting a bug.
    */
  @JSGlobal("Titanium.Android.ACTION_BUG_REPORT")
  @js.native
  val ACTION_BUG_REPORT: String = js.native
  
  /**
    * Perform a call to someone specified by the `data` property.
    */
  @JSGlobal("Titanium.Android.ACTION_CALL")
  @js.native
  val ACTION_CALL: String = js.native
  
  /**
    * User pressed the call button.
    */
  @JSGlobal("Titanium.Android.ACTION_CALL_BUTTON")
  @js.native
  val ACTION_CALL_BUTTON: String = js.native
  
  /**
    * The camera button was pressed.
    */
  @JSGlobal("Titanium.Android.ACTION_CAMERA_BUTTON")
  @js.native
  val ACTION_CAMERA_BUTTON: String = js.native
  
  /**
    * Display an activity chooser.
    */
  @JSGlobal("Titanium.Android.ACTION_CHOOSER")
  @js.native
  val ACTION_CHOOSER: String = js.native
  
  /**
    * User dismissed a temporary system dialog, such as the notification drawer or recent-app drawer.
    */
  @JSGlobal("Titanium.Android.ACTION_CLOSE_SYSTEM_DIALOGS")
  @js.native
  val ACTION_CLOSE_SYSTEM_DIALOGS: String = js.native
  
  /**
    * The device's configuration changed.
    */
  @JSGlobal("Titanium.Android.ACTION_CONFIGURATION_CHANGED")
  @js.native
  val ACTION_CONFIGURATION_CHANGED: String = js.native
  
  /**
    * Create a shortcut.
    */
  @JSGlobal("Titanium.Android.ACTION_CREATE_SHORTCUT")
  @js.native
  val ACTION_CREATE_SHORTCUT: String = js.native
  
  /**
    * Date changed.
    */
  @JSGlobal("Titanium.Android.ACTION_DATE_CHANGED")
  @js.native
  val ACTION_DATE_CHANGED: String = js.native
  
  /**
    * Default action, which is `Titanium.Android.ACTION_VIEW`
    */
  @JSGlobal("Titanium.Android.ACTION_DEFAULT")
  @js.native
  val ACTION_DEFAULT: String = js.native
  
  /**
    * Delete the data specified by the Intent's `data` property.
    */
  @JSGlobal("Titanium.Android.ACTION_DELETE")
  @js.native
  val ACTION_DELETE: String = js.native
  
  /**
    * Indicates a low memory condition on the device.
    */
  @JSGlobal("Titanium.Android.ACTION_DEVICE_STORAGE_LOW")
  @js.native
  val ACTION_DEVICE_STORAGE_LOW: String = js.native
  
  /**
    * Dial a number specified by the Intent's `data` property.
    */
  @JSGlobal("Titanium.Android.ACTION_DIAL")
  @js.native
  val ACTION_DIAL: String = js.native
  
  /**
    * Provide editable access to the data specified by the Intent's `data` property.
    */
  @JSGlobal("Titanium.Android.ACTION_EDIT")
  @js.native
  val ACTION_EDIT: String = js.native
  
  /**
    * Allow the user to select a particular kind of data specified by the Intent's `type` property.
    */
  @JSGlobal("Titanium.Android.ACTION_GET_CONTENT")
  @js.native
  val ACTION_GET_CONTENT: String = js.native
  
  /**
    * GTalk connection has been established.
    */
  @JSGlobal("Titanium.Android.ACTION_GTALK_SERVICE_CONNECTED")
  @js.native
  val ACTION_GTALK_SERVICE_CONNECTED: String = js.native
  
  /**
    * GTalk connection has been disconnected.
    */
  @JSGlobal("Titanium.Android.ACTION_GTALK_SERVICE_DISCONNECTED")
  @js.native
  val ACTION_GTALK_SERVICE_DISCONNECTED: String = js.native
  
  /**
    * A wired headset has been plugged in or unplugged.
    */
  @JSGlobal("Titanium.Android.ACTION_HEADSET_PLUG")
  @js.native
  val ACTION_HEADSET_PLUG: String = js.native
  
  /**
    * An input method has been changed.
    */
  @JSGlobal("Titanium.Android.ACTION_INPUT_METHOD_CHANGED")
  @js.native
  val ACTION_INPUT_METHOD_CHANGED: String = js.native
  
  /**
    * Insert an empty item into the given container.
    */
  @JSGlobal("Titanium.Android.ACTION_INSERT")
  @js.native
  val ACTION_INSERT: String = js.native
  
  /**
    * Pick an existing item or insert an empty item, then edit it.
    */
  @JSGlobal("Titanium.Android.ACTION_INSERT_OR_EDIT")
  @js.native
  val ACTION_INSERT_OR_EDIT: String = js.native
  
  /**
    * Start as the main entry point.
    */
  @JSGlobal("Titanium.Android.ACTION_MAIN")
  @js.native
  val ACTION_MAIN: String = js.native
  
  /**
    * Indicates low memory condition notification acknowledged by user and package management should be started.
    */
  @JSGlobal("Titanium.Android.ACTION_MANAGE_PACKAGE_STORAGE")
  @js.native
  val ACTION_MANAGE_PACKAGE_STORAGE: String = js.native
  
  /**
    * External media was removed from SD card slot, but mount point was not unmounted.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_BAD_REMOVAL")
  @js.native
  val ACTION_MEDIA_BAD_REMOVAL: String = js.native
  
  /**
    * The media button was pressed.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_BUTTON")
  @js.native
  val ACTION_MEDIA_BUTTON: String = js.native
  
  /**
    * External media is present and being disk-checked.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_CHECKING")
  @js.native
  val ACTION_MEDIA_CHECKING: String = js.native
  
  /**
    * User has expressed the desire to remove the external storage media.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_EJECT")
  @js.native
  val ACTION_MEDIA_EJECT: String = js.native
  
  /**
    * External media is present and mounted at its mount point.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_MOUNTED")
  @js.native
  val ACTION_MEDIA_MOUNTED: String = js.native
  
  /**
    * External media is present, but is using an incompatible filesystem or is blank.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_NOFS")
  @js.native
  val ACTION_MEDIA_NOFS: String = js.native
  
  /**
    * External media has been removed.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_REMOVED")
  @js.native
  val ACTION_MEDIA_REMOVED: String = js.native
  
  /**
    * The media scanner has finished scanning a directory.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_SCANNER_FINISHED")
  @js.native
  val ACTION_MEDIA_SCANNER_FINISHED: String = js.native
  
  /**
    * Request the media scanner to scan a file and add it to the media database.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_SCANNER_SCAN_FILE")
  @js.native
  val ACTION_MEDIA_SCANNER_SCAN_FILE: String = js.native
  
  /**
    * The media scanner has started scanning a directory.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_SCANNER_STARTED")
  @js.native
  val ACTION_MEDIA_SCANNER_STARTED: String = js.native
  
  /**
    * External media is unmounted because it is being shared via USB mass storage.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_SHARED")
  @js.native
  val ACTION_MEDIA_SHARED: String = js.native
  
  /**
    * Corresponds to the Android `Intent.ACTION_MEDIA_UNMOUNTABLE` constant.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_UNMOUNTABLE")
  @js.native
  val ACTION_MEDIA_UNMOUNTABLE: String = js.native
  
  /**
    * External media is present, but not mounted at its mount point.
    */
  @JSGlobal("Titanium.Android.ACTION_MEDIA_UNMOUNTED")
  @js.native
  val ACTION_MEDIA_UNMOUNTED: String = js.native
  
  /**
    * An outgoing call is about to be placed.
    */
  @JSGlobal("Titanium.Android.ACTION_NEW_OUTGOING_CALL")
  @js.native
  val ACTION_NEW_OUTGOING_CALL: String = js.native
  
  /**
    * A new application package has been installed on the device.
    */
  @JSGlobal("Titanium.Android.ACTION_PACKAGE_ADDED")
  @js.native
  val ACTION_PACKAGE_ADDED: String = js.native
  
  /**
    * An existing application package has been changed.
    */
  @JSGlobal("Titanium.Android.ACTION_PACKAGE_CHANGED")
  @js.native
  val ACTION_PACKAGE_CHANGED: String = js.native
  
  /**
    * The user has cleared the data of a package.
    */
  @JSGlobal("Titanium.Android.ACTION_PACKAGE_DATA_CLEARED")
  @js.native
  val ACTION_PACKAGE_DATA_CLEARED: String = js.native
  
  /**
    * An existing application package has been removed from the device.
    */
  @JSGlobal("Titanium.Android.ACTION_PACKAGE_REMOVED")
  @js.native
  val ACTION_PACKAGE_REMOVED: String = js.native
  
  /**
    * A new version of an application package has been installed, replacing an existing version that was previously installed.
    */
  @JSGlobal("Titanium.Android.ACTION_PACKAGE_REPLACED")
  @js.native
  val ACTION_PACKAGE_REPLACED: String = js.native
  
  /**
    * The user has restarted a package, and all of its processes have been killed.
    */
  @JSGlobal("Titanium.Android.ACTION_PACKAGE_RESTARTED")
  @js.native
  val ACTION_PACKAGE_RESTARTED: String = js.native
  
  /**
    * Pick an item from the directory indicated by the Intent's `data` property.
    */
  @JSGlobal("Titanium.Android.ACTION_PICK")
  @js.native
  val ACTION_PICK: String = js.native
  
  /**
    * Pick an activity given an intent.
    */
  @JSGlobal("Titanium.Android.ACTION_PICK_ACTIVITY")
  @js.native
  val ACTION_PICK_ACTIVITY: String = js.native
  
  /**
    * External power has been connected to the device.
    */
  @JSGlobal("Titanium.Android.ACTION_POWER_CONNECTED")
  @js.native
  val ACTION_POWER_CONNECTED: String = js.native
  
  /**
    * External power has been disconnected from the device.
    */
  @JSGlobal("Titanium.Android.ACTION_POWER_DISCONNECTED")
  @js.native
  val ACTION_POWER_DISCONNECTED: String = js.native
  
  /**
    * Show power usage information to the user.
    */
  @JSGlobal("Titanium.Android.ACTION_POWER_USAGE_SUMMARY")
  @js.native
  val ACTION_POWER_USAGE_SUMMARY: String = js.native
  
  /**
    * Content provider published new events or items.
    */
  @JSGlobal("Titanium.Android.ACTION_PROVIDER_CHANGED")
  @js.native
  val ACTION_PROVIDER_CHANGED: String = js.native
  
  /**
    * Device rebooted.
    */
  @JSGlobal("Titanium.Android.ACTION_REBOOT")
  @js.native
  val ACTION_REBOOT: String = js.native
  
  /**
    * Run the data.
    */
  @JSGlobal("Titanium.Android.ACTION_RUN")
  @js.native
  val ACTION_RUN: String = js.native
  
  /**
    * Sent when the device goes to sleep and becomes non-interactive.
    */
  @JSGlobal("Titanium.Android.ACTION_SCREEN_OFF")
  @js.native
  val ACTION_SCREEN_OFF: String = js.native
  
  /**
    * Sent when the device wakes up and becomes interactive.
    */
  @JSGlobal("Titanium.Android.ACTION_SCREEN_ON")
  @js.native
  val ACTION_SCREEN_ON: String = js.native
  
  /**
    * Perform a search.
    */
  @JSGlobal("Titanium.Android.ACTION_SEARCH")
  @js.native
  val ACTION_SEARCH: String = js.native
  
  /**
    * Start action associated with long pressing on the search key.
    */
  @JSGlobal("Titanium.Android.ACTION_SEARCH_LONG_PRESS")
  @js.native
  val ACTION_SEARCH_LONG_PRESS: String = js.native
  
  /**
    * Deliver data to another activity.
    */
  @JSGlobal("Titanium.Android.ACTION_SEND")
  @js.native
  val ACTION_SEND: String = js.native
  
  /**
    * Deliver data to the recipient specified by the Intent's `data` property.
    */
  @JSGlobal("Titanium.Android.ACTION_SENDTO")
  @js.native
  val ACTION_SENDTO: String = js.native
  
  /**
    * Deliver multiple data to another activity.
    */
  @JSGlobal("Titanium.Android.ACTION_SEND_MULTIPLE")
  @js.native
  val ACTION_SEND_MULTIPLE: String = js.native
  
  /**
    * Show settings for choosing the system wallpaper.
    */
  @JSGlobal("Titanium.Android.ACTION_SET_WALLPAPER")
  @js.native
  val ACTION_SET_WALLPAPER: String = js.native
  
  /**
    * Device is shutting down.
    */
  @JSGlobal("Titanium.Android.ACTION_SHUTDOWN")
  @js.native
  val ACTION_SHUTDOWN: String = js.native
  
  /**
    * Perform data synchronization.
    */
  @JSGlobal("Titanium.Android.ACTION_SYNC")
  @js.native
  val ACTION_SYNC: String = js.native
  
  /**
    * Start the platform-defined tutorial.
    */
  @JSGlobal("Titanium.Android.ACTION_SYSTEM_TUTORIAL")
  @js.native
  val ACTION_SYSTEM_TUTORIAL: String = js.native
  
  /**
    * The time was set.
    */
  @JSGlobal("Titanium.Android.ACTION_TIME_CHANGED")
  @js.native
  val ACTION_TIME_CHANGED: String = js.native
  
  /**
    * The current time changed.  Sent every minute.
    */
  @JSGlobal("Titanium.Android.ACTION_TIME_TICK")
  @js.native
  val ACTION_TIME_TICK: String = js.native
  
  /**
    * A user ID was removed from the system.
    */
  @JSGlobal("Titanium.Android.ACTION_UID_REMOVED")
  @js.native
  val ACTION_UID_REMOVED: String = js.native
  
  /**
    * Sent when the user is present after device wakes up.
    */
  @JSGlobal("Titanium.Android.ACTION_USER_PRESENT")
  @js.native
  val ACTION_USER_PRESENT: String = js.native
  
  /**
    * Display data to the user.
    */
  @JSGlobal("Titanium.Android.ACTION_VIEW")
  @js.native
  val ACTION_VIEW: String = js.native
  
  /**
    * Start voice command.
    */
  @JSGlobal("Titanium.Android.ACTION_VOICE_COMMAND")
  @js.native
  val ACTION_VOICE_COMMAND: String = js.native
  
  /**
    * The current system wallpaper has changed.
    */
  @JSGlobal("Titanium.Android.ACTION_WALLPAPER_CHANGED")
  @js.native
  val ACTION_WALLPAPER_CHANGED: String = js.native
  
  /**
    * Perform a web search.
    */
  @JSGlobal("Titanium.Android.ACTION_WEB_SEARCH")
  @js.native
  val ACTION_WEB_SEARCH: String = js.native
  
  /**
    * An action bar is a window feature that identifies the application and user location,
    * and provides user actions and navigation modes.
    */
  @JSGlobal("Titanium.Android.ActionBar")
  @js.native
  class ActionBar ()
    extends typings.titanium.Titanium.Android.ActionBar
  
  /**
    * The Titanium binding of an Android Activity.
    */
  @JSGlobal("Titanium.Android.Activity")
  @js.native
  class Activity ()
    extends typings.titanium.Titanium.Android.Activity
  
  /**
    * Helper object for generating large-format notifications that include a large image attachment.
    */
  @JSGlobal("Titanium.Android.BigPictureStyle")
  @js.native
  class BigPictureStyle ()
    extends typings.titanium.Titanium.Android.BigPictureStyle
  
  /**
    * Helper object for generating large-format notifications that include a lot of text.
    */
  @JSGlobal("Titanium.Android.BigTextStyle")
  @js.native
  class BigTextStyle ()
    extends typings.titanium.Titanium.Android.BigTextStyle
  
  /**
    * Monitor and handle Android system broadcasts.
    */
  @JSGlobal("Titanium.Android.BroadcastReceiver")
  @js.native
  class BroadcastReceiver ()
    extends typings.titanium.Titanium.Android.BroadcastReceiver
  
  /**
    * Notification category indicating an alarm or timer.
    */
  @JSGlobal("Titanium.Android.CATEGORY_ALARM")
  @js.native
  val CATEGORY_ALARM: String = js.native
  
  /**
    * Set if the activity should be considered as an alternative action to the data the user is currently viewing.
    */
  @JSGlobal("Titanium.Android.CATEGORY_ALTERNATIVE")
  @js.native
  val CATEGORY_ALTERNATIVE: String = js.native
  
  /**
    * Activity can browse the Internet.
    */
  @JSGlobal("Titanium.Android.CATEGORY_BROWSABLE")
  @js.native
  val CATEGORY_BROWSABLE: String = js.native
  
  /**
    * Notification category indicating an incoming call (voice or video) or similar synchronous
    * communication request.
    */
  @JSGlobal("Titanium.Android.CATEGORY_CALL")
  @js.native
  val CATEGORY_CALL: String = js.native
  
  /**
    * Activity should be used as the default action to perform on a piece of data.
    */
  @JSGlobal("Titanium.Android.CATEGORY_DEFAULT")
  @js.native
  val CATEGORY_DEFAULT: String = js.native
  
  /**
    * Activity is in the development preference panel.
    */
  @JSGlobal("Titanium.Android.CATEGORY_DEVELOPMENT_PREFERENCE")
  @js.native
  val CATEGORY_DEVELOPMENT_PREFERENCE: String = js.native
  
  /**
    * Notification category indicating an asynchronous bulk message (email).
    */
  @JSGlobal("Titanium.Android.CATEGORY_EMAIL")
  @js.native
  val CATEGORY_EMAIL: String = js.native
  
  /**
    * Activity can run inside a parent activity.
    */
  @JSGlobal("Titanium.Android.CATEGORY_EMBED")
  @js.native
  val CATEGORY_EMBED: String = js.native
  
  /**
    * Notification category indicating an error in background operation or authentication status.
    */
  @JSGlobal("Titanium.Android.CATEGORY_ERROR")
  @js.native
  val CATEGORY_ERROR: String = js.native
  
  /**
    * Notification category indicating a calendar event.
    */
  @JSGlobal("Titanium.Android.CATEGORY_EVENT")
  @js.native
  val CATEGORY_EVENT: String = js.native
  
  /**
    * To be used as test code for framework instrumentation tests.
    */
  @JSGlobal("Titanium.Android.CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST")
  @js.native
  val CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST: String = js.native
  
  /**
    * Home activity, the first activity that is displayed when the device boots.
    */
  @JSGlobal("Titanium.Android.CATEGORY_HOME")
  @js.native
  val CATEGORY_HOME: String = js.native
  
  /**
    * Provides information about the package it is in.
    */
  @JSGlobal("Titanium.Android.CATEGORY_INFO")
  @js.native
  val CATEGORY_INFO: String = js.native
  
  /**
    * Activity is in the device's launcher.
    */
  @JSGlobal("Titanium.Android.CATEGORY_LAUNCHER")
  @js.native
  val CATEGORY_LAUNCHER: String = js.native
  
  /**
    * Notification category indicating an incoming direct message (SMS, instant message, etc.).
    */
  @JSGlobal("Titanium.Android.CATEGORY_MESSAGE")
  @js.native
  val CATEGORY_MESSAGE: String = js.native
  
  /**
    * This activity may be exercised by the monkey or other automated test tools.
    */
  @JSGlobal("Titanium.Android.CATEGORY_MONKEY")
  @js.native
  val CATEGORY_MONKEY: String = js.native
  
  /**
    * Activity can open raw `file://` or `scheme://` URIs.
    */
  @JSGlobal("Titanium.Android.CATEGORY_OPENABLE")
  @js.native
  val CATEGORY_OPENABLE: String = js.native
  
  /**
    * This activity is a preference panel.
    */
  @JSGlobal("Titanium.Android.CATEGORY_PREFERENCE")
  @js.native
  val CATEGORY_PREFERENCE: String = js.native
  
  /**
    * Notification category indicating the progress of a long-running background operation.
    */
  @JSGlobal("Titanium.Android.CATEGORY_PROGRESS")
  @js.native
  val CATEGORY_PROGRESS: String = js.native
  
  /**
    * Notification category indicating a promotion or advertisement.
    */
  @JSGlobal("Titanium.Android.CATEGORY_PROMO")
  @js.native
  val CATEGORY_PROMO: String = js.native
  
  /**
    * Notification category indicating a specific, timely recommendation for a single thing.
    */
  @JSGlobal("Titanium.Android.CATEGORY_RECOMMENDATION")
  @js.native
  val CATEGORY_RECOMMENDATION: String = js.native
  
  /**
    * To be used as a sample code example (not part of the normal user experience).
    */
  @JSGlobal("Titanium.Android.CATEGORY_SAMPLE_CODE")
  @js.native
  val CATEGORY_SAMPLE_CODE: String = js.native
  
  /**
    * Activity should be considered as an alternative selection action to the data the user
    * has currently selected.
    */
  @JSGlobal("Titanium.Android.CATEGORY_SELECTED_ALTERNATIVE")
  @js.native
  val CATEGORY_SELECTED_ALTERNATIVE: String = js.native
  
  /**
    * Notification category for a running background service.
    */
  @JSGlobal("Titanium.Android.CATEGORY_SERVICE")
  @js.native
  val CATEGORY_SERVICE: String = js.native
  
  /**
    * Notification category for a social network or sharing update.
    */
  @JSGlobal("Titanium.Android.CATEGORY_SOCIAL")
  @js.native
  val CATEGORY_SOCIAL: String = js.native
  
  /**
    * Notification category indicating ongoing information about device or contextual status.
    */
  @JSGlobal("Titanium.Android.CATEGORY_STATUS")
  @js.native
  val CATEGORY_STATUS: String = js.native
  
  /**
    * Activity to be used in a tab activity.
    */
  @JSGlobal("Titanium.Android.CATEGORY_TAB")
  @js.native
  val CATEGORY_TAB: String = js.native
  
  /**
    * To be used as a test (not part of the normal user experience).
    */
  @JSGlobal("Titanium.Android.CATEGORY_TEST")
  @js.native
  val CATEGORY_TEST: String = js.native
  
  /**
    * Notification category indicating media transport control for playback.
    */
  @JSGlobal("Titanium.Android.CATEGORY_TRANSPORT")
  @js.native
  val CATEGORY_TRANSPORT: String = js.native
  
  /**
    * To be used as a unit test (run through the Test Harness).
    */
  @JSGlobal("Titanium.Android.CATEGORY_UNIT_TEST")
  @js.native
  val CATEGORY_UNIT_TEST: String = js.native
  
  /**
    * The Android.Calendar module provides proxies and methods for accessing the native Android
    * calendar functionality.
    * @deprecated Use [Titanium.Calendar](Titanium.Calendar) instead.
    */
  @JSGlobal("Titanium.Android.Calendar")
  @js.native
  val Calendar: scala.Nothing = js.native
  
  /**
    * Use all default settings for a notification; see
    * [Notification.defaults](Titanium.Android.Notification.defaults).
    */
  @JSGlobal("Titanium.Android.DEFAULT_ALL")
  @js.native
  val DEFAULT_ALL: Double = js.native
  
  /**
    * Use the default light settings for a notification; see
    * [Notification.defaults](Titanium.Android.Notification.defaults).
    */
  @JSGlobal("Titanium.Android.DEFAULT_LIGHTS")
  @js.native
  val DEFAULT_LIGHTS: Double = js.native
  
  /**
    * Use the default sound settings for a notification; see
    * [Notification.defaults](Titanium.Android.Notification.defaults).
    */
  @JSGlobal("Titanium.Android.DEFAULT_SOUND")
  @js.native
  val DEFAULT_SOUND: Double = js.native
  
  /**
    * Use the default vibration settings for a notification; see
    * [Notification.defaults](Titanium.Android.Notification.defaults).
    */
  @JSGlobal("Titanium.Android.DEFAULT_VIBRATE")
  @js.native
  val DEFAULT_VIBRATE: Double = js.native
  
  /**
    * Integer indicating how many pending alarms are being delivered with the intent.
    */
  @JSGlobal("Titanium.Android.EXTRA_ALARM_COUNT")
  @js.native
  val EXTRA_ALARM_COUNT: String = js.native
  
  /**
    * String array containing e-mail addresses for blind carbon copying.
    */
  @JSGlobal("Titanium.Android.EXTRA_BCC")
  @js.native
  val EXTRA_BCC: String = js.native
  
  /**
    * String array containing e-mail addresses for carbon copying.
    */
  @JSGlobal("Titanium.Android.EXTRA_CC")
  @js.native
  val EXTRA_CC: String = js.native
  
  /**
    * Boolean indicating full uninstall (true) or partial uninstall (false).
    */
  @JSGlobal("Titanium.Android.EXTRA_DATA_REMOVED")
  @js.native
  val EXTRA_DATA_REMOVED: String = js.native
  
  /**
    * Boolean indicating to restart the application or not.
    */
  @JSGlobal("Titanium.Android.EXTRA_DONT_KILL_APP")
  @js.native
  val EXTRA_DONT_KILL_APP: String = js.native
  
  /**
    * String array containing e-mail addresses.
    */
  @JSGlobal("Titanium.Android.EXTRA_EMAIL")
  @js.native
  val EXTRA_EMAIL: String = js.native
  
  /**
    * An Intent describing the choices you would like shown.
    */
  @JSGlobal("Titanium.Android.EXTRA_INTENT")
  @js.native
  val EXTRA_INTENT: String = js.native
  
  /**
    * A KeyEvent object containing the event that triggered the creation of the Intent it is in.
    */
  @JSGlobal("Titanium.Android.EXTRA_KEY_EVENT")
  @js.native
  val EXTRA_KEY_EVENT: String = js.native
  
  /**
    * String holding the phone number to call or number that was called.
    */
  @JSGlobal("Titanium.Android.EXTRA_PHONE_NUMBER")
  @js.native
  val EXTRA_PHONE_NUMBER: String = js.native
  
  /**
    * Boolean indicating if the package is being replaced.
    */
  @JSGlobal("Titanium.Android.EXTRA_REPLACING")
  @js.native
  val EXTRA_REPLACING: String = js.native
  
  /**
    * Bitmap icon.
    */
  @JSGlobal("Titanium.Android.EXTRA_SHORTCUT_ICON")
  @js.native
  val EXTRA_SHORTCUT_ICON: String = js.native
  
  /**
    * Resource of the shortcut.
    */
  @JSGlobal("Titanium.Android.EXTRA_SHORTCUT_ICON_RESOURCE")
  @js.native
  val EXTRA_SHORTCUT_ICON_RESOURCE: String = js.native
  
  /**
    * Intent of a shortcut.
    */
  @JSGlobal("Titanium.Android.EXTRA_SHORTCUT_INTENT")
  @js.native
  val EXTRA_SHORTCUT_INTENT: String = js.native
  
  /**
    * Name of the shortcut.
    */
  @JSGlobal("Titanium.Android.EXTRA_SHORTCUT_NAME")
  @js.native
  val EXTRA_SHORTCUT_NAME: String = js.native
  
  /**
    * URI containing the stream data.
    */
  @JSGlobal("Titanium.Android.EXTRA_STREAM")
  @js.native
  val EXTRA_STREAM: String = js.native
  
  /**
    * Subject line of a message.
    */
  @JSGlobal("Titanium.Android.EXTRA_SUBJECT")
  @js.native
  val EXTRA_SUBJECT: String = js.native
  
  /**
    * Initial data to place in a newly created record.
    */
  @JSGlobal("Titanium.Android.EXTRA_TEMPLATE")
  @js.native
  val EXTRA_TEMPLATE: String = js.native
  
  /**
    * Corresponds to the Android `Intent.EXTRA_TEXT` constant.
    */
  @JSGlobal("Titanium.Android.EXTRA_TEXT")
  @js.native
  val EXTRA_TEXT: String = js.native
  
  /**
    * Corresponds to the Android `Intent.EXTRA_TITLE` constant.
    */
  @JSGlobal("Titanium.Android.EXTRA_TITLE")
  @js.native
  val EXTRA_TITLE: String = js.native
  
  /**
    * UID of the assigned packaged.
    */
  @JSGlobal("Titanium.Android.EXTRA_UID")
  @js.native
  val EXTRA_UID: String = js.native
  
  /**
    * Not used.
    */
  @JSGlobal("Titanium.Android.FILL_IN_ACTION")
  @js.native
  val FILL_IN_ACTION: Double = js.native
  
  /**
    * Not used.
    */
  @JSGlobal("Titanium.Android.FILL_IN_CATEGORIES")
  @js.native
  val FILL_IN_CATEGORIES: Double = js.native
  
  /**
    * Not used.
    */
  @JSGlobal("Titanium.Android.FILL_IN_COMPONENT")
  @js.native
  val FILL_IN_COMPONENT: Double = js.native
  
  /**
    * Not used.
    */
  @JSGlobal("Titanium.Android.FILL_IN_DATA")
  @js.native
  val FILL_IN_DATA: Double = js.native
  
  /**
    * Not used.
    */
  @JSGlobal("Titanium.Android.FILL_IN_PACKAGE")
  @js.native
  val FILL_IN_PACKAGE: Double = js.native
  
  /**
    * If activity is already running, bring it to the foreground.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_BROUGHT_TO_FRONT")
  @js.native
  val FLAG_ACTIVITY_BROUGHT_TO_FRONT: Double = js.native
  
  /**
    * If the activity is present, removes any activities on top of it to make it the foreground activity.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_CLEAR_TOP")
  @js.native
  val FLAG_ACTIVITY_CLEAR_TOP: Double = js.native
  
  /**
    * Corresponds to the Android `Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET` constant.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET")
  @js.native
  val FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET: Double = js.native
  
  /**
    * Exclude the activity from recently launched activities.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS")
  @js.native
  val FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS: Double = js.native
  
  /**
    * Return result to the original calling activity.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_FORWARD_RESULT")
  @js.native
  val FLAG_ACTIVITY_FORWARD_RESULT: Double = js.native
  
  /**
    * Activity was launched from history.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY")
  @js.native
  val FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY: Double = js.native
  
  /**
    * Start the activity as a new task even if it exists.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_MULTIPLE_TASK")
  @js.native
  val FLAG_ACTIVITY_MULTIPLE_TASK: Double = js.native
  
  /**
    * Activity will be the start of a new task (collection of activities).
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_NEW_TASK")
  @js.native
  val FLAG_ACTIVITY_NEW_TASK: Double = js.native
  
  /**
    * Prevent transition animation.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_NO_ANIMATION")
  @js.native
  val FLAG_ACTIVITY_NO_ANIMATION: Double = js.native
  
  /**
    * Do not keep the activity in the history stack.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_NO_HISTORY")
  @js.native
  val FLAG_ACTIVITY_NO_HISTORY: Double = js.native
  
  /**
    * Disables the [onUserLeaveHint()](https://developer.android.com/reference/android/app/Activity.html#onUserLeaveHint()) callback.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_NO_USER_ACTION")
  @js.native
  val FLAG_ACTIVITY_NO_USER_ACTION: Double = js.native
  
  /**
    * Corresponds to the Android `Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP` constant.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_PREVIOUS_IS_TOP")
  @js.native
  val FLAG_ACTIVITY_PREVIOUS_IS_TOP: Double = js.native
  
  /**
    * If the activity already exists, place it at the top of the history stack.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_REORDER_TO_FRONT")
  @js.native
  val FLAG_ACTIVITY_REORDER_TO_FRONT: Double = js.native
  
  /**
    * If the task already exists, resets the task to its initial state.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED")
  @js.native
  val FLAG_ACTIVITY_RESET_TASK_IF_NEEDED: Double = js.native
  
  /**
    * Do not launch the activity if it is already running.
    */
  @JSGlobal("Titanium.Android.FLAG_ACTIVITY_SINGLE_TOP")
  @js.native
  val FLAG_ACTIVITY_SINGLE_TOP: Double = js.native
  
  /**
    * Cancel the notification when it is clicked by the user.
    */
  @JSGlobal("Titanium.Android.FLAG_AUTO_CANCEL")
  @js.native
  val FLAG_AUTO_CANCEL: Double = js.native
  
  /**
    * Cancel the current pending intent before creating a new one.
    */
  @JSGlobal("Titanium.Android.FLAG_CANCEL_CURRENT")
  @js.native
  val FLAG_CANCEL_CURRENT: Double = js.native
  
  /**
    * Enable a log message to print out the resolution of the intent.
    */
  @JSGlobal("Titanium.Android.FLAG_DEBUG_LOG_RESOLUTION")
  @js.native
  val FLAG_DEBUG_LOG_RESOLUTION: Double = js.native
  
  /**
    * Indicates the intent is coming from a background operation.
    */
  @JSGlobal("Titanium.Android.FLAG_FROM_BACKGROUND")
  @js.native
  val FLAG_FROM_BACKGROUND: Double = js.native
  
  /**
    * Grant read permission on the URI in the Intent's data or clipboard.
    */
  @JSGlobal("Titanium.Android.FLAG_GRANT_READ_URI_PERMISSION")
  @js.native
  val FLAG_GRANT_READ_URI_PERMISSION: Double = js.native
  
  /**
    * Grants write permission on the URI in the Intent's data or clipboard.
    */
  @JSGlobal("Titanium.Android.FLAG_GRANT_WRITE_URI_PERMISSION")
  @js.native
  val FLAG_GRANT_WRITE_URI_PERMISSION: Double = js.native
  
  /**
    * Repeat audio until the notification is cancelled or the notification window
    * is opened.
    */
  @JSGlobal("Titanium.Android.FLAG_INSISTENT")
  @js.native
  val FLAG_INSISTENT: Double = js.native
  
  /**
    * Do not cancel the notification when the user clicks the Clear All button.
    */
  @JSGlobal("Titanium.Android.FLAG_NO_CLEAR")
  @js.native
  val FLAG_NO_CLEAR: Double = js.native
  
  /**
    * If the current intent does not exist, do not create it.
    */
  @JSGlobal("Titanium.Android.FLAG_NO_CREATE")
  @js.native
  val FLAG_NO_CREATE: Double = js.native
  
  /**
    * The pending intent can only be used once.
    */
  @JSGlobal("Titanium.Android.FLAG_ONE_SHOT")
  @js.native
  val FLAG_ONE_SHOT: Double = js.native
  
  /**
    * Specifies that a notification is in reference to something that is ongoing, like a phone call.
    */
  @JSGlobal("Titanium.Android.FLAG_ONGOING_EVENT")
  @js.native
  val FLAG_ONGOING_EVENT: Double = js.native
  
  /**
    * Play an alert (sound, lights, and/or vibration) once each time the notification is sent, even if it has not been canceled before that.
    */
  @JSGlobal("Titanium.Android.FLAG_ONLY_ALERT_ONCE")
  @js.native
  val FLAG_ONLY_ALERT_ONCE: Double = js.native
  
  /**
    * When sending a broadcast, only registered receivers will be called.
    */
  @JSGlobal("Titanium.Android.FLAG_RECEIVER_REGISTERED_ONLY")
  @js.native
  val FLAG_RECEIVER_REGISTERED_ONLY: Double = js.native
  
  /**
    * Use LED lights to alert the user to the notification.
    */
  @JSGlobal("Titanium.Android.FLAG_SHOW_LIGHTS")
  @js.native
  val FLAG_SHOW_LIGHTS: Double = js.native
  
  /**
    * If the current pending intent already exists, only update the current intent's extra data.
    */
  @JSGlobal("Titanium.Android.FLAG_UPDATE_CURRENT")
  @js.native
  val FLAG_UPDATE_CURRENT: Double = js.native
  
  /**
    * Constant corresponding to connectedDevice in the R.attr.foregroundServiceType attribute. Auto, bluetooth, TV or other devices connection, monitoring and interaction.
    */
  @JSGlobal("Titanium.Android.FOREGROUND_SERVICE_TYPE_CONNECTED_DEVICE")
  @js.native
  val FOREGROUND_SERVICE_TYPE_CONNECTED_DEVICE: Double = js.native
  
  /**
    * Constant corresponding to location in the R.attr.foregroundServiceType attribute. GPS, map, navigation location update.
    */
  @JSGlobal("Titanium.Android.FOREGROUND_SERVICE_TYPE_LOCATION")
  @js.native
  val FOREGROUND_SERVICE_TYPE_LOCATION: Double = js.native
  
  /**
    * A special value indicates to use all types set in manifest file.
    */
  @JSGlobal("Titanium.Android.FOREGROUND_SERVICE_TYPE_MANIFEST")
  @js.native
  val FOREGROUND_SERVICE_TYPE_MANIFEST: Double = js.native
  
  /**
    * Constant corresponding to mediaPlayback in the R.attr.foregroundServiceType attribute. Music, video, news or other media playback.
    */
  @JSGlobal("Titanium.Android.FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK")
  @js.native
  val FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK: Double = js.native
  
  /**
    * Constant corresponding to mediaProjection in the R.attr.foregroundServiceType attribute. Managing a media projection session, e.g for screen recording or taking screenshots.
    */
  @JSGlobal("Titanium.Android.FOREGROUND_SERVICE_TYPE_MEDIA_PROJECTION")
  @js.native
  val FOREGROUND_SERVICE_TYPE_MEDIA_PROJECTION: Double = js.native
  
  /**
    * The default foreground service type if not been set in manifest file.
    */
  @JSGlobal("Titanium.Android.FOREGROUND_SERVICE_TYPE_NONE")
  @js.native
  val FOREGROUND_SERVICE_TYPE_NONE: Double = js.native
  
  /**
    * Constant corresponding to phoneCall in the R.attr.foregroundServiceType attribute. Ongoing phone call or video conference.
    */
  @JSGlobal("Titanium.Android.FOREGROUND_SERVICE_TYPE_PHONE_CALL")
  @js.native
  val FOREGROUND_SERVICE_TYPE_PHONE_CALL: Double = js.native
  
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  @JSGlobal("Titanium.Android.IMPORTANCE_DEFAULT")
  @js.native
  val IMPORTANCE_DEFAULT: Double = js.native
  
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  @JSGlobal("Titanium.Android.IMPORTANCE_HIGH")
  @js.native
  val IMPORTANCE_HIGH: Double = js.native
  
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  @JSGlobal("Titanium.Android.IMPORTANCE_LOW")
  @js.native
  val IMPORTANCE_LOW: Double = js.native
  
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  @JSGlobal("Titanium.Android.IMPORTANCE_MAX")
  @js.native
  val IMPORTANCE_MAX: Double = js.native
  
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  @JSGlobal("Titanium.Android.IMPORTANCE_MIN")
  @js.native
  val IMPORTANCE_MIN: Double = js.native
  
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  @JSGlobal("Titanium.Android.IMPORTANCE_NONE")
  @js.native
  val IMPORTANCE_NONE: Double = js.native
  
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  @JSGlobal("Titanium.Android.IMPORTANCE_UNSPECIFIED")
  @js.native
  val IMPORTANCE_UNSPECIFIED: Double = js.native
  
  /**
    * Message objects passed between Android application components.
    */
  @JSGlobal("Titanium.Android.Intent")
  @js.native
  class Intent ()
    extends typings.titanium.Titanium.Android.Intent
  
  /**
    * The Titanium binding of an Android Options Menu.
    */
  @JSGlobal("Titanium.Android.Menu")
  @js.native
  class Menu ()
    extends typings.titanium.Titanium.Android.Menu
  
  /**
    * The Titanium binding of an Android menu item.
    */
  @JSGlobal("Titanium.Android.MenuItem")
  @js.native
  class MenuItem ()
    extends typings.titanium.Titanium.Android.MenuItem
  
  /**
    * Standard Action Bar navigation mode.
    */
  @JSGlobal("Titanium.Android.NAVIGATION_MODE_STANDARD")
  @js.native
  val NAVIGATION_MODE_STANDARD: Double = js.native
  
  /**
    * Action Bar tab navigation mode.
    */
  @JSGlobal("Titanium.Android.NAVIGATION_MODE_TABS")
  @js.native
  val NAVIGATION_MODE_TABS: Double = js.native
  
  /**
    * UI notifications that can be sent while the application is in the background.
    */
  @JSGlobal("Titanium.Android.Notification")
  @js.native
  class Notification ()
    extends typings.titanium.Titanium.Android.Notification
  
  /**
    * Module for notification channels.
    */
  @JSGlobal("Titanium.Android.NotificationChannel")
  @js.native
  class NotificationChannel ()
    extends typings.titanium.Titanium.Android.NotificationChannel
  
  /**
    * Module for managing notifications.
    */
  @JSGlobal("Titanium.Android.NotificationManager")
  @js.native
  class NotificationManager ()
    extends typings.titanium.Titanium.Proxy
  object NotificationManager {
    
    @JSGlobal("Titanium.Android.NotificationManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Use <Titanium.Android.DEFAULT_ALL> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.DEFAULT_ALL")
    @js.native
    val DEFAULT_ALL: Double = js.native
    
    /**
      * Use <Titanium.Android.DEFAULT_LIGHTS> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.DEFAULT_LIGHTS")
    @js.native
    val DEFAULT_LIGHTS: Double = js.native
    
    /**
      * Use <Titanium.Android.DEFAULT_SOUND> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.DEFAULT_SOUND")
    @js.native
    val DEFAULT_SOUND: Double = js.native
    
    /**
      * Use <Titanium.Android.DEFAULT_VIBRATE> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.DEFAULT_VIBRATE")
    @js.native
    val DEFAULT_VIBRATE: Double = js.native
    
    /**
      * Use <Titanium.Android.FLAG_AUTO_CANCEL> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.FLAG_AUTO_CANCEL")
    @js.native
    val FLAG_AUTO_CANCEL: Double = js.native
    
    /**
      * Use <Titanium.Android.FLAG_INSISTENT> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.FLAG_INSISTENT")
    @js.native
    val FLAG_INSISTENT: Double = js.native
    
    /**
      * Use <Titanium.Android.FLAG_NO_CLEAR> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.FLAG_NO_CLEAR")
    @js.native
    val FLAG_NO_CLEAR: Double = js.native
    
    /**
      * Use <Titanium.Android.FLAG_ONGOING_EVENT> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.FLAG_ONGOING_EVENT")
    @js.native
    val FLAG_ONGOING_EVENT: Double = js.native
    
    /**
      * Use <Titanium.Android.FLAG_ONLY_ALERT_ONCE> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.FLAG_ONLY_ALERT_ONCE")
    @js.native
    val FLAG_ONLY_ALERT_ONCE: Double = js.native
    
    /**
      * Use <Titanium.Android.FLAG_SHOW_LIGHTS> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.FLAG_SHOW_LIGHTS")
    @js.native
    val FLAG_SHOW_LIGHTS: Double = js.native
    
    /**
      * Use <Titanium.Android.STREAM_DEFAULT> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.STREAM_DEFAULT")
    @js.native
    val STREAM_DEFAULT: Double = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Returns whether showing notifications is enabled for the application.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.areNotificationsEnabled")
    @js.native
    def areNotificationsEnabled(): Boolean = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Cancels a previously displayed notification.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.cancel")
    @js.native
    def cancel(id: Double): Unit = js.native
    
    /**
      * Cancels all previously displayed notifications.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.cancelAll")
    @js.native
    def cancelAll(): Unit = js.native
    
    /**
      * Create a notification channel.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.createNotificationChannel")
    @js.native
    def createNotificationChannel(parameters: Dictionary[typings.titanium.Titanium.Android.NotificationChannel]): typings.titanium.Titanium.Android.NotificationChannel = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.Android.NotificationManager.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.Android.NotificationManager.apiName> property.
      * @deprecated Access <Titanium.Android.NotificationManager.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Android.NotificationManager.bubbleParent> property.
      * @deprecated Access <Titanium.Android.NotificationManager.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Android.NotificationManager.lifecycleContainer> property.
      * @deprecated Access <Titanium.Android.NotificationManager.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.getLifecycleContainer")
    @js.native
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.lifecycleContainer")
    @js.native
    def lifecycleContainer: Window | TabGroup = js.native
    @scala.inline
    def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a persistent notification to the status bar.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.notify")
    @js.native
    def notify_(id: Double, notification: typings.titanium.Titanium.Android.Notification): Unit = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Android.NotificationManager.bubbleParent> property.
      * @deprecated Set the value using <Titanium.Android.NotificationManager.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    @JSGlobal("Titanium.Android.NotificationManager.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.Android.NotificationManager.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.Android.NotificationManager.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Android.NotificationManager.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  }
  
  /**
    * Not used.
    * @deprecated
    */
  @JSGlobal("Titanium.Android.PENDING_INTENT_FOR_ACTIVITY")
  @js.native
  val PENDING_INTENT_FOR_ACTIVITY: Double = js.native
  
  /**
    * Not used.
    * @deprecated
    */
  @JSGlobal("Titanium.Android.PENDING_INTENT_FOR_BROADCAST")
  @js.native
  val PENDING_INTENT_FOR_BROADCAST: Double = js.native
  
  /**
    * Not used.
    * @deprecated
    */
  @JSGlobal("Titanium.Android.PENDING_INTENT_FOR_SERVICE")
  @js.native
  val PENDING_INTENT_FOR_SERVICE: Double = js.native
  
  /**
    * Not used.
    * @deprecated
    */
  @JSGlobal("Titanium.Android.PENDING_INTENT_MAX_VALUE")
  @js.native
  val PENDING_INTENT_MAX_VALUE: Double = js.native
  
  /**
    * Default priority if it does not fit into another priority category.
    */
  @JSGlobal("Titanium.Android.PRIORITY_DEFAULT")
  @js.native
  val PRIORITY_DEFAULT: Double = js.native
  
  /**
    * Use for high priority notifications like real-time chat messages.
    */
  @JSGlobal("Titanium.Android.PRIORITY_HIGH")
  @js.native
  val PRIORITY_HIGH: Double = js.native
  
  /**
    * Use for low priority notifications like software updates.
    */
  @JSGlobal("Titanium.Android.PRIORITY_LOW")
  @js.native
  val PRIORITY_LOW: Double = js.native
  
  /**
    * Use for urgent or time-critical notifications, for example, turn-by-turn directions or
    * emergency alerts.
    */
  @JSGlobal("Titanium.Android.PRIORITY_MAX")
  @js.native
  val PRIORITY_MAX: Double = js.native
  
  /**
    * Use for expired events.
    */
  @JSGlobal("Titanium.Android.PRIORITY_MIN")
  @js.native
  val PRIORITY_MIN: Double = js.native
  
  /**
    * The Titanium binding of an Android `PendingIntent`.
    */
  @JSGlobal("Titanium.Android.PendingIntent")
  @js.native
  class PendingIntent ()
    extends typings.titanium.Titanium.Android.PendingIntent
  
  /**
    * Android service for creating custom quick settings tiles and handling user's interaction with them.
    */
  @JSGlobal("Titanium.Android.QuickSettingsService")
  @js.native
  class QuickSettingsService ()
    extends typings.titanium.Titanium.Android.QuickSettingsService
  
  /**
    * Accessor for Android system resources.
    */
  @JSGlobal("Titanium.Android.R")
  @js.native
  val R: typings.titanium.Titanium.Android.R = js.native
  
  /**
    * Used with [setResult](Titanium.Android.Activity.setResult) to specify that
    * an activity was canceled.
    */
  @JSGlobal("Titanium.Android.RESULT_CANCELED")
  @js.native
  val RESULT_CANCELED: Double = js.native
  
  /**
    * Used with [setResult](Titanium.Android.Activity.setResult) to specify a
    * user-defined result.
    */
  @JSGlobal("Titanium.Android.RESULT_FIRST_USER")
  @js.native
  val RESULT_FIRST_USER: Double = js.native
  
  /**
    * Used with [setResult](Titanium.Android.Activity.setResult) to specify that
    * an activity succeeded.
    */
  @JSGlobal("Titanium.Android.RESULT_OK")
  @js.native
  val RESULT_OK: Double = js.native
  
  /**
    * The Titanium binding of [Android RemoteViews](https://developer.android.com/reference/android/widget/RemoteViews.html).
    */
  @JSGlobal("Titanium.Android.RemoteViews")
  @js.native
  class RemoteViews ()
    extends typings.titanium.Titanium.Android.RemoteViews
  
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify the activity should run in the same orientation as the activity behind it
    * in the activity stack.
    */
  @JSGlobal("Titanium.Android.SCREEN_ORIENTATION_BEHIND")
  @js.native
  val SCREEN_ORIENTATION_BEHIND: Double = js.native
  
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify a landscape screen orientation.
    */
  @JSGlobal("Titanium.Android.SCREEN_ORIENTATION_LANDSCAPE")
  @js.native
  val SCREEN_ORIENTATION_LANDSCAPE: Double = js.native
  
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify that the sensor should be ignored and the display should not rotate.
    */
  @JSGlobal("Titanium.Android.SCREEN_ORIENTATION_NOSENSOR")
  @js.native
  val SCREEN_ORIENTATION_NOSENSOR: Double = js.native
  
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify a portrait screen orientation.
    */
  @JSGlobal("Titanium.Android.SCREEN_ORIENTATION_PORTRAIT")
  @js.native
  val SCREEN_ORIENTATION_PORTRAIT: Double = js.native
  
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify that orientation should be determined by the orientation sensor.
    */
  @JSGlobal("Titanium.Android.SCREEN_ORIENTATION_SENSOR")
  @js.native
  val SCREEN_ORIENTATION_SENSOR: Double = js.native
  
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify that the system should use its default rules for determining the best
    * orientation.
    */
  @JSGlobal("Titanium.Android.SCREEN_ORIENTATION_UNSPECIFIED")
  @js.native
  val SCREEN_ORIENTATION_UNSPECIFIED: Double = js.native
  
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify that the system should use the user's preferred orientation.
    */
  @JSGlobal("Titanium.Android.SCREEN_ORIENTATION_USER")
  @js.native
  val SCREEN_ORIENTATION_USER: Double = js.native
  
  /**
    * Always show this item as an action button in the action bar.
    */
  @JSGlobal("Titanium.Android.SHOW_AS_ACTION_ALWAYS")
  @js.native
  val SHOW_AS_ACTION_ALWAYS: Double = js.native
  
  /**
    * The action view can collapse to a normal menu item.
    */
  @JSGlobal("Titanium.Android.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW")
  @js.native
  val SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW: Double = js.native
  
  /**
    * Show this item as an action button if the system decides there is room for it.
    */
  @JSGlobal("Titanium.Android.SHOW_AS_ACTION_IF_ROOM")
  @js.native
  val SHOW_AS_ACTION_IF_ROOM: Double = js.native
  
  /**
    * Never display this item as an action button in the action bar.
    */
  @JSGlobal("Titanium.Android.SHOW_AS_ACTION_NEVER")
  @js.native
  val SHOW_AS_ACTION_NEVER: Double = js.native
  
  /**
    * When this item is in the action bar, always show it with a text label.
    */
  @JSGlobal("Titanium.Android.SHOW_AS_ACTION_WITH_TEXT")
  @js.native
  val SHOW_AS_ACTION_WITH_TEXT: Double = js.native
  
  /**
    * A Service start mode indicating that if the host application is stopped by Android, the service should not be restarted automatically.
    */
  @JSGlobal("Titanium.Android.START_NOT_STICKY")
  @js.native
  val START_NOT_STICKY: Double = js.native
  
  /**
    * A Service start mode indicating that if the host application is stopped by Android, the service should be restarted automatically and the original Intent re-sent.
    */
  @JSGlobal("Titanium.Android.START_REDELIVER_INTENT")
  @js.native
  val START_REDELIVER_INTENT: Double = js.native
  
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to
    * request that the alarm stream type for notifications be used.
    */
  @JSGlobal("Titanium.Android.STREAM_ALARM")
  @js.native
  val STREAM_ALARM: Double = js.native
  
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * default stream type for notifications be used.
    */
  @JSGlobal("Titanium.Android.STREAM_DEFAULT")
  @js.native
  val STREAM_DEFAULT: Double = js.native
  
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to
    * request that the music stream type for notifications be used.
    */
  @JSGlobal("Titanium.Android.STREAM_MUSIC")
  @js.native
  val STREAM_MUSIC: Double = js.native
  
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * notification stream type for notifications be used.
    */
  @JSGlobal("Titanium.Android.STREAM_NOTIFICATION")
  @js.native
  val STREAM_NOTIFICATION: Double = js.native
  
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * ring stream type for notifications be used.
    */
  @JSGlobal("Titanium.Android.STREAM_RING")
  @js.native
  val STREAM_RING: Double = js.native
  
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * system stream type for notifications be used.
    */
  @JSGlobal("Titanium.Android.STREAM_SYSTEM")
  @js.native
  val STREAM_SYSTEM: Double = js.native
  
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * voice call stream type for notifications be used.
    */
  @JSGlobal("Titanium.Android.STREAM_VOICE_CALL")
  @js.native
  val STREAM_VOICE_CALL: Double = js.native
  
  /**
    * Android application component that executes in the background.
    */
  @JSGlobal("Titanium.Android.Service")
  @js.native
  class Service ()
    extends typings.titanium.Titanium.Android.Service
  
  /**
    * QuickSettings tile is active.
    */
  @JSGlobal("Titanium.Android.TILE_STATE_ACTIVE")
  @js.native
  val TILE_STATE_ACTIVE: Double = js.native
  
  /**
    * QuickSettings tile is inactive.
    */
  @JSGlobal("Titanium.Android.TILE_STATE_INACTIVE")
  @js.native
  val TILE_STATE_INACTIVE: Double = js.native
  
  /**
    * QuickSettings tile is unavailble.
    */
  @JSGlobal("Titanium.Android.TILE_STATE_UNAVAILABLE")
  @js.native
  val TILE_STATE_UNAVAILABLE: Double = js.native
  
  /**
    * The URI scheme used for intent URIs.
    */
  @JSGlobal("Titanium.Android.URI_INTENT_SCHEME")
  @js.native
  val URI_INTENT_SCHEME: Double = js.native
  
  /**
    * Shows basic information about the notification.
    */
  @JSGlobal("Titanium.Android.VISIBILITY_PRIVATE")
  @js.native
  val VISIBILITY_PRIVATE: Double = js.native
  
  /**
    * Shows the notification's full content on the lockscreen. This is the system default if visibility is left unspecified.
    */
  @JSGlobal("Titanium.Android.VISIBILITY_PUBLIC")
  @js.native
  val VISIBILITY_PUBLIC: Double = js.native
  
  /**
    * Shows the most minimal information of the notification on the lockscreen.
    */
  @JSGlobal("Titanium.Android.VISIBILITY_SECRET")
  @js.native
  val VISIBILITY_SECRET: Double = js.native
  
  /**
    * Turn the screen on when the wake lock is acquired.
    */
  @JSGlobal("Titanium.Android.WAKE_LOCK_ACQUIRE_CAUSES_WAKEUP")
  @js.native
  val WAKE_LOCK_ACQUIRE_CAUSES_WAKEUP: Double = js.native
  
  /**
    * Ensures that the screen and keyboard backlight are on at full brightness.
    */
  @JSGlobal("Titanium.Android.WAKE_LOCK_FULL")
  @js.native
  val WAKE_LOCK_FULL: Double = js.native
  
  /**
    * When this wake lock is released, poke the user activity timer so the screen stays on for a little longer.
    */
  @JSGlobal("Titanium.Android.WAKE_LOCK_ON_AFTER_RELEASE")
  @js.native
  val WAKE_LOCK_ON_AFTER_RELEASE: Double = js.native
  
  /**
    * Ensures that the CPU is running; the screen and keyboard backlight will be allowed to go off.
    */
  @JSGlobal("Titanium.Android.WAKE_LOCK_PARTIAL")
  @js.native
  val WAKE_LOCK_PARTIAL: Double = js.native
  
  /**
    * Ensures that the screen is on at full brightness; the keyboard backlight will be allowed to go off.
    */
  @JSGlobal("Titanium.Android.WAKE_LOCK_SCREEN_BRIGHT")
  @js.native
  val WAKE_LOCK_SCREEN_BRIGHT: Double = js.native
  
  /**
    * Ensures that the screen is on (but may be dimmed); the keyboard backlight will be allowed to go off.
    */
  @JSGlobal("Titanium.Android.WAKE_LOCK_SCREEN_DIM")
  @js.native
  val WAKE_LOCK_SCREEN_DIM: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Android.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Android.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Android.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Android.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Creates and returns an instance of <Titanium.Android.BigPictureStyle>.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createBigPictureStyle")
  @js.native
  def createBigPictureStyle(): typings.titanium.Titanium.Android.BigPictureStyle = js.native
  @JSGlobal("Titanium.Android.createBigPictureStyle")
  @js.native
  def createBigPictureStyle(parameters: Dictionary[typings.titanium.Titanium.Android.BigPictureStyle]): typings.titanium.Titanium.Android.BigPictureStyle = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Android.BigTextStyle>.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createBigTextStyle")
  @js.native
  def createBigTextStyle(): typings.titanium.Titanium.Android.BigTextStyle = js.native
  @JSGlobal("Titanium.Android.createBigTextStyle")
  @js.native
  def createBigTextStyle(parameters: Dictionary[typings.titanium.Titanium.Android.BigTextStyle]): typings.titanium.Titanium.Android.BigTextStyle = js.native
  
  /**
    * Create an `Intent` to be used in a broadcast.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createBroadcastIntent")
  @js.native
  def createBroadcastIntent(): typings.titanium.Titanium.Android.Intent = js.native
  @JSGlobal("Titanium.Android.createBroadcastIntent")
  @js.native
  def createBroadcastIntent(parameters: Dictionary[typings.titanium.Titanium.Android.Intent]): typings.titanium.Titanium.Android.Intent = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Android.BroadcastReceiver>.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createBroadcastReceiver")
  @js.native
  def createBroadcastReceiver(): typings.titanium.Titanium.Android.BroadcastReceiver = js.native
  @JSGlobal("Titanium.Android.createBroadcastReceiver")
  @js.native
  def createBroadcastReceiver(parameters: Dictionary[typings.titanium.Titanium.Android.BroadcastReceiver]): typings.titanium.Titanium.Android.BroadcastReceiver = js.native
  
  /**
    * Creates a [DrawerLayout](Titanium.UI.Android.DrawerLayout).
    */
  /* static member */
  @JSGlobal("Titanium.Android.createDrawerLayout")
  @js.native
  def createDrawerLayout(): DrawerLayout = js.native
  @JSGlobal("Titanium.Android.createDrawerLayout")
  @js.native
  def createDrawerLayout(parameters: Dictionary[DrawerLayout]): DrawerLayout = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Android.Intent>.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createIntent")
  @js.native
  def createIntent(): typings.titanium.Titanium.Android.Intent = js.native
  @JSGlobal("Titanium.Android.createIntent")
  @js.native
  def createIntent(parameters: Dictionary[typings.titanium.Titanium.Android.Intent]): typings.titanium.Titanium.Android.Intent = js.native
  
  /**
    * Creates an activity chooser intent, used to allow the user to select a target activity
    * for an intent.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createIntentChooser")
  @js.native
  def createIntentChooser(intent: typings.titanium.Titanium.Android.Intent, title: String): typings.titanium.Titanium.Android.Intent = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Android.Notification>.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createNotification")
  @js.native
  def createNotification(): typings.titanium.Titanium.Android.Notification = js.native
  @JSGlobal("Titanium.Android.createNotification")
  @js.native
  def createNotification(parameters: Dictionary[typings.titanium.Titanium.Android.Notification]): typings.titanium.Titanium.Android.Notification = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Android.NotificationChannel>.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createNotificationChannel")
  @js.native
  def createNotificationChannel(): typings.titanium.Titanium.Android.NotificationChannel = js.native
  @JSGlobal("Titanium.Android.createNotificationChannel")
  @js.native
  def createNotificationChannel(parameters: Dictionary[typings.titanium.Titanium.Android.NotificationChannel]): typings.titanium.Titanium.Android.NotificationChannel = js.native
  
  /**
    * Creates a [PendingIntent](Titanium.Android.PendingIntent) to be used inside a
    * [Notification](Titanium.Android.Notification).
    */
  /* static member */
  @JSGlobal("Titanium.Android.createPendingIntent")
  @js.native
  def createPendingIntent(): typings.titanium.Titanium.Android.PendingIntent = js.native
  @JSGlobal("Titanium.Android.createPendingIntent")
  @js.native
  def createPendingIntent(parameters: Dictionary[typings.titanium.Titanium.Android.PendingIntent]): typings.titanium.Titanium.Android.PendingIntent = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Android.QuickSettingsService>.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createQuickSettingsService")
  @js.native
  def createQuickSettingsService(): typings.titanium.Titanium.Android.QuickSettingsService = js.native
  @JSGlobal("Titanium.Android.createQuickSettingsService")
  @js.native
  def createQuickSettingsService(parameters: Dictionary[typings.titanium.Titanium.Android.QuickSettingsService]): typings.titanium.Titanium.Android.QuickSettingsService = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Android.RemoteViews>.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createRemoteViews")
  @js.native
  def createRemoteViews(): typings.titanium.Titanium.Android.RemoteViews = js.native
  @JSGlobal("Titanium.Android.createRemoteViews")
  @js.native
  def createRemoteViews(parameters: Dictionary[typings.titanium.Titanium.Android.RemoteViews]): typings.titanium.Titanium.Android.RemoteViews = js.native
  
  /**
    * Create a <Titanium.Android.Service> so you can start/stop it and listen for events from it.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createService")
  @js.native
  def createService(intent: typings.titanium.Titanium.Android.Intent): typings.titanium.Titanium.Android.Service = js.native
  
  /**
    * Create an `Intent` to be used to start a service.
    */
  /* static member */
  @JSGlobal("Titanium.Android.createServiceIntent")
  @js.native
  def createServiceIntent(options: ServiceIntentOptions): typings.titanium.Titanium.Android.Intent = js.native
  
  /**
    * References the top-most window's activity.
    */
  /* static member */
  @JSGlobal("Titanium.Android.currentActivity")
  @js.native
  val currentActivity: typings.titanium.Titanium.Android.Activity = js.native
  
  /**
    * Service in the active context.
    */
  /* static member */
  @JSGlobal("Titanium.Android.currentService")
  @js.native
  val currentService: typings.titanium.Titanium.Android.Service = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Android.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Android.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Android.apiName> property.
    * @deprecated Access <Titanium.Android.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Android.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Android.bubbleParent> property.
    * @deprecated Access <Titanium.Android.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Android.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Android.lifecycleContainer> property.
    * @deprecated Access <Titanium.Android.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Android.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Returns `true` if the app has permission access.
    */
  /* static member */
  @JSGlobal("Titanium.Android.hasPermission")
  @js.native
  def hasPermission(permission: String): Boolean = js.native
  @JSGlobal("Titanium.Android.hasPermission")
  @js.native
  def hasPermission(permission: js.Array[String]): Boolean = js.native
  
  /**
    * Check on state of Service.
    */
  /* static member */
  @JSGlobal("Titanium.Android.isServiceRunning")
  @js.native
  def isServiceRunning(intent: typings.titanium.Titanium.Android.Intent): Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Android.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Registers broadcast receiver for the given actions.
    */
  /* static member */
  @JSGlobal("Titanium.Android.registerBroadcastReceiver")
  @js.native
  def registerBroadcastReceiver(broadcastReceiver: typings.titanium.Titanium.Android.BroadcastReceiver, actions: js.Array[String]): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Android.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Request for permission access.
    */
  /* static member */
  @JSGlobal("Titanium.Android.requestPermissions")
  @js.native
  def requestPermissions(permissions: String): Unit = js.native
  @JSGlobal("Titanium.Android.requestPermissions")
  @js.native
  def requestPermissions(permissions: String, callback: js.Function1[/* param0 */ RequestPermissionAccessResult, Unit]): Unit = js.native
  @JSGlobal("Titanium.Android.requestPermissions")
  @js.native
  def requestPermissions(permissions: js.Array[String]): Unit = js.native
  @JSGlobal("Titanium.Android.requestPermissions")
  @js.native
  def requestPermissions(
    permissions: js.Array[String],
    callback: js.Function1[/* param0 */ RequestPermissionAccessResult, Unit]
  ): Unit = js.native
  
  /**
    * The first activity launched by the application.
    */
  /* static member */
  @JSGlobal("Titanium.Android.rootActivity")
  @js.native
  val rootActivity: typings.titanium.Titanium.Android.Activity = js.native
  
  /**
    * Sets the value of the <Titanium.Android.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Android.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Android.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Android.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Android.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Android.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Starts a simple service.
    */
  /* static member */
  @JSGlobal("Titanium.Android.startService")
  @js.native
  def startService(intent: typings.titanium.Titanium.Android.Intent): Unit = js.native
  
  /**
    * Stop a simple service that was started with `startService`.
    */
  /* static member */
  @JSGlobal("Titanium.Android.stopService")
  @js.native
  def stopService(intent: typings.titanium.Titanium.Android.Intent): Unit = js.native
  
  /**
    * Unregisters a broadcast receiver.
    */
  /* static member */
  @JSGlobal("Titanium.Android.unregisterBroadcastReceiver")
  @js.native
  def unregisterBroadcastReceiver(broadcastReceiver: typings.titanium.Titanium.Android.BroadcastReceiver): Unit = js.native
}
