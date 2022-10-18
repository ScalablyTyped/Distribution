package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler
import typings.wonderFrp.distCommonjsStreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamIntervalStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/IntervalStream", "IntervalStream")
  @js.native
  open class IntervalStream protected () extends BaseStream {
    def this(interval: Double, scheduler: Scheduler) = this()
    
    /* private */ var _interval: Any = js.native
    
    def initWhenCreate(): Unit = js.native
  }
  /* static members */
  object IntervalStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/IntervalStream", "IntervalStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(interval: Double, scheduler: Scheduler): IntervalStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(interval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[IntervalStream]
  }
}
