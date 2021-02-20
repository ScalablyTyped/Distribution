package typings.titanium.global.Titanium

import typings.titanium.Dictionary
import typings.titanium.PushNotificationConfig
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.NetworkChangeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.change
import org.scalablytyped.runtime.StObject
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
object Network {
  
  @JSGlobal("Titanium.Network")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A browser for the discovery and retrieval of Bonjour services available on the network.
    */
  @JSGlobal("Titanium.Network.BonjourBrowser")
  @js.native
  class BonjourBrowser ()
    extends typings.titanium.Titanium.Network.BonjourBrowser
  
  /**
    * Describes a service on the network which is published by Bonjour.
    */
  @JSGlobal("Titanium.Network.BonjourService")
  @js.native
  class BonjourService ()
    extends typings.titanium.Titanium.Network.BonjourService
  
  /**
    * Cookie object used to manage the system cookie store and HTTP client cookie store.
    */
  @JSGlobal("Titanium.Network.Cookie")
  @js.native
  class Cookie ()
    extends typings.titanium.Titanium.Network.Cookie
  
  /**
    * HTTP client object that (mostly) implements the XMLHttpRequest specification.
    */
  @JSGlobal("Titanium.Network.HTTPClient")
  @js.native
  class HTTPClient ()
    extends typings.titanium.Titanium.Network.HTTPClient
  
  /**
    * Special hostname value for listening sockets, representing all
    * locally available network interfaces.
    * @deprecated
    */
  @JSGlobal("Titanium.Network.INADDR_ANY")
  @js.native
  val INADDR_ANY: scala.Nothing = js.native
  
  /**
    * A [networkType](Titanium.Network.networkType) value indicating that the device is
    * communicating over a local-area network.
    */
  @JSGlobal("Titanium.Network.NETWORK_LAN")
  @js.native
  val NETWORK_LAN: Double = js.native
  
  /**
    * A [networkType](Titanium.Network.networkType) value indicating that the device is
    * communicating over a mobile network.
    */
  @JSGlobal("Titanium.Network.NETWORK_MOBILE")
  @js.native
  val NETWORK_MOBILE: Double = js.native
  
  /**
    * A [networkType](Titanium.Network.networkType) value indicating that no
    * network is available.
    */
  @JSGlobal("Titanium.Network.NETWORK_NONE")
  @js.native
  val NETWORK_NONE: Double = js.native
  
  /**
    * A [networkType](Titanium.Network.networkType) value indicating that the
    * current network type is unknown.
    */
  @JSGlobal("Titanium.Network.NETWORK_UNKNOWN")
  @js.native
  val NETWORK_UNKNOWN: Double = js.native
  
  /**
    * A [networkType](Titanium.Network.networkType) value indicating that the
    * device is communicating over a WiFi network.
    */
  @JSGlobal("Titanium.Network.NETWORK_WIFI")
  @js.native
  val NETWORK_WIFI: Double = js.native
  
  /**
    * Constant value for an Alert style push notification.
    */
  @JSGlobal("Titanium.Network.NOTIFICATION_TYPE_ALERT")
  @js.native
  val NOTIFICATION_TYPE_ALERT: Double = js.native
  
  /**
    * Constant value for a Badge style push notification.
    */
  @JSGlobal("Titanium.Network.NOTIFICATION_TYPE_BADGE")
  @js.native
  val NOTIFICATION_TYPE_BADGE: Double = js.native
  
  /**
    * Constant value for a Newsstand style push notification. Only available on iOS5 and later
    */
  @JSGlobal("Titanium.Network.NOTIFICATION_TYPE_NEWSSTAND")
  @js.native
  val NOTIFICATION_TYPE_NEWSSTAND: Double = js.native
  
  /**
    * Constant value for a Sound style push notification.
    */
  @JSGlobal("Titanium.Network.NOTIFICATION_TYPE_SOUND")
  @js.native
  val NOTIFICATION_TYPE_SOUND: Double = js.native
  
  /**
    * Constant value specifying that the progress of a download can not be calculated.
    */
  @JSGlobal("Titanium.Network.PROGRESS_UNKNOWN")
  @js.native
  val PROGRESS_UNKNOWN: Double = js.native
  
  /**
    * Constant value specifying read-only mode for sockets.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  @JSGlobal("Titanium.Network.READ_MODE")
  @js.native
  val READ_MODE: scala.Nothing = js.native
  
  /**
    * Constant value specifying read-write mode for sockets.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  @JSGlobal("Titanium.Network.READ_WRITE_MODE")
  @js.native
  val READ_WRITE_MODE: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the CLOSED state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  @JSGlobal("Titanium.Network.SOCKET_CLOSED")
  @js.native
  val SOCKET_CLOSED: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the CONNECTED state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  @JSGlobal("Titanium.Network.SOCKET_CONNECTED")
  @js.native
  val SOCKET_CONNECTED: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the ERROR state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  @JSGlobal("Titanium.Network.SOCKET_ERROR")
  @js.native
  val SOCKET_ERROR: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the INITIALIZED state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  @JSGlobal("Titanium.Network.SOCKET_INITIALIZED")
  @js.native
  val SOCKET_INITIALIZED: scala.Nothing = js.native
  
  /**
    * Constant value representing a socket in the LISTENING state.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  @JSGlobal("Titanium.Network.SOCKET_LISTENING")
  @js.native
  val SOCKET_LISTENING: scala.Nothing = js.native
  
  /**
    * Socket module, used for creating sockets.
    */
  @JSGlobal("Titanium.Network.Socket")
  @js.native
  class Socket ()
    extends typings.titanium.Titanium.Proxy
  /**
    * Socket module, used for creating sockets.
    */
  object Socket {
    
    @JSGlobal("Titanium.Network.Socket")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * State value representing a closed socket.
      */
    @JSGlobal("Titanium.Network.Socket.CLOSED")
    @js.native
    val CLOSED: Double = js.native
    
    /**
      * State value representing a connected socket.
      */
    @JSGlobal("Titanium.Network.Socket.CONNECTED")
    @js.native
    val CONNECTED: Double = js.native
    
    /**
      * State value indicating an error has occurred on the socket.
      */
    @JSGlobal("Titanium.Network.Socket.ERROR")
    @js.native
    val ERROR: Double = js.native
    
    /**
      * State value representing an initialized socket.
      */
    @JSGlobal("Titanium.Network.Socket.INITIALIZED")
    @js.native
    val INITIALIZED: Double = js.native
    
    /**
      * State value representing a socket that is listening for connections.
      */
    @JSGlobal("Titanium.Network.Socket.LISTENING")
    @js.native
    val LISTENING: Double = js.native
    
    /**
      * TCP socket that implements the `Titanium.IOStream` interface.
      */
    @JSGlobal("Titanium.Network.Socket.TCP")
    @js.native
    class TCP ()
      extends typings.titanium.Titanium.Network.Socket.TCP
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Returns a new TCP socket object.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.createTCP")
    @js.native
    def createTCP(): typings.titanium.Titanium.Network.Socket.TCP = js.native
    @JSGlobal("Titanium.Network.Socket.createTCP")
    @js.native
    def createTCP(params: Dictionary[typings.titanium.Titanium.Network.Socket.TCP]): typings.titanium.Titanium.Network.Socket.TCP = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.Network.Socket.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Socket.apiName> property.
      * @deprecated Access <Titanium.Network.Socket.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Socket.bubbleParent> property.
      * @deprecated Access <Titanium.Network.Socket.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
      * @deprecated Access <Titanium.Network.Socket.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.getLifecycleContainer")
    @js.native
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.lifecycleContainer")
    @js.native
    def lifecycleContainer: Window | TabGroup = js.native
    @scala.inline
    def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Network.Socket.bubbleParent> property.
      * @deprecated Set the value using <Titanium.Network.Socket.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    @JSGlobal("Titanium.Network.Socket.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.Network.Socket.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Network.Socket.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  }
  
  /**
    * The TCPSocket instance returned from <Titanium.Network.createTCPSocket>.  This object
    * represents a socket which either listens locally on the device for connections,
    * or connects to a remote machine.
    * @deprecated Use [Titanium.Network.Socket.TCP](Titanium.Network.Socket.TCP) where possible.
    *
    */
  @JSGlobal("Titanium.Network.TCPSocket")
  @js.native
  val TCPSocket: scala.Nothing = js.native
  
  /**
    * Constant value specifying TLS version 1.0 for SSL.
    */
  @JSGlobal("Titanium.Network.TLS_VERSION_1_0")
  @js.native
  val TLS_VERSION_1_0: Double = js.native
  
  /**
    * Constant value specifying TLS version 1.1 for SSL.
    */
  @JSGlobal("Titanium.Network.TLS_VERSION_1_1")
  @js.native
  val TLS_VERSION_1_1: Double = js.native
  
  /**
    * Constant value specifying TLS version 1.2 for SSL.
    */
  @JSGlobal("Titanium.Network.TLS_VERSION_1_2")
  @js.native
  val TLS_VERSION_1_2: Double = js.native
  
  /**
    * Constant value specifying TLS version 1.3 for SSL.
    */
  @JSGlobal("Titanium.Network.TLS_VERSION_1_3")
  @js.native
  val TLS_VERSION_1_3: Double = js.native
  
  /**
    * Constant value specifying write-only mode for sockets.
    * @deprecated Used with the deprecated [Titanium.Network.TCPSocket](Titanium.Network.TCPSocket) only.
    * See [Socket](Titanium.Network.Socket) for constants used with
    * [TCP](Titanium.Network.Socket.TCP) sockets.
    *
    */
  @JSGlobal("Titanium.Network.WRITE_MODE")
  @js.native
  val WRITE_MODE: scala.Nothing = js.native
  
  /**
    * Legacy method to add a connectivity listener to listen for network changes.
    * @deprecated Use the [Titanium.Network.change](Titanium.Network.change) event to monitor connectivity changes.
    */
  /* static member */
  @JSGlobal("Titanium.Network.addConnectivityListener")
  @js.native
  def addConnectivityListener: scala.Nothing = js.native
  @scala.inline
  def addConnectivityListener_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addConnectivityListener")(x.asInstanceOf[js.Any])
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Network.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Network.addEventListener")
  @js.native
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Network, /* event */ NetworkChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Adds a cookie to the HTTP client cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.addHTTPCookie")
  @js.native
  def addHTTPCookie(cookie: typings.titanium.Titanium.Network.Cookie): Unit = js.native
  
  /**
    * Adds a cookie to the system cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.addSystemCookie")
  @js.native
  def addSystemCookie(cookie: typings.titanium.Titanium.Network.Cookie): Unit = js.native
  
  /**
    * A list of all cookies in the cookie storage.
    */
  /* static member */
  @JSGlobal("Titanium.Network.allHTTPCookies")
  @js.native
  val allHTTPCookies: js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Network.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Network.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Network.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Creates and returns a `BonjourBrowser` object.
    */
  /* static member */
  @JSGlobal("Titanium.Network.createBonjourBrowser")
  @js.native
  def createBonjourBrowser(serviceType: String, domain: String): typings.titanium.Titanium.Network.BonjourBrowser = js.native
  @JSGlobal("Titanium.Network.createBonjourBrowser")
  @js.native
  def createBonjourBrowser(
    serviceType: String,
    domain: String,
    parameters: Dictionary[typings.titanium.Titanium.Network.BonjourBrowser]
  ): typings.titanium.Titanium.Network.BonjourBrowser = js.native
  
  /**
    * Creates and returns a `BonjourService` object.
    */
  /* static member */
  @JSGlobal("Titanium.Network.createBonjourService")
  @js.native
  def createBonjourService(name: String, `type`: String, domain: String): typings.titanium.Titanium.Network.BonjourService = js.native
  @JSGlobal("Titanium.Network.createBonjourService")
  @js.native
  def createBonjourService(
    name: String,
    `type`: String,
    domain: String,
    parameters: Dictionary[typings.titanium.Titanium.Network.BonjourService]
  ): typings.titanium.Titanium.Network.BonjourService = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Network.Cookie>.
    */
  /* static member */
  @JSGlobal("Titanium.Network.createCookie")
  @js.native
  def createCookie(): typings.titanium.Titanium.Network.Cookie = js.native
  @JSGlobal("Titanium.Network.createCookie")
  @js.native
  def createCookie(parameters: Dictionary[typings.titanium.Titanium.Network.Cookie]): typings.titanium.Titanium.Network.Cookie = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Network.HTTPClient>.
    */
  /* static member */
  @JSGlobal("Titanium.Network.createHTTPClient")
  @js.native
  def createHTTPClient(): typings.titanium.Titanium.Network.HTTPClient = js.native
  @JSGlobal("Titanium.Network.createHTTPClient")
  @js.native
  def createHTTPClient(parameters: Dictionary[typings.titanium.Titanium.Network.HTTPClient]): typings.titanium.Titanium.Network.HTTPClient = js.native
  
  /**
    * Legacy method to create and return an instance of <Titanium.Network.TCPSocket>.
    * @deprecated Use [Titanium.Network.Socket.createTCP](Titanium.Network.Socket.createTCP) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.createTCPSocket")
  @js.native
  def createTCPSocket: scala.Nothing = js.native
  @scala.inline
  def createTCPSocket_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTCPSocket")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a decoded version of a URI encoded value.
    */
  /* static member */
  @JSGlobal("Titanium.Network.decodeURIComponent")
  @js.native
  def decodeURIComponent(value: String): String = js.native
  
  /**
    * Returns a URI encoded version of the specified URI component.
    */
  /* static member */
  @JSGlobal("Titanium.Network.encodeURIComponent")
  @js.native
  def encodeURIComponent(value: String): String = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Network.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Network.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Network.fireEvent")
  @js.native
  def fireEvent_change(name: change): Unit = js.native
  @JSGlobal("Titanium.Network.fireEvent")
  @js.native
  def fireEvent_change(name: change, event: NetworkChangeEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Network.allHTTPCookies> property.
    * @deprecated Access <Titanium.Network.allHTTPCookies> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getAllHTTPCookies")
  @js.native
  def getAllHTTPCookies(): js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
  /**
    * Gets the value of the <Titanium.Network.apiName> property.
    * @deprecated Access <Titanium.Network.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.bubbleParent> property.
    * @deprecated Access <Titanium.Network.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets all the cookies with the domain, path and name matched with the given values from the HTTP client cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getHTTPCookies")
  @js.native
  def getHTTPCookies(domain: String, path: String, name: String): js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
  /**
    * Gets all the cookies with the domain matched with the given values from the HTTP client cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getHTTPCookiesForDomain")
  @js.native
  def getHTTPCookiesForDomain(domain: String): js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
  /**
    * Gets the value of the <Titanium.Network.lifecycleContainer> property.
    * @deprecated Access <Titanium.Network.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Network.networkType> property.
    * @deprecated Access <Titanium.Network.networkType> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getNetworkType")
  @js.native
  def getNetworkType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Network.networkTypeName> property.
    * @deprecated Access <Titanium.Network.networkTypeName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getNetworkTypeName")
  @js.native
  def getNetworkTypeName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.online> property.
    * @deprecated Access <Titanium.Network.online> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getOnline")
  @js.native
  def getOnline(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Network.remoteDeviceUUID> property.
    * @deprecated Access <Titanium.Network.remoteDeviceUUID> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getRemoteDeviceUUID")
  @js.native
  def getRemoteDeviceUUID(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Network.remoteNotificationTypes> property.
    * @deprecated Access <Titanium.Network.remoteNotificationTypes> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getRemoteNotificationTypes")
  @js.native
  def getRemoteNotificationTypes(): js.Array[Double] = js.native
  
  /**
    * Gets the value of the <Titanium.Network.remoteNotificationsEnabled> property.
    * @deprecated Access <Titanium.Network.remoteNotificationsEnabled> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getRemoteNotificationsEnabled")
  @js.native
  def getRemoteNotificationsEnabled(): Boolean = js.native
  
  /**
    * Gets all the cookies with the domain, path and name matched with the given values from the system cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.getSystemCookies")
  @js.native
  def getSystemCookies(domain: String, path: String, name: String): js.Array[typings.titanium.Titanium.Network.Cookie] = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Network.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Network type value as a constant.
    */
  /* static member */
  @JSGlobal("Titanium.Network.networkType")
  @js.native
  val networkType: Double = js.native
  
  /**
    * Network type as a String. Returns one of `NONE`, `WIFI`, `LAN`, `MOBILE`, or `UNKNOWN`.
    */
  /* static member */
  @JSGlobal("Titanium.Network.networkTypeName")
  @js.native
  val networkTypeName: String = js.native
  
  /**
    * Boolean value indicating if the device is connected to the network.
    */
  /* static member */
  @JSGlobal("Titanium.Network.online")
  @js.native
  val online: Boolean = js.native
  
  /**
    * Registers for push notifications with the Apple Push Notification Service.
    */
  /* static member */
  @JSGlobal("Titanium.Network.registerForPushNotifications")
  @js.native
  def registerForPushNotifications(config: PushNotificationConfig): Unit = js.native
  
  /**
    * Remote device UUID if the device is registered with the Apple Push Notification
    * Service, or null if it is not registered.
    */
  /* static member */
  @JSGlobal("Titanium.Network.remoteDeviceUUID")
  @js.native
  val remoteDeviceUUID: String = js.native
  
  /**
    * Array of push notification type constants enabled for the application.
    */
  /* static member */
  @JSGlobal("Titanium.Network.remoteNotificationTypes")
  @js.native
  val remoteNotificationTypes: js.Array[Double] = js.native
  
  /**
    * Indicates whether push  notifications have been enabled using
    * [registerForPushNotifications](Titanium.Network.registerForPushNotifications).
    */
  /* static member */
  @JSGlobal("Titanium.Network.remoteNotificationsEnabled")
  @js.native
  val remoteNotificationsEnabled: Boolean = js.native
  
  /**
    * Removes all the cookies from the HTTP client cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.removeAllHTTPCookies")
  @js.native
  def removeAllHTTPCookies(): Unit = js.native
  
  /**
    * Removes all the cookie from the system client cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.removeAllSystemCookies")
  @js.native
  def removeAllSystemCookies(): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Network.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Network.removeEventListener")
  @js.native
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Network, /* event */ NetworkChangeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Removes the cookie with the domain, path and name exactly the same as the given values from the HTTP client cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.removeHTTPCookie")
  @js.native
  def removeHTTPCookie(domain: String, path: String, name: String): Unit = js.native
  
  /**
    * Removes the cookies with the domain matched with the given values from the HTTP client cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.removeHTTPCookiesForDomain")
  @js.native
  def removeHTTPCookiesForDomain(domain: String): Unit = js.native
  
  /**
    * Removes the cookie with the domain, path and name exactly the same as the given values from the system cookie store.
    */
  /* static member */
  @JSGlobal("Titanium.Network.removeSystemCookie")
  @js.native
  def removeSystemCookie(domain: String, path: String, name: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Network.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Network.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Network.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Network.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Network.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Network.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Unregisters the application for push notifications.
    */
  /* static member */
  @JSGlobal("Titanium.Network.unregisterForPushNotifications")
  @js.native
  def unregisterForPushNotifications(): Unit = js.native
}
