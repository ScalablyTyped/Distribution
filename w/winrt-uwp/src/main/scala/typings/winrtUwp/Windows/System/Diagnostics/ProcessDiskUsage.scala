package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to data about the disk usage of a process. */
trait ProcessDiskUsage extends js.Object {
  /**
    * Gets the ProcessDiskUsageReport for the process.
    * @return The ProcessDiskUsageReport for the process.
    */
  def getReport(): ProcessDiskUsageReport
}

object ProcessDiskUsage {
  @scala.inline
  def apply(getReport: () => ProcessDiskUsageReport): ProcessDiskUsage = {
    val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction0(getReport))
    __obj.asInstanceOf[ProcessDiskUsage]
  }
}

