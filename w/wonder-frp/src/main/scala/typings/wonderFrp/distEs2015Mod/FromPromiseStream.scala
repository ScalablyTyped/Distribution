package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FromPromiseStream")
@js.native
open class FromPromiseStream protected ()
  extends typings.wonderFrp.distEs2015StreamFromPromiseStreamMod.FromPromiseStream {
  def this(promise: Any, scheduler: typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler) = this()
}
/* static members */
object FromPromiseStream {
  
  @JSImport("wonder-frp/dist/es2015", "FromPromiseStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(promise: Any, scheduler: typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler): typings.wonderFrp.distEs2015StreamFromPromiseStreamMod.FromPromiseStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(promise.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015StreamFromPromiseStreamMod.FromPromiseStream]
}
