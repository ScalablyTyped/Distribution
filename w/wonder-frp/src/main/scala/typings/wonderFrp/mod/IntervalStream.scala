package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends typings.wonderFrp.intervalStreamMod.IntervalStream {
  def this(interval: Double, scheduler: typings.wonderFrp.schedulerMod.Scheduler) = this()
}
/* static members */
object IntervalStream {
  
  @JSImport("wonder-frp/dist/commonjs", "IntervalStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(interval: Double, scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.intervalStreamMod.IntervalStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(interval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.intervalStreamMod.IntervalStream]
}
