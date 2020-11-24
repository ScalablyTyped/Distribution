package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoWifiEncryptionType extends js.Object
@JSImport("tizen-common-web/systeminfo", "SystemInfoWifiEncryptionType")
@js.native
object SystemInfoWifiEncryptionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoWifiEncryptionType with String] = js.native
  
  @js.native
  sealed trait AES extends SystemInfoWifiEncryptionType
  /* "AES" */ @js.native
  object AES extends TopLevel[AES with String]
  
  @js.native
  sealed trait NONE extends SystemInfoWifiEncryptionType
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  @js.native
  sealed trait TKIP extends SystemInfoWifiEncryptionType
  /* "TKIP" */ @js.native
  object TKIP extends TopLevel[TKIP with String]
  
  @js.native
  sealed trait TKIP_AES_MIXED extends SystemInfoWifiEncryptionType
  /* "TKIP_AES_MIXED" */ @js.native
  object TKIP_AES_MIXED extends TopLevel[TKIP_AES_MIXED with String]
  
  @js.native
  sealed trait WEP extends SystemInfoWifiEncryptionType
  /* "WEP" */ @js.native
  object WEP extends TopLevel[WEP with String]
}
