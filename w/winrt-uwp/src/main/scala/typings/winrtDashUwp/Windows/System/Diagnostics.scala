package typings.winrtDashUwp.Windows.System

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides diagnostic information about the system and running processes. */
@JSGlobal("Windows.System.Diagnostics")
@js.native
object Diagnostics extends js.Object {
  /** Provides access to data about the CPU usage of a process. */
  @js.native
  abstract class ProcessCpuUsage () extends js.Object {
    /**
      * Gets the ProcessCpuUsageReport for the process.
      * @return The CPU usage report for the process.
      */
    def getReport(): ProcessCpuUsageReport = js.native
  }
  
  /** Provides data about the CPU usage of the process. */
  @js.native
  abstract class ProcessCpuUsageReport () extends js.Object {
    /** Gets the amount of CPU kernel time consumed by the process. */
    var kernelTime: Double = js.native
    /** Gets the amount of CPU user time consumed by the process. */
    var userTime: Double = js.native
  }
  
  /** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
  @js.native
  abstract class ProcessDiagnosticInfo () extends js.Object {
    /** Gets the CPU time used by the process. */
    var cpuUsage: ProcessCpuUsage = js.native
    /** Gets the disk I/O usage of the process. */
    var diskUsage: ProcessDiskUsage = js.native
    /** Gets the name of the executable file for the process. */
    var executableFileName: String = js.native
    /** Get memory usage data for the process. */
    var memoryUsage: ProcessMemoryUsage = js.native
    /** Gets the ProcessDiagnosticInfo for the parent process. */
    var parent: ProcessDiagnosticInfo = js.native
    /** Gets the unique process ID. */
    var processId: Double = js.native
    /** Gets the time the process was started. */
    var processStartTime: Date = js.native
  }
  
  /** Provides access to data about the disk usage of a process. */
  @js.native
  abstract class ProcessDiskUsage () extends js.Object {
    /**
      * Gets the ProcessDiskUsageReport for the process.
      * @return The ProcessDiskUsageReport for the process.
      */
    def getReport(): ProcessDiskUsageReport = js.native
  }
  
  /** Provides data about the disk usage of the process. */
  @js.native
  abstract class ProcessDiskUsageReport () extends js.Object {
    /** Gets the number of bytes the process has read from disk. */
    var bytesReadCount: Double = js.native
    /** Gets the number of bytes the process has written to disk. */
    var bytesWrittenCount: Double = js.native
    /** Gets the number of bytes used by the process in disk operations that were not read or write operations. */
    var otherBytesCount: Double = js.native
    /** Gets the number of disk operations performed by the process that were not read or write operations. */
    var otherOperationCount: Double = js.native
    /** Gets the number of disk read operations performed by the process. */
    var readOperationCount: Double = js.native
    /** Gets the number of disk write operations performed by the process. */
    var writeOperationCount: Double = js.native
  }
  
  /** Provides access to data about the memory usage of a process. */
  @js.native
  abstract class ProcessMemoryUsage () extends js.Object {
    /**
      * Gets the ProcessMemoryUsageReport for the process.
      * @return The ProcessMemoryUsageReport for the process.
      */
    def getReport(): ProcessMemoryUsageReport = js.native
  }
  
  /** Provides data about the memory usage of the process. */
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
  
  /* static members */
  @js.native
  object ProcessDiagnosticInfo extends js.Object {
    /**
      * Gets the ProcessDiagnosticInfo for the currently running process.
      * @return The ProcessDiagnosticInfo for the currently running process.
      */
    def getForCurrentProcess(): ProcessDiagnosticInfo = js.native
    /**
      * Gets a list of ProcessDiagnosticInfo objects for all running processes.
      * @return A list of ProcessDiagnosticInfo objects for all running processes.
      */
    def getForProcesses(): IVectorView[ProcessDiagnosticInfo] = js.native
  }
  
}

