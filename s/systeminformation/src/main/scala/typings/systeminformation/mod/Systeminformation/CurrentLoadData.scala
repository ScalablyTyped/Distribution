package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 7. Current Load, Processes & Services
@js.native
trait CurrentLoadData extends StObject {
  
  var avgload: Double = js.native
  
  var cpus: js.Array[CurrentLoadCpuData] = js.native
  
  var currentload: Double = js.native
  
  var currentload_idle: Double = js.native
  
  var currentload_irq: Double = js.native
  
  var currentload_nice: Double = js.native
  
  var currentload_system: Double = js.native
  
  var currentload_user: Double = js.native
  
  var raw_currentload: Double = js.native
  
  var raw_currentload_idle: Double = js.native
  
  var raw_currentload_irq: Double = js.native
  
  var raw_currentload_nice: Double = js.native
  
  var raw_currentload_system: Double = js.native
  
  var raw_currentload_user: Double = js.native
}
object CurrentLoadData {
  
  @scala.inline
  def apply(
    avgload: Double,
    cpus: js.Array[CurrentLoadCpuData],
    currentload: Double,
    currentload_idle: Double,
    currentload_irq: Double,
    currentload_nice: Double,
    currentload_system: Double,
    currentload_user: Double,
    raw_currentload: Double,
    raw_currentload_idle: Double,
    raw_currentload_irq: Double,
    raw_currentload_nice: Double,
    raw_currentload_system: Double,
    raw_currentload_user: Double
  ): CurrentLoadData = {
    val __obj = js.Dynamic.literal(avgload = avgload.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], currentload = currentload.asInstanceOf[js.Any], currentload_idle = currentload_idle.asInstanceOf[js.Any], currentload_irq = currentload_irq.asInstanceOf[js.Any], currentload_nice = currentload_nice.asInstanceOf[js.Any], currentload_system = currentload_system.asInstanceOf[js.Any], currentload_user = currentload_user.asInstanceOf[js.Any], raw_currentload = raw_currentload.asInstanceOf[js.Any], raw_currentload_idle = raw_currentload_idle.asInstanceOf[js.Any], raw_currentload_irq = raw_currentload_irq.asInstanceOf[js.Any], raw_currentload_nice = raw_currentload_nice.asInstanceOf[js.Any], raw_currentload_system = raw_currentload_system.asInstanceOf[js.Any], raw_currentload_user = raw_currentload_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentLoadData]
  }
  
  @scala.inline
  implicit class CurrentLoadDataMutableBuilder[Self <: CurrentLoadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvgload(value: Double): Self = StObject.set(x, "avgload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpus(value: js.Array[CurrentLoadCpuData]): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpusVarargs(value: CurrentLoadCpuData*): Self = StObject.set(x, "cpus", js.Array(value :_*))
    
    @scala.inline
    def setCurrentload(value: Double): Self = StObject.set(x, "currentload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_idle(value: Double): Self = StObject.set(x, "currentload_idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_irq(value: Double): Self = StObject.set(x, "currentload_irq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_nice(value: Double): Self = StObject.set(x, "currentload_nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_system(value: Double): Self = StObject.set(x, "currentload_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_user(value: Double): Self = StObject.set(x, "currentload_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload(value: Double): Self = StObject.set(x, "raw_currentload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_idle(value: Double): Self = StObject.set(x, "raw_currentload_idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_irq(value: Double): Self = StObject.set(x, "raw_currentload_irq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_nice(value: Double): Self = StObject.set(x, "raw_currentload_nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_system(value: Double): Self = StObject.set(x, "raw_currentload_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_user(value: Double): Self = StObject.set(x, "raw_currentload_user", value.asInstanceOf[js.Any])
  }
}
