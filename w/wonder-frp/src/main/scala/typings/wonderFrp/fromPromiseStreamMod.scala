package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.schedulerMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromPromiseStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/FromPromiseStream", "FromPromiseStream")
  @js.native
  class FromPromiseStream protected () extends BaseStream {
    def this(promise: js.Any, scheduler: Scheduler) = this()
    
    /* private */ var _promise: js.Any = js.native
  }
  /* static members */
  object FromPromiseStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/FromPromiseStream", "FromPromiseStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(promise: js.Any, scheduler: Scheduler): FromPromiseStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(promise.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[FromPromiseStream]
  }
}
