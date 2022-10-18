package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "IntervalStream")
@js.native
open class IntervalStream protected ()
  extends typings.wonderFrp.distEs2015StreamIntervalStreamMod.IntervalStream {
  def this(interval: Double, scheduler: typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler) = this()
}
/* static members */
object IntervalStream {
  
  @JSImport("wonder-frp/dist/es2015", "IntervalStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(interval: Double, scheduler: typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler): typings.wonderFrp.distEs2015StreamIntervalStreamMod.IntervalStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(interval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015StreamIntervalStreamMod.IntervalStream]
}
