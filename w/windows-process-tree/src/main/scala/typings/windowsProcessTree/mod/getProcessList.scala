package typings.windowsProcessTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("windows-process-tree", "getProcessList")
@js.native
object getProcessList extends js.Object {
  
  def apply(rootPid: Double, callback: js.Function1[/* processList */ js.Array[ProcessInfo], Unit]): Unit = js.native
  def apply(
    rootPid: Double,
    callback: js.Function1[/* processList */ js.Array[ProcessInfo], Unit],
    flags: ProcessDataFlag
  ): Unit = js.native
}
