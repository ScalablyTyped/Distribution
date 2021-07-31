package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "FromArrayStream")
@js.native
class FromArrayStream protected ()
  extends typings.wonderFrp.fromArrayStreamMod.FromArrayStream {
  def this(array: js.Array[js.Any], scheduler: typings.wonderFrp.schedulerMod.Scheduler) = this()
}
/* static members */
object FromArrayStream {
  
  @JSImport("wonder-frp/dist/commonjs", "FromArrayStream")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(array: js.Array[js.Any], scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.fromArrayStreamMod.FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.wonderFrp.fromArrayStreamMod.FromArrayStream]
}
