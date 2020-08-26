package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SystemInfoPropertyId extends js.Object

@JSImport("tizen-common-web/systeminfo", "SystemInfoPropertyId")
@js.native
object SystemInfoPropertyId extends js.Object {
  @js.native
  sealed trait ADS extends SystemInfoPropertyId
  
  @js.native
  sealed trait BATTERY extends SystemInfoPropertyId
  
  @js.native
  sealed trait BUILD extends SystemInfoPropertyId
  
  @js.native
  sealed trait CAMERA_FLASH extends SystemInfoPropertyId
  
  @js.native
  sealed trait CELLULAR_NETWORK extends SystemInfoPropertyId
  
  @js.native
  sealed trait CPU extends SystemInfoPropertyId
  
  @js.native
  sealed trait DEVICE_ORIENTATION extends SystemInfoPropertyId
  
  @js.native
  sealed trait DISPLAY extends SystemInfoPropertyId
  
  @js.native
  sealed trait ETHERNET_NETWORK extends SystemInfoPropertyId
  
  @js.native
  sealed trait LOCALE extends SystemInfoPropertyId
  
  @js.native
  sealed trait MEMORY extends SystemInfoPropertyId
  
  @js.native
  sealed trait NETWORK extends SystemInfoPropertyId
  
  @js.native
  sealed trait NET_PROXY_NETWORK extends SystemInfoPropertyId
  
  @js.native
  sealed trait PANEL extends SystemInfoPropertyId
  
  @js.native
  sealed trait PERIPHERAL extends SystemInfoPropertyId
  
  @js.native
  sealed trait SERVICE_COUNTRY extends SystemInfoPropertyId
  
  @js.native
  sealed trait SIM extends SystemInfoPropertyId
  
  @js.native
  sealed trait SOURCE_INFO extends SystemInfoPropertyId
  
  @js.native
  sealed trait STORAGE extends SystemInfoPropertyId
  
  @js.native
  sealed trait VIDEOSOURCE extends SystemInfoPropertyId
  
  @js.native
  sealed trait WIFI_NETWORK extends SystemInfoPropertyId
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoPropertyId with String] = js.native
  /* "ADS" */ @js.native
  object ADS extends TopLevel[ADS with String]
  
  /* "BATTERY" */ @js.native
  object BATTERY extends TopLevel[BATTERY with String]
  
  /* "BUILD" */ @js.native
  object BUILD extends TopLevel[BUILD with String]
  
  /* "CAMERA_FLASH" */ @js.native
  object CAMERA_FLASH extends TopLevel[CAMERA_FLASH with String]
  
  /* "CELLULAR_NETWORK" */ @js.native
  object CELLULAR_NETWORK extends TopLevel[CELLULAR_NETWORK with String]
  
  /* "CPU" */ @js.native
  object CPU extends TopLevel[CPU with String]
  
  /* "DEVICE_ORIENTATION" */ @js.native
  object DEVICE_ORIENTATION extends TopLevel[DEVICE_ORIENTATION with String]
  
  /* "DISPLAY" */ @js.native
  object DISPLAY extends TopLevel[DISPLAY with String]
  
  /* "ETHERNET_NETWORK" */ @js.native
  object ETHERNET_NETWORK extends TopLevel[ETHERNET_NETWORK with String]
  
  /* "LOCALE" */ @js.native
  object LOCALE extends TopLevel[LOCALE with String]
  
  /* "MEMORY" */ @js.native
  object MEMORY extends TopLevel[MEMORY with String]
  
  /* "NETWORK" */ @js.native
  object NETWORK extends TopLevel[NETWORK with String]
  
  /* "NET_PROXY_NETWORK" */ @js.native
  object NET_PROXY_NETWORK extends TopLevel[NET_PROXY_NETWORK with String]
  
  /* "PANEL" */ @js.native
  object PANEL extends TopLevel[PANEL with String]
  
  /* "PERIPHERAL" */ @js.native
  object PERIPHERAL extends TopLevel[PERIPHERAL with String]
  
  /* "SERVICE_COUNTRY" */ @js.native
  object SERVICE_COUNTRY extends TopLevel[SERVICE_COUNTRY with String]
  
  /* "SIM" */ @js.native
  object SIM extends TopLevel[SIM with String]
  
  /* "SOURCE_INFO" */ @js.native
  object SOURCE_INFO extends TopLevel[SOURCE_INFO with String]
  
  /* "STORAGE" */ @js.native
  object STORAGE extends TopLevel[STORAGE with String]
  
  /* "VIDEOSOURCE" */ @js.native
  object VIDEOSOURCE extends TopLevel[VIDEOSOURCE with String]
  
  /* "WIFI_NETWORK" */ @js.native
  object WIFI_NETWORK extends TopLevel[WIFI_NETWORK with String]
  
}

