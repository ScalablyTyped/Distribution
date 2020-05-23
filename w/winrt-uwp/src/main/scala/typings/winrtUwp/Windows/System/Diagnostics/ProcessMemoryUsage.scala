package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to data about the memory usage of a process. */
trait ProcessMemoryUsage extends js.Object {
  /**
    * Gets the ProcessMemoryUsageReport for the process.
    * @return The ProcessMemoryUsageReport for the process.
    */
  def getReport(): ProcessMemoryUsageReport
}

object ProcessMemoryUsage {
  @scala.inline
  def apply(getReport: () => ProcessMemoryUsageReport): ProcessMemoryUsage = {
    val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction0(getReport))
    __obj.asInstanceOf[ProcessMemoryUsage]
  }
}

