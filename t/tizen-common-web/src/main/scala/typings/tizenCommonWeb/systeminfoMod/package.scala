package typings.tizenCommonWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systeminfoMod {
  type SystemInfoPropertyArraySuccessCallback = js.Function1[
    /* properties */ js.Array[typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyType], 
    scala.Unit
  ]
  type SystemInfoPropertySuccessCallback = js.Function1[
    /* property */ typings.tizenCommonWeb.systeminfoMod.SystemInfoPropertyType, 
    scala.Unit
  ]
  type SystemInfoPropertyType = typings.tizenCommonWeb.systeminfoMod.SystemInfoBattery with typings.tizenCommonWeb.systeminfoMod.SystemInfoCpu with typings.tizenCommonWeb.systeminfoMod.SystemInfoStorage with typings.tizenCommonWeb.systeminfoMod.SystemInfoStorageUnit with typings.tizenCommonWeb.systeminfoMod.SystemInfoDisplay with typings.tizenCommonWeb.systeminfoMod.SystemInfoPanel with typings.tizenCommonWeb.systeminfoMod.SystemInfoDeviceOrientation with typings.tizenCommonWeb.systeminfoMod.SystemInfoBuild with typings.tizenCommonWeb.systeminfoMod.SystemInfoLocale with typings.tizenCommonWeb.systeminfoMod.SystemInfoNetwork with typings.tizenCommonWeb.systeminfoMod.SystemInfoWifiNetwork with typings.tizenCommonWeb.systeminfoMod.SystemInfoEthernetNetwork with typings.tizenCommonWeb.systeminfoMod.SystemInfoCellularNetwork with typings.tizenCommonWeb.systeminfoMod.SystemInfoNetProxyNetwork with typings.tizenCommonWeb.systeminfoMod.SystemInfoPeripheral with typings.tizenCommonWeb.systeminfoMod.SystemInfoMemory with typings.tizenCommonWeb.systeminfoMod.SystemInfoVideoSource
}
