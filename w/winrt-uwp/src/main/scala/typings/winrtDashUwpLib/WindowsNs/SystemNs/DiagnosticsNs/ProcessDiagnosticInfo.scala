package typings
package winrtDashUwpLib.WindowsNs.SystemNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
@JSGlobal("Windows.System.Diagnostics.ProcessDiagnosticInfo")
@js.native
abstract class ProcessDiagnosticInfo () extends js.Object {
  /** Gets the CPU time used by the process. */
  var cpuUsage: ProcessCpuUsage = js.native
  /** Gets the disk I/O usage of the process. */
  var diskUsage: ProcessDiskUsage = js.native
  /** Gets the name of the executable file for the process. */
  var executableFileName: java.lang.String = js.native
  /** Get memory usage data for the process. */
  var memoryUsage: ProcessMemoryUsage = js.native
  /** Gets the ProcessDiagnosticInfo for the parent process. */
  var parent: ProcessDiagnosticInfo = js.native
  /** Gets the unique process ID. */
  var processId: scala.Double = js.native
  /** Gets the time the process was started. */
  var processStartTime: stdLib.Date = js.native
}

/** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
@JSGlobal("Windows.System.Diagnostics.ProcessDiagnosticInfo")
@js.native
object ProcessDiagnosticInfo extends js.Object {
  /**
                   * Gets the ProcessDiagnosticInfo for the currently running process.
                   * @return The ProcessDiagnosticInfo for the currently running process.
                   */
  def getForCurrentProcess(): winrtDashUwpLib.WindowsNs.SystemNs.DiagnosticsNs.ProcessDiagnosticInfo = js.native
  /**
                   * Gets a list of ProcessDiagnosticInfo objects for all running processes.
                   * @return A list of ProcessDiagnosticInfo objects for all running processes.
                   */
  def getForProcesses(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.SystemNs.DiagnosticsNs.ProcessDiagnosticInfo] = js.native
}

