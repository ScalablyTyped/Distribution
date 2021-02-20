package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkState extends StObject
@JSImport("tizen-tv-webapis/network", "NetworkState")
@js.native
object NetworkState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkState with Double] = js.native
  
  /**
    * Gateway connected
    */
  @js.native
  sealed trait GATEWAY_CONNECTED extends NetworkState
  /* 4 */ val GATEWAY_CONNECTED: typings.tizenTvWebapis.networkMod.NetworkState.GATEWAY_CONNECTED with Double = js.native
  
  /**
    * Gateway disconnected
    */
  @js.native
  sealed trait GATEWAY_DISCONNECTED extends NetworkState
  /* 5 */ val GATEWAY_DISCONNECTED: typings.tizenTvWebapis.networkMod.NetworkState.GATEWAY_DISCONNECTED with Double = js.native
  
  /**
    * LAN cable connected
    */
  @js.native
  sealed trait LAN_CABLE_ATTACHED extends NetworkState
  /* 1 */ val LAN_CABLE_ATTACHED: typings.tizenTvWebapis.networkMod.NetworkState.LAN_CABLE_ATTACHED with Double = js.native
  
  /**
    * LAN cable disconnected
    */
  @js.native
  sealed trait LAN_CABLE_DETACHED extends NetworkState
  /* 2 */ val LAN_CABLE_DETACHED: typings.tizenTvWebapis.networkMod.NetworkState.LAN_CABLE_DETACHED with Double = js.native
  
  /**
    * LAN cable connection state unknown
    */
  @js.native
  sealed trait LAN_CABLE_STATE_UNKNOWN extends NetworkState
  /* 3 */ val LAN_CABLE_STATE_UNKNOWN: typings.tizenTvWebapis.networkMod.NetworkState.LAN_CABLE_STATE_UNKNOWN with Double = js.native
  
  /**
    * Wi-Fi module connected
    */
  @js.native
  sealed trait WIFI_MODULE_STATE_ATTACHED extends NetworkState
  /* 6 */ val WIFI_MODULE_STATE_ATTACHED: typings.tizenTvWebapis.networkMod.NetworkState.WIFI_MODULE_STATE_ATTACHED with Double = js.native
  
  /**
    * Wi-Fi module disconnected
    */
  @js.native
  sealed trait WIFI_MODULE_STATE_DETACHED extends NetworkState
  /* 7 */ val WIFI_MODULE_STATE_DETACHED: typings.tizenTvWebapis.networkMod.NetworkState.WIFI_MODULE_STATE_DETACHED with Double = js.native
  
  /**
    * Wi-Fi module connection state unknown
    */
  @js.native
  sealed trait WIFI_MODULE_STATE_UNKNOWN extends NetworkState
  /* 8 */ val WIFI_MODULE_STATE_UNKNOWN: typings.tizenTvWebapis.networkMod.NetworkState.WIFI_MODULE_STATE_UNKNOWN with Double = js.native
}
