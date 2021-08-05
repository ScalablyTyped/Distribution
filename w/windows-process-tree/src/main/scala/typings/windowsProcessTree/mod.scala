package typings.windowsProcessTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("windows-process-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ProcessDataFlag extends StObject
  @JSImport("windows-process-tree", "ProcessDataFlag")
  @js.native
  object ProcessDataFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProcessDataFlag & Double] = js.native
    
    @js.native
    sealed trait CommandLine
      extends StObject
         with ProcessDataFlag
    /* 2 */ val CommandLine: typings.windowsProcessTree.mod.ProcessDataFlag.CommandLine & Double = js.native
    
    @js.native
    sealed trait Memory
      extends StObject
         with ProcessDataFlag
    /* 1 */ val Memory: typings.windowsProcessTree.mod.ProcessDataFlag.Memory & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with ProcessDataFlag
    /* 0 */ val None: typings.windowsProcessTree.mod.ProcessDataFlag.None & Double = js.native
  }
  
  inline def getProcessCpuUsage(
    processList: js.Array[ProcessInfo],
    callback: js.Function1[/* processListWithCpu */ js.Array[ProcessCpuInfo], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProcessCpuUsage")(processList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getProcessList(rootPid: Double, callback: js.Function1[/* processList */ js.Array[ProcessInfo], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProcessList")(rootPid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getProcessList(
    rootPid: Double,
    callback: js.Function1[/* processList */ js.Array[ProcessInfo], Unit],
    flags: ProcessDataFlag
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProcessList")(rootPid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getProcessTree(rootPid: Double, callback: js.Function1[/* tree */ ProcessTreeNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProcessTree")(rootPid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getProcessTree(rootPid: Double, callback: js.Function1[/* tree */ ProcessTreeNode, Unit], flags: ProcessDataFlag): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProcessTree")(rootPid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ProcessCpuInfo
    extends StObject
       with ProcessInfo {
    
    var cpu: js.UndefOr[Double] = js.undefined
  }
  object ProcessCpuInfo {
    
    inline def apply(name: String, pid: Double, ppid: Double): ProcessCpuInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessCpuInfo]
    }
    
    extension [Self <: ProcessCpuInfo](x: Self) {
      
      inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    }
  }
  
  trait ProcessInfo extends StObject {
    
    /**
      * The string returned is at most 512 chars, strings exceeding this length are truncated.
      */
    var commandLine: js.UndefOr[String] = js.undefined
    
    /**
      * The working set size of the process, in bytes.
      */
    var memory: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var pid: Double
    
    var ppid: Double
  }
  object ProcessInfo {
    
    inline def apply(name: String, pid: Double, ppid: Double): ProcessInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessInfo]
    }
    
    extension [Self <: ProcessInfo](x: Self) {
      
      inline def setCommandLine(value: String): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
      
      inline def setCommandLineUndefined: Self = StObject.set(x, "commandLine", js.undefined)
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPpid(value: Double): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessTreeNode extends StObject {
    
    var children: js.Array[ProcessTreeNode]
    
    var commandLine: js.UndefOr[String] = js.undefined
    
    var memory: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var pid: Double
  }
  object ProcessTreeNode {
    
    inline def apply(children: js.Array[ProcessTreeNode], name: String, pid: Double): ProcessTreeNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessTreeNode]
    }
    
    extension [Self <: ProcessTreeNode](x: Self) {
      
      inline def setChildren(value: js.Array[ProcessTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ProcessTreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setCommandLine(value: String): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
      
      inline def setCommandLineUndefined: Self = StObject.set(x, "commandLine", js.undefined)
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    }
  }
}
