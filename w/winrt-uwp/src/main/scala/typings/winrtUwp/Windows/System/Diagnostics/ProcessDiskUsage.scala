package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to data about the disk usage of a process. */
@js.native
trait ProcessDiskUsage extends js.Object {
  /**
    * Gets the ProcessDiskUsageReport for the process.
    * @return The ProcessDiskUsageReport for the process.
    */
  def getReport(): ProcessDiskUsageReport = js.native
}

object ProcessDiskUsage {
  @scala.inline
  def apply(getReport: () => ProcessDiskUsageReport): ProcessDiskUsage = {
    val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction0(getReport))
    __obj.asInstanceOf[ProcessDiskUsage]
  }
  @scala.inline
  implicit class ProcessDiskUsageOps[Self <: ProcessDiskUsage] (val x: Self) extends AnyVal {
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
    def setGetReport(value: () => ProcessDiskUsageReport): Self = this.set("getReport", js.Any.fromFunction0(value))
  }
  
}

