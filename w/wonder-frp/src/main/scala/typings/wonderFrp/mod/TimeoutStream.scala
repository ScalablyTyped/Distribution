package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
class TimeoutStream protected ()
  extends typings.wonderFrp.timeoutStreamMod.TimeoutStream {
  def this(time: Double, scheduler: typings.wonderFrp.schedulerMod.Scheduler) = this()
}
/* static members */
object TimeoutStream {
  
  @JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(time: Double, scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.timeoutStreamMod.TimeoutStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.timeoutStreamMod.TimeoutStream]
}
