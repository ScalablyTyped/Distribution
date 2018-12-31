package typings
package winrtDashUwpLib.WindowsNs.SystemNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to data about the memory usage of a process. */
@JSGlobal("Windows.System.Diagnostics.ProcessMemoryUsage")
@js.native
abstract class ProcessMemoryUsage () extends js.Object {
  /**
    * Gets the ProcessMemoryUsageReport for the process.
    * @return The ProcessMemoryUsageReport for the process.
    */
  def getReport(): ProcessMemoryUsageReport = js.native
}

