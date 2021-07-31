package typings.wonderFrp

import typings.wonderFrp.coreSchedulerMod.Scheduler
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamFromArrayStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/FromArrayStream", "FromArrayStream")
  @js.native
  class FromArrayStream protected () extends BaseStream {
    def this(array: js.Array[js.Any], scheduler: Scheduler) = this()
    
    var _array: js.Any = js.native
  }
  /* static members */
  object FromArrayStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/FromArrayStream", "FromArrayStream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(array: js.Array[js.Any], scheduler: Scheduler): FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[FromArrayStream]
  }
}
