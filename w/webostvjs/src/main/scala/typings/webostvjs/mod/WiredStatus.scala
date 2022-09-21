package typings.webostvjs.mod

import typings.webostvjs.webostvjsStrings.Manual
import typings.webostvjs.webostvjsStrings.dhcp
import typings.webostvjs.webostvjsStrings.no
import typings.webostvjs.webostvjsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiredStatus extends StObject {
  
  /**
    * Primary DNS address for the wired connection.
    */
  var dns1: js.UndefOr[String] = js.undefined
  
  /**
    * Secondary DNS address for the wired connection.
    */
  var dns2: js.UndefOr[String] = js.undefined
  
  /**
    * Tertiary DNS address for the wired connection.
    */
  var dns3: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address of the network gateway.
    */
  var gateway: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the wired Interface name in use. For example, ppp0.
    */
  var interfaceName: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address associated with the wired connection.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * If the IP address was assigned using the manual mode, method will contain 'Manual'.
    * If the IP Address was assigned through DHCP, method will contain 'dhcp'.
    */
  var method: js.UndefOr[Manual | dhcp] = js.undefined
  
  /**
    * The netmask value for the wired connection.
    */
  var netmask: js.UndefOr[String] = js.undefined
  
  /**
    * The captive portal technique forces an HTTP client on a network to see a special web page
    * (usually for authentication purposes) before using the Internet normally.
    * Captive portals are used at most Wi-Fi hotspots.
    * The onInternet will contain one of the following values:
    * - 'yes' - indicating the WiFi connection is connected to the Internet.
    * - 'no' - indicating the WiFi connection is not connected to the Internet.
    */
  var onInternet: js.UndefOr[yes | no] = js.undefined
  
  /**
    * If the wired connection is available it will be set to connected.
    * If the wired connection is not available, it will be set to disconnected .
    */
  var state: ConnectionState
}
object WiredStatus {
  
  inline def apply(state: ConnectionState): WiredStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiredStatus]
  }
  
  extension [Self <: WiredStatus](x: Self) {
    
    inline def setDns1(value: String): Self = StObject.set(x, "dns1", value.asInstanceOf[js.Any])
    
    inline def setDns1Undefined: Self = StObject.set(x, "dns1", js.undefined)
    
    inline def setDns2(value: String): Self = StObject.set(x, "dns2", value.asInstanceOf[js.Any])
    
    inline def setDns2Undefined: Self = StObject.set(x, "dns2", js.undefined)
    
    inline def setDns3(value: String): Self = StObject.set(x, "dns3", value.asInstanceOf[js.Any])
    
    inline def setDns3Undefined: Self = StObject.set(x, "dns3", js.undefined)
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
    
    inline def setInterfaceName(value: String): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNameUndefined: Self = StObject.set(x, "interfaceName", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setMethod(value: Manual | dhcp): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNetmask(value: String): Self = StObject.set(x, "netmask", value.asInstanceOf[js.Any])
    
    inline def setNetmaskUndefined: Self = StObject.set(x, "netmask", js.undefined)
    
    inline def setOnInternet(value: yes | no): Self = StObject.set(x, "onInternet", value.asInstanceOf[js.Any])
    
    inline def setOnInternetUndefined: Self = StObject.set(x, "onInternet", js.undefined)
    
    inline def setState(value: ConnectionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
