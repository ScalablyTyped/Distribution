package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "IntervalRequestStream")
@js.native
class IntervalRequestStream protected ()
  extends typings.wonderFrp.streamIntervalRequestStreamMod.IntervalRequestStream {
  def this(scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler) = this()
}
/* static members */
object IntervalRequestStream {
  
  @JSImport("wonder-frp/dist/es2015", "IntervalRequestStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler): typings.wonderFrp.streamIntervalRequestStreamMod.IntervalRequestStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.streamIntervalRequestStreamMod.IntervalRequestStream]
}
