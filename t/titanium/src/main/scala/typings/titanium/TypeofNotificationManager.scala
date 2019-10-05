package typings.titanium

import typings.titanium.Titanium.Android.Notification
import typings.titanium.Titanium.Android.NotificationChannel
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofNotificationManager extends js.Object {
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
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
  def createNotificationChannel(parameters: js.Any): NotificationChannel = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationManager.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationManager.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationManager.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Adds a persistent notification to the status bar.
  			 */
  def notify(id: Double, notification: Notification): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationManager.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationManager.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationManager.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

