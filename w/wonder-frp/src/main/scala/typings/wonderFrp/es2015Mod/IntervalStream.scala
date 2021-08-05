package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends typings.wonderFrp.streamIntervalStreamMod.IntervalStream {
  def this(interval: Double, scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler) = this()
}
/* static members */
object IntervalStream {
  
  @JSImport("wonder-frp/dist/es2015", "IntervalStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(interval: Double, scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler): typings.wonderFrp.streamIntervalStreamMod.IntervalStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(interval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.streamIntervalStreamMod.IntervalStream]
}
