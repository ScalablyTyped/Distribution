package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentLoadCpuData extends StObject {
  
  var load: Double
  
  var load_idle: Double
  
  var load_irq: Double
  
  var load_nice: Double
  
  var load_system: Double
  
  var load_user: Double
  
  var raw_load: Double
  
  var raw_load_idle: Double
  
  var raw_load_irq: Double
  
  var raw_load_nice: Double
  
  var raw_load_system: Double
  
  var raw_load_user: Double
}
object CurrentLoadCpuData {
  
  inline def apply(
    load: Double,
    load_idle: Double,
    load_irq: Double,
    load_nice: Double,
    load_system: Double,
    load_user: Double,
    raw_load: Double,
    raw_load_idle: Double,
    raw_load_irq: Double,
    raw_load_nice: Double,
    raw_load_system: Double,
    raw_load_user: Double
  ): CurrentLoadCpuData = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], load_idle = load_idle.asInstanceOf[js.Any], load_irq = load_irq.asInstanceOf[js.Any], load_nice = load_nice.asInstanceOf[js.Any], load_system = load_system.asInstanceOf[js.Any], load_user = load_user.asInstanceOf[js.Any], raw_load = raw_load.asInstanceOf[js.Any], raw_load_idle = raw_load_idle.asInstanceOf[js.Any], raw_load_irq = raw_load_irq.asInstanceOf[js.Any], raw_load_nice = raw_load_nice.asInstanceOf[js.Any], raw_load_system = raw_load_system.asInstanceOf[js.Any], raw_load_user = raw_load_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentLoadCpuData]
  }
  
  extension [Self <: CurrentLoadCpuData](x: Self) {
    
    inline def setLoad(value: Double): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoad_idle(value: Double): Self = StObject.set(x, "load_idle", value.asInstanceOf[js.Any])
    
    inline def setLoad_irq(value: Double): Self = StObject.set(x, "load_irq", value.asInstanceOf[js.Any])
    
    inline def setLoad_nice(value: Double): Self = StObject.set(x, "load_nice", value.asInstanceOf[js.Any])
    
    inline def setLoad_system(value: Double): Self = StObject.set(x, "load_system", value.asInstanceOf[js.Any])
    
    inline def setLoad_user(value: Double): Self = StObject.set(x, "load_user", value.asInstanceOf[js.Any])
    
    inline def setRaw_load(value: Double): Self = StObject.set(x, "raw_load", value.asInstanceOf[js.Any])
    
    inline def setRaw_load_idle(value: Double): Self = StObject.set(x, "raw_load_idle", value.asInstanceOf[js.Any])
    
    inline def setRaw_load_irq(value: Double): Self = StObject.set(x, "raw_load_irq", value.asInstanceOf[js.Any])
    
    inline def setRaw_load_nice(value: Double): Self = StObject.set(x, "raw_load_nice", value.asInstanceOf[js.Any])
    
    inline def setRaw_load_system(value: Double): Self = StObject.set(x, "raw_load_system", value.asInstanceOf[js.Any])
    
    inline def setRaw_load_user(value: Double): Self = StObject.set(x, "raw_load_user", value.asInstanceOf[js.Any])
  }
}
