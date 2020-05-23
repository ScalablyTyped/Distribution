package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the CPU usage of the process. */
trait ProcessCpuUsageReport extends js.Object {
  /** Gets the amount of CPU kernel time consumed by the process. */
  var kernelTime: Double
  /** Gets the amount of CPU user time consumed by the process. */
  var userTime: Double
}

object ProcessCpuUsageReport {
  @scala.inline
  def apply(kernelTime: Double, userTime: Double): ProcessCpuUsageReport = {
    val __obj = js.Dynamic.literal(kernelTime = kernelTime.asInstanceOf[js.Any], userTime = userTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessCpuUsageReport]
  }
}

