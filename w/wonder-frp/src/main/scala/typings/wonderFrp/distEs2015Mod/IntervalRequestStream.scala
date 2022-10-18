package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "IntervalRequestStream")
@js.native
open class IntervalRequestStream protected ()
  extends typings.wonderFrp.distEs2015StreamIntervalRequestStreamMod.IntervalRequestStream {
  def this(scheduler: typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler) = this()
}
/* static members */
object IntervalRequestStream {
  
  @JSImport("wonder-frp/dist/es2015", "IntervalRequestStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(scheduler: typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler): typings.wonderFrp.distEs2015StreamIntervalRequestStreamMod.IntervalRequestStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distEs2015StreamIntervalRequestStreamMod.IntervalRequestStream]
}
