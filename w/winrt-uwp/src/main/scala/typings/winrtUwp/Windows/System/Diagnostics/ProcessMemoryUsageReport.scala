package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the memory usage of the process. */
@js.native
trait ProcessMemoryUsageReport extends js.Object {
  /** Gets the amount of non-paged memory available to the process, in bytes. */
  var nonPagedPoolSizeInBytes: Double = js.native
  /** Gets the number of memory page faults. */
  var pageFaultCount: Double = js.native
  /** Gets the size of the memory page file in bytes. */
  var pageFileSizeInBytes: Double = js.native
  /** Gets the amount of paged memory available to the process, in bytes. */
  var pagedPoolSizeInBytes: Double = js.native
  /** Gets the maximum amount of non-paged memory used by the process, in bytes. */
  var peakNonPagedPoolSizeInBytes: Double = js.native
  /** Gets the maximum size of the memory page file used by the process, in bytes. */
  var peakPageFileSizeInBytes: Double = js.native
  /** Gets the maximum amount of paged memory used by the process, in bytes. */
  var peakPagedPoolSizeInBytes: Double = js.native
  /** Gets the maximum amount of virtual memory used by the associated process. */
  var peakVirtualMemorySizeInBytes: Double = js.native
  /** Gets the maximum amount of physical memory used by the associated process. */
  var peakWorkingSetSizeInBytes: Double = js.native
  /** Gets the number of private memory pages allocated for the associated process. */
  var privatePageCount: Double = js.native
  /** Gets the amount of the virtual memory allocated for the associated process. */
  var virtualMemorySizeInBytes: Double = js.native
  /** Gets the amount of physical memory allocated for the associated process. */
  var workingSetSizeInBytes: Double = js.native
}

object ProcessMemoryUsageReport {
  @scala.inline
  def apply(
    nonPagedPoolSizeInBytes: Double,
    pageFaultCount: Double,
    pageFileSizeInBytes: Double,
    pagedPoolSizeInBytes: Double,
    peakNonPagedPoolSizeInBytes: Double,
    peakPageFileSizeInBytes: Double,
    peakPagedPoolSizeInBytes: Double,
    peakVirtualMemorySizeInBytes: Double,
    peakWorkingSetSizeInBytes: Double,
    privatePageCount: Double,
    virtualMemorySizeInBytes: Double,
    workingSetSizeInBytes: Double
  ): ProcessMemoryUsageReport = {
    val __obj = js.Dynamic.literal(nonPagedPoolSizeInBytes = nonPagedPoolSizeInBytes.asInstanceOf[js.Any], pageFaultCount = pageFaultCount.asInstanceOf[js.Any], pageFileSizeInBytes = pageFileSizeInBytes.asInstanceOf[js.Any], pagedPoolSizeInBytes = pagedPoolSizeInBytes.asInstanceOf[js.Any], peakNonPagedPoolSizeInBytes = peakNonPagedPoolSizeInBytes.asInstanceOf[js.Any], peakPageFileSizeInBytes = peakPageFileSizeInBytes.asInstanceOf[js.Any], peakPagedPoolSizeInBytes = peakPagedPoolSizeInBytes.asInstanceOf[js.Any], peakVirtualMemorySizeInBytes = peakVirtualMemorySizeInBytes.asInstanceOf[js.Any], peakWorkingSetSizeInBytes = peakWorkingSetSizeInBytes.asInstanceOf[js.Any], privatePageCount = privatePageCount.asInstanceOf[js.Any], virtualMemorySizeInBytes = virtualMemorySizeInBytes.asInstanceOf[js.Any], workingSetSizeInBytes = workingSetSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMemoryUsageReport]
  }
  @scala.inline
  implicit class ProcessMemoryUsageReportOps[Self <: ProcessMemoryUsageReport] (val x: Self) extends AnyVal {
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
    def setNonPagedPoolSizeInBytes(value: Double): Self = this.set("nonPagedPoolSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageFaultCount(value: Double): Self = this.set("pageFaultCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageFileSizeInBytes(value: Double): Self = this.set("pageFileSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagedPoolSizeInBytes(value: Double): Self = this.set("pagedPoolSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeakNonPagedPoolSizeInBytes(value: Double): Self = this.set("peakNonPagedPoolSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeakPageFileSizeInBytes(value: Double): Self = this.set("peakPageFileSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeakPagedPoolSizeInBytes(value: Double): Self = this.set("peakPagedPoolSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeakVirtualMemorySizeInBytes(value: Double): Self = this.set("peakVirtualMemorySizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeakWorkingSetSizeInBytes(value: Double): Self = this.set("peakWorkingSetSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivatePageCount(value: Double): Self = this.set("privatePageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualMemorySizeInBytes(value: Double): Self = this.set("virtualMemorySizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkingSetSizeInBytes(value: Double): Self = this.set("workingSetSizeInBytes", value.asInstanceOf[js.Any])
  }
  
}

