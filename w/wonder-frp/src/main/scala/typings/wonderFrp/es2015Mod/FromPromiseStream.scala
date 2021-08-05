package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FromPromiseStream")
@js.native
class FromPromiseStream protected ()
  extends typings.wonderFrp.streamFromPromiseStreamMod.FromPromiseStream {
  def this(promise: js.Any, scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler) = this()
}
/* static members */
object FromPromiseStream {
  
  @JSImport("wonder-frp/dist/es2015", "FromPromiseStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(promise: js.Any, scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler): typings.wonderFrp.streamFromPromiseStreamMod.FromPromiseStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(promise.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamFromPromiseStreamMod.FromPromiseStream]
}
