package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessesProcessData extends StObject {
  
  var command: String
  
  var cpu: Double
  
  var cpus: Double
  
  var cpuu: Double
  
  var mem: Double
  
  var memRss: Double
  
  var memVsz: Double
  
  var name: String
  
  var nice: Double
  
  var params: String
  
  var parentPid: Double
  
  var path: String
  
  var pid: Double
  
  var priority: Double
  
  var started: String
  
  var state: String
  
  var tty: String
  
  var user: String
}
object ProcessesProcessData {
  
  inline def apply(
    command: String,
    cpu: Double,
    cpus: Double,
    cpuu: Double,
    mem: Double,
    memRss: Double,
    memVsz: Double,
    name: String,
    nice: Double,
    params: String,
    parentPid: Double,
    path: String,
    pid: Double,
    priority: Double,
    started: String,
    state: String,
    tty: String,
    user: String
  ): ProcessesProcessData = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], cpuu = cpuu.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], memRss = memRss.asInstanceOf[js.Any], memVsz = memVsz.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], parentPid = parentPid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesProcessData]
  }
  
  extension [Self <: ProcessesProcessData](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpus(value: Double): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setCpuu(value: Double): Self = StObject.set(x, "cpuu", value.asInstanceOf[js.Any])
    
    inline def setMem(value: Double): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setMemRss(value: Double): Self = StObject.set(x, "memRss", value.asInstanceOf[js.Any])
    
    inline def setMemVsz(value: Double): Self = StObject.set(x, "memVsz", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParentPid(value: Double): Self = StObject.set(x, "parentPid", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTty(value: String): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
