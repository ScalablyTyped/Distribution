package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler
import typings.wonderFrp.distCommonjsStreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamIntervalRequestStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/IntervalRequestStream", "IntervalRequestStream")
  @js.native
  open class IntervalRequestStream protected () extends BaseStream {
    def this(scheduler: Scheduler) = this()
    
    /* private */ var _isEnd: Any = js.native
  }
  /* static members */
  object IntervalRequestStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/IntervalRequestStream", "IntervalRequestStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(scheduler: Scheduler): IntervalRequestStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[IntervalRequestStream]
  }
}
