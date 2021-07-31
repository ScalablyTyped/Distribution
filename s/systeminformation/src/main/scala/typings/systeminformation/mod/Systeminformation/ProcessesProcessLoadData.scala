package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessesProcessLoadData extends StObject {
  
  var cpu: Double
  
  var mem: Double
  
  var pid: Double
  
  var pids: js.Array[Double]
  
  var proc: String
}
object ProcessesProcessLoadData {
  
  @scala.inline
  def apply(cpu: Double, mem: Double, pid: Double, pids: js.Array[Double], proc: String): ProcessesProcessLoadData = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], proc = proc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesProcessLoadData]
  }
  
  @scala.inline
  implicit class ProcessesProcessLoadDataMutableBuilder[Self <: ProcessesProcessLoadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMem(value: Double): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPids(value: js.Array[Double]): Self = StObject.set(x, "pids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidsVarargs(value: Double*): Self = StObject.set(x, "pids", js.Array(value :_*))
    
    @scala.inline
    def setProc(value: String): Self = StObject.set(x, "proc", value.asInstanceOf[js.Any])
  }
}
