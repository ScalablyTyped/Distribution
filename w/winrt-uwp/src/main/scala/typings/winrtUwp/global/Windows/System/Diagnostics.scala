package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides diagnostic information about the system and running processes. */
object Diagnostics {
  
  /** Provides access to data about the CPU usage of a process. */
  /* note: abstract class */ @JSGlobal("Windows.System.Diagnostics.ProcessCpuUsage")
  @js.native
  open class ProcessCpuUsage ()
    extends StObject
       with typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsage {
    
    /**
      * Gets the ProcessCpuUsageReport for the process.
      * @return The CPU usage report for the process.
      */
    /* CompleteClass */
    override def getReport(): typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsageReport = js.native
  }
  
  /** Provides data about the CPU usage of the process. */
  /* note: abstract class */ @JSGlobal("Windows.System.Diagnostics.ProcessCpuUsageReport")
  @js.native
  open class ProcessCpuUsageReport ()
    extends StObject
       with typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsageReport {
    
    /** Gets the amount of CPU kernel time consumed by the process. */
    /* CompleteClass */
    var kernelTime: Double = js.native
    
    /** Gets the amount of CPU user time consumed by the process. */
    /* CompleteClass */
    var userTime: Double = js.native
  }
  
  /** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
  /* note: abstract class */ @JSGlobal("Windows.System.Diagnostics.ProcessDiagnosticInfo")
  @js.native
  open class ProcessDiagnosticInfo ()
    extends StObject
       with typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo {
    
    /** Gets the CPU time used by the process. */
    /* CompleteClass */
    var cpuUsage: typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsage = js.native
    
    /** Gets the disk I/O usage of the process. */
    /* CompleteClass */
    var diskUsage: typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsage = js.native
    
    /** Gets the name of the executable file for the process. */
    /* CompleteClass */
    var executableFileName: String = js.native
    
    /** Get memory usage data for the process. */
    /* CompleteClass */
    var memoryUsage: typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsage = js.native
    
    /** Gets the ProcessDiagnosticInfo for the parent process. */
    /* CompleteClass */
    var parent: typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo = js.native
    
    /** Gets the unique process ID. */
    /* CompleteClass */
    var processId: Double = js.native
    
    /** Gets the time the process was started. */
    /* CompleteClass */
    var processStartTime: js.Date = js.native
  }
  object ProcessDiagnosticInfo {
    
    @JSGlobal("Windows.System.Diagnostics.ProcessDiagnosticInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the ProcessDiagnosticInfo for the currently running process.
      * @return The ProcessDiagnosticInfo for the currently running process.
      */
    /* static member */
    inline def getForCurrentProcess(): typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentProcess")().asInstanceOf[typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo]
    
    /**
      * Gets a list of ProcessDiagnosticInfo objects for all running processes.
      * @return A list of ProcessDiagnosticInfo objects for all running processes.
      */
    /* static member */
    inline def getForProcesses(): IVectorView[typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getForProcesses")().asInstanceOf[IVectorView[typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo]]
  }
  
  /** Provides access to data about the disk usage of a process. */
  /* note: abstract class */ @JSGlobal("Windows.System.Diagnostics.ProcessDiskUsage")
  @js.native
  open class ProcessDiskUsage ()
    extends StObject
       with typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsage {
    
    /**
      * Gets the ProcessDiskUsageReport for the process.
      * @return The ProcessDiskUsageReport for the process.
      */
    /* CompleteClass */
    override def getReport(): typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsageReport = js.native
  }
  
  /** Provides data about the disk usage of the process. */
  /* note: abstract class */ @JSGlobal("Windows.System.Diagnostics.ProcessDiskUsageReport")
  @js.native
  open class ProcessDiskUsageReport ()
    extends StObject
       with typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsageReport {
    
    /** Gets the number of bytes the process has read from disk. */
    /* CompleteClass */
    var bytesReadCount: Double = js.native
    
    /** Gets the number of bytes the process has written to disk. */
    /* CompleteClass */
    var bytesWrittenCount: Double = js.native
    
    /** Gets the number of bytes used by the process in disk operations that were not read or write operations. */
    /* CompleteClass */
    var otherBytesCount: Double = js.native
    
    /** Gets the number of disk operations performed by the process that were not read or write operations. */
    /* CompleteClass */
    var otherOperationCount: Double = js.native
    
    /** Gets the number of disk read operations performed by the process. */
    /* CompleteClass */
    var readOperationCount: Double = js.native
    
    /** Gets the number of disk write operations performed by the process. */
    /* CompleteClass */
    var writeOperationCount: Double = js.native
  }
  
  /** Provides access to data about the memory usage of a process. */
  /* note: abstract class */ @JSGlobal("Windows.System.Diagnostics.ProcessMemoryUsage")
  @js.native
  open class ProcessMemoryUsage ()
    extends StObject
       with typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsage {
    
    /**
      * Gets the ProcessMemoryUsageReport for the process.
      * @return The ProcessMemoryUsageReport for the process.
      */
    /* CompleteClass */
    override def getReport(): typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsageReport = js.native
  }
  
  /** Provides data about the memory usage of the process. */
  /* note: abstract class */ @JSGlobal("Windows.System.Diagnostics.ProcessMemoryUsageReport")
  @js.native
  open class ProcessMemoryUsageReport ()
    extends StObject
       with typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsageReport {
    
    /** Gets the amount of non-paged memory available to the process, in bytes. */
    /* CompleteClass */
    var nonPagedPoolSizeInBytes: Double = js.native
    
    /** Gets the number of memory page faults. */
    /* CompleteClass */
    var pageFaultCount: Double = js.native
    
    /** Gets the size of the memory page file in bytes. */
    /* CompleteClass */
    var pageFileSizeInBytes: Double = js.native
    
    /** Gets the amount of paged memory available to the process, in bytes. */
    /* CompleteClass */
    var pagedPoolSizeInBytes: Double = js.native
    
    /** Gets the maximum amount of non-paged memory used by the process, in bytes. */
    /* CompleteClass */
    var peakNonPagedPoolSizeInBytes: Double = js.native
    
    /** Gets the maximum size of the memory page file used by the process, in bytes. */
    /* CompleteClass */
    var peakPageFileSizeInBytes: Double = js.native
    
    /** Gets the maximum amount of paged memory used by the process, in bytes. */
    /* CompleteClass */
    var peakPagedPoolSizeInBytes: Double = js.native
    
    /** Gets the maximum amount of virtual memory used by the associated process. */
    /* CompleteClass */
    var peakVirtualMemorySizeInBytes: Double = js.native
    
    /** Gets the maximum amount of physical memory used by the associated process. */
    /* CompleteClass */
    var peakWorkingSetSizeInBytes: Double = js.native
    
    /** Gets the number of private memory pages allocated for the associated process. */
    /* CompleteClass */
    var privatePageCount: Double = js.native
    
    /** Gets the amount of the virtual memory allocated for the associated process. */
    /* CompleteClass */
    var virtualMemorySizeInBytes: Double = js.native
    
    /** Gets the amount of physical memory allocated for the associated process. */
    /* CompleteClass */
    var workingSetSizeInBytes: Double = js.native
  }
}
