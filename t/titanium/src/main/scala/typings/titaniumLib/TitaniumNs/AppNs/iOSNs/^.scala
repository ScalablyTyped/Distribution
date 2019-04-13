package typings
package titaniumLib.TitaniumNs.AppNs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.App.iOS")
@js.native
object ^ extends js.Object {
  /**
  			 * Use with [setMinimumBackgroundFetchInterval](Titanium.App.iOS.setMinimumBackgroundFetchInterval) method.
  			 * Specifies the smallest fetch interval supported by the system.
  			 */
  val BACKGROUNDFETCHINTERVAL_MIN: scala.Double = js.native
  /**
  			 * Use with [setMinimumBackgroundFetchInterval](Titanium.App.iOS.setMinimumBackgroundFetchInterval) method.
  			 * Used to specify a fetch interval large enough to prevent fetch operations from occurring.
  			 */
  val BACKGROUNDFETCHINTERVAL_NEVER: scala.Double = js.native
  /**
  			 * Convenience constant for system event "accessibilitylayoutchanged".
  			 */
  val EVENT_ACCESSIBILITY_LAYOUT_CHANGED: java.lang.String = js.native
  /**
  			 * Convenience constant for system event "accessibilityscreenchanged".
  			 */
  val EVENT_ACCESSIBILITY_SCREEN_CHANGED: java.lang.String = js.native
  /**
  			 * The action will execute in background. Use with the
  			 * [activationMode](Titanium.App.iOS.UserNotificationAction.activationMode) property.
  			 */
  val USER_NOTIFICATION_ACTIVATION_MODE_BACKGROUND: scala.Double = js.native
  /**
  			 * The action will launch the application and execute in the foreground.
  			 * Use with the [activationMode](Titanium.App.iOS.UserNotificationAction.activationMode) property.
  			 */
  val USER_NOTIFICATION_ACTIVATION_MODE_FOREGROUND: scala.Double = js.native
  /**
  			 * A alert dialog is presented when the notification is received.
  			 */
  val USER_NOTIFICATION_ALERT_STYLE_ALERT: scala.Double = js.native
  /**
  			 * A banner is presented when the notification is received.
  			 */
  val USER_NOTIFICATION_ALERT_STYLE_BANNER: scala.Double = js.native
  /**
  			 * No banner or alert dialog is presented when the notification is received.
  			 */
  val USER_NOTIFICATION_ALERT_STYLE_NONE: scala.Double = js.native
  /**
  			 * The application is authorized to post user notifications.
  			 */
  val USER_NOTIFICATION_AUTHORIZATION_STATUS_AUTHORIZED: scala.Double = js.native
  /**
  			 * The application is not authorized to post user notifications.
  			 */
  val USER_NOTIFICATION_AUTHORIZATION_STATUS_DENIED: scala.Double = js.native
  /**
  			 * The user has not yet made a choice regarding whether the application may post
  			 * user notifications.
  			 */
  val USER_NOTIFICATION_AUTHORIZATION_STATUS_NOT_DETERMINED: scala.Double = js.native
  /**
  			 * The application is provisionally authorized to post non-interruptive user notifications.
  			 */
  val USER_NOTIFICATION_AUTHORIZATION_STATUS_PROVISIONAL: scala.Double = js.native
  /**
  			 * Default action behavior with no additional action support.
  			 */
  val USER_NOTIFICATION_BEHAVIOR_DEFAULT: scala.Double = js.native
  /**
  			 * Provides a textfield with the notification for the user to enter a text response.
  			 */
  val USER_NOTIFICATION_BEHAVIOR_TEXTINPUT: scala.Double = js.native
  /**
  			 * Allow CarPlay to display notifications of this type.
  			 */
  val USER_NOTIFICATION_CATEGORY_OPTION_ALLOW_IN_CARPLAY: scala.Double = js.native
  /**
  			 * Send dismiss actions to the UNUserNotificationCenter object's delegate for handling.
  			 */
  val USER_NOTIFICATION_CATEGORY_OPTION_CUSTOM_DISMISS_ACTION: scala.Double = js.native
  /**
  			 * Show the notification's subtitle, even if the user has disabled notification previews for the app.
  			 */
  val USER_NOTIFICATION_CATEGORY_OPTION_HIDDEN_PREVIEWS_SHOW_SUBTITLE: scala.Double = js.native
  /**
  			 * Show the notification's title, even if the user has disabled notification previews for the app.
  			 */
  val USER_NOTIFICATION_CATEGORY_OPTION_HIDDEN_PREVIEWS_SHOW_TITLE: scala.Double = js.native
  /**
  			 * No options.
  			 */
  val USER_NOTIFICATION_CATEGORY_OPTION_NONE: scala.Double = js.native
  /**
  			 * The notification setting is turned off.
  			 */
  val USER_NOTIFICATION_SETTING_DISABLED: scala.Double = js.native
  /**
  			 * The notification setting is turned on.
  			 */
  val USER_NOTIFICATION_SETTING_ENABLED: scala.Double = js.native
  /**
  			 * The application does not support this notification type.
  			 */
  val USER_NOTIFICATION_SETTING_NOT_SUPPORTED: scala.Double = js.native
  /**
  			 * The application may display an alert upon a notification being received.
  			 * Use with the [types](UserNotificationSettings.types) property.
  			 */
  val USER_NOTIFICATION_TYPE_ALERT: scala.Double = js.native
  /**
  			 * The application may badge its icon upon a notification being received.
  			 * Use with the [types](UserNotificationSettings.types) property.
  			 */
  val USER_NOTIFICATION_TYPE_BADGE: scala.Double = js.native
  /**
  			 * The ability to play sounds for critical alerts.
  			 * Use with the [types](UserNotificationSettings.types) property.
  			 */
  val USER_NOTIFICATION_TYPE_CRITICAL_ALERT: scala.Double = js.native
  /**
  			 * The application may not present any UI upon a notification being received.
  			 * Use with the [types](UserNotificationSettings.types) property.
  			 */
  val USER_NOTIFICATION_TYPE_NONE: scala.Double = js.native
  /**
  			 * An option indicating the system should display a button for in-app notification settings.
  			 * Use with the [types](UserNotificationSettings.types) property.
  			 */
  val USER_NOTIFICATION_TYPE_PROVIDES_APP_NOTIFICATION_SETTINGS: scala.Double = js.native
  /**
  			 * The ability to post non-interrupting notifications provisionally to the Notification Center.
  			 * Use with the [types](UserNotificationSettings.types) property.
  			 */
  val USER_NOTIFICATION_TYPE_PROVISIONAL: scala.Double = js.native
  /**
  			 * The application may play a sound upon a notification being received.
  			 * Use with the [types](UserNotificationSettings.types) property.
  			 */
  val USER_NOTIFICATION_TYPE_SOUND: scala.Double = js.native
  /**
  			 * Uniform type identifier for Mac OS icon images.
  			 */
  val UTTYPE_APPLE_ICNS: java.lang.String = js.native
  /**
  			 * Uniform type identifier for protected MPEG-4 audio (iTunes music store format).
  			 */
  val UTTYPE_APPLE_PROTECTED_MPEG4_AUDIO: java.lang.String = js.native
  /**
  			 * Uniform type identifier for all audio content.
  			 */
  val UTTYPE_AUDIO: java.lang.String = js.native
  /**
  			 * Uniform type identifier for Windows bitmap images.
  			 */
  val UTTYPE_BMP: java.lang.String = js.native
  /**
  			 * Uniform type identifier for Rich Text with content embedding, pasteboard format.
  			 */
  val UTTYPE_FLAT_RTFD: java.lang.String = js.native
  /**
  			 * Uniform type identifier for GIF images.
  			 */
  val UTTYPE_GIF: java.lang.String = js.native
  /**
  			 * Uniform type identifier for HTML.
  			 */
  val UTTYPE_HTML: java.lang.String = js.native
  /**
  			 * Uniform type identifier for Windows icon images.
  			 */
  val UTTYPE_ICO: java.lang.String = js.native
  /**
  			 * Uniform type identifier for all image types.
  			 */
  val UTTYPE_IMAGE: java.lang.String = js.native
  /**
  			 * Uniform type identifier for JPEG images.
  			 */
  val UTTYPE_JPEG: java.lang.String = js.native
  /**
  			 * Uniform type identifier for JPEG 2000 images.
  			 */
  val UTTYPE_JPEG2000: java.lang.String = js.native
  /**
  			 * Uniform type identifier for all audiovisual content.
  			 */
  val UTTYPE_MOVIE: java.lang.String = js.native
  /**
  			 * Uniform type identifier for MP3 audio.
  			 */
  val UTTYPE_MP3: java.lang.String = js.native
  /**
  			 * Uniform type identifier for MPEG-1 and MPEG-2 content.
  			 */
  val UTTYPE_MPEG: java.lang.String = js.native
  /**
  			 * Uniform type identifier for MPEG-4 content.
  			 */
  val UTTYPE_MPEG4: java.lang.String = js.native
  /**
  			 * Uniform type identifier for MPEG-4 audio.
  			 */
  val UTTYPE_MPEG4_AUDIO: java.lang.String = js.native
  /**
  			 * Uniform type identifier for PDF data.
  			 */
  val UTTYPE_PDF: java.lang.String = js.native
  /**
  			 * Uniform type identifier for PICT images.
  			 */
  val UTTYPE_PICT: java.lang.String = js.native
  /**
  			 * Uniform type identifier for a plain text type, equivalent to MIME type text/plain.
  			 */
  val UTTYPE_PLAIN_TEXT: java.lang.String = js.native
  /**
  			 * Uniform type identifier for PNG images.
  			 */
  val UTTYPE_PNG: java.lang.String = js.native
  /**
  			 * Uniform type identifier for QuickTime images.
  			 */
  val UTTYPE_QUICKTIME_IMAGE: java.lang.String = js.native
  /**
  			 * Uniform type identifier for QuickTime movies.
  			 */
  val UTTYPE_QUICKTIME_MOVIE: java.lang.String = js.native
  /**
  			 * Uniform type identifier for Rich Text.
  			 */
  val UTTYPE_RTF: java.lang.String = js.native
  /**
  			 * Uniform type identifier for Rich Text Format Directory, that is, Rich Text with content embedding, on-disk format.
  			 */
  val UTTYPE_RTFD: java.lang.String = js.native
  /**
  			 * Uniform type identifier for all text types.
  			 */
  val UTTYPE_TEXT: java.lang.String = js.native
  /**
  			 * Uniform type identifier for TIFF images.
  			 */
  val UTTYPE_TIFF: java.lang.String = js.native
  /**
  			 * Uniform type identifier for MLTE (Textension) format for mixed text and multimedia data.
  			 */
  val UTTYPE_TXN_TEXT_AND_MULTIMEDIA_DATA: java.lang.String = js.native
  /**
  			 * Uniform type identifier for Unicode-16 with byte-order mark (BOM), or if BOM is not present,
  			 * an external representation byte order (big-endian).
  			 */
  val UTTYPE_UTF16_EXTERNAL_PLAIN_TEXT: java.lang.String = js.native
  /**
  			 * Uniform type identifier for Unicode-16, native byte order, with an optional byte-order mark (BOM).
  			 */
  val UTTYPE_UTF16_PLAIN_TEXT: java.lang.String = js.native
  /**
  			 * Uniform type identifier for Unicode-8 plain text type.
  			 */
  val UTTYPE_UTF8_PLAIN_TEXT: java.lang.String = js.native
  /**
  			 * Uniform type identifier for all video content without audio.
  			 */
  val UTTYPE_VIDEO: java.lang.String = js.native
  /**
  			 * Uniform type identifier for WebKit webarchive format.
  			 */
  val UTTYPE_WEB_ARCHIVE: java.lang.String = js.native
  /**
  			 * Uniform type identifier for XML.
  			 */
  val UTTYPE_XML: java.lang.String = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String = js.native
  /**
  			 * Returns a URL to open the app's settings.
  			 */
  val applicationOpenSettingsURL: java.lang.String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean = js.native
  /**
  			 * Notification types and user notification categories the application is registered to use.
  			 */
  val currentUserNotificationSettings: titaniumLib.UserNotificationSettings = js.native
  /**
  			 * Provides an Array of the NSUserActivityTypes keys defined within your Titanium project.
  			 */
  val supportedUserActivityTypes: js.Array[java.lang.String] = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  			 * Cancels all scheduled local notifications.
  			 */
  def cancelAllLocalNotifications(): scala.Unit = js.native
  /**
  			 * Cancels a local notification.
  			 */
  def cancelLocalNotification(id: java.lang.String): scala.Unit = js.native
  /**
  			 * Cancels a local notification.
  			 */
  def cancelLocalNotification(id: scala.Double): scala.Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.SearchQuery>.
  			 */
  def createSearchQuery(): SearchQuery = js.native
  def createSearchQuery(parameters: js.Any): SearchQuery = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.SearchableIndex>.
  			 */
  def createSearchableIndex(): SearchableIndex = js.native
  def createSearchableIndex(parameters: js.Any): SearchableIndex = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.SearchableItem>.
  			 */
  def createSearchableItem(): SearchableItem = js.native
  def createSearchableItem(parameters: js.Any): SearchableItem = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.SearchableItemAttributeSet>.
  			 */
  def createSearchableItemAttributeSet(): SearchableItemAttributeSet = js.native
  def createSearchableItemAttributeSet(parameters: js.Any): SearchableItemAttributeSet = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.UserActivity>.
  			 */
  def createUserActivity(): UserActivity = js.native
  def createUserActivity(parameters: js.Any): UserActivity = js.native
  /**
  			 * Creates and returns an instance of Titanium.App.iOS.UserDefaults.
  			 */
  def createUserDefaults(parameters: js.Any): UserDefaults = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.UserNotificationAction>.
  			 */
  def createUserNotificationAction(): UserNotificationAction = js.native
  def createUserNotificationAction(parameters: js.Any): UserNotificationAction = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.UserNotificationCategory>.
  			 */
  def createUserNotificationCategory(): UserNotificationCategory = js.native
  def createUserNotificationCategory(parameters: js.Any): UserNotificationCategory = js.native
  /**
  			 * Marks the end of the app execution after initiating the download operation. Available only on iOS 7 and later.
  			 */
  def endBackgroundHandler(handlerID: java.lang.String): scala.Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.applicationOpenSettingsURL> property.
  			 */
  def getApplicationOpenSettingsURL(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.currentUserNotificationSettings> property.
  			 */
  def getCurrentUserNotificationSettings(): titaniumLib.UserNotificationSettings = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.supportedUserActivityTypes> property.
  			 */
  def getSupportedUserActivityTypes(): js.Array[java.lang.String] = js.native
  /**
  			 * Registers a service to run when the application is placed in the background.
  			 */
  def registerBackgroundService(params: js.Any): BackgroundService = js.native
  /**
  			 * Registers the application to use the requested notification types and categories.
  			 */
  def registerUserNotificationSettings(params: titaniumLib.UserNotificationSettings): scala.Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Schedule a local notification.
  			 */
  def scheduleLocalNotification(params: titaniumLib.NotificationParams): LocalNotification = js.native
  /**
  			 * Marks the end of an `openParentApplication:reply` execution by a WatchKit extension.
  			 */
  def sendWatchExtensionReply(handlerId: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.iOS.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Specifies the minimum amount of time that must elapse between background fetch operations.
  			 * Available only on iOS 7 and later.
  			 */
  def setMinimumBackgroundFetchInterval(fetchInterval: scala.Double): scala.Unit = js.native
}

