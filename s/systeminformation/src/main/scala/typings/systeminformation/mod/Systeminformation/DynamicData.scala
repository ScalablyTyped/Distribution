package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicData extends StObject {
  
  var battery: BatteryData
  
  var cpuCurrentSpeed: CpuCurrentSpeedData
  
  var cpuTemperature: CpuTemperatureData
  
  var currentLoad: CurrentLoadData
  
  var disksIO: DisksIoData
  
  var fsSize: FsSizeData
  
  var fsStats: FsStatsData
  
  var inetLatency: Double
  
  var mem: MemData
  
  var networkConnections: NetworkConnectionsData
  
  var networkStats: NetworkStatsData
  
  var node: String
  
  var processes: ProcessesData
  
  var services: ServicesData
  
  var time: TimeData
  
  var users: js.Array[UserData]
  
  var v8: String
  
  var wifiNetworks: WifiNetworkData
}
object DynamicData {
  
  inline def apply(
    battery: BatteryData,
    cpuCurrentSpeed: CpuCurrentSpeedData,
    cpuTemperature: CpuTemperatureData,
    currentLoad: CurrentLoadData,
    disksIO: DisksIoData,
    fsSize: FsSizeData,
    fsStats: FsStatsData,
    inetLatency: Double,
    mem: MemData,
    networkConnections: NetworkConnectionsData,
    networkStats: NetworkStatsData,
    node: String,
    processes: ProcessesData,
    services: ServicesData,
    time: TimeData,
    users: js.Array[UserData],
    v8: String,
    wifiNetworks: WifiNetworkData
  ): DynamicData = {
    val __obj = js.Dynamic.literal(battery = battery.asInstanceOf[js.Any], cpuCurrentSpeed = cpuCurrentSpeed.asInstanceOf[js.Any], cpuTemperature = cpuTemperature.asInstanceOf[js.Any], currentLoad = currentLoad.asInstanceOf[js.Any], disksIO = disksIO.asInstanceOf[js.Any], fsSize = fsSize.asInstanceOf[js.Any], fsStats = fsStats.asInstanceOf[js.Any], inetLatency = inetLatency.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], networkConnections = networkConnections.asInstanceOf[js.Any], networkStats = networkStats.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processes = processes.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], wifiNetworks = wifiNetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicData] (val x: Self) extends AnyVal {
    
    inline def setBattery(value: BatteryData): Self = StObject.set(x, "battery", value.asInstanceOf[js.Any])
    
    inline def setCpuCurrentSpeed(value: CpuCurrentSpeedData): Self = StObject.set(x, "cpuCurrentSpeed", value.asInstanceOf[js.Any])
    
    inline def setCpuTemperature(value: CpuTemperatureData): Self = StObject.set(x, "cpuTemperature", value.asInstanceOf[js.Any])
    
    inline def setCurrentLoad(value: CurrentLoadData): Self = StObject.set(x, "currentLoad", value.asInstanceOf[js.Any])
    
    inline def setDisksIO(value: DisksIoData): Self = StObject.set(x, "disksIO", value.asInstanceOf[js.Any])
    
    inline def setFsSize(value: FsSizeData): Self = StObject.set(x, "fsSize", value.asInstanceOf[js.Any])
    
    inline def setFsStats(value: FsStatsData): Self = StObject.set(x, "fsStats", value.asInstanceOf[js.Any])
    
    inline def setInetLatency(value: Double): Self = StObject.set(x, "inetLatency", value.asInstanceOf[js.Any])
    
    inline def setMem(value: MemData): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setNetworkConnections(value: NetworkConnectionsData): Self = StObject.set(x, "networkConnections", value.asInstanceOf[js.Any])
    
    inline def setNetworkStats(value: NetworkStatsData): Self = StObject.set(x, "networkStats", value.asInstanceOf[js.Any])
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setProcesses(value: ProcessesData): Self = StObject.set(x, "processes", value.asInstanceOf[js.Any])
    
    inline def setServices(value: ServicesData): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setTime(value: TimeData): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[UserData]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: UserData*): Self = StObject.set(x, "users", js.Array(value*))
    
    inline def setV8(value: String): Self = StObject.set(x, "v8", value.asInstanceOf[js.Any])
    
    inline def setWifiNetworks(value: WifiNetworkData): Self = StObject.set(x, "wifiNetworks", value.asInstanceOf[js.Any])
  }
}
