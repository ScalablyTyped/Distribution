package typings
package winrtDashUwpLib.WindowsNs.SystemNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to data about the disk usage of a process. */
@JSGlobal("Windows.System.Diagnostics.ProcessDiskUsage")
@js.native
abstract class ProcessDiskUsage () extends js.Object {
  /**
                   * Gets the ProcessDiskUsageReport for the process.
                   * @return The ProcessDiskUsageReport for the process.
                   */
  def getReport(): ProcessDiskUsageReport = js.native
}

