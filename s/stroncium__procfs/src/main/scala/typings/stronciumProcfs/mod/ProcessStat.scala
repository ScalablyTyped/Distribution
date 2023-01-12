package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessStat extends StObject {
  
  var blockIoTicks: Double
  
  var childGuestTicks: Double
  
  var childKernelTicks: Double
  
  var childMajorFaults: Double
  
  var childMinorFaults: Double
  
  var childUserTicks: Double
  
  var comm: String
  
  var exitSignal: Double
  
  var flags: Double
  
  var guestTicks: Double
  
  var kernelTicks: Double
  
  var lastCpu: Double
  
  var majorFaults: Double
  
  var minorFaults: Double
  
  var nice: Double
  
  var parent: Double
  
  var pid: Double
  
  var priority: Double
  
  var processGroup: Double
  
  var realtimePriority: Double
  
  var rss: Double
  
  var rssSoftLimit: Double
  
  var schedulingPolicy: Double
  
  var session: Double
  
  var startTicks: Double
  
  var state: ProcessState
  
  var terminalProcessGroup: Double
  
  var threads: Double
  
  var tty: Double
  
  var userTicks: Double
  
  var vsize: Double
}
object ProcessStat {
  
  inline def apply(
    blockIoTicks: Double,
    childGuestTicks: Double,
    childKernelTicks: Double,
    childMajorFaults: Double,
    childMinorFaults: Double,
    childUserTicks: Double,
    comm: String,
    exitSignal: Double,
    flags: Double,
    guestTicks: Double,
    kernelTicks: Double,
    lastCpu: Double,
    majorFaults: Double,
    minorFaults: Double,
    nice: Double,
    parent: Double,
    pid: Double,
    priority: Double,
    processGroup: Double,
    realtimePriority: Double,
    rss: Double,
    rssSoftLimit: Double,
    schedulingPolicy: Double,
    session: Double,
    startTicks: Double,
    state: ProcessState,
    terminalProcessGroup: Double,
    threads: Double,
    tty: Double,
    userTicks: Double,
    vsize: Double
  ): ProcessStat = {
    val __obj = js.Dynamic.literal(blockIoTicks = blockIoTicks.asInstanceOf[js.Any], childGuestTicks = childGuestTicks.asInstanceOf[js.Any], childKernelTicks = childKernelTicks.asInstanceOf[js.Any], childMajorFaults = childMajorFaults.asInstanceOf[js.Any], childMinorFaults = childMinorFaults.asInstanceOf[js.Any], childUserTicks = childUserTicks.asInstanceOf[js.Any], comm = comm.asInstanceOf[js.Any], exitSignal = exitSignal.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], guestTicks = guestTicks.asInstanceOf[js.Any], kernelTicks = kernelTicks.asInstanceOf[js.Any], lastCpu = lastCpu.asInstanceOf[js.Any], majorFaults = majorFaults.asInstanceOf[js.Any], minorFaults = minorFaults.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], processGroup = processGroup.asInstanceOf[js.Any], realtimePriority = realtimePriority.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any], rssSoftLimit = rssSoftLimit.asInstanceOf[js.Any], schedulingPolicy = schedulingPolicy.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], startTicks = startTicks.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], terminalProcessGroup = terminalProcessGroup.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], userTicks = userTicks.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessStat] (val x: Self) extends AnyVal {
    
    inline def setBlockIoTicks(value: Double): Self = StObject.set(x, "blockIoTicks", value.asInstanceOf[js.Any])
    
    inline def setChildGuestTicks(value: Double): Self = StObject.set(x, "childGuestTicks", value.asInstanceOf[js.Any])
    
    inline def setChildKernelTicks(value: Double): Self = StObject.set(x, "childKernelTicks", value.asInstanceOf[js.Any])
    
    inline def setChildMajorFaults(value: Double): Self = StObject.set(x, "childMajorFaults", value.asInstanceOf[js.Any])
    
    inline def setChildMinorFaults(value: Double): Self = StObject.set(x, "childMinorFaults", value.asInstanceOf[js.Any])
    
    inline def setChildUserTicks(value: Double): Self = StObject.set(x, "childUserTicks", value.asInstanceOf[js.Any])
    
    inline def setComm(value: String): Self = StObject.set(x, "comm", value.asInstanceOf[js.Any])
    
    inline def setExitSignal(value: Double): Self = StObject.set(x, "exitSignal", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGuestTicks(value: Double): Self = StObject.set(x, "guestTicks", value.asInstanceOf[js.Any])
    
    inline def setKernelTicks(value: Double): Self = StObject.set(x, "kernelTicks", value.asInstanceOf[js.Any])
    
    inline def setLastCpu(value: Double): Self = StObject.set(x, "lastCpu", value.asInstanceOf[js.Any])
    
    inline def setMajorFaults(value: Double): Self = StObject.set(x, "majorFaults", value.asInstanceOf[js.Any])
    
    inline def setMinorFaults(value: Double): Self = StObject.set(x, "minorFaults", value.asInstanceOf[js.Any])
    
    inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProcessGroup(value: Double): Self = StObject.set(x, "processGroup", value.asInstanceOf[js.Any])
    
    inline def setRealtimePriority(value: Double): Self = StObject.set(x, "realtimePriority", value.asInstanceOf[js.Any])
    
    inline def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
    
    inline def setRssSoftLimit(value: Double): Self = StObject.set(x, "rssSoftLimit", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPolicy(value: Double): Self = StObject.set(x, "schedulingPolicy", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Double): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setStartTicks(value: Double): Self = StObject.set(x, "startTicks", value.asInstanceOf[js.Any])
    
    inline def setState(value: ProcessState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTerminalProcessGroup(value: Double): Self = StObject.set(x, "terminalProcessGroup", value.asInstanceOf[js.Any])
    
    inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setTty(value: Double): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    inline def setUserTicks(value: Double): Self = StObject.set(x, "userTicks", value.asInstanceOf[js.Any])
    
    inline def setVsize(value: Double): Self = StObject.set(x, "vsize", value.asInstanceOf[js.Any])
  }
}
