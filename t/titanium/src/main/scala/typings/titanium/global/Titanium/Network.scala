package typings.titanium.global.Titanium

import typings.titanium.Dictionary
import typings.titanium.PushNotificationConfig
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.NetworkChangeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top level network module.
  */
@JSGlobal("Titanium.Network")
@js.native
class Network ()
  extends typings.titanium.Titanium.Proxy
/**
  * The top level network module.
  */
/* static members */
@JSGlobal("Titanium.Network")
@js.native
object Network extends js.Object {
  
  /**
    * Special hostname value for listening sockets, representing all
    * locally available network interfaces.
    * @deprecated
    */
  val INADDR_ANY: scala.Nothing = js.native
  
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
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  val READ_MODE: scala.Nothing = js.native
  
  /**
    * Constant value specifying read-write mode for sockets.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  val READ_WRITE_MODE: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the CLOSED state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  val SOCKET_CLOSED: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the CONNECTED state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  val SOCKET_CONNECTED: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the ERROR state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  val SOCKET_ERROR: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the INITIALIZED state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  val SOCKET_INITIALIZED: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the LISTENING state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  val SOCKET_LISTENING: scala.Nothing = js.native
  
  /**
    * The TCPSocket instance returned from <Titanium.Network.createTCPSocket>.  This object
    * represents a socket which either listens locally on the device for connections,
    * or connects to a remote machine.
    * @deprecated Use [Titanium.Network.Socket.TCP](Titanium.Network.Socket.TCP) where possible.
    *
    */
  val TCPSocket: scala.Nothing = js.native
  
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
    * Constant value specifying TLS version 1.3 for SSL.
    */
  val TLS_VERSION_1_3: Double = js.native
  
  /**
    * Constant value specifying write-only mode for sockets.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  val WRITE_MODE: scala.Nothing = js.native
  
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
  def addHTTPCookie(cookie: typings.titanium.Titanium.Network.Cookie): Unit = js.native
  
  /**
    * Adds a cookie to the system cookie store.
    */
  def addSystemCookie(cookie: typings.titanium.Titanium.Network.Cookie): Unit = js.native
  
  /**
    * A list of all cookies in the cookie storage.
    */
  val allHTTPCookies: js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Creates and returns a `BonjourBrowser` object.
    */
  def createBonjourBrowser(serviceType: String, domain: String): typings.titanium.Titanium.Network.BonjourBrowser = js.native
  def createBonjourBrowser(
    serviceType: String,
    domain: String,
    parameters: Dictionary[typings.titanium.Titanium.Network.BonjourBrowser]
  ): typings.titanium.Titanium.Network.BonjourBrowser = js.native
  
  /**
    * Creates and returns a `BonjourService` object.
    */
  def createBonjourService(name: String, `type`: String, domain: String): typings.titanium.Titanium.Network.BonjourService = js.native
  def createBonjourService(
    name: String,
    `type`: String,
    domain: String,
    parameters: Dictionary[typings.titanium.Titanium.Network.BonjourService]
  ): typings.titanium.Titanium.Network.BonjourService = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Network.Cookie>.
    */
  def createCookie(): typings.titanium.Titanium.Network.Cookie = js.native
  def createCookie(parameters: Dictionary[typings.titanium.Titanium.Network.Cookie]): typings.titanium.Titanium.Network.Cookie = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Network.HTTPClient>.
    */
  def createHTTPClient(): typings.titanium.Titanium.Network.HTTPClient = js.native
  def createHTTPClient(parameters: Dictionary[typings.titanium.Titanium.Network.HTTPClient]): typings.titanium.Titanium.Network.HTTPClient = js.native
  
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
  def getAllHTTPCookies(): js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
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
  def getHTTPCookies(domain: String, path: String, name: String): js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
  /**
    * Gets all the cookies with the domain matched with the given values from the HTTP client cookie store.
    */
  def getHTTPCookiesForDomain(domain: String): js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
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
  def getSystemCookies(domain: String, path: String, name: String): js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
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
    * Registers for push notifications with the Apple Push Notification Service.
    */
  def registerForPushNotifications(config: PushNotificationConfig): Unit = js.native
  
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
  
  /**
    * A browser for the discovery and retrieval of Bonjour services available on the network.
    */
  @js.native
  class BonjourBrowser ()
    extends typings.titanium.Titanium.Network.BonjourBrowser
  
  /**
    * Describes a service on the network which is published by Bonjour.
    */
  @js.native
  class BonjourService ()
    extends typings.titanium.Titanium.Network.BonjourService
  
  /**
    * Cookie object used to manage the system cookie store and HTTP client cookie store.
    */
  @js.native
  class Cookie ()
    extends typings.titanium.Titanium.Network.Cookie
  
  /**
    * HTTP client object that (mostly) implements the XMLHttpRequest specification.
    */
  @js.native
  class HTTPClient ()
    extends typings.titanium.Titanium.Network.HTTPClient
  
  /**
    * Socket module, used for creating sockets.
    */
  @js.native
  class Socket ()
    extends typings.titanium.Titanium.Proxy
  /**
    * Socket module, used for creating sockets.
    */
  /* static members */
  @js.native
  object Socket extends js.Object {
    
    /**
      * State value representing a closed socket.
      */
    val CLOSED: Double = js.native
    
    /**
      * State value representing a connected socket.
      */
    val CONNECTED: Double = js.native
    
    /**
      * State value indicating an error has occurred on the socket.
      */
    val ERROR: Double = js.native
    
    /**
      * State value representing an initialized socket.
      */
    val INITIALIZED: Double = js.native
    
    /**
      * State value representing a socket that is listening for connections.
      */
    val LISTENING: Double = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    var bubbleParent: Boolean = js.native
    
    /**
      * Returns a new TCP socket object.
      */
    def createTCP(): typings.titanium.Titanium.Network.Socket.TCP = js.native
    def createTCP(params: Dictionary[typings.titanium.Titanium.Network.Socket.TCP]): typings.titanium.Titanium.Network.Socket.TCP = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    def fireEvent(name: String): Unit = js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Socket.apiName> property.
      * @deprecated Access <Titanium.Network.Socket.apiName> instead.
      */
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Socket.bubbleParent> property.
      * @deprecated Access <Titanium.Network.Socket.bubbleParent> instead.
      */
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
      * @deprecated Access <Titanium.Network.Socket.lifecycleContainer> instead.
      */
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    var lifecycleContainer: Window | TabGroup = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Socket.bubbleParent> property.
      * @deprecated Set the value using <Titanium.Network.Socket.bubbleParent> instead.
      */
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.Network.Socket.lifecycleContainer> instead.
      */
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
    
    /**
      * TCP socket that implements the `Titanium.IOStream` interface.
      */
    @js.native
    class TCP ()
      extends typings.titanium.Titanium.Network.Socket.TCP
  }
}
