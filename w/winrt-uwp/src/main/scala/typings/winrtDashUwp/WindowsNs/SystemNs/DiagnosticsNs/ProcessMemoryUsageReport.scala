package typings.winrtDashUwp.WindowsNs.SystemNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the memory usage of the process. */
@JSGlobal("Windows.System.Diagnostics.ProcessMemoryUsageReport")
@js.native
abstract class ProcessMemoryUsageReport () extends js.Object {
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

