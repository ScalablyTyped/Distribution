package typings
package winrtDashUwpLib.WindowsNs.SystemNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to data about the CPU usage of a process. */
@JSGlobal("Windows.System.Diagnostics.ProcessCpuUsage")
@js.native
abstract class ProcessCpuUsage () extends js.Object {
  /**
                   * Gets the ProcessCpuUsageReport for the process.
                   * @return The CPU usage report for the process.
                   */
  def getReport(): ProcessCpuUsageReport = js.native
}

