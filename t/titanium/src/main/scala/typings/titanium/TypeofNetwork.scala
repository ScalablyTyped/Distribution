package typings.titanium

import typings.titanium.TitaniumNs.NetworkNs.BonjourBrowser
import typings.titanium.TitaniumNs.NetworkNs.BonjourService
import typings.titanium.TitaniumNs.NetworkNs.Cookie
import typings.titanium.TitaniumNs.NetworkNs.HTTPClient
import typings.titanium.TitaniumNs.NetworkNs.TCPSocket
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofNetwork extends js.Object {
  /**
  		 * Special hostname value for listening sockets, representing all
  		 * locally available network interfaces.
  		 */
  val INADDR_ANY: String = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that the device is
  		 * communicating over a local-area network.
  		 */
  val NETWORK_LAN: Double = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that the device is
  		 * communicating over a mobile network.
  		 */
  val NETWORK_MOBILE: Double = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that no
  		 * network is available.
  		 */
  val NETWORK_NONE: Double = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that the
  		 * current network type is unknown.
  		 */
  val NETWORK_UNKNOWN: Double = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that the
  		 * device is communicating over a WiFi network.
  		 */
  val NETWORK_WIFI: Double = js.native
  /**
  		 * Constant value for an Alert style push notification.
  		 */
  val NOTIFICATION_TYPE_ALERT: Double = js.native
  /**
  		 * Constant value for a Badge style push notification.
  		 */
  val NOTIFICATION_TYPE_BADGE: Double = js.native
  /**
  		 * Constant value for a Newsstand style push notification. Only available on iOS5 and later
  		 */
  val NOTIFICATION_TYPE_NEWSSTAND: Double = js.native
  /**
  		 * Constant value for a Sound style push notification.
  		 */
  val NOTIFICATION_TYPE_SOUND: Double = js.native
  /**
  		 * Constant value specifying that the progress of a download can not be calculated.
  		 */
  val PROGRESS_UNKNOWN: Double = js.native
  /**
  		 * Constant value specifying read-only mode for sockets.
  		 */
  val READ_MODE: Double = js.native
  /**
  		 * Constant value specifying read-write mode for sockets.
  		 */
  val READ_WRITE_MODE: Double = js.native
  /**
  		 * Constant value representing a socket in the CLOSED state.
  		 */
  val SOCKET_CLOSED: Double = js.native
  /**
  		 * Constant value representing a socket in the CONNECTED state.
  		 */
  val SOCKET_CONNECTED: Double = js.native
  /**
  		 * Constant value representing a socket in the ERROR state.
  		 */
  val SOCKET_ERROR: Double = js.native
  /**
  		 * Constant value representing a socket in the INITIALIZED state.
  		 */
  val SOCKET_INITIALIZED: Double = js.native
  /**
  		 * Constant value representing a socket in the LISTENING state.
  		 */
  val SOCKET_LISTENING: Double = js.native
  /**
  		 * Socket module, used for creating sockets.
  		 */
  val SocketNs: TypeofSocket = js.native
  /**
  		 * Constant value specifying TLS version 1.0 for SSL.
  		 */
  val TLS_VERSION_1_0: Double = js.native
  /**
  		 * Constant value specifying TLS version 1.1 for SSL.
  		 */
  val TLS_VERSION_1_1: Double = js.native
  /**
  		 * Constant value specifying TLS version 1.2 for SSL.
  		 */
  val TLS_VERSION_1_2: Double = js.native
  /**
  		 * Constant value specifying write-only mode for sockets.
  		 */
  val WRITE_MODE: Double = js.native
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
  		 * Legacy method to add a connectivity listener to listen for network changes.
  		 */
  def addConnectivityListener(callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
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
  def createBonjourBrowser(serviceType: String, domain: String, parameters: js.Any): BonjourBrowser = js.native
  /**
  		 * Creates and returns a `BonjourService` object.
  		 */
  def createBonjourService(name: String, `type`: String, domain: String): BonjourService = js.native
  def createBonjourService(name: String, `type`: String, domain: String, parameters: js.Any): BonjourService = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Network.Cookie>.
  		 */
  def createCookie(): Cookie = js.native
  def createCookie(parameters: js.Any): Cookie = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Network.HTTPClient>.
  		 */
  def createHTTPClient(): HTTPClient = js.native
  def createHTTPClient(parameters: js.Any): HTTPClient = js.native
  /**
  		 * Legacy method to create and return an instance of <Titanium.Network.TCPSocket>.
  		 */
  def createTCPSocket(hostName: String, port: Double, mode: Double, parameters: js.Any): TCPSocket = js.native
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
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Network.allHTTPCookies> property.
  		 */
  def getAllHTTPCookies(): js.Array[Cookie] = js.native
  /**
  		 * Gets the value of the <Titanium.Network.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Network.bubbleParent> property.
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
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Network.networkType> property.
  		 */
  def getNetworkType(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Network.networkTypeName> property.
  		 */
  def getNetworkTypeName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Network.online> property.
  		 */
  def getOnline(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Network.remoteDeviceUUID> property.
  		 */
  def getRemoteDeviceUUID(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Network.remoteNotificationTypes> property.
  		 */
  def getRemoteNotificationTypes(): js.Array[Double] = js.native
  /**
  		 * Gets the value of the <Titanium.Network.remoteNotificationsEnabled> property.
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
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
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
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Network.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Network.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Unregisters the application for push notifications.
  		 */
  def unregisterForPushNotifications(): Unit = js.native
}

