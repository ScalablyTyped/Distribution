package typings.tizenTvWebapis.networkMod

import typings.tizenTvWebapis.anon.AES
import typings.tizenTvWebapis.anon.AUTO
import typings.tizenTvWebapis.anon.CELLULAR
import typings.tizenTvWebapis.anon.EAP
import typings.tizenTvWebapis.anon.GATEWAYCONNECTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkManager extends StObject {
  
  var NetworkActiveConnectionType: CELLULAR
  
  var NetworkIpMode: AUTO
  
  var NetworkState: GATEWAYCONNECTED
  
  var NetworkWiFiEncryptionType: AES
  
  var NetworkWiFiSecurityMode: EAP
  
  /**
    * Registers an asynchronous event listener.
    * @throw `SecurityError``TypeMismatchError`
    * @returns number Application async listener ID
    * @param listener NetworkStateChangedCallback. For example: listenerID = network.addNetworkStateChangeListener(onChange);
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if an input parameter is not compatible with its expected type, TypeMismatchError is thrown instead of NotSupportedError.
    * @note Since plugin version 3.0, the NotSupportedError exception has been removed.
    */
  def addNetworkStateChangeListener(listener: NetworkStateChangedCallback): Double
  
  /**
    * Retrieves the DHCP option 60 vendor string currently used by Udhcp. Works only when the active connection type is wired.
    * @throw WebAPIException `SecurityError`, `InvalidStateError`
    * @returns string Vendor string
    * Example: If Udhcpc is running with the default string "udhcpc1.21.1", after calling setDhcpOption60Field = "cisco", checkCurrentIpWith60Field= "udhcpc1.21.1"
    * @since 2.3
    * @privilegeLevel Partner
    * @privilegeName http://developer.samsung.com/privilege/network.dhcpoption60
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def checkCurrentIpWith60Field(): String
  
  /**
    * Retrieves the TV's currently-active connection type.
    * @throw WebAPIException `SecurityError`
    * @returns NetworkActiveConnectionType Currently-active network connection type."DISCONNECTED": 0, "WIFI": 1, "CELLULAR": 2, "ETHERNET": 3
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    */
  def getActiveConnectionType(): NetworkActiveConnectionType
  
  /**
    * Retrieves the DHCP option 60 vendor string. Works only when the active connection type is wired.
    * @throw WebAPIException `SecurityError`, `InvalidStateError`
    * @returns string Vendor-specific string. Default value is "default".
    * Example: If setDhcpOption60Field = "cisco" then getCurrentDhcpOption60Field = "cisco".
    * @since 2.3
    * @privilegeLevel Partner
    * @privilegeName http://developer.samsung.com/privilege/network.dhcpoption60
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getCurrentDhcpOption60Field(): String
  
  /**
    * Retrieves the TV's configured DNS address.
    * @throw WebAPIException `SecurityError`, `InvalidStateError`
    * @returns string DNS address for the currently-configured network. Example: 192.168.0.1
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getDns(): String
  
  /**
    * Retrieves the TV's configured gateway address.
    * @throw WebAPIException `SecurityError`,`InvalidStateError`
    * @returns string Gateway address for the currently-configured network
    * Example: 192.168.0.1
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getGateway(): String
  
  /**
    * Retrieves the TV's configured IP address.
    * @throw WebAPIException `SecurityError`,`InvalidStateError`
    * @returns string IP address for the currently-configured network
    * Example: 192.168.0.11
    * @code
    * @endcode
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getIp(): String
  
  /**
    * Retrieves the TV's IP configuration mode.
    * @throw WebAPIException `SecurityError`
    * @returns unsigned long Network IP mode
    *   "NONE":0
    *   "STATIC": 1
    *   "DYNAMIC": 2
    *   "AUTO": 3
    *   "FIXED": 4
    *   "UNKNOWN": 5
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, the NotSupportedError exception has been removed.
    */
  def getIpMode(): NetworkIpMode
  
  /**
    * Retrieves the network device's MAC address.
    * @throw WebAPIException `SecurityError`,`InvalidStateError`
    * @returns string MAC address for the currently-configured network. Example: 50:B7:A3:C2:96:11
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getMac(): String
  
  /**
    * Retrieves the TV's configured secondary DNS address.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type InvalidStateError, if a network connection is not available. (Since plugin version 3.0)
    * @returns string Secondary DNS address
    * Example: 192.168.0.100
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getSecondaryDns(): String
  
  /**
    * Retrieves the TV's configured subnet mask address.
    * @throw WebAPIException `SecurityError`,`InvalidStateError`
    * @returns string Subnet mask address for the currently-configured network. Example: 255.255.255.0
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getSubnetMask(): String
  
  /**
    * Retrieves the TV's configured name when TV is connected to a network.
    * @throw WebAPIException `SecurityError`,`InvalidStateError`
    * @returns string TV Name for any connected network. Example: Tizen_Device
    * @since 4.0
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getTVName(): String
  
  /**
    * Retrieves the TV network module version.
    * @returns string Network plugin module version
    * @throw WebAPIException `SecurityError`
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, the NotSupportedError exception has been removed.
    */
  def getVersion(): String
  
  /**
    * Retrieves the Wi-Fi encryption type. Works only when the active connection type is Wi-Fi.
    * @throw WebAPIException`SecurityError`,`InvalidStateError`
    * @returns unsigned long Wi-Fi encryption type
    *   "WEP": 1
    *   "TKIP": 2
    *   "AES": 3
    *   "TKIP_AES_MIXED": 4
    *   "NONE": 5
    *  "UNKNOWN": 6
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getWiFiEncryptionType(): NetworkWiFiEncryptionType
  
  /**
    * Retrieves the Wi-Fi security mode. Works only when the active connection type is Wi-Fi.
    * @throw WebAPIException`SecurityError`,`InvalidStateError`
    * @returns unsigned long Wi-Fi security mode
    *   "WEP": 1
    *   "WPA_PSK": 2
    *   "WPA2_PSK": 3
    *   "EAP": 4
    *   "NONE": 5
    *   "UNKNOWN": 6
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getWiFiSecurityMode(): NetworkWiFiSecurityMode
  
  /**
    * Retrieves the Wi-Fi signal strength. Works only when the active connection type is Wi-Fi.
    * @throw WebAPIException`SecurityError`,`InvalidStateError`
    * @returns number Signal strength level. Valid values are 1 to 5. Signal strength is strongest when the value is 5.
    * 8dBm
    * 8 ~ -77dBm
    * 7 ~ -66dBm
    * 6 ~ -55dBm
    * 5dBm
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getWiFiSignalStrengthLevel(): Double
  
  /**
    * Retrieves the Wi-Fi network SSID. Works only when the active connection type is Wi-Fi.
    * @throw WebAPIException `SecurityError`,`InvalidStateError`
    * @returns string Wi-Fi network SSID. Example: Strawbarry
    * @since 2.3
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @version 1.0
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def getWiFiSsid(): String
  
  /**
    * Checks whether the TV is connected to a network gateway.
    * @returns Boolean value:
    * true: Gateway connected
    * false: Gateway is not connected
    * @throw WebAPIException `SecurityError`
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def isConnectedToGateway(): Boolean
  
  /**
    * Sets the DHCP option 60 vendor string to the default value, "udhcpc1.21.1". Works only when the active connection type is wired. The vendor string is updated when Udhcpc is restarted or relaunched.
    * @throw WebAPIException `SecurityError`,`InvalidStateError`
    * @since 2.3
    * @privilegeLevel Partner
    * @privilegeName http://developer.samsung.com/privilege/network.dhcpoption60
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    */
  def removeDhcpOption60Field(): Unit
  
  /**
    * Unregisters an asynchronous event listener.
    * @throw WebAPIException `SecurityError`,`TypeMismatchError`,`InvalidValuesError`,
    * @param listenerId ListenerID to be removed
    * @since 2.3
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/network.public
    * @note Since plugin version 3.0, if the listenerId value is not the same as the value generated by addNetworkStateChangeListener, InvalidValuesError is thrown instead of NotSupportedError.
    */
  def removeNetworkStateChangeListener(listenerId: Double): Unit
  
  /**
    * Sets the DHCP option 60 vendor string. Works only when the active connection type is wired. The vendor string is updated when Udhcpc is restarted or relaunched.
    * @throw WebAPIException `SecurityError`,`InvalidStateError`,`InvalidStateError`,`TypeMismatchError`
    * @param vendorName DHCP option 60 vendor name string
    * @since 2.3
    * @privilegeLevel Partner
    * @privilegeName http://developer.samsung.com/privilege/network.dhcpoption60
    * @note Since plugin version 3.0, if a network connection is not available, InvalidStateError is thrown instead of NotSupportedError.
    * @note Since plugin version 3.0, if an input parameter is not compatible with its expected type, TypeMismatchError is thrown instead of NotSupportedError.
    */
  def setDhcpOption60Field(vendorName: String): Unit
}
object NetworkManager {
  
  @scala.inline
  def apply(
    NetworkActiveConnectionType: CELLULAR,
    NetworkIpMode: AUTO,
    NetworkState: GATEWAYCONNECTED,
    NetworkWiFiEncryptionType: AES,
    NetworkWiFiSecurityMode: EAP,
    addNetworkStateChangeListener: NetworkStateChangedCallback => Double,
    checkCurrentIpWith60Field: () => String,
    getActiveConnectionType: () => NetworkActiveConnectionType,
    getCurrentDhcpOption60Field: () => String,
    getDns: () => String,
    getGateway: () => String,
    getIp: () => String,
    getIpMode: () => NetworkIpMode,
    getMac: () => String,
    getSecondaryDns: () => String,
    getSubnetMask: () => String,
    getTVName: () => String,
    getVersion: () => String,
    getWiFiEncryptionType: () => NetworkWiFiEncryptionType,
    getWiFiSecurityMode: () => NetworkWiFiSecurityMode,
    getWiFiSignalStrengthLevel: () => Double,
    getWiFiSsid: () => String,
    isConnectedToGateway: () => Boolean,
    removeDhcpOption60Field: () => Unit,
    removeNetworkStateChangeListener: Double => Unit,
    setDhcpOption60Field: String => Unit
  ): NetworkManager = {
    val __obj = js.Dynamic.literal(NetworkActiveConnectionType = NetworkActiveConnectionType.asInstanceOf[js.Any], NetworkIpMode = NetworkIpMode.asInstanceOf[js.Any], NetworkState = NetworkState.asInstanceOf[js.Any], NetworkWiFiEncryptionType = NetworkWiFiEncryptionType.asInstanceOf[js.Any], NetworkWiFiSecurityMode = NetworkWiFiSecurityMode.asInstanceOf[js.Any], addNetworkStateChangeListener = js.Any.fromFunction1(addNetworkStateChangeListener), checkCurrentIpWith60Field = js.Any.fromFunction0(checkCurrentIpWith60Field), getActiveConnectionType = js.Any.fromFunction0(getActiveConnectionType), getCurrentDhcpOption60Field = js.Any.fromFunction0(getCurrentDhcpOption60Field), getDns = js.Any.fromFunction0(getDns), getGateway = js.Any.fromFunction0(getGateway), getIp = js.Any.fromFunction0(getIp), getIpMode = js.Any.fromFunction0(getIpMode), getMac = js.Any.fromFunction0(getMac), getSecondaryDns = js.Any.fromFunction0(getSecondaryDns), getSubnetMask = js.Any.fromFunction0(getSubnetMask), getTVName = js.Any.fromFunction0(getTVName), getVersion = js.Any.fromFunction0(getVersion), getWiFiEncryptionType = js.Any.fromFunction0(getWiFiEncryptionType), getWiFiSecurityMode = js.Any.fromFunction0(getWiFiSecurityMode), getWiFiSignalStrengthLevel = js.Any.fromFunction0(getWiFiSignalStrengthLevel), getWiFiSsid = js.Any.fromFunction0(getWiFiSsid), isConnectedToGateway = js.Any.fromFunction0(isConnectedToGateway), removeDhcpOption60Field = js.Any.fromFunction0(removeDhcpOption60Field), removeNetworkStateChangeListener = js.Any.fromFunction1(removeNetworkStateChangeListener), setDhcpOption60Field = js.Any.fromFunction1(setDhcpOption60Field))
    __obj.asInstanceOf[NetworkManager]
  }
  
  @scala.inline
  implicit class NetworkManagerMutableBuilder[Self <: NetworkManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNetworkStateChangeListener(value: NetworkStateChangedCallback => Double): Self = StObject.set(x, "addNetworkStateChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckCurrentIpWith60Field(value: () => String): Self = StObject.set(x, "checkCurrentIpWith60Field", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveConnectionType(value: () => NetworkActiveConnectionType): Self = StObject.set(x, "getActiveConnectionType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentDhcpOption60Field(value: () => String): Self = StObject.set(x, "getCurrentDhcpOption60Field", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDns(value: () => String): Self = StObject.set(x, "getDns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGateway(value: () => String): Self = StObject.set(x, "getGateway", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIp(value: () => String): Self = StObject.set(x, "getIp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIpMode(value: () => NetworkIpMode): Self = StObject.set(x, "getIpMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMac(value: () => String): Self = StObject.set(x, "getMac", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSecondaryDns(value: () => String): Self = StObject.set(x, "getSecondaryDns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubnetMask(value: () => String): Self = StObject.set(x, "getSubnetMask", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTVName(value: () => String): Self = StObject.set(x, "getTVName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWiFiEncryptionType(value: () => NetworkWiFiEncryptionType): Self = StObject.set(x, "getWiFiEncryptionType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWiFiSecurityMode(value: () => NetworkWiFiSecurityMode): Self = StObject.set(x, "getWiFiSecurityMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWiFiSignalStrengthLevel(value: () => Double): Self = StObject.set(x, "getWiFiSignalStrengthLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWiFiSsid(value: () => String): Self = StObject.set(x, "getWiFiSsid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsConnectedToGateway(value: () => Boolean): Self = StObject.set(x, "isConnectedToGateway", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNetworkActiveConnectionType(value: CELLULAR): Self = StObject.set(x, "NetworkActiveConnectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIpMode(value: AUTO): Self = StObject.set(x, "NetworkIpMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkState(value: GATEWAYCONNECTED): Self = StObject.set(x, "NetworkState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkWiFiEncryptionType(value: AES): Self = StObject.set(x, "NetworkWiFiEncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkWiFiSecurityMode(value: EAP): Self = StObject.set(x, "NetworkWiFiSecurityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveDhcpOption60Field(value: () => Unit): Self = StObject.set(x, "removeDhcpOption60Field", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveNetworkStateChangeListener(value: Double => Unit): Self = StObject.set(x, "removeNetworkStateChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDhcpOption60Field(value: String => Unit): Self = StObject.set(x, "setDhcpOption60Field", js.Any.fromFunction1(value))
  }
}
