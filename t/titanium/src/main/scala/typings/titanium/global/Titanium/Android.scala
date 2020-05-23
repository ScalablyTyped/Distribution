package typings.titanium.global.Titanium

import typings.titanium.Dictionary
import typings.titanium.RequestPermissionAccessResult
import typings.titanium.ServiceIntentOptions
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.Android.DrawerLayout
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
/* static members */
@JSGlobal("Titanium.Android")
@js.native
object Android extends js.Object {
  /**
    * An action bar is a window feature that identifies the application and user location,
    * and provides user actions and navigation modes.
    */
  @js.native
  class ActionBar ()
    extends typings.titanium.Titanium.Android.ActionBar
  
  /**
    * The Titanium binding of an Android Activity.
    */
  @js.native
  class Activity ()
    extends typings.titanium.Titanium.Android.Activity
  
  /**
    * Helper object for generating large-format notifications that include a large image attachment.
    */
  @js.native
  class BigPictureStyle ()
    extends typings.titanium.Titanium.Android.BigPictureStyle
  
  /**
    * Helper object for generating large-format notifications that include a lot of text.
    */
  @js.native
  class BigTextStyle ()
    extends typings.titanium.Titanium.Android.BigTextStyle
  
  /**
    * Monitor and handle Android system broadcasts.
    */
  @js.native
  class BroadcastReceiver ()
    extends typings.titanium.Titanium.Android.BroadcastReceiver
  
  /**
    * Message objects passed between Android application components.
    */
  @js.native
  class Intent ()
    extends typings.titanium.Titanium.Android.Intent
  
  /**
    * The Titanium binding of an Android Options Menu.
    */
  @js.native
  class Menu ()
    extends typings.titanium.Titanium.Android.Menu
  
  /**
    * The Titanium binding of an Android menu item.
    */
  @js.native
  class MenuItem ()
    extends typings.titanium.Titanium.Android.MenuItem
  
  /**
    * UI notifications that can be sent while the application is in the background.
    */
  @js.native
  class Notification ()
    extends typings.titanium.Titanium.Android.Notification
  
  /**
    * Module for notification channels.
    */
  @js.native
  class NotificationChannel ()
    extends typings.titanium.Titanium.Android.NotificationChannel
  
  /**
    * Module for managing notifications.
    */
  @js.native
  class NotificationManager ()
    extends typings.titanium.Titanium.Proxy
  
  /**
    * The Titanium binding of an Android `PendingIntent`.
    */
  @js.native
  class PendingIntent ()
    extends typings.titanium.Titanium.Android.PendingIntent
  
  /**
    * Android service for creating custom quick settings tiles and handling user's interaction with them.
    */
  @js.native
  class QuickSettingsService ()
    extends typings.titanium.Titanium.Android.QuickSettingsService
  
  /**
    * The Titanium binding of [Android RemoteViews](https://developer.android.com/reference/android/widget/RemoteViews.html).
    */
  @js.native
  class RemoteViews ()
    extends typings.titanium.Titanium.Android.RemoteViews
  
  /**
    * Android application component that executes in the background.
    */
  @js.native
  class Service ()
    extends typings.titanium.Titanium.Android.Service
  
  /**
    * User switched airplane mode on or off.
    */
  val ACTION_AIRPLANE_MODE_CHANGED: String = js.native
  /**
    * List all applications.
    */
  val ACTION_ALL_APPS: String = js.native
  /**
    * Handle an incoming phone call.
    */
  val ACTION_ANSWER: String = js.native
  /**
    * Used to indicate that the data is an attachment.
    */
  val ACTION_ATTACH_DATA: String = js.native
  /**
    * Listen to battery state change status.
    */
  val ACTION_BATTERY_CHANGED: String = js.native
  /**
    * Indicates low battery condition on the device.
    */
  val ACTION_BATTERY_LOW: String = js.native
  /**
    * Inidicates the battery is now okay after being low.
    */
  val ACTION_BATTERY_OKAY: String = js.native
  /**
    * Indicates the system has finished booting.
    */
  val ACTION_BOOT_COMPLETED: String = js.native
  /**
    * Show activity for reporting a bug.
    */
  val ACTION_BUG_REPORT: String = js.native
  /**
    * Perform a call to someone specified by the `data` property.
    */
  val ACTION_CALL: String = js.native
  /**
    * User pressed the call button.
    */
  val ACTION_CALL_BUTTON: String = js.native
  /**
    * The camera button was pressed.
    */
  val ACTION_CAMERA_BUTTON: String = js.native
  /**
    * Display an activity chooser.
    */
  val ACTION_CHOOSER: String = js.native
  /**
    * User dismissed a temporary system dialog, such as the notification drawer or recent-app drawer.
    */
  val ACTION_CLOSE_SYSTEM_DIALOGS: String = js.native
  /**
    * The device's configuration changed.
    */
  val ACTION_CONFIGURATION_CHANGED: String = js.native
  /**
    * Create a shortcut.
    */
  val ACTION_CREATE_SHORTCUT: String = js.native
  /**
    * Date changed.
    */
  val ACTION_DATE_CHANGED: String = js.native
  /**
    * Default action, which is `Titanium.Android.ACTION_VIEW`
    */
  val ACTION_DEFAULT: String = js.native
  /**
    * Delete the data specified by the Intent's `data` property.
    */
  val ACTION_DELETE: String = js.native
  /**
    * Indicates a low memory condition on the device.
    */
  val ACTION_DEVICE_STORAGE_LOW: String = js.native
  /**
    * Dial a number specified by the Intent's `data` property.
    */
  val ACTION_DIAL: String = js.native
  /**
    * Provide editable access to the data specified by the Intent's `data` property.
    */
  val ACTION_EDIT: String = js.native
  /**
    * Allow the user to select a particular kind of data specified by the Intent's `type` property.
    */
  val ACTION_GET_CONTENT: String = js.native
  /**
    * GTalk connection has been established.
    */
  val ACTION_GTALK_SERVICE_CONNECTED: String = js.native
  /**
    * GTalk connection has been disconnected.
    */
  val ACTION_GTALK_SERVICE_DISCONNECTED: String = js.native
  /**
    * A wired headset has been plugged in or unplugged.
    */
  val ACTION_HEADSET_PLUG: String = js.native
  /**
    * An input method has been changed.
    */
  val ACTION_INPUT_METHOD_CHANGED: String = js.native
  /**
    * Insert an empty item into the given container.
    */
  val ACTION_INSERT: String = js.native
  /**
    * Pick an existing item or insert an empty item, then edit it.
    */
  val ACTION_INSERT_OR_EDIT: String = js.native
  /**
    * Start as the main entry point.
    */
  val ACTION_MAIN: String = js.native
  /**
    * Indicates low memory condition notification acknowledged by user and package management should be started.
    */
  val ACTION_MANAGE_PACKAGE_STORAGE: String = js.native
  /**
    * External media was removed from SD card slot, but mount point was not unmounted.
    */
  val ACTION_MEDIA_BAD_REMOVAL: String = js.native
  /**
    * The media button was pressed.
    */
  val ACTION_MEDIA_BUTTON: String = js.native
  /**
    * External media is present and being disk-checked.
    */
  val ACTION_MEDIA_CHECKING: String = js.native
  /**
    * User has expressed the desire to remove the external storage media.
    */
  val ACTION_MEDIA_EJECT: String = js.native
  /**
    * External media is present and mounted at its mount point.
    */
  val ACTION_MEDIA_MOUNTED: String = js.native
  /**
    * External media is present, but is using an incompatible filesystem or is blank.
    */
  val ACTION_MEDIA_NOFS: String = js.native
  /**
    * External media has been removed.
    */
  val ACTION_MEDIA_REMOVED: String = js.native
  /**
    * The media scanner has finished scanning a directory.
    */
  val ACTION_MEDIA_SCANNER_FINISHED: String = js.native
  /**
    * Request the media scanner to scan a file and add it to the media database.
    */
  val ACTION_MEDIA_SCANNER_SCAN_FILE: String = js.native
  /**
    * The media scanner has started scanning a directory.
    */
  val ACTION_MEDIA_SCANNER_STARTED: String = js.native
  /**
    * External media is unmounted because it is being shared via USB mass storage.
    */
  val ACTION_MEDIA_SHARED: String = js.native
  /**
    * Corresponds to the Android `Intent.ACTION_MEDIA_UNMOUNTABLE` constant.
    */
  val ACTION_MEDIA_UNMOUNTABLE: String = js.native
  /**
    * External media is present, but not mounted at its mount point.
    */
  val ACTION_MEDIA_UNMOUNTED: String = js.native
  /**
    * An outgoing call is about to be placed.
    */
  val ACTION_NEW_OUTGOING_CALL: String = js.native
  /**
    * A new application package has been installed on the device.
    */
  val ACTION_PACKAGE_ADDED: String = js.native
  /**
    * An existing application package has been changed.
    */
  val ACTION_PACKAGE_CHANGED: String = js.native
  /**
    * The user has cleared the data of a package.
    */
  val ACTION_PACKAGE_DATA_CLEARED: String = js.native
  /**
    * An existing application package has been removed from the device.
    */
  val ACTION_PACKAGE_REMOVED: String = js.native
  /**
    * A new version of an application package has been installed, replacing an existing version that was previously installed.
    */
  val ACTION_PACKAGE_REPLACED: String = js.native
  /**
    * The user has restarted a package, and all of its processes have been killed.
    */
  val ACTION_PACKAGE_RESTARTED: String = js.native
  /**
    * Pick an item from the directory indicated by the Intent's `data` property.
    */
  val ACTION_PICK: String = js.native
  /**
    * Pick an activity given an intent.
    */
  val ACTION_PICK_ACTIVITY: String = js.native
  /**
    * External power has been connected to the device.
    */
  val ACTION_POWER_CONNECTED: String = js.native
  /**
    * External power has been disconnected from the device.
    */
  val ACTION_POWER_DISCONNECTED: String = js.native
  /**
    * Show power usage information to the user.
    */
  val ACTION_POWER_USAGE_SUMMARY: String = js.native
  /**
    * Content provider published new events or items.
    */
  val ACTION_PROVIDER_CHANGED: String = js.native
  /**
    * Device rebooted.
    */
  val ACTION_REBOOT: String = js.native
  /**
    * Run the data.
    */
  val ACTION_RUN: String = js.native
  /**
    * Sent when the device goes to sleep and becomes non-interactive.
    */
  val ACTION_SCREEN_OFF: String = js.native
  /**
    * Sent when the device wakes up and becomes interactive.
    */
  val ACTION_SCREEN_ON: String = js.native
  /**
    * Perform a search.
    */
  val ACTION_SEARCH: String = js.native
  /**
    * Start action associated with long pressing on the search key.
    */
  val ACTION_SEARCH_LONG_PRESS: String = js.native
  /**
    * Deliver data to another activity.
    */
  val ACTION_SEND: String = js.native
  /**
    * Deliver data to the recipient specified by the Intent's `data` property.
    */
  val ACTION_SENDTO: String = js.native
  /**
    * Deliver multiple data to another activity.
    */
  val ACTION_SEND_MULTIPLE: String = js.native
  /**
    * Show settings for choosing the system wallpaper.
    */
  val ACTION_SET_WALLPAPER: String = js.native
  /**
    * Device is shutting down.
    */
  val ACTION_SHUTDOWN: String = js.native
  /**
    * Perform data synchronization.
    */
  val ACTION_SYNC: String = js.native
  /**
    * Start the platform-defined tutorial.
    */
  val ACTION_SYSTEM_TUTORIAL: String = js.native
  /**
    * The time was set.
    */
  val ACTION_TIME_CHANGED: String = js.native
  /**
    * The current time changed.  Sent every minute.
    */
  val ACTION_TIME_TICK: String = js.native
  /**
    * A user ID was removed from the system.
    */
  val ACTION_UID_REMOVED: String = js.native
  /**
    * Sent when the user is present after device wakes up.
    */
  val ACTION_USER_PRESENT: String = js.native
  /**
    * Display data to the user.
    */
  val ACTION_VIEW: String = js.native
  /**
    * Start voice command.
    */
  val ACTION_VOICE_COMMAND: String = js.native
  /**
    * The current system wallpaper has changed.
    */
  val ACTION_WALLPAPER_CHANGED: String = js.native
  /**
    * Perform a web search.
    */
  val ACTION_WEB_SEARCH: String = js.native
  /**
    * Notification category indicating an alarm or timer.
    */
  val CATEGORY_ALARM: String = js.native
  /**
    * Set if the activity should be considered as an alternative action to the data the user is currently viewing.
    */
  val CATEGORY_ALTERNATIVE: String = js.native
  /**
    * Activity can browse the Internet.
    */
  val CATEGORY_BROWSABLE: String = js.native
  /**
    * Notification category indicating an incoming call (voice or video) or similar synchronous
    * communication request.
    */
  val CATEGORY_CALL: String = js.native
  /**
    * Activity should be used as the default action to perform on a piece of data.
    */
  val CATEGORY_DEFAULT: String = js.native
  /**
    * Activity is in the development preference panel.
    */
  val CATEGORY_DEVELOPMENT_PREFERENCE: String = js.native
  /**
    * Notification category indicating an asynchronous bulk message (email).
    */
  val CATEGORY_EMAIL: String = js.native
  /**
    * Activity can run inside a parent activity.
    */
  val CATEGORY_EMBED: String = js.native
  /**
    * Notification category indicating an error in background operation or authentication status.
    */
  val CATEGORY_ERROR: String = js.native
  /**
    * Notification category indicating a calendar event.
    */
  val CATEGORY_EVENT: String = js.native
  /**
    * To be used as test code for framework instrumentation tests.
    */
  val CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST: String = js.native
  /**
    * Home activity, the first activity that is displayed when the device boots.
    */
  val CATEGORY_HOME: String = js.native
  /**
    * Provides information about the package it is in.
    */
  val CATEGORY_INFO: String = js.native
  /**
    * Activity is in the device's launcher.
    */
  val CATEGORY_LAUNCHER: String = js.native
  /**
    * Notification category indicating an incoming direct message (SMS, instant message, etc.).
    */
  val CATEGORY_MESSAGE: String = js.native
  /**
    * This activity may be exercised by the monkey or other automated test tools.
    */
  val CATEGORY_MONKEY: String = js.native
  /**
    * Activity can open raw `file://` or `scheme://` URIs.
    */
  val CATEGORY_OPENABLE: String = js.native
  /**
    * This activity is a preference panel.
    */
  val CATEGORY_PREFERENCE: String = js.native
  /**
    * Notification category indicating the progress of a long-running background operation.
    */
  val CATEGORY_PROGRESS: String = js.native
  /**
    * Notification category indicating a promotion or advertisement.
    */
  val CATEGORY_PROMO: String = js.native
  /**
    * Notification category indicating a specific, timely recommendation for a single thing.
    */
  val CATEGORY_RECOMMENDATION: String = js.native
  /**
    * To be used as a sample code example (not part of the normal user experience).
    */
  val CATEGORY_SAMPLE_CODE: String = js.native
  /**
    * Activity should be considered as an alternative selection action to the data the user
    * has currently selected.
    */
  val CATEGORY_SELECTED_ALTERNATIVE: String = js.native
  /**
    * Notification category for a running background service.
    */
  val CATEGORY_SERVICE: String = js.native
  /**
    * Notification category for a social network or sharing update.
    */
  val CATEGORY_SOCIAL: String = js.native
  /**
    * Notification category indicating ongoing information about device or contextual status.
    */
  val CATEGORY_STATUS: String = js.native
  /**
    * Activity to be used in a tab activity.
    */
  val CATEGORY_TAB: String = js.native
  /**
    * To be used as a test (not part of the normal user experience).
    */
  val CATEGORY_TEST: String = js.native
  /**
    * Notification category indicating media transport control for playback.
    */
  val CATEGORY_TRANSPORT: String = js.native
  /**
    * To be used as a unit test (run through the Test Harness).
    */
  val CATEGORY_UNIT_TEST: String = js.native
  /**
    * The Android.Calendar module provides proxies and methods for accessing the native Android
    * calendar functionality.
    * @deprecated Use [Titanium.Calendar](Titanium.Calendar) instead.
    */
  val Calendar: scala.Nothing = js.native
  /**
    * Use all default settings for a notification; see
    * [Notification.defaults](Titanium.Android.Notification.defaults).
    */
  val DEFAULT_ALL: Double = js.native
  /**
    * Use the default light settings for a notification; see
    * [Notification.defaults](Titanium.Android.Notification.defaults).
    */
  val DEFAULT_LIGHTS: Double = js.native
  /**
    * Use the default sound settings for a notification; see
    * [Notification.defaults](Titanium.Android.Notification.defaults).
    */
  val DEFAULT_SOUND: Double = js.native
  /**
    * Use the default vibration settings for a notification; see
    * [Notification.defaults](Titanium.Android.Notification.defaults).
    */
  val DEFAULT_VIBRATE: Double = js.native
  /**
    * Integer indicating how many pending alarms are being delivered with the intent.
    */
  val EXTRA_ALARM_COUNT: String = js.native
  /**
    * String array containing e-mail addresses for blind carbon copying.
    */
  val EXTRA_BCC: String = js.native
  /**
    * String array containing e-mail addresses for carbon copying.
    */
  val EXTRA_CC: String = js.native
  /**
    * Boolean indicating full uninstall (true) or partial uninstall (false).
    */
  val EXTRA_DATA_REMOVED: String = js.native
  /**
    * Boolean indicating to restart the application or not.
    */
  val EXTRA_DONT_KILL_APP: String = js.native
  /**
    * String array containing e-mail addresses.
    */
  val EXTRA_EMAIL: String = js.native
  /**
    * An Intent describing the choices you would like shown.
    */
  val EXTRA_INTENT: String = js.native
  /**
    * A KeyEvent object containing the event that triggered the creation of the Intent it is in.
    */
  val EXTRA_KEY_EVENT: String = js.native
  /**
    * String holding the phone number to call or number that was called.
    */
  val EXTRA_PHONE_NUMBER: String = js.native
  /**
    * Boolean indicating if the package is being replaced.
    */
  val EXTRA_REPLACING: String = js.native
  /**
    * Bitmap icon.
    */
  val EXTRA_SHORTCUT_ICON: String = js.native
  /**
    * Resource of the shortcut.
    */
  val EXTRA_SHORTCUT_ICON_RESOURCE: String = js.native
  /**
    * Intent of a shortcut.
    */
  val EXTRA_SHORTCUT_INTENT: String = js.native
  /**
    * Name of the shortcut.
    */
  val EXTRA_SHORTCUT_NAME: String = js.native
  /**
    * URI containing the stream data.
    */
  val EXTRA_STREAM: String = js.native
  /**
    * Subject line of a message.
    */
  val EXTRA_SUBJECT: String = js.native
  /**
    * Initial data to place in a newly created record.
    */
  val EXTRA_TEMPLATE: String = js.native
  /**
    * Corresponds to the Android `Intent.EXTRA_TEXT` constant.
    */
  val EXTRA_TEXT: String = js.native
  /**
    * Corresponds to the Android `Intent.EXTRA_TITLE` constant.
    */
  val EXTRA_TITLE: String = js.native
  /**
    * UID of the assigned packaged.
    */
  val EXTRA_UID: String = js.native
  /**
    * Not used.
    */
  val FILL_IN_ACTION: Double = js.native
  /**
    * Not used.
    */
  val FILL_IN_CATEGORIES: Double = js.native
  /**
    * Not used.
    */
  val FILL_IN_COMPONENT: Double = js.native
  /**
    * Not used.
    */
  val FILL_IN_DATA: Double = js.native
  /**
    * Not used.
    */
  val FILL_IN_PACKAGE: Double = js.native
  /**
    * If activity is already running, bring it to the foreground.
    */
  val FLAG_ACTIVITY_BROUGHT_TO_FRONT: Double = js.native
  /**
    * If the activity is present, removes any activities on top of it to make it the foreground activity.
    */
  val FLAG_ACTIVITY_CLEAR_TOP: Double = js.native
  /**
    * Corresponds to the Android `Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET` constant.
    */
  val FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET: Double = js.native
  /**
    * Exclude the activity from recently launched activities.
    */
  val FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS: Double = js.native
  /**
    * Return result to the original calling activity.
    */
  val FLAG_ACTIVITY_FORWARD_RESULT: Double = js.native
  /**
    * Activity was launched from history.
    */
  val FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY: Double = js.native
  /**
    * Start the activity as a new task even if it exists.
    */
  val FLAG_ACTIVITY_MULTIPLE_TASK: Double = js.native
  /**
    * Activity will be the start of a new task (collection of activities).
    */
  val FLAG_ACTIVITY_NEW_TASK: Double = js.native
  /**
    * Prevent transition animation.
    */
  val FLAG_ACTIVITY_NO_ANIMATION: Double = js.native
  /**
    * Do not keep the activity in the history stack.
    */
  val FLAG_ACTIVITY_NO_HISTORY: Double = js.native
  /**
    * Disables the [onUserLeaveHint()](https://developer.android.com/reference/android/app/Activity.html#onUserLeaveHint()) callback.
    */
  val FLAG_ACTIVITY_NO_USER_ACTION: Double = js.native
  /**
    * Corresponds to the Android `Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP` constant.
    */
  val FLAG_ACTIVITY_PREVIOUS_IS_TOP: Double = js.native
  /**
    * If the activity already exists, place it at the top of the history stack.
    */
  val FLAG_ACTIVITY_REORDER_TO_FRONT: Double = js.native
  /**
    * If the task already exists, resets the task to its initial state.
    */
  val FLAG_ACTIVITY_RESET_TASK_IF_NEEDED: Double = js.native
  /**
    * Do not launch the activity if it is already running.
    */
  val FLAG_ACTIVITY_SINGLE_TOP: Double = js.native
  /**
    * Cancel the notification when it is clicked by the user.
    */
  val FLAG_AUTO_CANCEL: Double = js.native
  /**
    * Cancel the current pending intent before creating a new one.
    */
  val FLAG_CANCEL_CURRENT: Double = js.native
  /**
    * Enable a log message to print out the resolution of the intent.
    */
  val FLAG_DEBUG_LOG_RESOLUTION: Double = js.native
  /**
    * Indicates the intent is coming from a background operation.
    */
  val FLAG_FROM_BACKGROUND: Double = js.native
  /**
    * Grant read permission on the URI in the Intent's data or clipboard.
    */
  val FLAG_GRANT_READ_URI_PERMISSION: Double = js.native
  /**
    * Grants write permission on the URI in the Intent's data or clipboard.
    */
  val FLAG_GRANT_WRITE_URI_PERMISSION: Double = js.native
  /**
    * Repeat audio until the notification is cancelled or the notification window
    * is opened.
    */
  val FLAG_INSISTENT: Double = js.native
  /**
    * Do not cancel the notification when the user clicks the Clear All button.
    */
  val FLAG_NO_CLEAR: Double = js.native
  /**
    * If the current intent does not exist, do not create it.
    */
  val FLAG_NO_CREATE: Double = js.native
  /**
    * The pending intent can only be used once.
    */
  val FLAG_ONE_SHOT: Double = js.native
  /**
    * Specifies that a notification is in reference to something that is ongoing, like a phone call.
    */
  val FLAG_ONGOING_EVENT: Double = js.native
  /**
    * Play an alert (sound, lights, and/or vibration) once each time the notification is sent, even if it has not been canceled before that.
    */
  val FLAG_ONLY_ALERT_ONCE: Double = js.native
  /**
    * When sending a broadcast, only registered receivers will be called.
    */
  val FLAG_RECEIVER_REGISTERED_ONLY: Double = js.native
  /**
    * Use LED lights to alert the user to the notification.
    */
  val FLAG_SHOW_LIGHTS: Double = js.native
  /**
    * If the current pending intent already exists, only update the current intent's extra data.
    */
  val FLAG_UPDATE_CURRENT: Double = js.native
  /**
    * Constant corresponding to connectedDevice in the R.attr.foregroundServiceType attribute. Auto, bluetooth, TV or other devices connection, monitoring and interaction.
    */
  val FOREGROUND_SERVICE_TYPE_CONNECTED_DEVICE: Double = js.native
  /**
    * Constant corresponding to location in the R.attr.foregroundServiceType attribute. GPS, map, navigation location update.
    */
  val FOREGROUND_SERVICE_TYPE_LOCATION: Double = js.native
  /**
    * A special value indicates to use all types set in manifest file.
    */
  val FOREGROUND_SERVICE_TYPE_MANIFEST: Double = js.native
  /**
    * Constant corresponding to mediaPlayback in the R.attr.foregroundServiceType attribute. Music, video, news or other media playback.
    */
  val FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK: Double = js.native
  /**
    * Constant corresponding to mediaProjection in the R.attr.foregroundServiceType attribute. Managing a media projection session, e.g for screen recording or taking screenshots.
    */
  val FOREGROUND_SERVICE_TYPE_MEDIA_PROJECTION: Double = js.native
  /**
    * The default foreground service type if not been set in manifest file.
    */
  val FOREGROUND_SERVICE_TYPE_NONE: Double = js.native
  /**
    * Constant corresponding to phoneCall in the R.attr.foregroundServiceType attribute. Ongoing phone call or video conference.
    */
  val FOREGROUND_SERVICE_TYPE_PHONE_CALL: Double = js.native
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  val IMPORTANCE_DEFAULT: Double = js.native
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  val IMPORTANCE_HIGH: Double = js.native
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  val IMPORTANCE_LOW: Double = js.native
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  val IMPORTANCE_MAX: Double = js.native
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  val IMPORTANCE_MIN: Double = js.native
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  val IMPORTANCE_NONE: Double = js.native
  /**
    * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
    */
  val IMPORTANCE_UNSPECIFIED: Double = js.native
  /**
    * Standard Action Bar navigation mode.
    */
  val NAVIGATION_MODE_STANDARD: Double = js.native
  /**
    * Action Bar tab navigation mode.
    */
  val NAVIGATION_MODE_TABS: Double = js.native
  /**
    * Not used.
    * @deprecated
    */
  val PENDING_INTENT_FOR_ACTIVITY: Double = js.native
  /**
    * Not used.
    * @deprecated
    */
  val PENDING_INTENT_FOR_BROADCAST: Double = js.native
  /**
    * Not used.
    * @deprecated
    */
  val PENDING_INTENT_FOR_SERVICE: Double = js.native
  /**
    * Not used.
    * @deprecated
    */
  val PENDING_INTENT_MAX_VALUE: Double = js.native
  /**
    * Default priority if it does not fit into another priority category.
    */
  val PRIORITY_DEFAULT: Double = js.native
  /**
    * Use for high priority notifications like real-time chat messages.
    */
  val PRIORITY_HIGH: Double = js.native
  /**
    * Use for low priority notifications like software updates.
    */
  val PRIORITY_LOW: Double = js.native
  /**
    * Use for urgent or time-critical notifications, for example, turn-by-turn directions or
    * emergency alerts.
    */
  val PRIORITY_MAX: Double = js.native
  /**
    * Use for expired events.
    */
  val PRIORITY_MIN: Double = js.native
  /**
    * Accessor for Android system resources.
    */
  val R: typings.titanium.Titanium.Android.R = js.native
  /**
    * Used with [setResult](Titanium.Android.Activity.setResult) to specify that
    * an activity was canceled.
    */
  val RESULT_CANCELED: Double = js.native
  /**
    * Used with [setResult](Titanium.Android.Activity.setResult) to specify a
    * user-defined result.
    */
  val RESULT_FIRST_USER: Double = js.native
  /**
    * Used with [setResult](Titanium.Android.Activity.setResult) to specify that
    * an activity succeeded.
    */
  val RESULT_OK: Double = js.native
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify the activity should run in the same orientation as the activity behind it
    * in the activity stack.
    */
  val SCREEN_ORIENTATION_BEHIND: Double = js.native
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify a landscape screen orientation.
    */
  val SCREEN_ORIENTATION_LANDSCAPE: Double = js.native
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify that the sensor should be ignored and the display should not rotate.
    */
  val SCREEN_ORIENTATION_NOSENSOR: Double = js.native
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify a portrait screen orientation.
    */
  val SCREEN_ORIENTATION_PORTRAIT: Double = js.native
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify that orientation should be determined by the orientation sensor.
    */
  val SCREEN_ORIENTATION_SENSOR: Double = js.native
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify that the system should use its default rules for determining the best
    * orientation.
    */
  val SCREEN_ORIENTATION_UNSPECIFIED: Double = js.native
  /**
    * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
    * specify that the system should use the user's preferred orientation.
    */
  val SCREEN_ORIENTATION_USER: Double = js.native
  /**
    * Always show this item as an action button in the action bar.
    */
  val SHOW_AS_ACTION_ALWAYS: Double = js.native
  /**
    * The action view can collapse to a normal menu item.
    */
  val SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW: Double = js.native
  /**
    * Show this item as an action button if the system decides there is room for it.
    */
  val SHOW_AS_ACTION_IF_ROOM: Double = js.native
  /**
    * Never display this item as an action button in the action bar.
    */
  val SHOW_AS_ACTION_NEVER: Double = js.native
  /**
    * When this item is in the action bar, always show it with a text label.
    */
  val SHOW_AS_ACTION_WITH_TEXT: Double = js.native
  /**
    * A Service start mode indicating that if the host application is stopped by Android, the service should not be restarted automatically.
    */
  val START_NOT_STICKY: Double = js.native
  /**
    * A Service start mode indicating that if the host application is stopped by Android, the service should be restarted automatically and the original Intent re-sent.
    */
  val START_REDELIVER_INTENT: Double = js.native
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to
    * request that the alarm stream type for notifications be used.
    */
  val STREAM_ALARM: Double = js.native
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * default stream type for notifications be used.
    */
  val STREAM_DEFAULT: Double = js.native
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to
    * request that the music stream type for notifications be used.
    */
  val STREAM_MUSIC: Double = js.native
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * notification stream type for notifications be used.
    */
  val STREAM_NOTIFICATION: Double = js.native
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * ring stream type for notifications be used.
    */
  val STREAM_RING: Double = js.native
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * system stream type for notifications be used.
    */
  val STREAM_SYSTEM: Double = js.native
  /**
    * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
    * voice call stream type for notifications be used.
    */
  val STREAM_VOICE_CALL: Double = js.native
  /**
    * QuickSettings tile is active.
    */
  val TILE_STATE_ACTIVE: Double = js.native
  /**
    * QuickSettings tile is inactive.
    */
  val TILE_STATE_INACTIVE: Double = js.native
  /**
    * QuickSettings tile is unavailble.
    */
  val TILE_STATE_UNAVAILABLE: Double = js.native
  /**
    * The URI scheme used for intent URIs.
    */
  val URI_INTENT_SCHEME: Double = js.native
  /**
    * Shows basic information about the notification.
    */
  val VISIBILITY_PRIVATE: Double = js.native
  /**
    * Shows the notification's full content on the lockscreen. This is the system default if visibility is left unspecified.
    */
  val VISIBILITY_PUBLIC: Double = js.native
  /**
    * Shows the most minimal information of the notification on the lockscreen.
    */
  val VISIBILITY_SECRET: Double = js.native
  /**
    * Turn the screen on when the wake lock is acquired.
    */
  val WAKE_LOCK_ACQUIRE_CAUSES_WAKEUP: Double = js.native
  /**
    * Ensures that the screen and keyboard backlight are on at full brightness.
    */
  val WAKE_LOCK_FULL: Double = js.native
  /**
    * When this wake lock is released, poke the user activity timer so the screen stays on for a little longer.
    */
  val WAKE_LOCK_ON_AFTER_RELEASE: Double = js.native
  /**
    * Ensures that the CPU is running; the screen and keyboard backlight will be allowed to go off.
    */
  val WAKE_LOCK_PARTIAL: Double = js.native
  /**
    * Ensures that the screen is on at full brightness; the keyboard backlight will be allowed to go off.
    */
  val WAKE_LOCK_SCREEN_BRIGHT: Double = js.native
  /**
    * Ensures that the screen is on (but may be dimmed); the keyboard backlight will be allowed to go off.
    */
  val WAKE_LOCK_SCREEN_DIM: Double = js.native
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  /**
    * References the top-most window's activity.
    */
  val currentActivity: typings.titanium.Titanium.Android.Activity = js.native
  /**
    * Service in the active context.
    */
  val currentService: typings.titanium.Titanium.Android.Service = js.native
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
    * The first activity launched by the application.
    */
  val rootActivity: typings.titanium.Titanium.Android.Activity = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  /**
    * Creates and returns an instance of <Titanium.Android.BigPictureStyle>.
    */
  def createBigPictureStyle(): typings.titanium.Titanium.Android.BigPictureStyle = js.native
  def createBigPictureStyle(parameters: Dictionary[typings.titanium.Titanium.Android.BigPictureStyle]): typings.titanium.Titanium.Android.BigPictureStyle = js.native
  /**
    * Creates and returns an instance of <Titanium.Android.BigTextStyle>.
    */
  def createBigTextStyle(): typings.titanium.Titanium.Android.BigTextStyle = js.native
  def createBigTextStyle(parameters: Dictionary[typings.titanium.Titanium.Android.BigTextStyle]): typings.titanium.Titanium.Android.BigTextStyle = js.native
  /**
    * Create an `Intent` to be used in a broadcast.
    */
  def createBroadcastIntent(): typings.titanium.Titanium.Android.Intent = js.native
  def createBroadcastIntent(parameters: Dictionary[typings.titanium.Titanium.Android.Intent]): typings.titanium.Titanium.Android.Intent = js.native
  /**
    * Creates and returns an instance of <Titanium.Android.BroadcastReceiver>.
    */
  def createBroadcastReceiver(): typings.titanium.Titanium.Android.BroadcastReceiver = js.native
  def createBroadcastReceiver(parameters: Dictionary[typings.titanium.Titanium.Android.BroadcastReceiver]): typings.titanium.Titanium.Android.BroadcastReceiver = js.native
  /**
    * Creates a [DrawerLayout](Titanium.UI.Android.DrawerLayout).
    */
  def createDrawerLayout(): DrawerLayout = js.native
  def createDrawerLayout(parameters: Dictionary[DrawerLayout]): DrawerLayout = js.native
  /**
    * Creates and returns an instance of <Titanium.Android.Intent>.
    */
  def createIntent(): typings.titanium.Titanium.Android.Intent = js.native
  def createIntent(parameters: Dictionary[typings.titanium.Titanium.Android.Intent]): typings.titanium.Titanium.Android.Intent = js.native
  /**
    * Creates an activity chooser intent, used to allow the user to select a target activity
    * for an intent.
    */
  def createIntentChooser(intent: typings.titanium.Titanium.Android.Intent, title: String): typings.titanium.Titanium.Android.Intent = js.native
  /**
    * Creates and returns an instance of <Titanium.Android.Notification>.
    */
  def createNotification(): typings.titanium.Titanium.Android.Notification = js.native
  def createNotification(parameters: Dictionary[typings.titanium.Titanium.Android.Notification]): typings.titanium.Titanium.Android.Notification = js.native
  /**
    * Creates and returns an instance of <Titanium.Android.NotificationChannel>.
    */
  def createNotificationChannel(): typings.titanium.Titanium.Android.NotificationChannel = js.native
  def createNotificationChannel(parameters: Dictionary[typings.titanium.Titanium.Android.NotificationChannel]): typings.titanium.Titanium.Android.NotificationChannel = js.native
  /**
    * Creates a [PendingIntent](Titanium.Android.PendingIntent) to be used inside a
    * [Notification](Titanium.Android.Notification).
    */
  def createPendingIntent(): typings.titanium.Titanium.Android.PendingIntent = js.native
  def createPendingIntent(parameters: Dictionary[typings.titanium.Titanium.Android.PendingIntent]): typings.titanium.Titanium.Android.PendingIntent = js.native
  /**
    * Creates and returns an instance of <Titanium.Android.QuickSettingsService>.
    */
  def createQuickSettingsService(): typings.titanium.Titanium.Android.QuickSettingsService = js.native
  def createQuickSettingsService(parameters: Dictionary[typings.titanium.Titanium.Android.QuickSettingsService]): typings.titanium.Titanium.Android.QuickSettingsService = js.native
  /**
    * Creates and returns an instance of <Titanium.Android.RemoteViews>.
    */
  def createRemoteViews(): typings.titanium.Titanium.Android.RemoteViews = js.native
  def createRemoteViews(parameters: Dictionary[typings.titanium.Titanium.Android.RemoteViews]): typings.titanium.Titanium.Android.RemoteViews = js.native
  /**
    * Create a <Titanium.Android.Service> so you can start/stop it and listen for events from it.
    */
  def createService(intent: typings.titanium.Titanium.Android.Intent): typings.titanium.Titanium.Android.Service = js.native
  /**
    * Create an `Intent` to be used to start a service.
    */
  def createServiceIntent(options: ServiceIntentOptions): typings.titanium.Titanium.Android.Intent = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Gets the value of the <Titanium.Android.apiName> property.
    * @deprecated Access <Titanium.Android.apiName> instead.
    */
  def getApiName(): String = js.native
  /**
    * Gets the value of the <Titanium.Android.bubbleParent> property.
    * @deprecated Access <Titanium.Android.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Android.lifecycleContainer> property.
    * @deprecated Access <Titanium.Android.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
    * Returns `true` if the app has permission access.
    */
  def hasPermission(permission: String): Boolean = js.native
  def hasPermission(permission: js.Array[String]): Boolean = js.native
  /**
    * Check on state of Service.
    */
  def isServiceRunning(intent: typings.titanium.Titanium.Android.Intent): Boolean = js.native
  /**
    * Registers broadcast receiver for the given actions.
    */
  def registerBroadcastReceiver(broadcastReceiver: typings.titanium.Titanium.Android.BroadcastReceiver, actions: js.Array[String]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Request for permission access.
    */
  def requestPermissions(permissions: String): Unit = js.native
  def requestPermissions(permissions: String, callback: js.Function1[/* param0 */ RequestPermissionAccessResult, Unit]): Unit = js.native
  def requestPermissions(permissions: js.Array[String]): Unit = js.native
  def requestPermissions(
    permissions: js.Array[String],
    callback: js.Function1[/* param0 */ RequestPermissionAccessResult, Unit]
  ): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Android.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Android.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
    * Starts a simple service.
    */
  def startService(intent: typings.titanium.Titanium.Android.Intent): Unit = js.native
  /**
    * Stop a simple service that was started with `startService`.
    */
  def stopService(intent: typings.titanium.Titanium.Android.Intent): Unit = js.native
  /**
    * Unregisters a broadcast receiver.
    */
  def unregisterBroadcastReceiver(broadcastReceiver: typings.titanium.Titanium.Android.BroadcastReceiver): Unit = js.native
  /* static members */
  @js.native
  object NotificationManager extends js.Object {
    /**
      * Use <Titanium.Android.DEFAULT_ALL> instead.
      */
    val DEFAULT_ALL: Double = js.native
    /**
      * Use <Titanium.Android.DEFAULT_LIGHTS> instead.
      */
    val DEFAULT_LIGHTS: Double = js.native
    /**
      * Use <Titanium.Android.DEFAULT_SOUND> instead.
      */
    val DEFAULT_SOUND: Double = js.native
    /**
      * Use <Titanium.Android.DEFAULT_VIBRATE> instead.
      */
    val DEFAULT_VIBRATE: Double = js.native
    /**
      * Use <Titanium.Android.FLAG_AUTO_CANCEL> instead.
      */
    val FLAG_AUTO_CANCEL: Double = js.native
    /**
      * Use <Titanium.Android.FLAG_INSISTENT> instead.
      */
    val FLAG_INSISTENT: Double = js.native
    /**
      * Use <Titanium.Android.FLAG_NO_CLEAR> instead.
      */
    val FLAG_NO_CLEAR: Double = js.native
    /**
      * Use <Titanium.Android.FLAG_ONGOING_EVENT> instead.
      */
    val FLAG_ONGOING_EVENT: Double = js.native
    /**
      * Use <Titanium.Android.FLAG_ONLY_ALERT_ONCE> instead.
      */
    val FLAG_ONLY_ALERT_ONCE: Double = js.native
    /**
      * Use <Titanium.Android.FLAG_SHOW_LIGHTS> instead.
      */
    val FLAG_SHOW_LIGHTS: Double = js.native
    /**
      * Use <Titanium.Android.STREAM_DEFAULT> instead.
      */
    val STREAM_DEFAULT: Double = js.native
    /**
      * The name of the API that this proxy corresponds to.
      */
    val apiName: String = js.native
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    var bubbleParent: Boolean = js.native
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    var lifecycleContainer: Window | TabGroup = js.native
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Applies the properties to the proxy.
      */
    def applyProperties(props: js.Any): Unit = js.native
    /**
      * Returns whether showing notifications is enabled for the application.
      */
    def areNotificationsEnabled(): Boolean = js.native
    /**
      * Cancels a previously displayed notification.
      */
    def cancel(id: Double): Unit = js.native
    /**
      * Cancels all previously displayed notifications.
      */
    def cancelAll(): Unit = js.native
    /**
      * Create a notification channel.
      */
    def createNotificationChannel(parameters: Dictionary[typings.titanium.Titanium.Android.NotificationChannel]): typings.titanium.Titanium.Android.NotificationChannel = js.native
    /**
      * Fires a synthesized event to any registered listeners.
      */
    def fireEvent(name: String): Unit = js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    /**
      * Gets the value of the <Titanium.Android.NotificationManager.apiName> property.
      * @deprecated Access <Titanium.Android.NotificationManager.apiName> instead.
      */
    def getApiName(): String = js.native
    /**
      * Gets the value of the <Titanium.Android.NotificationManager.bubbleParent> property.
      * @deprecated Access <Titanium.Android.NotificationManager.bubbleParent> instead.
      */
    def getBubbleParent(): Boolean = js.native
    /**
      * Gets the value of the <Titanium.Android.NotificationManager.lifecycleContainer> property.
      * @deprecated Access <Titanium.Android.NotificationManager.lifecycleContainer> instead.
      */
    def getLifecycleContainer(): Window | TabGroup = js.native
    /**
      * Adds a persistent notification to the status bar.
      */
    def notify(id: Double, notification: typings.titanium.Titanium.Android.Notification): Unit = js.native
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Sets the value of the <Titanium.Android.NotificationManager.bubbleParent> property.
      * @deprecated Set the value using <Titanium.Android.NotificationManager.bubbleParent> instead.
      */
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.Android.NotificationManager.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.Android.NotificationManager.lifecycleContainer> instead.
      */
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  }
  
}

