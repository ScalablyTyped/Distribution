package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessesProcessData extends StObject {
  
  var command: String = js.native
  
  var mem_rss: Double = js.native
  
  var mem_vsz: Double = js.native
  
  var name: String = js.native
  
  var nice: Double = js.native
  
  var params: String = js.native
  
  var parentPid: Double = js.native
  
  var path: String = js.native
  
  var pcpu: Double = js.native
  
  var pcpus: Double = js.native
  
  var pcpuu: Double = js.native
  
  var pid: Double = js.native
  
  var pmem: Double = js.native
  
  var priority: Double = js.native
  
  var started: String = js.native
  
  var state: String = js.native
  
  var tty: String = js.native
  
  var user: String = js.native
}
object ProcessesProcessData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ProcessesProcessDataMutableBuilder[Self <: ProcessesProcessData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMem_rss(value: Double): Self = StObject.set(x, "mem_rss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMem_vsz(value: Double): Self = StObject.set(x, "mem_vsz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentPid(value: Double): Self = StObject.set(x, "parentPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcpu(value: Double): Self = StObject.set(x, "pcpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcpus(value: Double): Self = StObject.set(x, "pcpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcpuu(value: Double): Self = StObject.set(x, "pcpuu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPmem(value: Double): Self = StObject.set(x, "pmem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTty(value: String): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
