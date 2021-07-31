package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkWiFiSecurityMode extends StObject
@JSImport("tizen-tv-webapis/network", "NetworkWiFiSecurityMode")
@js.native
object NetworkWiFiSecurityMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkWiFiSecurityMode & Double] = js.native
  
  /**
    * EAP security mode
    */
  @js.native
  sealed trait EAP
    extends StObject
       with NetworkWiFiSecurityMode
  /* 4 */ val EAP: typings.tizenTvWebapis.networkMod.NetworkWiFiSecurityMode.EAP & Double = js.native
  
  /**
    * Open security mode
    */
  @js.native
  sealed trait NONE
    extends StObject
       with NetworkWiFiSecurityMode
  /* 5 */ val NONE: typings.tizenTvWebapis.networkMod.NetworkWiFiSecurityMode.NONE & Double = js.native
  
  /**
    * Security mode unknown
    */
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with NetworkWiFiSecurityMode
  /* 6 */ val UNKNOWN: typings.tizenTvWebapis.networkMod.NetworkWiFiSecurityMode.UNKNOWN & Double = js.native
  
  /**
    * WEP security mode
    */
  @js.native
  sealed trait WEP
    extends StObject
       with NetworkWiFiSecurityMode
  /* 1 */ val WEP: typings.tizenTvWebapis.networkMod.NetworkWiFiSecurityMode.WEP & Double = js.native
  
  /**
    * WPA2_PSK security mode
    */
  @js.native
  sealed trait WPA2_PSK
    extends StObject
       with NetworkWiFiSecurityMode
  /* 3 */ val WPA2_PSK: typings.tizenTvWebapis.networkMod.NetworkWiFiSecurityMode.WPA2_PSK & Double = js.native
  
  /**
    * PSK security mode
    */
  @js.native
  sealed trait WPA_PSK
    extends StObject
       with NetworkWiFiSecurityMode
  /* 2 */ val WPA_PSK: typings.tizenTvWebapis.networkMod.NetworkWiFiSecurityMode.WPA_PSK & Double = js.native
}
