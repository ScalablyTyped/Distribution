package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessesProcessData extends StObject {
  
  var command: String
  
  var mem_rss: Double
  
  var mem_vsz: Double
  
  var name: String
  
  var nice: Double
  
  var params: String
  
  var parentPid: Double
  
  var path: String
  
  var pcpu: Double
  
  var pcpus: Double
  
  var pcpuu: Double
  
  var pid: Double
  
  var pmem: Double
  
  var priority: Double
  
  var started: String
  
  var state: String
  
  var tty: String
  
  var user: String
}
object ProcessesProcessData {
  
  inline def apply(
    command: String,
    mem_rss: Double,
    mem_vsz: Double,
    name: String,
    nice: Double,
    params: String,
    parentPid: Double,
    path: String,
    pcpu: Double,
    pcpus: Double,
    pcpuu: Double,
    pid: Double,
    pmem: Double,
    priority: Double,
    started: String,
    state: String,
    tty: String,
    user: String
  ): ProcessesProcessData = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], mem_rss = mem_rss.asInstanceOf[js.Any], mem_vsz = mem_vsz.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], parentPid = parentPid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pcpu = pcpu.asInstanceOf[js.Any], pcpus = pcpus.asInstanceOf[js.Any], pcpuu = pcpuu.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pmem = pmem.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesProcessData]
  }
  
  extension [Self <: ProcessesProcessData](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setMem_rss(value: Double): Self = StObject.set(x, "mem_rss", value.asInstanceOf[js.Any])
    
    inline def setMem_vsz(value: Double): Self = StObject.set(x, "mem_vsz", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParentPid(value: Double): Self = StObject.set(x, "parentPid", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPcpu(value: Double): Self = StObject.set(x, "pcpu", value.asInstanceOf[js.Any])
    
    inline def setPcpus(value: Double): Self = StObject.set(x, "pcpus", value.asInstanceOf[js.Any])
    
    inline def setPcpuu(value: Double): Self = StObject.set(x, "pcpuu", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPmem(value: Double): Self = StObject.set(x, "pmem", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTty(value: String): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
