package typings.throng

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("throng", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(startOrOptions: Options): Unit = js.native
  def apply(startOrOptions: ProcessCallback): Unit = js.native
  def apply(workers: WorkerCount, start: ProcessCallback): Unit = js.native
  
  @js.native
  trait Options extends js.Object {
    
    var grace: js.UndefOr[Double] = js.native
    
    var lifetime: js.UndefOr[Double] = js.native
    
    var master: js.UndefOr[ProcessCallback] = js.native
    
    def start(id: Double): js.Any = js.native
    @JSName("start")
    var start_Original: ProcessCallback = js.native
    
    var workers: js.UndefOr[WorkerCount] = js.native
  }
  
  type ProcessCallback = js.Function1[/* id */ Double, js.Any]
  
  type WorkerCount = Double | String
}
