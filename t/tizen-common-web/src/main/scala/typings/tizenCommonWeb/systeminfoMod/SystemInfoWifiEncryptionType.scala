package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemInfoWifiEncryptionType extends js.Object

@JSImport("tizen-common-web/systeminfo", "SystemInfoWifiEncryptionType")
@js.native
object SystemInfoWifiEncryptionType extends js.Object {
  @js.native
  sealed trait AES extends SystemInfoWifiEncryptionType
  
  @js.native
  sealed trait NONE extends SystemInfoWifiEncryptionType
  
  @js.native
  sealed trait TKIP extends SystemInfoWifiEncryptionType
  
  @js.native
  sealed trait TKIP_AES_MIXED extends SystemInfoWifiEncryptionType
  
  @js.native
  sealed trait WEP extends SystemInfoWifiEncryptionType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoWifiEncryptionType with String] = js.native
  /* "AES" */ @js.native
  object AES extends TopLevel[AES with String]
  
  /* "NONE" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
  /* "TKIP" */ @js.native
  object TKIP extends TopLevel[TKIP with String]
  
  /* "TKIP_AES_MIXED" */ @js.native
  object TKIP_AES_MIXED extends TopLevel[TKIP_AES_MIXED with String]
  
  /* "WEP" */ @js.native
  object WEP extends TopLevel[WEP with String]
  
}

