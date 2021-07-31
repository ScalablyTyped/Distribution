package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoWifiEncryptionType extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoWifiEncryptionType")
@js.native
object SystemInfoWifiEncryptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoWifiEncryptionType & String] = js.native
  
  @js.native
  sealed trait AES
    extends StObject
       with SystemInfoWifiEncryptionType
  /* "AES" */ val AES: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.AES & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with SystemInfoWifiEncryptionType
  /* "NONE" */ val NONE: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.NONE & String = js.native
  
  @js.native
  sealed trait TKIP
    extends StObject
       with SystemInfoWifiEncryptionType
  /* "TKIP" */ val TKIP: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.TKIP & String = js.native
  
  @js.native
  sealed trait TKIP_AES_MIXED
    extends StObject
       with SystemInfoWifiEncryptionType
  /* "TKIP_AES_MIXED" */ val TKIP_AES_MIXED: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.TKIP_AES_MIXED & String = js.native
  
  @js.native
  sealed trait WEP
    extends StObject
       with SystemInfoWifiEncryptionType
  /* "WEP" */ val WEP: typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiEncryptionType.WEP & String = js.native
}
