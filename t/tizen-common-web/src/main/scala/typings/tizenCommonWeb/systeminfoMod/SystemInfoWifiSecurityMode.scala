package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoWifiSecurityMode extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoWifiSecurityMode")
@js.native
object SystemInfoWifiSecurityMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoWifiSecurityMode with String] = js.native
  
  @js.native
  sealed trait EAP extends SystemInfoWifiSecurityMode
  /* "EAP" */ val EAP: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.EAP with String = js.native
  
  @js.native
  sealed trait NONE extends SystemInfoWifiSecurityMode
  /* "NONE" */ val NONE: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.NONE with String = js.native
  
  @js.native
  sealed trait WEP extends SystemInfoWifiSecurityMode
  /* "WEP" */ val WEP: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.WEP with String = js.native
  
  @js.native
  sealed trait WPA2_PSK extends SystemInfoWifiSecurityMode
  /* "WPA2_PSK" */ val WPA2_PSK: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.WPA2_PSK with String = js.native
  
  @js.native
  sealed trait WPA_PSK extends SystemInfoWifiSecurityMode
  /* "WPA_PSK" */ val WPA_PSK: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.WPA_PSK with String = js.native
}
