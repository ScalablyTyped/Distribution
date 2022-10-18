package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FromArrayStream")
@js.native
open class FromArrayStream protected ()
  extends typings.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream {
  def this(array: js.Array[Any], scheduler: typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler) = this()
}
/* static members */
object FromArrayStream {
  
  @JSImport("wonder-frp/dist/commonjs", "FromArrayStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(array: js.Array[Any], scheduler: typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler): typings.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream]
}
