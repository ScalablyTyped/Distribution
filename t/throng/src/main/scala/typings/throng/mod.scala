package typings.throng

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("throng", JSImport.Namespace)
  @js.native
  def apply(startOrOptions: Options): Unit = js.native
  @JSImport("throng", JSImport.Namespace)
  @js.native
  def apply(startOrOptions: ProcessCallback): Unit = js.native
  @JSImport("throng", JSImport.Namespace)
  @js.native
  def apply(workers: WorkerCount, start: ProcessCallback): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
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
