package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.ProcessesProcessLoadData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "processLoad")
@js.native
object processLoad extends js.Object {
  
  def apply(processName: String): js.Promise[ProcessesProcessLoadData] = js.native
  def apply(processName: String, cb: js.Function1[/* data */ ProcessesProcessLoadData, _]): js.Promise[ProcessesProcessLoadData] = js.native
}
