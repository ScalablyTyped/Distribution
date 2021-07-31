package typings.wonderFrp

import typings.wonderFrp.coreSchedulerMod.Scheduler
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamIntervalStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/IntervalStream", "IntervalStream")
  @js.native
  class IntervalStream protected () extends BaseStream {
    def this(interval: Double, scheduler: Scheduler) = this()
    
    var _interval: js.Any = js.native
    
    def initWhenCreate(): Unit = js.native
  }
  /* static members */
  object IntervalStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/IntervalStream", "IntervalStream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(interval: Double, scheduler: Scheduler): IntervalStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(interval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[IntervalStream]
  }
}
