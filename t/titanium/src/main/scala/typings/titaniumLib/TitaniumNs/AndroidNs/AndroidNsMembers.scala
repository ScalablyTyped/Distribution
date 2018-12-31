package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Android")
@js.native
object AndroidNsMembers extends js.Object {
  /**
  		 * User switched airplane mode on or off.
  		 */
  val ACTION_AIRPLANE_MODE_CHANGED: java.lang.String = js.native
  /**
  		 * List all applications.
  		 */
  val ACTION_ALL_APPS: java.lang.String = js.native
  /**
  		 * Handle an incoming phone call.
  		 */
  val ACTION_ANSWER: java.lang.String = js.native
  /**
  		 * Used to indicate that the data is an attachment.
  		 */
  val ACTION_ATTACH_DATA: java.lang.String = js.native
  /**
  		 * Listen to battery state change status.
  		 */
  val ACTION_BATTERY_CHANGED: java.lang.String = js.native
  /**
  		 * Indicates low battery condition on the device.
  		 */
  val ACTION_BATTERY_LOW: java.lang.String = js.native
  /**
  		 * Inidicates the battery is now okay after being low.
  		 */
  val ACTION_BATTERY_OKAY: java.lang.String = js.native
  /**
  		 * Indicates the system has finished booting.
  		 */
  val ACTION_BOOT_COMPLETED: java.lang.String = js.native
  /**
  		 * Show activity for reporting a bug.
  		 */
  val ACTION_BUG_REPORT: java.lang.String = js.native
  /**
  		 * Perform a call to someone specified by the `data` property.
  		 */
  val ACTION_CALL: java.lang.String = js.native
  /**
  		 * User pressed the call button.
  		 */
  val ACTION_CALL_BUTTON: java.lang.String = js.native
  /**
  		 * The camera button was pressed.
  		 */
  val ACTION_CAMERA_BUTTON: java.lang.String = js.native
  /**
  		 * Display an activity chooser.
  		 */
  val ACTION_CHOOSER: java.lang.String = js.native
  /**
  		 * User dismissed a temporary system dialog, such as the notification drawer or recent-app drawer.
  		 */
  val ACTION_CLOSE_SYSTEM_DIALOGS: java.lang.String = js.native
  /**
  		 * The device's configuration changed.
  		 */
  val ACTION_CONFIGURATION_CHANGED: java.lang.String = js.native
  /**
  		 * Create a shortcut.
  		 */
  val ACTION_CREATE_SHORTCUT: java.lang.String = js.native
  /**
  		 * Date changed.
  		 */
  val ACTION_DATE_CHANGED: java.lang.String = js.native
  /**
  		 * Default action, which is `Titanium.Android.ACTION_VIEW`
  		 */
  val ACTION_DEFAULT: java.lang.String = js.native
  /**
  		 * Delete the data specified by the Intent's `data` property.
  		 */
  val ACTION_DELETE: java.lang.String = js.native
  /**
  		 * Indicates a low memory condition on the device.
  		 */
  val ACTION_DEVICE_STORAGE_LOW: java.lang.String = js.native
  /**
  		 * Dial a number specified by the Intent's `data` property.
  		 */
  val ACTION_DIAL: java.lang.String = js.native
  /**
  		 * Provide editable access to the data specified by the Intent's `data` property.
  		 */
  val ACTION_EDIT: java.lang.String = js.native
  /**
  		 * Allow the user to select a particular kind of data specified by the Intent's `type` property.
  		 */
  val ACTION_GET_CONTENT: java.lang.String = js.native
  /**
  		 * GTalk connection has been established.
  		 */
  val ACTION_GTALK_SERVICE_CONNECTED: java.lang.String = js.native
  /**
  		 * GTalk connections has been disconnected.
  		 */
  val ACTION_GTALK_SERVICE_DISCONNECTED: java.lang.String = js.native
  /**
  		 * A wired headset has been plugged in or unplugged.
  		 */
  val ACTION_HEADSET_PLUG: java.lang.String = js.native
  /**
  		 * An input method has been changed.
  		 */
  val ACTION_INPUT_METHOD_CHANGED: java.lang.String = js.native
  /**
  		 * Insert an empty item into the given container.
  		 */
  val ACTION_INSERT: java.lang.String = js.native
  /**
  		 * Pick an existing item or insert an empty item, then edit it.
  		 */
  val ACTION_INSERT_OR_EDIT: java.lang.String = js.native
  /**
  		 * Start as the main entry point.
  		 */
  val ACTION_MAIN: java.lang.String = js.native
  /**
  		 * Indicates low memory condition notification acknowledged by user and package management should be started.
  		 */
  val ACTION_MANAGE_PACKAGE_STORAGE: java.lang.String = js.native
  /**
  		 * External media was removed from SD card slot, but mount point was not unmounted.
  		 */
  val ACTION_MEDIA_BAD_REMOVAL: java.lang.String = js.native
  /**
  		 * The media button was pressed.
  		 */
  val ACTION_MEDIA_BUTTON: java.lang.String = js.native
  /**
  		 * External media is present and being disk-checked
  		 */
  val ACTION_MEDIA_CHECKING: java.lang.String = js.native
  /**
  		 * User has expressed the desire to remove the external storage media.
  		 */
  val ACTION_MEDIA_EJECT: java.lang.String = js.native
  /**
  		 * External media is present and mounted at its mount point.
  		 */
  val ACTION_MEDIA_MOUNTED: java.lang.String = js.native
  /**
  		 * External media is present, but is using an incompatible filesystem or is blank.
  		 */
  val ACTION_MEDIA_NOFS: java.lang.String = js.native
  /**
  		 * External media has been removed.
  		 */
  val ACTION_MEDIA_REMOVED: java.lang.String = js.native
  /**
  		 * The media scanner has finished scanning a directory.
  		 */
  val ACTION_MEDIA_SCANNER_FINISHED: java.lang.String = js.native
  /**
  		 * Request the media scanner to scan a file and add it to the media database.
  		 */
  val ACTION_MEDIA_SCANNER_SCAN_FILE: java.lang.String = js.native
  /**
  		 * The media scanner has started scanning a directory.
  		 */
  val ACTION_MEDIA_SCANNER_STARTED: java.lang.String = js.native
  /**
  		 * External media is unmounted because it is being shared via USB mass storage.
  		 */
  val ACTION_MEDIA_SHARED: java.lang.String = js.native
  /**
  		 * Corresponds to the Android `Intent.ACTION_MEDIA_UNMOUNTABLE` constant.
  		 */
  val ACTION_MEDIA_UNMOUNTABLE: java.lang.String = js.native
  /**
  		 * External media is present, but not mounted at its mount point.
  		 */
  val ACTION_MEDIA_UNMOUNTED: java.lang.String = js.native
  /**
  		 * An outgoing call is about to be placed.
  		 */
  val ACTION_NEW_OUTGOING_CALL: java.lang.String = js.native
  /**
  		 * A new application package has been installed on the device.
  		 */
  val ACTION_PACKAGE_ADDED: java.lang.String = js.native
  /**
  		 * An existing application package has been changed.
  		 */
  val ACTION_PACKAGE_CHANGED: java.lang.String = js.native
  /**
  		 * The user has cleared the data of a package.
  		 */
  val ACTION_PACKAGE_DATA_CLEARED: java.lang.String = js.native
  /**
  		 * An existing application package has been removed from the device.
  		 */
  val ACTION_PACKAGE_REMOVED: java.lang.String = js.native
  /**
  		 * A new version of an application package has been installed, replacing an existing version that was previously installed.
  		 */
  val ACTION_PACKAGE_REPLACED: java.lang.String = js.native
  /**
  		 * The user has restarted a package, and all of its processes have been killed.
  		 */
  val ACTION_PACKAGE_RESTARTED: java.lang.String = js.native
  /**
  		 * Pick an item from the directory indicated by the Intent's `data` property.
  		 */
  val ACTION_PICK: java.lang.String = js.native
  /**
  		 * Pick an activity given an intent.
  		 */
  val ACTION_PICK_ACTIVITY: java.lang.String = js.native
  /**
  		 * External power has been connected to the device.
  		 */
  val ACTION_POWER_CONNECTED: java.lang.String = js.native
  /**
  		 * External power has been disconnected from the device.
  		 */
  val ACTION_POWER_DISCONNECTED: java.lang.String = js.native
  /**
  		 * Show power usage information to the user.
  		 */
  val ACTION_POWER_USAGE_SUMMARY: java.lang.String = js.native
  /**
  		 * Content provider published new events or items.
  		 */
  val ACTION_PROVIDER_CHANGED: java.lang.String = js.native
  /**
  		 * Device rebooted.
  		 */
  val ACTION_REBOOT: java.lang.String = js.native
  /**
  		 * Run the data.
  		 */
  val ACTION_RUN: java.lang.String = js.native
  /**
  		 * Sent when the device goes to sleep and becomes non-interactive.
  		 */
  val ACTION_SCREEN_OFF: java.lang.String = js.native
  /**
  		 * Sent when the device wakes up and becomes interactive.
  		 */
  val ACTION_SCREEN_ON: java.lang.String = js.native
  /**
  		 * Perform a search.
  		 */
  val ACTION_SEARCH: java.lang.String = js.native
  /**
  		 * Start action associated with long pressing on the search key.
  		 */
  val ACTION_SEARCH_LONG_PRESS: java.lang.String = js.native
  /**
  		 * Deliver data to another activity.
  		 */
  val ACTION_SEND: java.lang.String = js.native
  /**
  		 * Deliver data to the recipient specified by the Intent's `data` property.
  		 */
  val ACTION_SENDTO: java.lang.String = js.native
  /**
  		 * Deliver multiple data to another activity.
  		 */
  val ACTION_SEND_MULTIPLE: java.lang.String = js.native
  /**
  		 * Show settings for choosing the system wallpaper.
  		 */
  val ACTION_SET_WALLPAPER: java.lang.String = js.native
  /**
  		 * Device is shutting down.
  		 */
  val ACTION_SHUTDOWN: java.lang.String = js.native
  /**
  		 * Perform data synchronization.
  		 */
  val ACTION_SYNC: java.lang.String = js.native
  /**
  		 * Start the platform-defined tutorial.
  		 */
  val ACTION_SYSTEM_TUTORIAL: java.lang.String = js.native
  /**
  		 * The time was set.
  		 */
  val ACTION_TIME_CHANGED: java.lang.String = js.native
  /**
  		 * The current time changed.  Sent every minute.
  		 */
  val ACTION_TIME_TICK: java.lang.String = js.native
  /**
  		 * A user ID was removed from the system.
  		 */
  val ACTION_UID_REMOVED: java.lang.String = js.native
  /**
  		 * Sent when the user is present after device wakes up.
  		 */
  val ACTION_USER_PRESENT: java.lang.String = js.native
  /**
  		 * Display data to the user.
  		 */
  val ACTION_VIEW: java.lang.String = js.native
  /**
  		 * Start voice command.
  		 */
  val ACTION_VOICE_COMMAND: java.lang.String = js.native
  /**
  		 * The current system wallpaper has changed.
  		 */
  val ACTION_WALLPAPER_CHANGED: java.lang.String = js.native
  /**
  		 * Perform a web search.
  		 */
  val ACTION_WEB_SEARCH: java.lang.String = js.native
  /**
  		 * Notification category indicating an alarm or timer.
  		 */
  val CATEGORY_ALARM: java.lang.String = js.native
  /**
  		 * Set if the activity should be considered as an alternative action to the data the user is currently viewing.
  		 */
  val CATEGORY_ALTERNATIVE: java.lang.String = js.native
  /**
  		 * Activity can browse the Internet.
  		 */
  val CATEGORY_BROWSABLE: java.lang.String = js.native
  /**
  		 * Notification category indicating an incoming call (voice or video) or similar synchronous
  		 * communication request.
  		 */
  val CATEGORY_CALL: java.lang.String = js.native
  /**
  		 * Activity should be used as the default action to perform on a piece of data.
  		 */
  val CATEGORY_DEFAULT: java.lang.String = js.native
  /**
  		 * Activity is in the development preference panel.
  		 */
  val CATEGORY_DEVELOPMENT_PREFERENCE: java.lang.String = js.native
  /**
  		 * Notification category indicating an asynchronous bulk message (email).
  		 */
  val CATEGORY_EMAIL: java.lang.String = js.native
  /**
  		 * Activity can run inside a parent activity.
  		 */
  val CATEGORY_EMBED: java.lang.String = js.native
  /**
  		 * Notification category indicating an error in background operation or authentication status.
  		 */
  val CATEGORY_ERROR: java.lang.String = js.native
  /**
  		 * Notification category indicating a calendar event.
  		 */
  val CATEGORY_EVENT: java.lang.String = js.native
  /**
  		 * To be used as test code for framework instrumentation tests.
  		 */
  val CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST: java.lang.String = js.native
  /**
  		 * Home activity, the first activity that is displayed when the device boots.
  		 */
  val CATEGORY_HOME: java.lang.String = js.native
  /**
  		 * Provides information about the package it is in.
  		 */
  val CATEGORY_INFO: java.lang.String = js.native
  /**
  		 * Activity is in the device's launcher.
  		 */
  val CATEGORY_LAUNCHER: java.lang.String = js.native
  /**
  		 * Notification category indicating an incoming direct message (SMS, instant message, etc.).
  		 */
  val CATEGORY_MESSAGE: java.lang.String = js.native
  /**
  		 * This activity may be exercised by the monkey or other automated test tools.
  		 */
  val CATEGORY_MONKEY: java.lang.String = js.native
  /**
  		 * Activity can open raw `file://` or `scheme://` URIs.
  		 */
  val CATEGORY_OPENABLE: java.lang.String = js.native
  /**
  		 * This activity is a preference panel.
  		 */
  val CATEGORY_PREFERENCE: java.lang.String = js.native
  /**
  		 * Notification category indicating the progress of a long-running background operation.
  		 */
  val CATEGORY_PROGRESS: java.lang.String = js.native
  /**
  		 * Notification category indicating a promotion or advertisement.
  		 */
  val CATEGORY_PROMO: java.lang.String = js.native
  /**
  		 * Notification category indicating a specific, timely recommendation for a single thing.
  		 */
  val CATEGORY_RECOMMENDATION: java.lang.String = js.native
  /**
  		 * To be used as a sample code example (not part of the normal user experience).
  		 */
  val CATEGORY_SAMPLE_CODE: java.lang.String = js.native
  /**
  		 * Activity should be considered as an alternative selection action to the data the user
  		 * has currently selected.
  		 */
  val CATEGORY_SELECTED_ALTERNATIVE: java.lang.String = js.native
  /**
  		 * Notification category for a running background service.
  		 */
  val CATEGORY_SERVICE: java.lang.String = js.native
  /**
  		 * Notification category for a social network or sharing update.
  		 */
  val CATEGORY_SOCIAL: java.lang.String = js.native
  /**
  		 * Notification category indicating ongoing information about device or contextual status.
  		 */
  val CATEGORY_STATUS: java.lang.String = js.native
  /**
  		 * Activity to be used in a tab activity.
  		 */
  val CATEGORY_TAB: java.lang.String = js.native
  /**
  		 * To be used as a test (not part of the normal user experience).
  		 */
  val CATEGORY_TEST: java.lang.String = js.native
  /**
  		 * Notification category indicating media transport control for playback.
  		 */
  val CATEGORY_TRANSPORT: java.lang.String = js.native
  /**
  		 * To be used as a unit test (run through the Test Harness).
  		 */
  val CATEGORY_UNIT_TEST: java.lang.String = js.native
  /**
  		 * Use all default settings for a notification; see
  		 * [Notification.defaults](Titanium.Android.Notification.defaults).
  		 */
  val DEFAULT_ALL: scala.Double = js.native
  /**
  		 * Use the default light settings for a notification; see
  		 * [Notification.defaults](Titanium.Android.Notification.defaults).
  		 */
  val DEFAULT_LIGHTS: scala.Double = js.native
  /**
  		 * Use the default sound settings for a notification; see
  		 * [Notification.defaults](Titanium.Android.Notification.defaults).
  		 */
  val DEFAULT_SOUND: scala.Double = js.native
  /**
  		 * Use the default vibration settings for a notification; see
  		 * [Notification.defaults](Titanium.Android.Notification.defaults).
  		 */
  val DEFAULT_VIBRATE: scala.Double = js.native
  /**
  		 * Integer indicating how many pending alarms are being delivered with the intent.
  		 */
  val EXTRA_ALARM_COUNT: java.lang.String = js.native
  /**
  		 * String array containing e-mail addresses for blind carbon copying.
  		 */
  val EXTRA_BCC: java.lang.String = js.native
  /**
  		 * String array containing e-mail addresses for carbon copying.
  		 */
  val EXTRA_CC: java.lang.String = js.native
  /**
  		 * Boolean indicating full uninstall (true) or partial uninstall (false).
  		 */
  val EXTRA_DATA_REMOVED: java.lang.String = js.native
  /**
  		 * Boolean indicating to restart the application or not.
  		 */
  val EXTRA_DONT_KILL_APP: java.lang.String = js.native
  /**
  		 * String array containing e-mail addresses.
  		 */
  val EXTRA_EMAIL: java.lang.String = js.native
  /**
  		 * An Intent describing the choices you would like shown.
  		 */
  val EXTRA_INTENT: java.lang.String = js.native
  /**
  		 * A KeyEvent object containing the event that triggered the creation of the Intent it is in.
  		 */
  val EXTRA_KEY_EVENT: java.lang.String = js.native
  /**
  		 * String holding the phone number to call or number that was called.
  		 */
  val EXTRA_PHONE_NUMBER: java.lang.String = js.native
  /**
  		 * Boolean indicating if the package is being replaced.
  		 */
  val EXTRA_REPLACING: java.lang.String = js.native
  /**
  		 * Bitmap icon.
  		 */
  val EXTRA_SHORTCUT_ICON: java.lang.String = js.native
  /**
  		 * Resource of the shortcut.
  		 */
  val EXTRA_SHORTCUT_ICON_RESOURCE: java.lang.String = js.native
  /**
  		 * Intent of a shortcut.
  		 */
  val EXTRA_SHORTCUT_INTENT: java.lang.String = js.native
  /**
  		 * Name of the shortcut.
  		 */
  val EXTRA_SHORTCUT_NAME: java.lang.String = js.native
  /**
  		 * URI containing the stream data.
  		 */
  val EXTRA_STREAM: java.lang.String = js.native
  /**
  		 * Subject line of a message.
  		 */
  val EXTRA_SUBJECT: java.lang.String = js.native
  /**
  		 * Initial data to place in a newly created record.
  		 */
  val EXTRA_TEMPLATE: java.lang.String = js.native
  /**
  		 * Corresponds to the Android `Intent.EXTRA_TEXT` constant.
  		 */
  val EXTRA_TEXT: java.lang.String = js.native
  /**
  		 * Corresponds to the Android `Intent.EXTRA_TITLE` constant.
  		 */
  val EXTRA_TITLE: java.lang.String = js.native
  /**
  		 * UID of the assigned packaged.
  		 */
  val EXTRA_UID: java.lang.String = js.native
  /**
  		 * Not used.
  		 */
  val FILL_IN_ACTION: scala.Double = js.native
  /**
  		 * Not used.
  		 */
  val FILL_IN_CATEGORIES: scala.Double = js.native
  /**
  		 * Not used.
  		 */
  val FILL_IN_COMPONENT: scala.Double = js.native
  /**
  		 * Not used.
  		 */
  val FILL_IN_DATA: scala.Double = js.native
  /**
  		 * Not used.
  		 */
  val FILL_IN_PACKAGE: scala.Double = js.native
  /**
  		 * If activity is already running, bring it to the foreground.
  		 */
  val FLAG_ACTIVITY_BROUGHT_TO_FRONT: scala.Double = js.native
  /**
  		 * If the activity is present, removes any activities on top of it to make it the foreground activity.
  		 */
  val FLAG_ACTIVITY_CLEAR_TOP: scala.Double = js.native
  /**
  		 * Corresponds to the Android `Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET` constant.
  		 */
  val FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET: scala.Double = js.native
  /**
  		 * Exclude the activity from recently launched activities.
  		 */
  val FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS: scala.Double = js.native
  /**
  		 * Return result to the original calling activity.
  		 */
  val FLAG_ACTIVITY_FORWARD_RESULT: scala.Double = js.native
  /**
  		 * Activity was launched from history.
  		 */
  val FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY: scala.Double = js.native
  /**
  		 * Start the activity as a new task even if it exists.
  		 */
  val FLAG_ACTIVITY_MULTIPLE_TASK: scala.Double = js.native
  /**
  		 * Activity will be the start of a new task (collection of activities).
  		 */
  val FLAG_ACTIVITY_NEW_TASK: scala.Double = js.native
  /**
  		 * Prevent transition animation.
  		 */
  val FLAG_ACTIVITY_NO_ANIMATION: scala.Double = js.native
  /**
  		 * Do not keep the activity in the history stack.
  		 */
  val FLAG_ACTIVITY_NO_HISTORY: scala.Double = js.native
  /**
  		 * Disables the [onUserLeaveHint()](https://developer.android.com/reference/android/app/Activity.html#onUserLeaveHint()) callback.
  		 */
  val FLAG_ACTIVITY_NO_USER_ACTION: scala.Double = js.native
  /**
  		 * Corresponds to the Android `Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP` constant.
  		 */
  val FLAG_ACTIVITY_PREVIOUS_IS_TOP: scala.Double = js.native
  /**
  		 * If the activity already exists, place it at the top of the history stack.
  		 */
  val FLAG_ACTIVITY_REORDER_TO_FRONT: scala.Double = js.native
  /**
  		 * If the task already exists, resets the task to its initial state.
  		 */
  val FLAG_ACTIVITY_RESET_TASK_IF_NEEDED: scala.Double = js.native
  /**
  		 * Do not launch the activity if it is already running.
  		 */
  val FLAG_ACTIVITY_SINGLE_TOP: scala.Double = js.native
  /**
  		 * Cancel the notification when it is clicked by the user.
  		 */
  val FLAG_AUTO_CANCEL: scala.Double = js.native
  /**
  		 * Cancel the current pending intent before creating a new one.
  		 */
  val FLAG_CANCEL_CURRENT: scala.Double = js.native
  /**
  		 * Enable a log message to print out the resolution of the intent.
  		 */
  val FLAG_DEBUG_LOG_RESOLUTION: scala.Double = js.native
  /**
  		 * Indicates the intent is coming from a background operation.
  		 */
  val FLAG_FROM_BACKGROUND: scala.Double = js.native
  /**
  		 * Grant read permission on the URI in the Intent's data or clipboard.
  		 */
  val FLAG_GRANT_READ_URI_PERMISSION: scala.Double = js.native
  /**
  		 * Grants write permission on the URI in the Intent's data or clipboard.
  		 */
  val FLAG_GRANT_WRITE_URI_PERMISSION: scala.Double = js.native
  /**
  		 * Repeat audio until the notification is cancelled or the notification window
  		 * is opened.
  		 */
  val FLAG_INSISTENT: scala.Double = js.native
  /**
  		 * Do not cancel the notification when the user clicks the Clear All button.
  		 */
  val FLAG_NO_CLEAR: scala.Double = js.native
  /**
  		 * If the current intent does not exist, do not create it.
  		 */
  val FLAG_NO_CREATE: scala.Double = js.native
  /**
  		 * The pending intent can only be used once.
  		 */
  val FLAG_ONE_SHOT: scala.Double = js.native
  /**
  		 * Specifies that a notification is in reference to something that is ongoing, like a phone call.
  		 */
  val FLAG_ONGOING_EVENT: scala.Double = js.native
  /**
  		 * Play an alert (sound, lights, and/or vibration) once each time the notification is sent, even if it has not been canceled before that.
  		 */
  val FLAG_ONLY_ALERT_ONCE: scala.Double = js.native
  /**
  		 * When sending a broadcast, only registered receivers will be called.
  		 */
  val FLAG_RECEIVER_REGISTERED_ONLY: scala.Double = js.native
  /**
  		 * Use LED lights to alert the user to the notification.
  		 */
  val FLAG_SHOW_LIGHTS: scala.Double = js.native
  /**
  		 * If the current pending intent already exists, only update the current intent's extra data.
  		 */
  val FLAG_UPDATE_CURRENT: scala.Double = js.native
  /**
  		 * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
  		 */
  val IMPORTANCE_DEFAULT: scala.Double = js.native
  /**
  		 * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
  		 */
  val IMPORTANCE_HIGH: scala.Double = js.native
  /**
  		 * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
  		 */
  val IMPORTANCE_LOW: scala.Double = js.native
  /**
  		 * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
  		 */
  val IMPORTANCE_MAX: scala.Double = js.native
  /**
  		 * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
  		 */
  val IMPORTANCE_MIN: scala.Double = js.native
  /**
  		 * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
  		 */
  val IMPORTANCE_NONE: scala.Double = js.native
  /**
  		 * Used with [NotificationChannel](Titanium.Android.NotificationChannel) to specify an importance level.
  		 */
  val IMPORTANCE_UNSPECIFIED: scala.Double = js.native
  /**
  		 * Standard Action Bar navigation mode
  		 */
  val NAVIGATION_MODE_STANDARD: scala.Double = js.native
  /**
  		 * Action Bar tab navigation mode
  		 */
  val NAVIGATION_MODE_TABS: scala.Double = js.native
  /**
  		 * Not used.
  		 */
  val PENDING_INTENT_FOR_ACTIVITY: scala.Double = js.native
  /**
  		 * Not used.
  		 */
  val PENDING_INTENT_FOR_BROADCAST: scala.Double = js.native
  /**
  		 * Not used.
  		 */
  val PENDING_INTENT_FOR_SERVICE: scala.Double = js.native
  /**
  		 * Not used.
  		 */
  val PENDING_INTENT_MAX_VALUE: scala.Double = js.native
  /**
  		 * Default priority if it does no fit into another priority category.
  		 */
  val PRIORITY_DEFAULT: scala.Double = js.native
  /**
  		 * Use for high priority notifications like real-time chat messages.
  		 */
  val PRIORITY_HIGH: scala.Double = js.native
  /**
  		 * Use for low priority notifications like software updates.
  		 */
  val PRIORITY_LOW: scala.Double = js.native
  /**
  		 * Use for urgent or time-critical notifications, for example, turn-by-turn directions or
  		 * emergency alerts.
  		 */
  val PRIORITY_MAX: scala.Double = js.native
  /**
  		 * Use for expired events.
  		 */
  val PRIORITY_MIN: scala.Double = js.native
  /**
  		 * Used with [setResult](Titanium.Android.Activity.setResult) to specify that
  		 * an activity was canceled.
  		 */
  val RESULT_CANCELED: scala.Double = js.native
  /**
  		 * Used with [setResult](Titanium.Android.Activity.setResult) to specify a
  		 * user-defined result.
  		 */
  val RESULT_FIRST_USER: scala.Double = js.native
  /**
  		 * Used with [setResult](Titanium.Android.Activity.setResult) to specify that
  		 * an activity succeeded.
  		 */
  val RESULT_OK: scala.Double = js.native
  /**
  		 * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
  		 * specify the activity should run in the same orientation as the activity behind it
  		 * in the activity stack.
  		 */
  val SCREEN_ORIENTATION_BEHIND: scala.Double = js.native
  /**
  		 * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
  		 * specify a landscape screen orientation.
  		 */
  val SCREEN_ORIENTATION_LANDSCAPE: scala.Double = js.native
  /**
  		 * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
  		 * specify that the sensor should be ignored and the display should not rotate.
  		 */
  val SCREEN_ORIENTATION_NOSENSOR: scala.Double = js.native
  /**
  		 * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
  		 * specify a portrait screen orientation.
  		 */
  val SCREEN_ORIENTATION_PORTRAIT: scala.Double = js.native
  /**
  		 * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
  		 * specify that orientation should be determined by the orientation sensor.
  		 */
  val SCREEN_ORIENTATION_SENSOR: scala.Double = js.native
  /**
  		 * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
  		 * specify that the system should use its default rules for determining the best
  		 * orientation.
  		 */
  val SCREEN_ORIENTATION_UNSPECIFIED: scala.Double = js.native
  /**
  		 * Use with [requestedOrientation](Titanium.Android.Activity.requestedOrientation) to
  		 * specify that the system should use the user's preferred orientation.
  		 */
  val SCREEN_ORIENTATION_USER: scala.Double = js.native
  /**
  		 * Always show this item as an action button in the action bar.
  		 */
  val SHOW_AS_ACTION_ALWAYS: scala.Double = js.native
  /**
  		 * The action view can collapse to a normal menu item.
  		 */
  val SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW: scala.Double = js.native
  /**
  		 * Show this item as an action button if the system decides there is room for it.
  		 */
  val SHOW_AS_ACTION_IF_ROOM: scala.Double = js.native
  /**
  		 * Never display this item as an action button in the action bar.
  		 */
  val SHOW_AS_ACTION_NEVER: scala.Double = js.native
  /**
  		 * When this item is in the action bar, always show it with a text label.
  		 */
  val SHOW_AS_ACTION_WITH_TEXT: scala.Double = js.native
  /**
  		 * A Service start mode indicating that if the host application is stopped by Android, the service should not be restarted automatically.
  		 */
  val START_NOT_STICKY: scala.Double = js.native
  /**
  		 * A Service start mode indicating that if the host application is stopped by Android, the service should be restarted automatically and the original Intent re-sent.
  		 */
  val START_REDELIVER_INTENT: scala.Double = js.native
  /**
  		 * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to
  		 * request that the alarm stream type for notifications be used.
  		 */
  val STREAM_ALARM: scala.Double = js.native
  /**
  		 * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
  		 * default stream type for notifications be used.
  		 */
  val STREAM_DEFAULT: scala.Double = js.native
  /**
  		 * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to
  		 * request that the music stream type for notifications be used.
  		 */
  val STREAM_MUSIC: scala.Double = js.native
  /**
  		 * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
  		 * notification stream type for notifications be used.
  		 */
  val STREAM_NOTIFICATION: scala.Double = js.native
  /**
  		 * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
  		 * ring stream type for notifications be used.
  		 */
  val STREAM_RING: scala.Double = js.native
  /**
  		 * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
  		 * system stream type for notifications be used.
  		 */
  val STREAM_SYSTEM: scala.Double = js.native
  /**
  		 * Use with [audioStreamType](Titanium.Android.Notification.audioStreamType) to request that the
  		 * voice call stream type for notifications be used.
  		 */
  val STREAM_VOICE_CALL: scala.Double = js.native
  /**
  		 * QuickSettings tile is active.
  		 */
  val TILE_STATE_ACTIVE: scala.Double = js.native
  /**
  		 * QuickSettings tile is inactive.
  		 */
  val TILE_STATE_INACTIVE: scala.Double = js.native
  /**
  		 * QuickSettings tile is unavailble.
  		 */
  val TILE_STATE_UNAVAILABLE: scala.Double = js.native
  /**
  		 * The URI scheme used for intent URIs.
  		 */
  val URI_INTENT_SCHEME: scala.Double = js.native
  /**
  		 * Shows basic information about the notification.
  		 */
  val VISIBILITY_PRIVATE: scala.Double = js.native
  /**
  		 * Shows the notification's full content on the lockscreen. This is the system default if visibility is left unspecified.
  		 */
  val VISIBILITY_PUBLIC: scala.Double = js.native
  /**
  		 * Shows the most minimal information of the notification on the lockscreen.
  		 */
  val VISIBILITY_SECRET: scala.Double = js.native
  /**
  		 * Turn the screen on when the wake lock is acquired.
  		 */
  val WAKE_LOCK_ACQUIRE_CAUSES_WAKEUP: scala.Double = js.native
  /**
  		 * Ensures that the screen and keyboard backlight are on at full brightness.
  		 */
  val WAKE_LOCK_FULL: scala.Double = js.native
  /**
  		 * When this wake lock is released, poke the user activity timer so the screen stays on for a little longer.
  		 */
  val WAKE_LOCK_ON_AFTER_RELEASE: scala.Double = js.native
  /**
  		 * Ensures that the CPU is running; the screen and keyboard backlight will be allowed to go off.
  		 */
  val WAKE_LOCK_PARTIAL: scala.Double = js.native
  /**
  		 * Ensures that the screen is on at full brightness; the keyboard backlight will be allowed to go off.
  		 */
  val WAKE_LOCK_SCREEN_BRIGHT: scala.Double = js.native
  /**
  		 * Ensures that the screen is on (but may be dimmed); the keyboard backlight will be allowed to go off.
  		 */
  val WAKE_LOCK_SCREEN_DIM: scala.Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Activity of the active context.
  		 */
  val currentActivity: Activity = js.native
  /**
  		 * Service in the active context.
  		 */
  val currentService: Service = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.BigPictureStyle>.
  		 */
  def createBigPictureStyle(): BigPictureStyle = js.native
  def createBigPictureStyle(parameters: js.Any): BigPictureStyle = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.BigTextStyle>.
  		 */
  def createBigTextStyle(): BigTextStyle = js.native
  def createBigTextStyle(parameters: js.Any): BigTextStyle = js.native
  /**
  		 * Create an `Intent` to be used in a broadcast.
  		 */
  def createBroadcastIntent(): Intent = js.native
  def createBroadcastIntent(parameters: js.Any): Intent = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.BroadcastReceiver>.
  		 */
  def createBroadcastReceiver(): BroadcastReceiver = js.native
  def createBroadcastReceiver(parameters: js.Any): BroadcastReceiver = js.native
  /**
  		 * Creates a [DrawerLayout](Titanium.UI.Android.DrawerLayout).
  		 */
  def createDrawerLayout(): titaniumLib.TitaniumNs.UINs.AndroidNs.DrawerLayout = js.native
  def createDrawerLayout(parameters: js.Any): titaniumLib.TitaniumNs.UINs.AndroidNs.DrawerLayout = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.Intent>.
  		 */
  def createIntent(): Intent = js.native
  def createIntent(parameters: js.Any): Intent = js.native
  /**
  		 * Creates an activity chooser intent, used to allow the user to select a target activity
  		 * for an intent.
  		 */
  def createIntentChooser(intent: Intent, title: java.lang.String): Intent = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.Notification>.
  		 */
  def createNotification(): Notification = js.native
  def createNotification(parameters: js.Any): Notification = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.NotificationChannel>.
  		 */
  def createNotificationChannel(): NotificationChannel = js.native
  def createNotificationChannel(parameters: js.Any): NotificationChannel = js.native
  /**
  		 * Creates a [PendingIntent](Titanium.Android.PendingIntent) to be used inside a
  		 * [Notification](Titanium.Android.Notification).
  		 */
  def createPendingIntent(): PendingIntent = js.native
  def createPendingIntent(parameters: js.Any): PendingIntent = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.QuickSettingsService>.
  		 */
  def createQuickSettingsService(): QuickSettingsService = js.native
  def createQuickSettingsService(parameters: js.Any): QuickSettingsService = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.RemoteViews>.
  		 */
  def createRemoteViews(): RemoteViews = js.native
  def createRemoteViews(parameters: js.Any): RemoteViews = js.native
  /**
  		 * Create a <Titanium.Android.Service> so you can start/stop it and listen for events from it.
  		 */
  def createService(intent: Intent): Service = js.native
  /**
  		 * Create an `Intent` to be used to start a service.
  		 */
  def createServiceIntent(options: titaniumLib.ServiceIntentOptions): Intent = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Android.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Android.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Android.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Returns `true` if the app has permission access.
  		 */
  def hasPermission(permission: java.lang.String): scala.Boolean = js.native
  /**
  		 * Returns `true` if the app has permission access.
  		 */
  def hasPermission(permission: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
  		 * Check on state of Service.
  		 */
  def isServiceRunning(intent: Intent): scala.Boolean = js.native
  /**
  		 * Registers broadcast receiver for the given actions
  		 */
  def registerBroadcastReceiver(broadcastReceiver: BroadcastReceiver, actions: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Request for permission access.
  		 */
  def requestPermissions(permissions: java.lang.String): scala.Unit = js.native
  def requestPermissions(
    permissions: java.lang.String,
    callback: js.Function1[/* param0 */ titaniumLib.RequestPermissionAccessResult, _]
  ): scala.Unit = js.native
  /**
  		 * Request for permission access.
  		 */
  def requestPermissions(permissions: js.Array[java.lang.String]): scala.Unit = js.native
  def requestPermissions(
    permissions: js.Array[java.lang.String],
    callback: js.Function1[/* param0 */ titaniumLib.RequestPermissionAccessResult, _]
  ): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Android.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Android.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Android.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Starts a simple service.
  		 */
  def startService(intent: Intent): scala.Unit = js.native
  /**
  		 * Stop a simple service that was started with `startService`.
  		 */
  def stopService(intent: Intent): scala.Unit = js.native
  /**
  		 * Unregisters a broadcast receiver
  		 */
  def unregisterBroadcastReceiver(broadcastReceiver: BroadcastReceiver): scala.Unit = js.native
}

