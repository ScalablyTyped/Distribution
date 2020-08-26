package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemInfoWifiSecurityMode extends js.Object

@JSImport("tizen-common-web/systeminfo", "SystemInfoWifiSecurityMode")
@js.native
object SystemInfoWifiSecurityMode extends js.Object {
  @js.native
  sealed trait EAP extends SystemInfoWifiSecurityMode
  
  @js.native
  sealed trait NONE extends SystemInfoWifiSecurityMode
  
  @js.native
  sealed trait WEP extends SystemInfoWifiSecurityMode
  
  @js.native
  sealed trait WPA2_PSK extends SystemInfoWifiSecurityMode
  
  @js.native
  sealed trait WPA_PSK extends SystemInfoWifiSecurityMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoWifiSecurityMode with String] = js.native
  /* "EAP" */ @js.native
  object EAP extends TopLevel[EAP with String]
  
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  /* "WEP" */ @js.native
  object WEP extends TopLevel[WEP with String]
  
  /* "WPA2_PSK" */ @js.native
  object WPA2_PSK extends TopLevel[WPA2_PSK with String]
  
  /* "WPA_PSK" */ @js.native
  object WPA_PSK extends TopLevel[WPA_PSK with String]
  
}

