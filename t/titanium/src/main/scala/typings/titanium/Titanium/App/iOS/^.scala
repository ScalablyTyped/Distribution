package typings.titanium.Titanium.App.iOS

import typings.titanium.Dictionary
import typings.titanium.NotificationParams
import typings.titanium.Titanium.App.iOSBackgroundfetchEvent
import typings.titanium.Titanium.App.iOSBackgroundtransferEvent
import typings.titanium.Titanium.App.iOSContinueactivityEvent
import typings.titanium.Titanium.App.iOSDownloadcompletedEvent
import typings.titanium.Titanium.App.iOSDownloadprogressEvent
import typings.titanium.Titanium.App.iOSHandleurlEvent
import typings.titanium.Titanium.App.iOSLocalnotificationactionEvent
import typings.titanium.Titanium.App.iOSNotificationEvent
import typings.titanium.Titanium.App.iOSRemotenotificationactionEvent
import typings.titanium.Titanium.App.iOSSessioncompletedEvent
import typings.titanium.Titanium.App.iOSSessioneventscompletedEvent
import typings.titanium.Titanium.App.iOSShortcutitemclickEvent
import typings.titanium.Titanium.App.iOSSilentpushEvent
import typings.titanium.Titanium.App.iOSTraitcollectionchangeEvent
import typings.titanium.Titanium.App.iOSUploadprogressEvent
import typings.titanium.Titanium.App.iOSUsernotificationsettingsEvent
import typings.titanium.Titanium.App.iOSWatchkitextensionrequestEvent
import typings.titanium.Titanium.Event
import typings.titanium.UserNotificationSettings
import typings.titanium.titaniumStrings.backgroundfetch
import typings.titanium.titaniumStrings.backgroundtransfer
import typings.titanium.titaniumStrings.continueactivity
import typings.titanium.titaniumStrings.downloadcompleted
import typings.titanium.titaniumStrings.downloadprogress
import typings.titanium.titaniumStrings.handleurl
import typings.titanium.titaniumStrings.localnotificationaction
import typings.titanium.titaniumStrings.notification
import typings.titanium.titaniumStrings.remotenotificationaction
import typings.titanium.titaniumStrings.sessioncompleted
import typings.titanium.titaniumStrings.sessioneventscompleted
import typings.titanium.titaniumStrings.shortcutitemclick
import typings.titanium.titaniumStrings.silentpush
import typings.titanium.titaniumStrings.traitcollectionchange
import typings.titanium.titaniumStrings.uploadprogress
import typings.titanium.titaniumStrings.usernotificationsettings
import typings.titanium.titaniumStrings.watchkitextensionrequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.App.iOS")
@js.native
object ^ extends js.Object {
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Returns a URL to open the app's settings.
  			 */
  val applicationOpenSettingsURL: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * Notification types and user notification categories the application is registered to use.
  			 * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings](Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings) instead.
  			 */
  val currentUserNotificationSettings: UserNotificationSettings = js.native
  /**
  			 * Provides an Array of the NSUserActivityTypes keys defined within your Titanium project.
  			 */
  val supportedUserActivityTypes: js.Array[String] = js.native
  /**
  			 * The style associated with the user interface.
  			 */
  val userInterfaceStyle: js.Array[String] = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_backgroundfetch(
    name: backgroundfetch,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSBackgroundfetchEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_backgroundtransfer(
    name: backgroundtransfer,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSBackgroundtransferEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_continueactivity(
    name: continueactivity,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSContinueactivityEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadcompleted(
    name: downloadcompleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSDownloadcompletedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadprogress(
    name: downloadprogress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSDownloadprogressEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_handleurl(
    name: handleurl,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSHandleurlEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localnotificationaction(
    name: localnotificationaction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSLocalnotificationactionEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notification(
    name: notification,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSNotificationEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remotenotificationaction(
    name: remotenotificationaction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSRemotenotificationactionEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessioncompleted(
    name: sessioncompleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSessioncompletedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessioneventscompleted(
    name: sessioneventscompleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSessioneventscompletedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSShortcutitemclickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_silentpush(
    name: silentpush,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSilentpushEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_traitcollectionchange(
    name: traitcollectionchange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSTraitcollectionchangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_uploadprogress(
    name: uploadprogress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSUploadprogressEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_usernotificationsettings(
    name: usernotificationsettings,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSUsernotificationsettingsEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_watchkitextensionrequest(
    name: watchkitextensionrequest,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSWatchkitextensionrequestEvent, Unit]
  ): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Cancels all scheduled local notifications.
  			 * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.removePendingNotifications](Titanium.App.iOS.UserNotificationCenter.removePendingNotifications) instead.
  			 */
  def cancelAllLocalNotifications(): Unit = js.native
  def cancelLocalNotification(id: String): Unit = js.native
  /**
  			 * Cancels a local notification.
  			 * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.removePendingNotifications](Titanium.App.iOS.UserNotificationCenter.removePendingNotifications) instead.
  			 */
  def cancelLocalNotification(id: Double): Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.SearchQuery>.
  			 */
  def createSearchQuery(): SearchQuery = js.native
  def createSearchQuery(parameters: Dictionary[SearchQuery]): SearchQuery = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.SearchableIndex>.
  			 */
  def createSearchableIndex(): SearchableIndex = js.native
  def createSearchableIndex(parameters: Dictionary[SearchableIndex]): SearchableIndex = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.SearchableItem>.
  			 */
  def createSearchableItem(): SearchableItem = js.native
  def createSearchableItem(parameters: Dictionary[SearchableItem]): SearchableItem = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.SearchableItemAttributeSet>.
  			 */
  def createSearchableItemAttributeSet(): SearchableItemAttributeSet = js.native
  def createSearchableItemAttributeSet(parameters: Dictionary[SearchableItemAttributeSet]): SearchableItemAttributeSet = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.UserActivity>.
  			 */
  def createUserActivity(): UserActivity = js.native
  def createUserActivity(parameters: Dictionary[UserActivity]): UserActivity = js.native
  /**
  			 * Creates and returns an instance of Titanium.App.iOS.UserDefaults.
  			 */
  def createUserDefaults(parameters: Dictionary[UserDefaults]): UserDefaults = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.UserNotificationAction>.
  			 */
  def createUserNotificationAction(): UserNotificationAction = js.native
  def createUserNotificationAction(parameters: Dictionary[UserNotificationAction]): UserNotificationAction = js.native
  /**
  			 * Creates and returns an instance of <Titanium.App.iOS.UserNotificationCategory>.
  			 */
  def createUserNotificationCategory(): UserNotificationCategory = js.native
  def createUserNotificationCategory(parameters: Dictionary[UserNotificationCategory]): UserNotificationCategory = js.native
  /**
  			 * Marks the end of the app execution after initiating the download operation. Available only on iOS 7 and later.
  			 */
  def endBackgroundHandler(handlerID: String): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_backgroundfetch(name: backgroundfetch): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_backgroundfetch(name: backgroundfetch, event: iOSBackgroundfetchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_backgroundtransfer(name: backgroundtransfer): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_backgroundtransfer(name: backgroundtransfer, event: iOSBackgroundtransferEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_continueactivity(name: continueactivity): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_continueactivity(name: continueactivity, event: iOSContinueactivityEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_downloadcompleted(name: downloadcompleted): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_downloadcompleted(name: downloadcompleted, event: iOSDownloadcompletedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_downloadprogress(name: downloadprogress): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_downloadprogress(name: downloadprogress, event: iOSDownloadprogressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_handleurl(name: handleurl): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_handleurl(name: handleurl, event: iOSHandleurlEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_localnotificationaction(name: localnotificationaction): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_localnotificationaction(name: localnotificationaction, event: iOSLocalnotificationactionEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_notification(name: notification): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_notification(name: notification, event: iOSNotificationEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_remotenotificationaction(name: remotenotificationaction): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_remotenotificationaction(name: remotenotificationaction, event: iOSRemotenotificationactionEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_sessioncompleted(name: sessioncompleted): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_sessioncompleted(name: sessioncompleted, event: iOSSessioncompletedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_sessioneventscompleted(name: sessioneventscompleted): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_sessioneventscompleted(name: sessioneventscompleted, event: iOSSessioneventscompletedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_shortcutitemclick(name: shortcutitemclick): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_shortcutitemclick(name: shortcutitemclick, event: iOSShortcutitemclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_silentpush(name: silentpush): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_silentpush(name: silentpush, event: iOSSilentpushEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_traitcollectionchange(name: traitcollectionchange): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_traitcollectionchange(name: traitcollectionchange, event: iOSTraitcollectionchangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_uploadprogress(name: uploadprogress): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_uploadprogress(name: uploadprogress, event: iOSUploadprogressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_usernotificationsettings(name: usernotificationsettings): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_usernotificationsettings(name: usernotificationsettings, event: iOSUsernotificationsettingsEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_watchkitextensionrequest(name: watchkitextensionrequest): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_watchkitextensionrequest(name: watchkitextensionrequest, event: iOSWatchkitextensionrequestEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.apiName> property.
  			 * @deprecated Access <Titanium.App.iOS.apiName> instead.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.applicationOpenSettingsURL> property.
  			 * @deprecated Access <Titanium.App.iOS.applicationOpenSettingsURL> instead.
  			 */
  def getApplicationOpenSettingsURL(): String = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.bubbleParent> property.
  			 * @deprecated Access <Titanium.App.iOS.bubbleParent> instead.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.currentUserNotificationSettings> property.
  			 * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings](Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings) instead.
  			 */
  def getCurrentUserNotificationSettings(): UserNotificationSettings = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.supportedUserActivityTypes> property.
  			 * @deprecated Access <Titanium.App.iOS.supportedUserActivityTypes> instead.
  			 */
  def getSupportedUserActivityTypes(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.App.iOS.userInterfaceStyle> property.
  			 * @deprecated Access <Titanium.App.iOS.userInterfaceStyle> instead.
  			 */
  def getUserInterfaceStyle(): js.Array[String] = js.native
  /**
  			 * Registers a service to run when the application is placed in the background.
  			 */
  def registerBackgroundService(params: js.Any): BackgroundService = js.native
  /**
  			 * Registers the application to use the requested notification types and categories.
  			 */
  def registerUserNotificationSettings(params: UserNotificationSettings): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_backgroundfetch(
    name: backgroundfetch,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSBackgroundfetchEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_backgroundtransfer(
    name: backgroundtransfer,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSBackgroundtransferEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_continueactivity(
    name: continueactivity,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSContinueactivityEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadcompleted(
    name: downloadcompleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSDownloadcompletedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadprogress(
    name: downloadprogress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSDownloadprogressEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_handleurl(
    name: handleurl,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSHandleurlEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localnotificationaction(
    name: localnotificationaction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSLocalnotificationactionEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_notification(
    name: notification,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSNotificationEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remotenotificationaction(
    name: remotenotificationaction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSRemotenotificationactionEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessioncompleted(
    name: sessioncompleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSessioncompletedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessioneventscompleted(
    name: sessioneventscompleted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSessioneventscompletedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSShortcutitemclickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_silentpush(
    name: silentpush,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSSilentpushEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_traitcollectionchange(
    name: traitcollectionchange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSTraitcollectionchangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_uploadprogress(
    name: uploadprogress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSUploadprogressEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_usernotificationsettings(
    name: usernotificationsettings,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSUsernotificationsettingsEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_watchkitextensionrequest(
    name: watchkitextensionrequest,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ iOSWatchkitextensionrequestEvent, Unit]
  ): Unit = js.native
  /**
  			 * Schedule a local notification.
  			 */
  def scheduleLocalNotification(params: NotificationParams): LocalNotification = js.native
  /**
  			 * Marks the end of an `openParentApplication:reply` execution by a WatchKit extension.
  			 * @deprecated Use [Titanium.WatchSession](Titanium.WatchSession) instead, which is supported on iOS 9 and later.
  			 *
  			 */
  def sendWatchExtensionReply(handlerId: String, userInfo: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.iOS.bubbleParent> property.
  			 * @deprecated Set the value using <Titanium.App.iOS.bubbleParent> instead.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Specifies the minimum amount of time that must elapse between background fetch operations.
  			 * Available only on iOS 7 and later.
  			 */
  def setMinimumBackgroundFetchInterval(fetchInterval: Double): Unit = js.native
}

