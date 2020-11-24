package typings.windowsProcessTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("windows-process-tree", "getProcessCpuUsage")
@js.native
object getProcessCpuUsage extends js.Object {
  
  def apply(
    processList: js.Array[ProcessInfo],
    callback: js.Function1[/* processListWithCpu */ js.Array[ProcessCpuInfo], Unit]
  ): Unit = js.native
}
