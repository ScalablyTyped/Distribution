package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessesProcessData extends js.Object {
  
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
  implicit class ProcessesProcessDataOps[Self <: ProcessesProcessData] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMem_rss(value: Double): Self = this.set("mem_rss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMem_vsz(value: Double): Self = this.set("mem_vsz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNice(value: Double): Self = this.set("nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: String): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentPid(value: Double): Self = this.set("parentPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcpu(value: Double): Self = this.set("pcpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcpus(value: Double): Self = this.set("pcpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcpuu(value: Double): Self = this.set("pcpuu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPmem(value: Double): Self = this.set("pmem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: String): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTty(value: String): Self = this.set("tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
