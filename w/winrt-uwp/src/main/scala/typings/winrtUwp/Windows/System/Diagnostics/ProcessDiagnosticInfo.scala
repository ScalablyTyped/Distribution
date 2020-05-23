package typings.winrtUwp.Windows.System.Diagnostics

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
trait ProcessDiagnosticInfo extends js.Object {
  /** Gets the CPU time used by the process. */
  var cpuUsage: ProcessCpuUsage
  /** Gets the disk I/O usage of the process. */
  var diskUsage: ProcessDiskUsage
  /** Gets the name of the executable file for the process. */
  var executableFileName: String
  /** Get memory usage data for the process. */
  var memoryUsage: ProcessMemoryUsage
  /** Gets the ProcessDiagnosticInfo for the parent process. */
  var parent: ProcessDiagnosticInfo
  /** Gets the unique process ID. */
  var processId: Double
  /** Gets the time the process was started. */
  var processStartTime: Date
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
}

