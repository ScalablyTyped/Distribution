package typings.winrtUwp.global.Windows.System

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides diagnostic information about the system and running processes. */
@JSGlobal("Windows.System.Diagnostics")
@js.native
object Diagnostics extends js.Object {
  /** Provides access to data about the CPU usage of a process. */
  @js.native
  abstract class ProcessCpuUsage ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsage {
    /**
      * Gets the ProcessCpuUsageReport for the process.
      * @return The CPU usage report for the process.
      */
    /* CompleteClass */
    override def getReport(): typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsageReport = js.native
  }
  
  /** Provides data about the CPU usage of the process. */
  @js.native
  abstract class ProcessCpuUsageReport ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsageReport {
    /** Gets the amount of CPU kernel time consumed by the process. */
    /* CompleteClass */
    override var kernelTime: Double = js.native
    /** Gets the amount of CPU user time consumed by the process. */
    /* CompleteClass */
    override var userTime: Double = js.native
  }
  
  /** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
  @js.native
  abstract class ProcessDiagnosticInfo ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo {
    /** Gets the CPU time used by the process. */
    /* CompleteClass */
    override var cpuUsage: typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsage = js.native
    /** Gets the disk I/O usage of the process. */
    /* CompleteClass */
    override var diskUsage: typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsage = js.native
    /** Gets the name of the executable file for the process. */
    /* CompleteClass */
    override var executableFileName: String = js.native
    /** Get memory usage data for the process. */
    /* CompleteClass */
    override var memoryUsage: typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsage = js.native
    /** Gets the ProcessDiagnosticInfo for the parent process. */
    /* CompleteClass */
    override var parent: typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo = js.native
    /** Gets the unique process ID. */
    /* CompleteClass */
    override var processId: Double = js.native
    /** Gets the time the process was started. */
    /* CompleteClass */
    override var processStartTime: Date = js.native
  }
  
  /** Provides access to data about the disk usage of a process. */
  @js.native
  abstract class ProcessDiskUsage ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsage {
    /**
      * Gets the ProcessDiskUsageReport for the process.
      * @return The ProcessDiskUsageReport for the process.
      */
    /* CompleteClass */
    override def getReport(): typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsageReport = js.native
  }
  
  /** Provides data about the disk usage of the process. */
  @js.native
  abstract class ProcessDiskUsageReport ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsageReport {
    /** Gets the number of bytes the process has read from disk. */
    /* CompleteClass */
    override var bytesReadCount: Double = js.native
    /** Gets the number of bytes the process has written to disk. */
    /* CompleteClass */
    override var bytesWrittenCount: Double = js.native
    /** Gets the number of bytes used by the process in disk operations that were not read or write operations. */
    /* CompleteClass */
    override var otherBytesCount: Double = js.native
    /** Gets the number of disk operations performed by the process that were not read or write operations. */
    /* CompleteClass */
    override var otherOperationCount: Double = js.native
    /** Gets the number of disk read operations performed by the process. */
    /* CompleteClass */
    override var readOperationCount: Double = js.native
    /** Gets the number of disk write operations performed by the process. */
    /* CompleteClass */
    override var writeOperationCount: Double = js.native
  }
  
  /** Provides access to data about the memory usage of a process. */
  @js.native
  abstract class ProcessMemoryUsage ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsage {
    /**
      * Gets the ProcessMemoryUsageReport for the process.
      * @return The ProcessMemoryUsageReport for the process.
      */
    /* CompleteClass */
    override def getReport(): typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsageReport = js.native
  }
  
  /** Provides data about the memory usage of the process. */
  @js.native
  abstract class ProcessMemoryUsageReport ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsageReport {
    /** Gets the amount of non-paged memory available to the process, in bytes. */
    /* CompleteClass */
    override var nonPagedPoolSizeInBytes: Double = js.native
    /** Gets the number of memory page faults. */
    /* CompleteClass */
    override var pageFaultCount: Double = js.native
    /** Gets the size of the memory page file in bytes. */
    /* CompleteClass */
    override var pageFileSizeInBytes: Double = js.native
    /** Gets the amount of paged memory available to the process, in bytes. */
    /* CompleteClass */
    override var pagedPoolSizeInBytes: Double = js.native
    /** Gets the maximum amount of non-paged memory used by the process, in bytes. */
    /* CompleteClass */
    override var peakNonPagedPoolSizeInBytes: Double = js.native
    /** Gets the maximum size of the memory page file used by the process, in bytes. */
    /* CompleteClass */
    override var peakPageFileSizeInBytes: Double = js.native
    /** Gets the maximum amount of paged memory used by the process, in bytes. */
    /* CompleteClass */
    override var peakPagedPoolSizeInBytes: Double = js.native
    /** Gets the maximum amount of virtual memory used by the associated process. */
    /* CompleteClass */
    override var peakVirtualMemorySizeInBytes: Double = js.native
    /** Gets the maximum amount of physical memory used by the associated process. */
    /* CompleteClass */
    override var peakWorkingSetSizeInBytes: Double = js.native
    /** Gets the number of private memory pages allocated for the associated process. */
    /* CompleteClass */
    override var privatePageCount: Double = js.native
    /** Gets the amount of the virtual memory allocated for the associated process. */
    /* CompleteClass */
    override var virtualMemorySizeInBytes: Double = js.native
    /** Gets the amount of physical memory allocated for the associated process. */
    /* CompleteClass */
    override var workingSetSizeInBytes: Double = js.native
  }
  
  /* static members */
  @js.native
  object ProcessDiagnosticInfo extends js.Object {
    /**
      * Gets the ProcessDiagnosticInfo for the currently running process.
      * @return The ProcessDiagnosticInfo for the currently running process.
      */
    def getForCurrentProcess(): typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo = js.native
    /**
      * Gets a list of ProcessDiagnosticInfo objects for all running processes.
      * @return A list of ProcessDiagnosticInfo objects for all running processes.
      */
    def getForProcesses(): IVectorView[typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo] = js.native
  }
  
}

