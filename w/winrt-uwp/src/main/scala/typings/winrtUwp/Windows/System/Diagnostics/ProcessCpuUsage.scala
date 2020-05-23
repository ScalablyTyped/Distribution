package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to data about the CPU usage of a process. */
trait ProcessCpuUsage extends js.Object {
  /**
    * Gets the ProcessCpuUsageReport for the process.
    * @return The CPU usage report for the process.
    */
  def getReport(): ProcessCpuUsageReport
}

object ProcessCpuUsage {
  @scala.inline
  def apply(getReport: () => ProcessCpuUsageReport): ProcessCpuUsage = {
    val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction0(getReport))
    __obj.asInstanceOf[ProcessCpuUsage]
  }
}

