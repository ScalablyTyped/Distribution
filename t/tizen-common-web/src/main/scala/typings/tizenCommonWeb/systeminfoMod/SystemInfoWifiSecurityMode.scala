package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoWifiSecurityMode extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoWifiSecurityMode")
@js.native
object SystemInfoWifiSecurityMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoWifiSecurityMode & String] = js.native
  
  @js.native
  sealed trait EAP
    extends StObject
       with SystemInfoWifiSecurityMode
  /* "EAP" */ val EAP: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.EAP & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with SystemInfoWifiSecurityMode
  /* "NONE" */ val NONE: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.NONE & String = js.native
  
  @js.native
  sealed trait WEP
    extends StObject
       with SystemInfoWifiSecurityMode
  /* "WEP" */ val WEP: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.WEP & String = js.native
  
  @js.native
  sealed trait WPA2_PSK
    extends StObject
       with SystemInfoWifiSecurityMode
  /* "WPA2_PSK" */ val WPA2_PSK: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.WPA2_PSK & String = js.native
  
  @js.native
  sealed trait WPA_PSK
    extends StObject
       with SystemInfoWifiSecurityMode
  /* "WPA_PSK" */ val WPA_PSK: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiSecurityMode.WPA_PSK & String = js.native
}
