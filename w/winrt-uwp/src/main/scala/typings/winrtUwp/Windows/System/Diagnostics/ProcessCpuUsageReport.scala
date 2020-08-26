package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the CPU usage of the process. */
@js.native
trait ProcessCpuUsageReport extends js.Object {
  /** Gets the amount of CPU kernel time consumed by the process. */
  var kernelTime: Double = js.native
  /** Gets the amount of CPU user time consumed by the process. */
  var userTime: Double = js.native
}

object ProcessCpuUsageReport {
  @scala.inline
  def apply(kernelTime: Double, userTime: Double): ProcessCpuUsageReport = {
    val __obj = js.Dynamic.literal(kernelTime = kernelTime.asInstanceOf[js.Any], userTime = userTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessCpuUsageReport]
  }
  @scala.inline
  implicit class ProcessCpuUsageReportOps[Self <: ProcessCpuUsageReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKernelTime(value: Double): Self = this.set("kernelTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserTime(value: Double): Self = this.set("userTime", value.asInstanceOf[js.Any])
  }
  
}

