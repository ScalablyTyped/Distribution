package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemInfoPropertyId extends StObject
@JSImport("tizen-common-web/systeminfo", "SystemInfoPropertyId")
@js.native
object SystemInfoPropertyId extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SystemInfoPropertyId & String] = js.native
  
  @js.native
  sealed trait ADS
    extends StObject
       with SystemInfoPropertyId
  /* "ADS" */ val ADS: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.ADS & String = js.native
  
  @js.native
  sealed trait BATTERY
    extends StObject
       with SystemInfoPropertyId
  /* "BATTERY" */ val BATTERY: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.BATTERY & String = js.native
  
  @js.native
  sealed trait BUILD
    extends StObject
       with SystemInfoPropertyId
  /* "BUILD" */ val BUILD: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.BUILD & String = js.native
  
  @js.native
  sealed trait CAMERA_FLASH
    extends StObject
       with SystemInfoPropertyId
  /* "CAMERA_FLASH" */ val CAMERA_FLASH: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.CAMERA_FLASH & String = js.native
  
  @js.native
  sealed trait CELLULAR_NETWORK
    extends StObject
       with SystemInfoPropertyId
  /* "CELLULAR_NETWORK" */ val CELLULAR_NETWORK: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.CELLULAR_NETWORK & String = js.native
  
  @js.native
  sealed trait CPU
    extends StObject
       with SystemInfoPropertyId
  /* "CPU" */ val CPU: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.CPU & String = js.native
  
  @js.native
  sealed trait DEVICE_ORIENTATION
    extends StObject
       with SystemInfoPropertyId
  /* "DEVICE_ORIENTATION" */ val DEVICE_ORIENTATION: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.DEVICE_ORIENTATION & String = js.native
  
  @js.native
  sealed trait DISPLAY
    extends StObject
       with SystemInfoPropertyId
  /* "DISPLAY" */ val DISPLAY: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.DISPLAY & String = js.native
  
  @js.native
  sealed trait ETHERNET_NETWORK
    extends StObject
       with SystemInfoPropertyId
  /* "ETHERNET_NETWORK" */ val ETHERNET_NETWORK: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.ETHERNET_NETWORK & String = js.native
  
  @js.native
  sealed trait LOCALE
    extends StObject
       with SystemInfoPropertyId
  /* "LOCALE" */ val LOCALE: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.LOCALE & String = js.native
  
  @js.native
  sealed trait MEMORY
    extends StObject
       with SystemInfoPropertyId
  /* "MEMORY" */ val MEMORY: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.MEMORY & String = js.native
  
  @js.native
  sealed trait NETWORK
    extends StObject
       with SystemInfoPropertyId
  /* "NETWORK" */ val NETWORK: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.NETWORK & String = js.native
  
  @js.native
  sealed trait NET_PROXY_NETWORK
    extends StObject
       with SystemInfoPropertyId
  /* "NET_PROXY_NETWORK" */ val NET_PROXY_NETWORK: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.NET_PROXY_NETWORK & String = js.native
  
  @js.native
  sealed trait PANEL
    extends StObject
       with SystemInfoPropertyId
  /* "PANEL" */ val PANEL: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.PANEL & String = js.native
  
  @js.native
  sealed trait PERIPHERAL
    extends StObject
       with SystemInfoPropertyId
  /* "PERIPHERAL" */ val PERIPHERAL: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.PERIPHERAL & String = js.native
  
  @js.native
  sealed trait SERVICE_COUNTRY
    extends StObject
       with SystemInfoPropertyId
  /* "SERVICE_COUNTRY" */ val SERVICE_COUNTRY: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.SERVICE_COUNTRY & String = js.native
  
  @js.native
  sealed trait SIM
    extends StObject
       with SystemInfoPropertyId
  /* "SIM" */ val SIM: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.SIM & String = js.native
  
  @js.native
  sealed trait SOURCE_INFO
    extends StObject
       with SystemInfoPropertyId
  /* "SOURCE_INFO" */ val SOURCE_INFO: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.SOURCE_INFO & String = js.native
  
  @js.native
  sealed trait STORAGE
    extends StObject
       with SystemInfoPropertyId
  /* "STORAGE" */ val STORAGE: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.STORAGE & String = js.native
  
  @js.native
  sealed trait VIDEOSOURCE
    extends StObject
       with SystemInfoPropertyId
  /* "VIDEOSOURCE" */ val VIDEOSOURCE: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.VIDEOSOURCE & String = js.native
  
  @js.native
  sealed trait WIFI_NETWORK
    extends StObject
       with SystemInfoPropertyId
  /* "WIFI_NETWORK" */ val WIFI_NETWORK: typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyId.WIFI_NETWORK & String = js.native
}
