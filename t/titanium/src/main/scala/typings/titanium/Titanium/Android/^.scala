package typings.titanium.Titanium.Android

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

@JSGlobal("Titanium.Android")
@js.native
object ^ extends js.Object {
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
  val currentActivity: Activity = js.native
  /**
  		 * Service in the active context.
  		 */
  val currentService: Service = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * The first activity launched by the application.
  		 */
  val rootActivity: Activity = js.native
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
  def createBigPictureStyle(): BigPictureStyle = js.native
  def createBigPictureStyle(parameters: Dictionary[BigPictureStyle]): BigPictureStyle = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.BigTextStyle>.
  		 */
  def createBigTextStyle(): BigTextStyle = js.native
  def createBigTextStyle(parameters: Dictionary[BigTextStyle]): BigTextStyle = js.native
  /**
  		 * Create an `Intent` to be used in a broadcast.
  		 */
  def createBroadcastIntent(): Intent = js.native
  def createBroadcastIntent(parameters: Dictionary[Intent]): Intent = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.BroadcastReceiver>.
  		 */
  def createBroadcastReceiver(): BroadcastReceiver = js.native
  def createBroadcastReceiver(parameters: Dictionary[BroadcastReceiver]): BroadcastReceiver = js.native
  /**
  		 * Creates a [DrawerLayout](Titanium.UI.Android.DrawerLayout).
  		 */
  def createDrawerLayout(): DrawerLayout = js.native
  def createDrawerLayout(parameters: Dictionary[DrawerLayout]): DrawerLayout = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.Intent>.
  		 */
  def createIntent(): Intent = js.native
  def createIntent(parameters: Dictionary[Intent]): Intent = js.native
  /**
  		 * Creates an activity chooser intent, used to allow the user to select a target activity
  		 * for an intent.
  		 */
  def createIntentChooser(intent: Intent, title: String): Intent = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.Notification>.
  		 */
  def createNotification(): Notification = js.native
  def createNotification(parameters: Dictionary[Notification]): Notification = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.NotificationChannel>.
  		 */
  def createNotificationChannel(): NotificationChannel = js.native
  def createNotificationChannel(parameters: Dictionary[NotificationChannel]): NotificationChannel = js.native
  /**
  		 * Creates a [PendingIntent](Titanium.Android.PendingIntent) to be used inside a
  		 * [Notification](Titanium.Android.Notification).
  		 */
  def createPendingIntent(): PendingIntent = js.native
  def createPendingIntent(parameters: Dictionary[PendingIntent]): PendingIntent = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.QuickSettingsService>.
  		 */
  def createQuickSettingsService(): QuickSettingsService = js.native
  def createQuickSettingsService(parameters: Dictionary[QuickSettingsService]): QuickSettingsService = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Android.RemoteViews>.
  		 */
  def createRemoteViews(): RemoteViews = js.native
  def createRemoteViews(parameters: Dictionary[RemoteViews]): RemoteViews = js.native
  /**
  		 * Create a <Titanium.Android.Service> so you can start/stop it and listen for events from it.
  		 */
  def createService(intent: Intent): Service = js.native
  /**
  		 * Create an `Intent` to be used to start a service.
  		 */
  def createServiceIntent(options: ServiceIntentOptions): Intent = js.native
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
  def isServiceRunning(intent: Intent): Boolean = js.native
  /**
  		 * Registers broadcast receiver for the given actions.
  		 */
  def registerBroadcastReceiver(broadcastReceiver: BroadcastReceiver, actions: js.Array[String]): Unit = js.native
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
  def startService(intent: Intent): Unit = js.native
  /**
  		 * Stop a simple service that was started with `startService`.
  		 */
  def stopService(intent: Intent): Unit = js.native
  /**
  		 * Unregisters a broadcast receiver.
  		 */
  def unregisterBroadcastReceiver(broadcastReceiver: BroadcastReceiver): Unit = js.native
}

