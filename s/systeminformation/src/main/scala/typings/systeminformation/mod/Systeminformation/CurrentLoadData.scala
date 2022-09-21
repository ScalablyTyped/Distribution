package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 7. Current Load, Processes & Services
trait CurrentLoadData extends StObject {
  
  var avgLoad: Double
  
  var cpus: js.Array[CurrentLoadCpuData]
  
  var currentLoad: Double
  
  var currentLoadIdle: Double
  
  var currentLoadIrq: Double
  
  var currentLoadNice: Double
  
  var currentLoadSystem: Double
  
  var currentLoadUser: Double
  
  var rawCurrentLoad: Double
  
  var rawCurrentLoadIdle: Double
  
  var rawCurrentLoadIrq: Double
  
  var rawCurrentLoadNice: Double
  
  var rawCurrentLoadSystem: Double
  
  var rawCurrentLoadUser: Double
}
object CurrentLoadData {
  
  inline def apply(
    avgLoad: Double,
    cpus: js.Array[CurrentLoadCpuData],
    currentLoad: Double,
    currentLoadIdle: Double,
    currentLoadIrq: Double,
    currentLoadNice: Double,
    currentLoadSystem: Double,
    currentLoadUser: Double,
    rawCurrentLoad: Double,
    rawCurrentLoadIdle: Double,
    rawCurrentLoadIrq: Double,
    rawCurrentLoadNice: Double,
    rawCurrentLoadSystem: Double,
    rawCurrentLoadUser: Double
  ): CurrentLoadData = {
    val __obj = js.Dynamic.literal(avgLoad = avgLoad.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], currentLoad = currentLoad.asInstanceOf[js.Any], currentLoadIdle = currentLoadIdle.asInstanceOf[js.Any], currentLoadIrq = currentLoadIrq.asInstanceOf[js.Any], currentLoadNice = currentLoadNice.asInstanceOf[js.Any], currentLoadSystem = currentLoadSystem.asInstanceOf[js.Any], currentLoadUser = currentLoadUser.asInstanceOf[js.Any], rawCurrentLoad = rawCurrentLoad.asInstanceOf[js.Any], rawCurrentLoadIdle = rawCurrentLoadIdle.asInstanceOf[js.Any], rawCurrentLoadIrq = rawCurrentLoadIrq.asInstanceOf[js.Any], rawCurrentLoadNice = rawCurrentLoadNice.asInstanceOf[js.Any], rawCurrentLoadSystem = rawCurrentLoadSystem.asInstanceOf[js.Any], rawCurrentLoadUser = rawCurrentLoadUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentLoadData]
  }
  
  extension [Self <: CurrentLoadData](x: Self) {
    
    inline def setAvgLoad(value: Double): Self = StObject.set(x, "avgLoad", value.asInstanceOf[js.Any])
    
    inline def setCpus(value: js.Array[CurrentLoadCpuData]): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setCpusVarargs(value: CurrentLoadCpuData*): Self = StObject.set(x, "cpus", js.Array(value*))
    
    inline def setCurrentLoad(value: Double): Self = StObject.set(x, "currentLoad", value.asInstanceOf[js.Any])
    
    inline def setCurrentLoadIdle(value: Double): Self = StObject.set(x, "currentLoadIdle", value.asInstanceOf[js.Any])
    
    inline def setCurrentLoadIrq(value: Double): Self = StObject.set(x, "currentLoadIrq", value.asInstanceOf[js.Any])
    
    inline def setCurrentLoadNice(value: Double): Self = StObject.set(x, "currentLoadNice", value.asInstanceOf[js.Any])
    
    inline def setCurrentLoadSystem(value: Double): Self = StObject.set(x, "currentLoadSystem", value.asInstanceOf[js.Any])
    
    inline def setCurrentLoadUser(value: Double): Self = StObject.set(x, "currentLoadUser", value.asInstanceOf[js.Any])
    
    inline def setRawCurrentLoad(value: Double): Self = StObject.set(x, "rawCurrentLoad", value.asInstanceOf[js.Any])
    
    inline def setRawCurrentLoadIdle(value: Double): Self = StObject.set(x, "rawCurrentLoadIdle", value.asInstanceOf[js.Any])
    
    inline def setRawCurrentLoadIrq(value: Double): Self = StObject.set(x, "rawCurrentLoadIrq", value.asInstanceOf[js.Any])
    
    inline def setRawCurrentLoadNice(value: Double): Self = StObject.set(x, "rawCurrentLoadNice", value.asInstanceOf[js.Any])
    
    inline def setRawCurrentLoadSystem(value: Double): Self = StObject.set(x, "rawCurrentLoadSystem", value.asInstanceOf[js.Any])
    
    inline def setRawCurrentLoadUser(value: Double): Self = StObject.set(x, "rawCurrentLoadUser", value.asInstanceOf[js.Any])
  }
}
