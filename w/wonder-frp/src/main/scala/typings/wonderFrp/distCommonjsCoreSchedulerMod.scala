package typings.wonderFrp

import typings.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCoreSchedulerMod {
  
  @JSImport("wonder-frp/dist/commonjs/core/Scheduler", "Scheduler")
  @js.native
  open class Scheduler () extends StObject {
    
    /* private */ var _requestLoopId: Any = js.native
    
    def publishInterval(observer: IObserver, initial: Any, interval: Double, action: js.Function): Double = js.native
    
    def publishIntervalRequest(observer: IObserver, action: js.Function): Unit = js.native
    
    def publishRecursive(observer: IObserver, initial: Any, action: js.Function): Unit = js.native
    
    def publishTimeout(observer: IObserver, time: Double, action: js.Function): Double = js.native
    
    var requestLoopId: Any = js.native
  }
  /* static members */
  object Scheduler {
    
    @JSImport("wonder-frp/dist/commonjs/core/Scheduler", "Scheduler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(args: Any*): Scheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Scheduler]
  }
}
