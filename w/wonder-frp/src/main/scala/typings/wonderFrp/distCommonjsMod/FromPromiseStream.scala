package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FromPromiseStream")
@js.native
open class FromPromiseStream protected ()
  extends typings.wonderFrp.distCommonjsStreamFromPromiseStreamMod.FromPromiseStream {
  def this(promise: Any, scheduler: typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler) = this()
}
/* static members */
object FromPromiseStream {
  
  @JSImport("wonder-frp/dist/commonjs", "FromPromiseStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(promise: Any, scheduler: typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler): typings.wonderFrp.distCommonjsStreamFromPromiseStreamMod.FromPromiseStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(promise.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distCommonjsStreamFromPromiseStreamMod.FromPromiseStream]
}
