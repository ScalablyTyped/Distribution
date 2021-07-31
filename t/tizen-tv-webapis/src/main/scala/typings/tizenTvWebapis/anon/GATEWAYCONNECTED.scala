package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`4`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`5`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`6`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`7`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GATEWAYCONNECTED extends StObject {
  
  /**
    * Gateway connected
    */
  var GATEWAY_CONNECTED: `4`
  
  /**
    * Gateway disconnected
    */
  var GATEWAY_DISCONNECTED: `5`
  
  /**
    * LAN cable connected
    */
  var LAN_CABLE_ATTACHED: `1`
  
  /**
    * LAN cable disconnected
    */
  var LAN_CABLE_DETACHED: `2`
  
  /**
    * LAN cable connection state unknown
    */
  var LAN_CABLE_STATE_UNKNOWN: `3`
  
  /**
    * Wi-Fi module connected
    */
  var WIFI_MODULE_STATE_ATTACHED: `6`
  
  /**
    * Wi-Fi module disconnected
    */
  var WIFI_MODULE_STATE_DETACHED: `7`
  
  /**
    * Wi-Fi module connection state unknown
    */
  var WIFI_MODULE_STATE_UNKNOWN: `8`
}
object GATEWAYCONNECTED {
  
  @scala.inline
  def apply(): GATEWAYCONNECTED = {
    val __obj = js.Dynamic.literal(GATEWAY_CONNECTED = 4, GATEWAY_DISCONNECTED = 5, LAN_CABLE_ATTACHED = 1, LAN_CABLE_DETACHED = 2, LAN_CABLE_STATE_UNKNOWN = 3, WIFI_MODULE_STATE_ATTACHED = 6, WIFI_MODULE_STATE_DETACHED = 7, WIFI_MODULE_STATE_UNKNOWN = 8)
    __obj.asInstanceOf[GATEWAYCONNECTED]
  }
  
  @scala.inline
  implicit class GATEWAYCONNECTEDMutableBuilder[Self <: GATEWAYCONNECTED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGATEWAY_CONNECTED(value: `4`): Self = StObject.set(x, "GATEWAY_CONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGATEWAY_DISCONNECTED(value: `5`): Self = StObject.set(x, "GATEWAY_DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAN_CABLE_ATTACHED(value: `1`): Self = StObject.set(x, "LAN_CABLE_ATTACHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAN_CABLE_DETACHED(value: `2`): Self = StObject.set(x, "LAN_CABLE_DETACHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAN_CABLE_STATE_UNKNOWN(value: `3`): Self = StObject.set(x, "LAN_CABLE_STATE_UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI_MODULE_STATE_ATTACHED(value: `6`): Self = StObject.set(x, "WIFI_MODULE_STATE_ATTACHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI_MODULE_STATE_DETACHED(value: `7`): Self = StObject.set(x, "WIFI_MODULE_STATE_DETACHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI_MODULE_STATE_UNKNOWN(value: `8`): Self = StObject.set(x, "WIFI_MODULE_STATE_UNKNOWN", value.asInstanceOf[js.Any])
  }
}
