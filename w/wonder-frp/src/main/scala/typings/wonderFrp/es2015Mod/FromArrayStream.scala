package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FromArrayStream")
@js.native
class FromArrayStream protected ()
  extends typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream {
  def this(array: js.Array[js.Any], scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler) = this()
}
/* static members */
object FromArrayStream {
  
  @JSImport("wonder-frp/dist/es2015", "FromArrayStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(array: js.Array[js.Any], scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler): typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream]
}
