package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FromPromiseStream")
@js.native
open class FromPromiseStream protected ()
  extends typings.wonderFrp.fromPromiseStreamMod.FromPromiseStream {
  def this(promise: Any, scheduler: typings.wonderFrp.schedulerMod.Scheduler) = this()
}
/* static members */
object FromPromiseStream {
  
  @JSImport("wonder-frp/dist/commonjs", "FromPromiseStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(promise: Any, scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.fromPromiseStreamMod.FromPromiseStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(promise.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.fromPromiseStreamMod.FromPromiseStream]
}
