package typings.webostvjs.mod

import typings.webostvjs.webostvjsStrings.`false`
import typings.webostvjs.webostvjsStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WifiPeerInfo extends StObject {
  
  /**
    * Configuration method.
    */
  var configMethod: js.UndefOr[Double] = js.undefined
  
  /**
    * Connection status.
    */
  var connected: Boolean
  
  /**
    * Device address.
    */
  var deviceAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Device name.
    */
  var deviceName: String
  
  /**
    * Group owner.
    */
  var groupOwner: Boolean
  
  /**
    * If the connection is available, this property will be set to 'true'.
    * if the connection is not available, this property will be set to 'false'.
    */
  var invited: js.UndefOr[`true` | `false`] = js.undefined
  
  /**
    * IPv4 address.
    */
  var peerIp: js.UndefOr[String] = js.undefined
  
  /**
    * Service discovery response. Only sent on the first inquiry and never again.
    */
  var serviceDiscoveryResponse: js.UndefOr[String] = js.undefined
  
  /**
    * Signal level.
    */
  var signalLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * WFD information.
    */
  var wfdInfo: js.UndefOr[WifiWfdInfo] = js.undefined
}
object WifiPeerInfo {
  
  inline def apply(connected: Boolean, deviceName: String, groupOwner: Boolean): WifiPeerInfo = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], groupOwner = groupOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiPeerInfo]
  }
  
  extension [Self <: WifiPeerInfo](x: Self) {
    
    inline def setConfigMethod(value: Double): Self = StObject.set(x, "configMethod", value.asInstanceOf[js.Any])
    
    inline def setConfigMethodUndefined: Self = StObject.set(x, "configMethod", js.undefined)
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setDeviceAddress(value: String): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
    
    inline def setDeviceAddressUndefined: Self = StObject.set(x, "deviceAddress", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setGroupOwner(value: Boolean): Self = StObject.set(x, "groupOwner", value.asInstanceOf[js.Any])
    
    inline def setInvited(value: `true` | `false`): Self = StObject.set(x, "invited", value.asInstanceOf[js.Any])
    
    inline def setInvitedUndefined: Self = StObject.set(x, "invited", js.undefined)
    
    inline def setPeerIp(value: String): Self = StObject.set(x, "peerIp", value.asInstanceOf[js.Any])
    
    inline def setPeerIpUndefined: Self = StObject.set(x, "peerIp", js.undefined)
    
    inline def setServiceDiscoveryResponse(value: String): Self = StObject.set(x, "serviceDiscoveryResponse", value.asInstanceOf[js.Any])
    
    inline def setServiceDiscoveryResponseUndefined: Self = StObject.set(x, "serviceDiscoveryResponse", js.undefined)
    
    inline def setSignalLevel(value: Double): Self = StObject.set(x, "signalLevel", value.asInstanceOf[js.Any])
    
    inline def setSignalLevelUndefined: Self = StObject.set(x, "signalLevel", js.undefined)
    
    inline def setWfdInfo(value: WifiWfdInfo): Self = StObject.set(x, "wfdInfo", value.asInstanceOf[js.Any])
    
    inline def setWfdInfoUndefined: Self = StObject.set(x, "wfdInfo", js.undefined)
  }
}
