package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "FromArrayStream")
@js.native
open class FromArrayStream protected ()
  extends typings.wonderFrp.distEs2015StreamFromArrayStreamMod.FromArrayStream {
  def this(array: js.Array[Any], scheduler: typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler) = this()
}
/* static members */
object FromArrayStream {
  
  @JSImport("wonder-frp/dist/es2015", "FromArrayStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(array: js.Array[Any], scheduler: typings.wonderFrp.distEs2015CoreSchedulerMod.Scheduler): typings.wonderFrp.distEs2015StreamFromArrayStreamMod.FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.distEs2015StreamFromArrayStreamMod.FromArrayStream]
}
