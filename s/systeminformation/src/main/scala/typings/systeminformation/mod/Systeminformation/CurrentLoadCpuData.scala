package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentLoadCpuData extends StObject {
  
  var load: Double
  
  var loadIdle: Double
  
  var loadIrq: Double
  
  var loadNice: Double
  
  var loadSystem: Double
  
  var loadUser: Double
  
  var rawLoad: Double
  
  var rawLoadIdle: Double
  
  var rawLoadIrq: Double
  
  var rawLoadNice: Double
  
  var rawLoadSystem: Double
  
  var rawLoadUser: Double
}
object CurrentLoadCpuData {
  
  inline def apply(
    load: Double,
    loadIdle: Double,
    loadIrq: Double,
    loadNice: Double,
    loadSystem: Double,
    loadUser: Double,
    rawLoad: Double,
    rawLoadIdle: Double,
    rawLoadIrq: Double,
    rawLoadNice: Double,
    rawLoadSystem: Double,
    rawLoadUser: Double
  ): CurrentLoadCpuData = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], loadIdle = loadIdle.asInstanceOf[js.Any], loadIrq = loadIrq.asInstanceOf[js.Any], loadNice = loadNice.asInstanceOf[js.Any], loadSystem = loadSystem.asInstanceOf[js.Any], loadUser = loadUser.asInstanceOf[js.Any], rawLoad = rawLoad.asInstanceOf[js.Any], rawLoadIdle = rawLoadIdle.asInstanceOf[js.Any], rawLoadIrq = rawLoadIrq.asInstanceOf[js.Any], rawLoadNice = rawLoadNice.asInstanceOf[js.Any], rawLoadSystem = rawLoadSystem.asInstanceOf[js.Any], rawLoadUser = rawLoadUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentLoadCpuData]
  }
  
  extension [Self <: CurrentLoadCpuData](x: Self) {
    
    inline def setLoad(value: Double): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadIdle(value: Double): Self = StObject.set(x, "loadIdle", value.asInstanceOf[js.Any])
    
    inline def setLoadIrq(value: Double): Self = StObject.set(x, "loadIrq", value.asInstanceOf[js.Any])
    
    inline def setLoadNice(value: Double): Self = StObject.set(x, "loadNice", value.asInstanceOf[js.Any])
    
    inline def setLoadSystem(value: Double): Self = StObject.set(x, "loadSystem", value.asInstanceOf[js.Any])
    
    inline def setLoadUser(value: Double): Self = StObject.set(x, "loadUser", value.asInstanceOf[js.Any])
    
    inline def setRawLoad(value: Double): Self = StObject.set(x, "rawLoad", value.asInstanceOf[js.Any])
    
    inline def setRawLoadIdle(value: Double): Self = StObject.set(x, "rawLoadIdle", value.asInstanceOf[js.Any])
    
    inline def setRawLoadIrq(value: Double): Self = StObject.set(x, "rawLoadIrq", value.asInstanceOf[js.Any])
    
    inline def setRawLoadNice(value: Double): Self = StObject.set(x, "rawLoadNice", value.asInstanceOf[js.Any])
    
    inline def setRawLoadSystem(value: Double): Self = StObject.set(x, "rawLoadSystem", value.asInstanceOf[js.Any])
    
    inline def setRawLoadUser(value: Double): Self = StObject.set(x, "rawLoadUser", value.asInstanceOf[js.Any])
  }
}
