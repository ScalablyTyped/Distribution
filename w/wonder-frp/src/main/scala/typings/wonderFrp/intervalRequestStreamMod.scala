package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.schedulerMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalRequestStreamMod {
  
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
