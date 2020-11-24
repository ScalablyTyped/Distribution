package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkState extends js.Object
@JSImport("tizen-tv-webapis/network", "NetworkState")
@js.native
object NetworkState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkState with Double] = js.native
  
  /**
    * Gateway connected
    */
  @js.native
  sealed trait GATEWAY_CONNECTED extends NetworkState
  /* 4 */ @js.native
  object GATEWAY_CONNECTED extends TopLevel[GATEWAY_CONNECTED with Double]
  
  /**
    * Gateway disconnected
    */
  @js.native
  sealed trait GATEWAY_DISCONNECTED extends NetworkState
  /* 5 */ @js.native
  object GATEWAY_DISCONNECTED extends TopLevel[GATEWAY_DISCONNECTED with Double]
  
  /**
    * LAN cable connected
    */
  @js.native
  sealed trait LAN_CABLE_ATTACHED extends NetworkState
  /* 1 */ @js.native
  object LAN_CABLE_ATTACHED extends TopLevel[LAN_CABLE_ATTACHED with Double]
  
  /**
    * LAN cable disconnected
    */
  @js.native
  sealed trait LAN_CABLE_DETACHED extends NetworkState
  /* 2 */ @js.native
  object LAN_CABLE_DETACHED extends TopLevel[LAN_CABLE_DETACHED with Double]
  
  /**
    * LAN cable connection state unknown
    */
  @js.native
  sealed trait LAN_CABLE_STATE_UNKNOWN extends NetworkState
  /* 3 */ @js.native
  object LAN_CABLE_STATE_UNKNOWN extends TopLevel[LAN_CABLE_STATE_UNKNOWN with Double]
  
  /**
    * Wi-Fi module connected
    */
  @js.native
  sealed trait WIFI_MODULE_STATE_ATTACHED extends NetworkState
  /* 6 */ @js.native
  object WIFI_MODULE_STATE_ATTACHED extends TopLevel[WIFI_MODULE_STATE_ATTACHED with Double]
  
  /**
    * Wi-Fi module disconnected
    */
  @js.native
  sealed trait WIFI_MODULE_STATE_DETACHED extends NetworkState
  /* 7 */ @js.native
  object WIFI_MODULE_STATE_DETACHED extends TopLevel[WIFI_MODULE_STATE_DETACHED with Double]
  
  /**
    * Wi-Fi module connection state unknown
    */
  @js.native
  sealed trait WIFI_MODULE_STATE_UNKNOWN extends NetworkState
  /* 8 */ @js.native
  object WIFI_MODULE_STATE_UNKNOWN extends TopLevel[WIFI_MODULE_STATE_UNKNOWN with Double]
}
