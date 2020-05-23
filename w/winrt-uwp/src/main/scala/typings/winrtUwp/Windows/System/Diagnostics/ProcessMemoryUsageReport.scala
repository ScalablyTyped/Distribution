package typings.winrtUwp.Windows.System.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the memory usage of the process. */
trait ProcessMemoryUsageReport extends js.Object {
  /** Gets the amount of non-paged memory available to the process, in bytes. */
  var nonPagedPoolSizeInBytes: Double
  /** Gets the number of memory page faults. */
  var pageFaultCount: Double
  /** Gets the size of the memory page file in bytes. */
  var pageFileSizeInBytes: Double
  /** Gets the amount of paged memory available to the process, in bytes. */
  var pagedPoolSizeInBytes: Double
  /** Gets the maximum amount of non-paged memory used by the process, in bytes. */
  var peakNonPagedPoolSizeInBytes: Double
  /** Gets the maximum size of the memory page file used by the process, in bytes. */
  var peakPageFileSizeInBytes: Double
  /** Gets the maximum amount of paged memory used by the process, in bytes. */
  var peakPagedPoolSizeInBytes: Double
  /** Gets the maximum amount of virtual memory used by the associated process. */
  var peakVirtualMemorySizeInBytes: Double
  /** Gets the maximum amount of physical memory used by the associated process. */
  var peakWorkingSetSizeInBytes: Double
  /** Gets the number of private memory pages allocated for the associated process. */
  var privatePageCount: Double
  /** Gets the amount of the virtual memory allocated for the associated process. */
  var virtualMemorySizeInBytes: Double
  /** Gets the amount of physical memory allocated for the associated process. */
  var workingSetSizeInBytes: Double
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
}

