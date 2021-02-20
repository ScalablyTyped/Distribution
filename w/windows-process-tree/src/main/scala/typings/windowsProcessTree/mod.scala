package typings.windowsProcessTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait ProcessDataFlag extends StObject
  @JSImport("windows-process-tree", "ProcessDataFlag")
  @js.native
  object ProcessDataFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProcessDataFlag with Double] = js.native
    
    @js.native
    sealed trait CommandLine extends ProcessDataFlag
    /* 2 */ val CommandLine: typings.windowsProcessTree.mod.ProcessDataFlag.CommandLine with Double = js.native
    
    @js.native
    sealed trait Memory extends ProcessDataFlag
    /* 1 */ val Memory: typings.windowsProcessTree.mod.ProcessDataFlag.Memory with Double = js.native
    
    @js.native
    sealed trait None extends ProcessDataFlag
    /* 0 */ val None: typings.windowsProcessTree.mod.ProcessDataFlag.None with Double = js.native
  }
  
  @JSImport("windows-process-tree", "getProcessCpuUsage")
  @js.native
  def getProcessCpuUsage(
    processList: js.Array[ProcessInfo],
    callback: js.Function1[/* processListWithCpu */ js.Array[ProcessCpuInfo], Unit]
  ): Unit = js.native
  
  @JSImport("windows-process-tree", "getProcessList")
  @js.native
  def getProcessList(rootPid: Double, callback: js.Function1[/* processList */ js.Array[ProcessInfo], Unit]): Unit = js.native
  @JSImport("windows-process-tree", "getProcessList")
  @js.native
  def getProcessList(
    rootPid: Double,
    callback: js.Function1[/* processList */ js.Array[ProcessInfo], Unit],
    flags: ProcessDataFlag
  ): Unit = js.native
  
  @JSImport("windows-process-tree", "getProcessTree")
  @js.native
  def getProcessTree(rootPid: Double, callback: js.Function1[/* tree */ ProcessTreeNode, Unit]): Unit = js.native
  @JSImport("windows-process-tree", "getProcessTree")
  @js.native
  def getProcessTree(rootPid: Double, callback: js.Function1[/* tree */ ProcessTreeNode, Unit], flags: ProcessDataFlag): Unit = js.native
  
  @js.native
  trait ProcessCpuInfo extends ProcessInfo {
    
    var cpu: js.UndefOr[Double] = js.native
  }
  object ProcessCpuInfo {
    
    @scala.inline
    def apply(name: String, pid: Double, ppid: Double): ProcessCpuInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessCpuInfo]
    }
    
    @scala.inline
    implicit class ProcessCpuInfoMutableBuilder[Self <: ProcessCpuInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    }
  }
  
  @js.native
  trait ProcessInfo extends StObject {
    
    /**
      * The string returned is at most 512 chars, strings exceeding this length are truncated.
      */
    var commandLine: js.UndefOr[String] = js.native
    
    /**
      * The working set size of the process, in bytes.
      */
    var memory: js.UndefOr[Double] = js.native
    
    var name: String = js.native
    
    var pid: Double = js.native
    
    var ppid: Double = js.native
  }
  object ProcessInfo {
    
    @scala.inline
    def apply(name: String, pid: Double, ppid: Double): ProcessInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessInfo]
    }
    
    @scala.inline
    implicit class ProcessInfoMutableBuilder[Self <: ProcessInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommandLine(value: String): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandLineUndefined: Self = StObject.set(x, "commandLine", js.undefined)
      
      @scala.inline
      def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPpid(value: Double): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProcessTreeNode extends StObject {
    
    var children: js.Array[ProcessTreeNode] = js.native
    
    var commandLine: js.UndefOr[String] = js.native
    
    var memory: js.UndefOr[Double] = js.native
    
    var name: String = js.native
    
    var pid: Double = js.native
  }
  object ProcessTreeNode {
    
    @scala.inline
    def apply(children: js.Array[ProcessTreeNode], name: String, pid: Double): ProcessTreeNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessTreeNode]
    }
    
    @scala.inline
    implicit class ProcessTreeNodeMutableBuilder[Self <: ProcessTreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ProcessTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ProcessTreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCommandLine(value: String): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandLineUndefined: Self = StObject.set(x, "commandLine", js.undefined)
      
      @scala.inline
      def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    }
  }
}
