package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "IntervalRequestStream")
@js.native
open class IntervalRequestStream protected ()
  extends typings.wonderFrp.distCommonjsStreamIntervalRequestStreamMod.IntervalRequestStream {
  def this(scheduler: typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler) = this()
}
/* static members */
object IntervalRequestStream {
  
  @JSImport("wonder-frp/dist/commonjs", "IntervalRequestStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(scheduler: typings.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler): typings.wonderFrp.distCommonjsStreamIntervalRequestStreamMod.IntervalRequestStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distCommonjsStreamIntervalRequestStreamMod.IntervalRequestStream]
}
