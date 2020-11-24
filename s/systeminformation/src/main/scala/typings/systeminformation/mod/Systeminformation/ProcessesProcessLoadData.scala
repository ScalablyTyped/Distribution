package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessesProcessLoadData extends js.Object {
  
  var cpu: Double = js.native
  
  var mem: Double = js.native
  
  var pid: Double = js.native
  
  var pids: js.Array[Double] = js.native
  
  var proc: String = js.native
}
object ProcessesProcessLoadData {
  
  @scala.inline
  def apply(cpu: Double, mem: Double, pid: Double, pids: js.Array[Double], proc: String): ProcessesProcessLoadData = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], proc = proc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesProcessLoadData]
  }
  
  @scala.inline
  implicit class ProcessesProcessLoadDataOps[Self <: ProcessesProcessLoadData] (val x: Self) extends AnyVal {
    
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
    def setCpu(value: Double): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMem(value: Double): Self = this.set("mem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidsVarargs(value: Double*): Self = this.set("pids", js.Array(value :_*))
    
    @scala.inline
    def setPids(value: js.Array[Double]): Self = this.set("pids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProc(value: String): Self = this.set("proc", value.asInstanceOf[js.Any])
  }
}
