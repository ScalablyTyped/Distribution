package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler
import typings.wonderFrp.distEs2015StreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StreamFromArrayStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/FromArrayStream", "FromArrayStream")
  @js.native
  open class FromArrayStream protected () extends BaseStream {
    def this(array: js.Array[Any], scheduler: Scheduler) = this()
    
    /* private */ var _array: Any = js.native
  }
  /* static members */
  object FromArrayStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/FromArrayStream", "FromArrayStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(array: js.Array[Any], scheduler: Scheduler): FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[FromArrayStream]
  }
}
