package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.schedulerMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeoutStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/TimeoutStream", "TimeoutStream")
  @js.native
  class TimeoutStream protected () extends BaseStream {
    def this(time: Double, scheduler: Scheduler) = this()
    
    var _time: js.Any = js.native
  }
  /* static members */
  object TimeoutStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/TimeoutStream", "TimeoutStream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(time: Double, scheduler: Scheduler): TimeoutStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[TimeoutStream]
  }
}
