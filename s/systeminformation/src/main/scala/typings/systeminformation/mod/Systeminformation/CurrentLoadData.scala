package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 7. Current Load, Processes & Services
@js.native
trait CurrentLoadData extends js.Object {
  
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
  implicit class CurrentLoadDataOps[Self <: CurrentLoadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvgload(value: Double): Self = this.set("avgload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpusVarargs(value: CurrentLoadCpuData*): Self = this.set("cpus", js.Array(value :_*))
    
    @scala.inline
    def setCpus(value: js.Array[CurrentLoadCpuData]): Self = this.set("cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload(value: Double): Self = this.set("currentload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_idle(value: Double): Self = this.set("currentload_idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_irq(value: Double): Self = this.set("currentload_irq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_nice(value: Double): Self = this.set("currentload_nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_system(value: Double): Self = this.set("currentload_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentload_user(value: Double): Self = this.set("currentload_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload(value: Double): Self = this.set("raw_currentload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_idle(value: Double): Self = this.set("raw_currentload_idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_irq(value: Double): Self = this.set("raw_currentload_irq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_nice(value: Double): Self = this.set("raw_currentload_nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_system(value: Double): Self = this.set("raw_currentload_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_currentload_user(value: Double): Self = this.set("raw_currentload_user", value.asInstanceOf[js.Any])
  }
}
