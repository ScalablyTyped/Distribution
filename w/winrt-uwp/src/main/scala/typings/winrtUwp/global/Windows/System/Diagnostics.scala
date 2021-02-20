package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides diagnostic information about the system and running processes. */
object Diagnostics {
  
  /** Provides access to data about the CPU usage of a process. */
  @JSGlobal("Windows.System.Diagnostics.ProcessCpuUsage")
  @js.native
  abstract class ProcessCpuUsage ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsage
  
  /** Provides data about the CPU usage of the process. */
  @JSGlobal("Windows.System.Diagnostics.ProcessCpuUsageReport")
  @js.native
  abstract class ProcessCpuUsageReport ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessCpuUsageReport
  
  /** Provides diagnostic information about a process, such as CPU usage, disk usage, memory usage and so on. */
  @JSGlobal("Windows.System.Diagnostics.ProcessDiagnosticInfo")
  @js.native
  abstract class ProcessDiagnosticInfo ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo
  object ProcessDiagnosticInfo {
    
    /**
      * Gets the ProcessDiagnosticInfo for the currently running process.
      * @return The ProcessDiagnosticInfo for the currently running process.
      */
    /* static member */
    @JSGlobal("Windows.System.Diagnostics.ProcessDiagnosticInfo.getForCurrentProcess")
    @js.native
    def getForCurrentProcess(): typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo = js.native
    
    /**
      * Gets a list of ProcessDiagnosticInfo objects for all running processes.
      * @return A list of ProcessDiagnosticInfo objects for all running processes.
      */
    /* static member */
    @JSGlobal("Windows.System.Diagnostics.ProcessDiagnosticInfo.getForProcesses")
    @js.native
    def getForProcesses(): IVectorView[typings.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo] = js.native
  }
  
  /** Provides access to data about the disk usage of a process. */
  @JSGlobal("Windows.System.Diagnostics.ProcessDiskUsage")
  @js.native
  abstract class ProcessDiskUsage ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsage
  
  /** Provides data about the disk usage of the process. */
  @JSGlobal("Windows.System.Diagnostics.ProcessDiskUsageReport")
  @js.native
  abstract class ProcessDiskUsageReport ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessDiskUsageReport
  
  /** Provides access to data about the memory usage of a process. */
  @JSGlobal("Windows.System.Diagnostics.ProcessMemoryUsage")
  @js.native
  abstract class ProcessMemoryUsage ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsage
  
  /** Provides data about the memory usage of the process. */
  @JSGlobal("Windows.System.Diagnostics.ProcessMemoryUsageReport")
  @js.native
  abstract class ProcessMemoryUsageReport ()
    extends typings.winrtUwp.Windows.System.Diagnostics.ProcessMemoryUsageReport
}
