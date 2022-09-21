package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkState extends StObject
@JSImport("tizen-tv-webapis", "NetworkState")
@js.native
object NetworkState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkState & Double] = js.native
  
  /**
    * Gateway connected
    *
    * @since 2.3
    */
  @js.native
  sealed trait GATEWAY_CONNECTED
    extends StObject
       with NetworkState
  /* 4 */ val GATEWAY_CONNECTED: typings.tizenTvWebapis.mod.NetworkState.GATEWAY_CONNECTED & Double = js.native
  
  /**
    * Gateway disconnected
    *
    * @since 2.3
    */
  @js.native
  sealed trait GATEWAY_DISCONNECTED
    extends StObject
       with NetworkState
  /* 5 */ val GATEWAY_DISCONNECTED: typings.tizenTvWebapis.mod.NetworkState.GATEWAY_DISCONNECTED & Double = js.native
  
  /**
    * LAN cable connected
    *
    * @since 2.3
    */
  @js.native
  sealed trait LAN_CABLE_ATTACHED
    extends StObject
       with NetworkState
  /* 1 */ val LAN_CABLE_ATTACHED: typings.tizenTvWebapis.mod.NetworkState.LAN_CABLE_ATTACHED & Double = js.native
  
  /**
    * LAN cable disconnected
    *
    * @since 2.3
    */
  @js.native
  sealed trait LAN_CABLE_DETACHED
    extends StObject
       with NetworkState
  /* 2 */ val LAN_CABLE_DETACHED: typings.tizenTvWebapis.mod.NetworkState.LAN_CABLE_DETACHED & Double = js.native
  
  /**
    * LAN cable connection state unknown
    *
    * @since 2.3
    */
  @js.native
  sealed trait LAN_CABLE_STATE_UNKNOWN
    extends StObject
       with NetworkState
  /* 3 */ val LAN_CABLE_STATE_UNKNOWN: typings.tizenTvWebapis.mod.NetworkState.LAN_CABLE_STATE_UNKNOWN & Double = js.native
  
  /**
    * Wi-Fi module connected
    *
    * @since 2.3
    */
  @js.native
  sealed trait WIFI_MODULE_STATE_ATTACHED
    extends StObject
       with NetworkState
  /* 6 */ val WIFI_MODULE_STATE_ATTACHED: typings.tizenTvWebapis.mod.NetworkState.WIFI_MODULE_STATE_ATTACHED & Double = js.native
  
  /**
    * Wi-Fi module disconnected
    *
    * @since 2.3
    */
  @js.native
  sealed trait WIFI_MODULE_STATE_DETACHED
    extends StObject
       with NetworkState
  /* 7 */ val WIFI_MODULE_STATE_DETACHED: typings.tizenTvWebapis.mod.NetworkState.WIFI_MODULE_STATE_DETACHED & Double = js.native
  
  /**
    * Wi-Fi module connection state unknown
    *
    * @since 2.3
    */
  @js.native
  sealed trait WIFI_MODULE_STATE_UNKNOWN
    extends StObject
       with NetworkState
  /* 8 */ val WIFI_MODULE_STATE_UNKNOWN: typings.tizenTvWebapis.mod.NetworkState.WIFI_MODULE_STATE_UNKNOWN & Double = js.native
}
