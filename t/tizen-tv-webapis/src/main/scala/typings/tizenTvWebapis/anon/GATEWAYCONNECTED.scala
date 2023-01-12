package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisInts.`1`
import typings.tizenTvWebapis.tizenTvWebapisInts.`2`
import typings.tizenTvWebapis.tizenTvWebapisInts.`3`
import typings.tizenTvWebapis.tizenTvWebapisInts.`4`
import typings.tizenTvWebapis.tizenTvWebapisInts.`5`
import typings.tizenTvWebapis.tizenTvWebapisInts.`6`
import typings.tizenTvWebapis.tizenTvWebapisInts.`7`
import typings.tizenTvWebapis.tizenTvWebapisInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GATEWAYCONNECTED extends StObject {
  
  /**
    * Gateway connected
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var GATEWAY_CONNECTED: `4`
  
  /**
    * Gateway disconnected
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var GATEWAY_DISCONNECTED: `5`
  
  /**
    * LAN cable connected
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var LAN_CABLE_ATTACHED: `1`
  
  /**
    * LAN cable disconnected
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var LAN_CABLE_DETACHED: `2`
  
  /**
    * LAN cable connection state unknown
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var LAN_CABLE_STATE_UNKNOWN: `3`
  
  /**
    * Wi-Fi module connected
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var WIFI_MODULE_STATE_ATTACHED: `6`
  
  /**
    * Wi-Fi module disconnected
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var WIFI_MODULE_STATE_DETACHED: `7`
  
  /**
    * Wi-Fi module connection state unknown
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var WIFI_MODULE_STATE_UNKNOWN: `8`
}
object GATEWAYCONNECTED {
  
  inline def apply(): GATEWAYCONNECTED = {
    val __obj = js.Dynamic.literal(GATEWAY_CONNECTED = 4, GATEWAY_DISCONNECTED = 5, LAN_CABLE_ATTACHED = 1, LAN_CABLE_DETACHED = 2, LAN_CABLE_STATE_UNKNOWN = 3, WIFI_MODULE_STATE_ATTACHED = 6, WIFI_MODULE_STATE_DETACHED = 7, WIFI_MODULE_STATE_UNKNOWN = 8)
    __obj.asInstanceOf[GATEWAYCONNECTED]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GATEWAYCONNECTED] (val x: Self) extends AnyVal {
    
    inline def setGATEWAY_CONNECTED(value: `4`): Self = StObject.set(x, "GATEWAY_CONNECTED", value.asInstanceOf[js.Any])
    
    inline def setGATEWAY_DISCONNECTED(value: `5`): Self = StObject.set(x, "GATEWAY_DISCONNECTED", value.asInstanceOf[js.Any])
    
    inline def setLAN_CABLE_ATTACHED(value: `1`): Self = StObject.set(x, "LAN_CABLE_ATTACHED", value.asInstanceOf[js.Any])
    
    inline def setLAN_CABLE_DETACHED(value: `2`): Self = StObject.set(x, "LAN_CABLE_DETACHED", value.asInstanceOf[js.Any])
    
    inline def setLAN_CABLE_STATE_UNKNOWN(value: `3`): Self = StObject.set(x, "LAN_CABLE_STATE_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setWIFI_MODULE_STATE_ATTACHED(value: `6`): Self = StObject.set(x, "WIFI_MODULE_STATE_ATTACHED", value.asInstanceOf[js.Any])
    
    inline def setWIFI_MODULE_STATE_DETACHED(value: `7`): Self = StObject.set(x, "WIFI_MODULE_STATE_DETACHED", value.asInstanceOf[js.Any])
    
    inline def setWIFI_MODULE_STATE_UNKNOWN(value: `8`): Self = StObject.set(x, "WIFI_MODULE_STATE_UNKNOWN", value.asInstanceOf[js.Any])
  }
}
