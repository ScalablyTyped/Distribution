package typings.tizenTvWebapis.networkMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkWiFiSecurityMode extends js.Object
@JSImport("tizen-tv-webapis/network", "NetworkWiFiSecurityMode")
@js.native
object NetworkWiFiSecurityMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkWiFiSecurityMode with Double] = js.native
  
  /**
    * EAP security mode
    */
  @js.native
  sealed trait EAP extends NetworkWiFiSecurityMode
  /* 4 */ @js.native
  object EAP extends TopLevel[EAP with Double]
  
  /**
    * Open security mode
    */
  @js.native
  sealed trait NONE extends NetworkWiFiSecurityMode
  /* 5 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /**
    * Security mode unknown
    */
  @js.native
  sealed trait UNKNOWN extends NetworkWiFiSecurityMode
  /* 6 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  /**
    * WEP security mode
    */
  @js.native
  sealed trait WEP extends NetworkWiFiSecurityMode
  /* 1 */ @js.native
  object WEP extends TopLevel[WEP with Double]
  
  /**
    * WPA2_PSK security mode
    */
  @js.native
  sealed trait WPA2_PSK extends NetworkWiFiSecurityMode
  /* 3 */ @js.native
  object WPA2_PSK extends TopLevel[WPA2_PSK with Double]
  
  /**
    * PSK security mode
    */
  @js.native
  sealed trait WPA_PSK extends NetworkWiFiSecurityMode
  /* 2 */ @js.native
  object WPA_PSK extends TopLevel[WPA_PSK with Double]
}
