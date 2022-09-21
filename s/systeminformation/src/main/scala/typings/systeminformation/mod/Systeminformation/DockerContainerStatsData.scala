package typings.systeminformation.mod.Systeminformation

import typings.systeminformation.anon.R
import typings.systeminformation.anon.Rx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerContainerStatsData extends StObject {
  
  var blockIO: R
  
  var cpuPercent: Double
  
  var cpuStats: Any
  
  var id: String
  
  var memLimit: Double
  
  var memPercent: Double
  
  var memUsage: Double
  
  var memoryStats: Any
  
  var netIO: Rx
  
  var networks: Any
  
  var pids: Double
  
  var precpuStats: Any
  
  var restartCount: Double
}
object DockerContainerStatsData {
  
  inline def apply(
    blockIO: R,
    cpuPercent: Double,
    cpuStats: Any,
    id: String,
    memLimit: Double,
    memPercent: Double,
    memUsage: Double,
    memoryStats: Any,
    netIO: Rx,
    networks: Any,
    pids: Double,
    precpuStats: Any,
    restartCount: Double
  ): DockerContainerStatsData = {
    val __obj = js.Dynamic.literal(blockIO = blockIO.asInstanceOf[js.Any], cpuPercent = cpuPercent.asInstanceOf[js.Any], cpuStats = cpuStats.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memLimit = memLimit.asInstanceOf[js.Any], memPercent = memPercent.asInstanceOf[js.Any], memUsage = memUsage.asInstanceOf[js.Any], memoryStats = memoryStats.asInstanceOf[js.Any], netIO = netIO.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], precpuStats = precpuStats.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerContainerStatsData]
  }
  
  extension [Self <: DockerContainerStatsData](x: Self) {
    
    inline def setBlockIO(value: R): Self = StObject.set(x, "blockIO", value.asInstanceOf[js.Any])
    
    inline def setCpuPercent(value: Double): Self = StObject.set(x, "cpuPercent", value.asInstanceOf[js.Any])
    
    inline def setCpuStats(value: Any): Self = StObject.set(x, "cpuStats", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMemLimit(value: Double): Self = StObject.set(x, "memLimit", value.asInstanceOf[js.Any])
    
    inline def setMemPercent(value: Double): Self = StObject.set(x, "memPercent", value.asInstanceOf[js.Any])
    
    inline def setMemUsage(value: Double): Self = StObject.set(x, "memUsage", value.asInstanceOf[js.Any])
    
    inline def setMemoryStats(value: Any): Self = StObject.set(x, "memoryStats", value.asInstanceOf[js.Any])
    
    inline def setNetIO(value: Rx): Self = StObject.set(x, "netIO", value.asInstanceOf[js.Any])
    
    inline def setNetworks(value: Any): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setPids(value: Double): Self = StObject.set(x, "pids", value.asInstanceOf[js.Any])
    
    inline def setPrecpuStats(value: Any): Self = StObject.set(x, "precpuStats", value.asInstanceOf[js.Any])
    
    inline def setRestartCount(value: Double): Self = StObject.set(x, "restartCount", value.asInstanceOf[js.Any])
  }
}
