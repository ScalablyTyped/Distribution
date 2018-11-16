package typings
package titaniumLib.TitaniumNs.NetworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Network")
@js.native
object NetworkNsMembers extends js.Object {
  /**
  		 * Special hostname value for listening sockets, representing all
  		 * locally available network interfaces.
  		 */
  val INADDR_ANY: java.lang.String = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that the device is
  		 * communicating over a local-area network.
  		 */
  val NETWORK_LAN: scala.Double = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that the device is
  		 * communicating over a mobile network.
  		 */
  val NETWORK_MOBILE: scala.Double = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that no
  		 * network is available.
  		 */
  val NETWORK_NONE: scala.Double = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that the
  		 * current network type is unknown.
  		 */
  val NETWORK_UNKNOWN: scala.Double = js.native
  /**
  		 * A [networkType](Titanium.Network.networkType) value indicating that the
  		 * device is communicating over a WiFi network.
  		 */
  val NETWORK_WIFI: scala.Double = js.native
  /**
  		 * Constant value for an Alert style push notification.
  		 */
  val NOTIFICATION_TYPE_ALERT: scala.Double = js.native
  /**
  		 * Constant value for a Badge style push notification.
  		 */
  val NOTIFICATION_TYPE_BADGE: scala.Double = js.native
  /**
  		 * Constant value for a Newsstand style push notification. Only available on iOS5 and later
  		 */
  val NOTIFICATION_TYPE_NEWSSTAND: scala.Double = js.native
  /**
  		 * Constant value for a Sound style push notification.
  		 */
  val NOTIFICATION_TYPE_SOUND: scala.Double = js.native
  /**
  		 * Constant value specifying that the progress of a download can not be calculated.
  		 */
  val PROGRESS_UNKNOWN: scala.Double = js.native
  /**
  		 * Constant value specifying read-only mode for sockets.
  		 */
  val READ_MODE: scala.Double = js.native
  /**
  		 * Constant value specifying read-write mode for sockets.
  		 */
  val READ_WRITE_MODE: scala.Double = js.native
  /**
  		 * Constant value representing a socket in the CLOSED state.
  		 */
  val SOCKET_CLOSED: scala.Double = js.native
  /**
  		 * Constant value representing a socket in the CONNECTED state.
  		 */
  val SOCKET_CONNECTED: scala.Double = js.native
  /**
  		 * Constant value representing a socket in the ERROR state.
  		 */
  val SOCKET_ERROR: scala.Double = js.native
  /**
  		 * Constant value representing a socket in the INITIALIZED state.
  		 */
  val SOCKET_INITIALIZED: scala.Double = js.native
  /**
  		 * Constant value representing a socket in the LISTENING state.
  		 */
  val SOCKET_LISTENING: scala.Double = js.native
  /**
  		 * Constant value specifying TLS version 1.0 for SSL.
  		 */
  val TLS_VERSION_1_0: scala.Double = js.native
  /**
  		 * Constant value specifying TLS version 1.1 for SSL.
  		 */
  val TLS_VERSION_1_1: scala.Double = js.native
  /**
  		 * Constant value specifying TLS version 1.2 for SSL.
  		 */
  val TLS_VERSION_1_2: scala.Double = js.native
  /**
  		 * Constant value specifying write-only mode for sockets.
  		 */
  val WRITE_MODE: scala.Double = js.native
  /**
  		 * A list of all cookies in the cookie storage.
  		 */
  val allHTTPCookies: js.Array[Cookie] = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Network type value as a constant.
  		 */
  val networkType: scala.Double = js.native
  /**
  		 * Network type as a String. Returns one of `NONE`, `WIFI`, `LAN`, `MOBILE`, or `UNKNOWN`.
  		 */
  val networkTypeName: java.lang.String = js.native
  /**
  		 * Boolean value indicating if the device is connected to the network.
  		 */
  val online: scala.Boolean = js.native
  /**
  		 * Remote device UUID if the device is registered with the Apple Push Notification
  		 * Service, or null if it is not registered.
  		 */
  val remoteDeviceUUID: java.lang.String = js.native
  /**
  		 * Array of push notification type constants enabled for the application.
  		 */
  val remoteNotificationTypes: js.Array[scala.Double] = js.native
  /**
  		 * Indicates whether push  notifications have been enabled using
  		 * [registerForPushNotifications](Titanium.Network.registerForPushNotifications).
  		 */
  val remoteNotificationsEnabled: scala.Boolean = js.native
  /**
  		 * Legacy method to add a connectivity listener to listen for network changes.
  		 */
  def addConnectivityListener(callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Adds a cookie to the HTTP client cookie store.
  		 */
  def addHTTPCookie(cookie: Cookie): scala.Unit = js.native
  /**
  		 * Adds a cookie to the system cookie store.
  		 */
  def addSystemCookie(cookie: Cookie): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Creates and returns a `BonjourBrowser` object.
  		 */
  def createBonjourBrowser(serviceType: java.lang.String, domain: java.lang.String): BonjourBrowser = js.native
  /**
  		 * Creates and returns a `BonjourBrowser` object.
  		 */
  def createBonjourBrowser(serviceType: java.lang.String, domain: java.lang.String, parameters: js.Any): BonjourBrowser = js.native
  /**
  		 * Creates and returns a `BonjourService` object.
  		 */
  def createBonjourService(name: java.lang.String, `type`: java.lang.String, domain: java.lang.String): BonjourService = js.native
  /**
  		 * Creates and returns a `BonjourService` object.
  		 */
  def createBonjourService(name: java.lang.String, `type`: java.lang.String, domain: java.lang.String, parameters: js.Any): BonjourService = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Network.Cookie>.
  		 */
  def createCookie(): Cookie = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Network.Cookie>.
  		 */
  def createCookie(parameters: js.Any): Cookie = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Network.HTTPClient>.
  		 */
  def createHTTPClient(): HTTPClient = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Network.HTTPClient>.
  		 */
  def createHTTPClient(parameters: js.Any): HTTPClient = js.native
  /**
  		 * Legacy method to create and return an instance of <Titanium.Network.TCPSocket>.
  		 */
  def createTCPSocket(hostName: java.lang.String, port: scala.Double, mode: scala.Double, parameters: js.Any): TCPSocket = js.native
  /**
  		 * Returns a decoded version of a URI encoded value.
  		 */
  def decodeURIComponent(value: java.lang.String): java.lang.String = js.native
  /**
  		 * Returns a URI encoded version of the specified URI component.
  		 */
  def encodeURIComponent(value: java.lang.String): java.lang.String = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Network.allHTTPCookies> property.
  		 */
  def getAllHTTPCookies(): js.Array[Cookie] = js.native
  /**
  		 * Gets the value of the <Titanium.Network.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Network.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets all the cookies with the domain, path and name matched with the given values from the HTTP client cookie store.
  		 */
  def getHTTPCookies(domain: java.lang.String, path: java.lang.String, name: java.lang.String): js.Array[Cookie] = js.native
  /**
  		 * Gets all the cookies with the domain matched with the given values from the HTTP client cookie store.
  		 */
  def getHTTPCookiesForDomain(domain: java.lang.String): js.Array[Cookie] = js.native
  /**
  		 * Gets the value of the <Titanium.Network.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Network.networkType> property.
  		 */
  def getNetworkType(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Network.networkTypeName> property.
  		 */
  def getNetworkTypeName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Network.online> property.
  		 */
  def getOnline(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Network.remoteDeviceUUID> property.
  		 */
  def getRemoteDeviceUUID(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Network.remoteNotificationTypes> property.
  		 */
  def getRemoteNotificationTypes(): js.Array[scala.Double] = js.native
  /**
  		 * Gets the value of the <Titanium.Network.remoteNotificationsEnabled> property.
  		 */
  def getRemoteNotificationsEnabled(): scala.Boolean = js.native
  /**
  		 * Gets all the cookies with the domain, path and name matched with the given values from the system cookie store.
  		 */
  def getSystemCookies(domain: java.lang.String, path: java.lang.String, name: java.lang.String): js.Array[Cookie] = js.native
  /**
  		 * Registers for push notifications with the Apple Push Notification Service.
  		 */
  def registerForPushNotifications(config: titaniumLib.PushNotificationConfig): scala.Unit = js.native
  /**
  		 * Removes all the cookies from the HTTP client cookie store.
  		 */
  def removeAllHTTPCookies(): scala.Unit = js.native
  /**
  		 * Removes all the cookie from the system client cookie store.
  		 */
  def removeAllSystemCookies(): scala.Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Removes the cookie with the domain, path and name exactly the same as the given values from the HTTP client cookie store.
  		 */
  def removeHTTPCookie(domain: java.lang.String, path: java.lang.String, name: java.lang.String): scala.Unit = js.native
  /**
  		 * Removes the cookies with the domain matched with the given values from the HTTP client cookie store.
  		 */
  def removeHTTPCookiesForDomain(domain: java.lang.String): scala.Unit = js.native
  /**
  		 * Removes the cookie with the domain, path and name exactly the same as the given values from the system cookie store.
  		 */
  def removeSystemCookie(domain: java.lang.String, path: java.lang.String, name: java.lang.String): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Network.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Network.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Network.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Unregisters the application for push notifications.
  		 */
  def unregisterForPushNotifications(): scala.Unit = js.native
}

