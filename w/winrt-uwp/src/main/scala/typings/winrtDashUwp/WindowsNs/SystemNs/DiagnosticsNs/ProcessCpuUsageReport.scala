package typings.winrtDashUwp.WindowsNs.SystemNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the CPU usage of the process. */
@JSGlobal("Windows.System.Diagnostics.ProcessCpuUsageReport")
@js.native
abstract class ProcessCpuUsageReport () extends js.Object {
  /** Gets the amount of CPU kernel time consumed by the process. */
  var kernelTime: Double = js.native
  /** Gets the amount of CPU user time consumed by the process. */
  var userTime: Double = js.native
}

