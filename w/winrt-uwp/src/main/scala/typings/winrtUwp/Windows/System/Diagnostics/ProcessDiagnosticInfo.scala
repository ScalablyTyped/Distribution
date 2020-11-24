package typings.winrtUwp.Windows.System.Diagnostics

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
@js.native
trait ProcessDiagnosticInfo extends js.Object {
  
  /** Gets the CPU time used by the process. */
  var cpuUsage: ProcessCpuUsage = js.native
  
  /** Gets the disk I/O usage of the process. */
  var diskUsage: ProcessDiskUsage = js.native
  
  /** Gets the name of the executable file for the process. */
  var executableFileName: String = js.native
  
  /** Get memory usage data for the process. */
  var memoryUsage: ProcessMemoryUsage = js.native
  
  /** Gets the ProcessDiagnosticInfo for the parent process. */
  var parent: ProcessDiagnosticInfo = js.native
  
  /** Gets the unique process ID. */
  var processId: Double = js.native
  
  /** Gets the time the process was started. */
  var processStartTime: Date = js.native
}
object ProcessDiagnosticInfo {
  
  @scala.inline
  def apply(
    cpuUsage: ProcessCpuUsage,
    diskUsage: ProcessDiskUsage,
    executableFileName: String,
    memoryUsage: ProcessMemoryUsage,
    parent: ProcessDiagnosticInfo,
    processId: Double,
    processStartTime: Date
  ): ProcessDiagnosticInfo = {
    val __obj = js.Dynamic.literal(cpuUsage = cpuUsage.asInstanceOf[js.Any], diskUsage = diskUsage.asInstanceOf[js.Any], executableFileName = executableFileName.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], processStartTime = processStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessDiagnosticInfo]
  }
  
  @scala.inline
  implicit class ProcessDiagnosticInfoOps[Self <: ProcessDiagnosticInfo] (val x: Self) extends AnyVal {
    
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
    def setCpuUsage(value: ProcessCpuUsage): Self = this.set("cpuUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskUsage(value: ProcessDiskUsage): Self = this.set("diskUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutableFileName(value: String): Self = this.set("executableFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUsage(value: ProcessMemoryUsage): Self = this.set("memoryUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ProcessDiagnosticInfo): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessStartTime(value: Date): Self = this.set("processStartTime", value.asInstanceOf[js.Any])
  }
}
