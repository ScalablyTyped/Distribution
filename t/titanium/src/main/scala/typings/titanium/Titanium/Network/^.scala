package typings.titanium.Titanium.Network

import typings.titanium.Dictionary
import typings.titanium.PushNotificationConfig
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.NetworkChangeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Network")
@js.native
object ^ extends js.Object {
  /**
  		 * A list of all cookies in the cookie storage.
  		 */
  val allHTTPCookies: js.Array[Cookie] = js.native
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
  		 * Network type value as a constant.
  		 */
  val networkType: Double = js.native
  /**
  		 * Network type as a String. Returns one of `NONE`, `WIFI`, `LAN`, `MOBILE`, or `UNKNOWN`.
  		 */
  val networkTypeName: String = js.native
  /**
  		 * Boolean value indicating if the device is connected to the network.
  		 */
  val online: Boolean = js.native
  /**
  		 * Remote device UUID if the device is registered with the Apple Push Notification
  		 * Service, or null if it is not registered.
  		 */
  val remoteDeviceUUID: String = js.native
  /**
  		 * Array of push notification type constants enabled for the application.
  		 */
  val remoteNotificationTypes: js.Array[Double] = js.native
  /**
  		 * Indicates whether push  notifications have been enabled using
  		 * [registerForPushNotifications](Titanium.Network.registerForPushNotifications).
  		 */
  val remoteNotificationsEnabled: Boolean = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ NetworkChangeEvent, Unit]
  ): Unit = js.native
  /**
  		 * Adds a cookie to the HTTP client cookie store.
  		 */
  def addHTTPCookie(cookie: Cookie): Unit = js.native
  /**
  		 * Adds a cookie to the system cookie store.
  		 */
  def addSystemCookie(cookie: Cookie): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Creates and returns a `BonjourBrowser` object.
  		 */
  def createBonjourBrowser(serviceType: String, domain: String): BonjourBrowser = js.native
  def createBonjourBrowser(serviceType: String, domain: String, parameters: Dictionary[BonjourBrowser]): BonjourBrowser = js.native
  /**
  		 * Creates and returns a `BonjourService` object.
  		 */
  def createBonjourService(name: String, `type`: String, domain: String): BonjourService = js.native
  def createBonjourService(name: String, `type`: String, domain: String, parameters: Dictionary[BonjourService]): BonjourService = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Network.Cookie>.
  		 */
  def createCookie(): Cookie = js.native
  def createCookie(parameters: Dictionary[Cookie]): Cookie = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Network.HTTPClient>.
  		 */
  def createHTTPClient(): HTTPClient = js.native
  def createHTTPClient(parameters: Dictionary[HTTPClient]): HTTPClient = js.native
  /**
  		 * Returns a decoded version of a URI encoded value.
  		 */
  def decodeURIComponent(value: String): String = js.native
  /**
  		 * Returns a URI encoded version of the specified URI component.
  		 */
  def encodeURIComponent(value: String): String = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: NetworkChangeEvent): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Network.allHTTPCookies> property.
  		 * @deprecated Access <Titanium.Network.allHTTPCookies> instead.
  		 */
  def getAllHTTPCookies(): js.Array[Cookie] = js.native
  /**
  		 * Gets the value of the <Titanium.Network.apiName> property.
  		 * @deprecated Access <Titanium.Network.apiName> instead.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Network.bubbleParent> property.
  		 * @deprecated Access <Titanium.Network.bubbleParent> instead.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets all the cookies with the domain, path and name matched with the given values from the HTTP client cookie store.
  		 */
  def getHTTPCookies(domain: String, path: String, name: String): js.Array[Cookie] = js.native
  /**
  		 * Gets all the cookies with the domain matched with the given values from the HTTP client cookie store.
  		 */
  def getHTTPCookiesForDomain(domain: String): js.Array[Cookie] = js.native
  /**
  		 * Gets the value of the <Titanium.Network.lifecycleContainer> property.
  		 * @deprecated Access <Titanium.Network.lifecycleContainer> instead.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Network.networkType> property.
  		 * @deprecated Access <Titanium.Network.networkType> instead.
  		 */
  def getNetworkType(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Network.networkTypeName> property.
  		 * @deprecated Access <Titanium.Network.networkTypeName> instead.
  		 */
  def getNetworkTypeName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Network.online> property.
  		 * @deprecated Access <Titanium.Network.online> instead.
  		 */
  def getOnline(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Network.remoteDeviceUUID> property.
  		 * @deprecated Access <Titanium.Network.remoteDeviceUUID> instead.
  		 */
  def getRemoteDeviceUUID(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Network.remoteNotificationTypes> property.
  		 * @deprecated Access <Titanium.Network.remoteNotificationTypes> instead.
  		 */
  def getRemoteNotificationTypes(): js.Array[Double] = js.native
  /**
  		 * Gets the value of the <Titanium.Network.remoteNotificationsEnabled> property.
  		 * @deprecated Access <Titanium.Network.remoteNotificationsEnabled> instead.
  		 */
  def getRemoteNotificationsEnabled(): Boolean = js.native
  /**
  		 * Gets all the cookies with the domain, path and name matched with the given values from the system cookie store.
  		 */
  def getSystemCookies(domain: String, path: String, name: String): js.Array[Cookie] = js.native
  /**
  		 * Registers for push notifications with the Apple Push Notification Service.
  		 */
  def registerForPushNotifications(config: PushNotificationConfig): Unit = js.native
  /**
  		 * Removes all the cookies from the HTTP client cookie store.
  		 */
  def removeAllHTTPCookies(): Unit = js.native
  /**
  		 * Removes all the cookie from the system client cookie store.
  		 */
  def removeAllSystemCookies(): Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ NetworkChangeEvent, Unit]
  ): Unit = js.native
  /**
  		 * Removes the cookie with the domain, path and name exactly the same as the given values from the HTTP client cookie store.
  		 */
  def removeHTTPCookie(domain: String, path: String, name: String): Unit = js.native
  /**
  		 * Removes the cookies with the domain matched with the given values from the HTTP client cookie store.
  		 */
  def removeHTTPCookiesForDomain(domain: String): Unit = js.native
  /**
  		 * Removes the cookie with the domain, path and name exactly the same as the given values from the system cookie store.
  		 */
  def removeSystemCookie(domain: String, path: String, name: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Network.bubbleParent> property.
  		 * @deprecated Set the value using <Titanium.Network.bubbleParent> instead.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Network.lifecycleContainer> property.
  		 * @deprecated Set the value using <Titanium.Network.lifecycleContainer> instead.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Unregisters the application for push notifications.
  		 */
  def unregisterForPushNotifications(): Unit = js.native
}

